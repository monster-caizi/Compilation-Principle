package com.cai;

import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.cai.antlr.caiLexer;
import com.cai.antlr.caiParser;
import com.cai.handleListenter.constantListenter;
import com.cai.handleListenter.parseListenter;
import com.cai.handleListenter.simplifyListenter;

public class mainAntlr {

	static public Map<String, Boolean> constValue = new HashMap<String, Boolean>();
	static public Map<String, Boolean> preValue = new HashMap<String, Boolean>();
	static public Set<String> keySet;
	static public String newStr = "";
	static public boolean flag = true;
	static int max = 0;
	static String judgeStr;
    static String Output="";
	public static String readInput() {

		Scanner sc = new Scanner(System.in);
		System.out.println("\n请输入公式集于Input.txt中，输入完以后保存并在控制台回车开始程序:");
		sc.nextLine();
		FileUtils Fileread=new FileUtils ();
		String input = "";
		try {
			input = Fileread.readFile("./Input.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return input;

	}

	public static caiParser getContext(String nodeSet) {
		ANTLRInputStream inputStream = new ANTLRInputStream(nodeSet);
		caiLexer lexer = new caiLexer(inputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		caiParser parser = new caiParser(tokens);
		return parser;
	}

	//采用回溯法，拼凑出各种的谓词真值情况，并调用化简过程判断是否判断结果为真，
	//是则返回该真值形式，且命题可满足，不然重复该过程,直到遍历所有结果仍不可为真，即公式集不可满足
	public static boolean changeSet(String[] SubSet, int i) {
		
		//回溯结束条件，调用新的建立新树，并判断是否可满足
		if (i == max) {
			caiParser parser = getContext(judgeStr);
			caiParser.ProgramContext root = parser.program();
			ParseTreeWalker walker = new ParseTreeWalker();
			simplifyListenter simplifylistenter = new simplifyListenter();
			walker.walk(simplifylistenter, root);

			if (flag)
				return true;
			else
				return false;
		}
		//回溯过程
		preValue.put(SubSet[i], true);
		boolean f = changeSet(SubSet, i + 1);
		if (f) {
			return true;
		} else {
			preValue.put(SubSet[i], false);
			return changeSet(SubSet, i + 1);
		}
	}
	//判断是否可满足
	public static void Judge() {
		//原化简结果即不可满足，则可成功退出
		if (flag == false) {
			System.out.println("命题集不可满足！！");
			return;
		}
		//找到化简后的公式集中的所有谓词常量
		Pattern pat = Pattern
				.compile("@[a-z]+\\(((\\d\\d*)|([a-z](\\d|[a-z])*))\\)");
		Matcher mat = pat.matcher(newStr);
		int f = 0;
		preValue = new HashMap<String, Boolean>();

		while (mat.find()) {
			f++;
			preValue.put(mat.group(), true);
		}
		//转化为key值的数组，便于利用回溯法赋值
		flag = true;
		Set<String> mySet = preValue.keySet();
		List<String> nodes = new ArrayList<String>();
		String[] newsub = new String[mySet.size()];
		max = mySet.size();
		int i = 0;
		for (String key : mySet) {
			// String Keychange = replace(key);
			newsub[i++] = key;
		}
		judgeStr = newStr;
		//调用回溯函数
		boolean F = changeSet(newsub, 0);
		//判断结果，输出是否可满足
		if (F) {
			System.out.print("命题集可满足！在化简后的基础上，各项取值如下即可满足:\n");//
			Output=Output+"命题集可满足！在化简后的基础上，各项取值如下即可满足:\r\n";
			for (int j = 0; j < max; j++) {
				System.out.print(newsub[j] + "==" + preValue.get(newsub[j])
						+ "    ");
				Output=Output+newsub[j] + "==" + preValue.get(newsub[j])
						+ "    ";
			}
			System.out.println("\n");
			Output=Output+"\r\n";
		} else {
			System.out.println("命题集不可满足！！");
			Output=Output+"命题集不可满足！！";
			return;
		}
	}

	/*
	 * 初始 
	 可满足测试集：
	$X$Y(@p(X)||~@q(Y)||@r(Y)); 
	$X(@p(X)-> %Y (@q(Y) && X != Y));
	@r(1)&&~@r(2);
	不可满足测试集：
	@w(0);
	~@w(0)||~@w(1);
	@w(1);

	 */

	/*
	 * 代入
	 * ((((@p(1)||~@q(1)||@r(1))&&(@p(1)||~@q(2)||@r(2))))&&(((@p(2)||~@q(1)||
	 * @r(1))&&(@p(2)||~@q(2)||@r(2)))));
	 * ((@p(1)->((@q(1)&&1!=1)||(@q(2)&&1!=2))
	 * )&&(@p(2)->((@q(1)&&2!=1)||(@q(2)&&2!=2))));
	 * 
	 * @r(1)&&~@r(2);
	 */
	public static void main(String[] args) {

		String input=readInput();
		
		
		
		Thread myThread = new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				 caiParser parser1 = getContext(input) ;
				 parser1.setBuildParseTree(true);
				 Trees.inspect(parser1.program(), parser1);
			}
		};
		myThread.start();

		caiParser parser1 = getContext(input);
		System.out
				.println("------------------------------------------------------\n代入过程：\n");
		Output="------------------------------------------------------\n代入过程：\r\n"+		Output;
		caiParser.ProgramContext root1 = parser1.program();
		constantListenter constantlistener = new constantListenter();

		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(constantlistener, root1);

		keySet = constValue.keySet();
		parseListenter parseListenter = new parseListenter();
		walker.walk(parseListenter, root1);

		System.out.println(newStr);
		Output=Output+newStr;
		
		caiParser parser2 = getContext(newStr);
		newStr = "";

		System.out
				.println("------------------------------------------------------\n化简结果，部分化简完已为真的语句已消去：\n");
		Output=Output+"------------------------------------------------------\n化简结果，部分化简完已为真的语句已消去：\r\n";
		caiParser.ProgramContext root2 = parser2.program();
		simplifyListenter simplifylistenter = new simplifyListenter();
		walker.walk(simplifylistenter, root2);
		System.out.println(newStr);
		Output=Output+newStr;
		System.out
				.println("------------------------------------------------------\n可满足性判定结果：\n");
		Output=Output+"------------------------------------------------------\n可满足性判定结果：\r\n";
		
		Judge();

		
		
		
		
		FileWriter writer;
        try {
            writer = new FileWriter("./caiResult.txt");
            writer.write(Output);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		/*
		 * String str="!=22"; str=str.replaceAll("!=", "caizi");
		 * 
		 * System.out.println(str);
		 *///

	}

}
