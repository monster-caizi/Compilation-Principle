package com.cai.handleListenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cai.mainAntlr;
import com.cai.antlr.caiBaseListener;
import com.cai.antlr.caiParser;
import com.cai.antlr.caiParser.AndContext;

public class simplifyListenter extends caiBaseListener {

	static private Map<String, String> mySentence = new HashMap<String, String>();

	static int a = 0;
	//拼凑出在正则表达式中不会被转义的新语句，因部分一阶逻辑中使用符号为正则表达式中的保留字符，故需要添加'\\',避免混淆
	public String replace(String str) {
		str = str + ",";
		StringBuilder sb = new StringBuilder(str);
		String finalStr = "";
		char temp = 0;
		for (int i = 0; temp != ','; i++) {
			temp = sb.charAt(i);
			if (temp == '(' || temp == ')' || temp == '$' || temp == '|') {
				sb.insert(i, "\\");
				i += 1;
			}

		}
		finalStr = sb.toString();
		finalStr = finalStr.substring(0, finalStr.length() - 1);
		return finalStr;
	}

	//每一次进去一个新的sentence的时候清空以前的语句所做的替换，避免干扰
	@Override
	public void enterExample(caiParser.ExampleContext ctx) {
		super.enterExample(ctx);
		if (mySentence.size() > 0)
			mySentence.clear();
	}
	//退出当前语句时将新生成的代入结果追加到newStr中，以后后面可满足性判断使用
	@Override
	public void exitExample(caiParser.ExampleContext ctx) {
		super.exitExample(ctx);

		String Str = ctx.getText() + ";\r\n";
		Set<String> mySet = mySentence.keySet();
		for (String key : mySet) {
			String Keychange = replace(key);
			String Str1 = Str.replaceAll(Keychange, mySentence.get(key));
			Str = Str1;
		}

		if (Str.equals("false;\r\n"))
			mainAntlr.flag = false;

		if(!Str.equals("true;\r\n"))
			mainAntlr.newStr += Str;

		//System.out.println(Str);
	}
	//化简AND语句中的可化简部分
	@Override
	public void exitAndexp(caiParser.AndexpContext ctx) {
		super.exitAndexp(ctx);

		if (ctx.and().size() > 0) {

			String s = ctx.getText();
			String str = null;
			caiParser.CompexpContext Compexp = null;
			String temp = "";
			int i;
			String ss = ctx.getText();
			//处理多AND情况
			for (i = 0; i < ctx.compexp().size(); i++) {
				Compexp = ctx.compexp(i);
				String Comstr = Compexp.getText();
				// 替换以前已经做过的子式，并删除该子式
				Set<String> mySet = mySentence.keySet();
				List<String> nodes = new ArrayList<String>();
				for (String key : mySet) {
					String Keychange = replace(key);
					String Str1 = Comstr.replaceAll(Keychange,
							mySentence.get(key));
					if (!Str1.equals(Comstr))
						nodes.add(key);
					Comstr = Str1;
				}
				for (String node : nodes)
					mySentence.remove(node);
				//代入新式子中出现的已知真值的谓词常量
				mySet = mainAntlr.preValue.keySet();
				for (String key : mySet) {
					String KeychangeT = replace(key);
					String KeychangeF = '~' + KeychangeT;
					String Str1 = Comstr.replaceAll(KeychangeF,
							!mainAntlr.preValue.get(key)+"");
					Str1 = Str1.replaceAll(KeychangeT,
							mainAntlr.preValue.get(key).toString());
					Comstr = Str1;
				}
				//具体化简过程
				if (Comstr.equals("false")) {
					temp = "false";
					break;
				} else {
					if (i == 0)
						if (Comstr.equals("true"))
							temp = "";
						else
							temp = Comstr;
					else if (!Comstr.equals("true"))
						if (temp.equals(""))
							temp = Comstr;
						else

							temp = temp + "&&" + Comstr;
				}

			}
			if (temp.equals(""))
				mySentence.put(ctx.getText(), "true");
			else
				mySentence.put(ctx.getText(), temp);
		}

	}
	//化简OR语句中的可化简部分
	@Override
	public void exitOrexp(caiParser.OrexpContext ctx) {
		super.exitOrexp(ctx);
		if (ctx.or().size() > 0) {

			String s = ctx.getText();
			String str = null;
			caiParser.AndexpContext Compexp = null;
			String temp = "";
			int i;
			String ss = ctx.getText();
			//处理多OR情况
			for (i = 0; i < ctx.andexp().size(); i++) {
				Compexp = ctx.andexp(i);
				String Comstr = Compexp.getText();
				// 替换以前已经做过的子式，并删除该子式
				Set<String> mySet = mySentence.keySet();
				List<String> nodes = new ArrayList<String>();
				for (String key : mySet) {
					String Keychange = replace(key);
					String Str1 = Comstr.replaceAll(Keychange,
							mySentence.get(key));
					if (!Str1.equals(Comstr))
						nodes.add(key);
					Comstr = Str1;
				}
				for (String node : nodes)
					mySentence.remove(node);
				//代入新式子中出现的已知真值的谓词常量
				mySet = mainAntlr.preValue.keySet();
				for (String key : mySet) {
					String KeychangeT = replace(key);
					String KeychangeF = '~' + KeychangeT;
					String Str1 = Comstr.replaceAll(KeychangeF,
							!mainAntlr.preValue.get(key)+"");
					Str1 = Str1.replaceAll(KeychangeT,
							mainAntlr.preValue.get(key).toString());
					Comstr = Str1;
				}
				//具体化简过程
				if (Comstr.equals("true")) {
					temp = "true";
					break;
				} else {
					if (i == 0)
						if (Comstr.equals("false"))
							temp = "";
						else
							temp = Comstr;
					else if (!Comstr.equals("false"))
						if (temp.equals(""))
							temp = Comstr;
						else
							temp = temp + "||" + Comstr;
				}

			}
			if (temp.equals(""))
				mySentence.put(ctx.getText(), "false");
			else
				mySentence.put(ctx.getText(), temp);
		}
	}

	//化简-> 与 <->语句中的可化简部分
	public void exitTcexp(caiParser.TcexpContext ctx) {
		String s = ctx.getText();
		String str = null;
		caiParser.OrexpContext Orexp = null;
		String temp = "";
		int i;
		String ss = ctx.getText();
		String orestrPre = null;
		//处理多->或<->情况
		for (i = 0; i < ctx.orexp().size(); i++) {
			Orexp = ctx.orexp(i);
			String orestr = Orexp.getText();
			// 替换以前已经做过的子式，并删除该子式
			Set<String> mySet = mySentence.keySet();
			List<String> nodes = new ArrayList<String>();
			for (String key : mySet) {
				String Keychange = replace(key);
				String Str1 = orestr.replaceAll(Keychange, mySentence.get(key));
				if (!Str1.equals(orestr))
					nodes.add(key);
				orestr = Str1;
			}
			for (String node : nodes)
				mySentence.remove(node);
			//代入新式子中出现的已知真值的谓词常量
			mySet = mainAntlr.preValue.keySet();
			for (String key : mySet) {
				String KeychangeT = replace(key);
				String KeychangeF = '~' + KeychangeT;
				String Str1 = orestr.replaceAll(KeychangeF, !mainAntlr.preValue
						.get(key)+"");
				Str1 = Str1.replaceAll(KeychangeT, mainAntlr.preValue.get(key)
						.toString());
				orestr = Str1;
			}
			//具体化简过程,通过具体推导，只存在以下几种情况，实现即可，只化简为OR语句，在可满足判断是重新建树的时候判断化简即可
			if (i != 0) {
				// String
				caiParser.KeyContext Key = ctx.key(i - 1);
				String keyStr = Key.getText();
				if (orestrPre.equals("true")) {
					temp = orestr;
				} else if (orestrPre.equals("flase")) {
					if (keyStr.equals("->")) {
						temp = "true";
					} else {
						temp = "~" + orestr;
					}
				} else if (orestr.equals("false"))
					temp = "~" + orestrPre;
				else if (orestr.equals("true")) {
					if (keyStr.equals("->")) {
						temp = "true";
					} else {
						temp = "~" + orestrPre;
					}

				} else {
					if (keyStr.equals("->")) {
						temp = "~" + orestrPre + "||" + orestr;
					} else {
						temp = "(~" + orestrPre + "||" + orestr + ")&&("
								+ orestrPre + "||~" + orestr + ")";
					}

				}

			} else
				temp = orestr;

			orestrPre = orestr;// A
		}

		if (i != 0)
			mySentence.put(ctx.getText(), temp);

	}
	//判断当前语句是否包含最外层括号，是则在父节点的括号可去掉
	private boolean moveParenthesis(String str) {
		Stack<Integer> mystack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder(str);
		String finalStr = "";
		char temp = 0;
		Integer index = 0;
		for (int i = 0; i < str.length(); i++) {
			temp = sb.charAt(i);

			if (temp == '(') {
				mystack.push(i);
			}
			if (temp == ')') {
				index = mystack.pop();
			}

		}
		if (index == 0)
			return true;
		else
			return false;

	}

	// ((@p(1)->((@q(1)&&1!=1)||(@q(2)&&1!=2)))&&(@p(2)->((@q(1)&&2!=1)||(@q(2)&&2!=2))));
	// ((~@p(1)||@q(2))&&(~@p(2)||@q(1)));

	//化简多余括弧
	@Override
	public void exitExp(caiParser.ExpContext ctx) {

		super.exitExp(ctx);

		if (ctx.lk() == null)
			return;
		String Comstr = ctx.sentence().getText();
		
		// 替换以前已经做过的子式，并删除该子式
		Set<String> mySet = mySentence.keySet();
		List<String> nodes = new ArrayList<String>();
		for (String key : mySet) {
			String Keychange = replace(key);
			String Str1 = Comstr.replaceAll(Keychange, mySentence.get(key));
			if (!Str1.equals(Comstr))
				nodes.add(key);
			Comstr = Str1;
		}

		for (String node : nodes)
			mySentence.remove(node);
		//代入新式子中出现的已知真值的谓词常量
		mySet = mainAntlr.preValue.keySet();
		for (String key : mySet) {
			String KeychangeT = replace(key);
			String KeychangeF = '~' + KeychangeT;
			String Str1 = Comstr.replaceAll(KeychangeF,
					mainAntlr.preValue.get(key).toString());
			Str1 = Str1.replaceAll(KeychangeT, mainAntlr.preValue.get(key)
					.toString());
			Comstr = Str1;
		}
		//利用正则表达式找出出现的谓词语句
		Pattern pat = Pattern
				.compile("~?@[a-z]+\\(((\\d\\d*)|([a-z](\\d|[a-z])*))\\)");
		Matcher mat = pat.matcher(Comstr);
		int flag = 0;
		String mysubStr = "";
		while (mat.find()) {
			flag++;
			mysubStr = mat.group();
		}
		//判断是否为单谓词语句，是则可去括号
		if ((flag == 1 && Comstr.equals(mysubStr))) {
			if (ctx.not() == null)
				mySentence.put(ctx.getText(), Comstr);
			else
				mySentence.put(ctx.getText(), '~' + Comstr);
			return;
		}
		//判断是否为false语句，是则可去括号
		if (Comstr.equals("false")) {
			if (ctx.not() == null)
				mySentence.put(ctx.getText(), "false");
			else
				mySentence.put(ctx.getText(), "true");
			return;
		}
		//判断是否为true语句，是则可去括号
		if (Comstr.equals("true")) {
			if (ctx.not() == null)
				mySentence.put(ctx.getText(), "true");
			else
				mySentence.put(ctx.getText(), "false");
			return;
		}
		//判断最外层是否的括号是否多余，是则去掉
		String temp1 = Comstr.substring(0, 1);

		String temp2 = Comstr.substring(Comstr.length() - 1, Comstr.length());

		if (temp1.equals("(") && temp2.equals(")")) {

			if (moveParenthesis(Comstr))
				mySentence.put(ctx.getText(), Comstr);
			else
				mySentence.put(ctx.getText(), "(" + Comstr + ")");

		} else
			mySentence.put(ctx.getText(), "(" + Comstr + ")");

	}
	//化简数值比较结果，该数值比较只可为数字常量的比较
	@Override
	public void exitCompexp(caiParser.CompexpContext ctx) {
		super.exitCompexp(ctx);
		String str = null;

		if (ctx.ne() != null) {
			caiParser.ExpContext exp1 = ctx.exp(0);
			caiParser.ExpContext exp2 = ctx.exp(1);

			if (exp1.conexp() == null || exp2.conexp() == null || exp2 == null) {
				return;
			}
			String e1 = exp1.getText();
			String e2 = exp2.getText();

			int E1 = Integer.parseInt(e1);
			int E2 = Integer.parseInt(e2);

			caiParser.NeContext ne = ctx.ne();
			caiParser.AeContext ae = ctx.ae();
			caiParser.BeContext be = ctx.be();
			caiParser.EqContext eq = ctx.eq();
			caiParser.BlContext bl = ctx.bl();
			caiParser.AbContext ab = ctx.ab();

			boolean result = false;

			if (ne != null) {
				result = (E1 != E2);
			} else if (ab != null) {
				result = (E1 > E2);
			} else if (ae != null) {
				result = (E1 >= E2);
			} else if (be != null) {
				result = (E1 <= E2);
			} else if (eq != null) {
				result = (E1 == E2);
			} else if (bl != null) {
				result = (E1 < E2);
			}

			if (result) {
				mySentence.put(ctx.getText(), "true");
			} else {
				mySentence.put(ctx.getText(), "false");
			}

		}

	}

}
