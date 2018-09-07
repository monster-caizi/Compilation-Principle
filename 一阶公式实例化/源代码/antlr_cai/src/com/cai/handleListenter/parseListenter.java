package com.cai.handleListenter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cai.mainAntlr;
import com.cai.antlr.caiBaseListener;
import com.cai.antlr.caiParser;

//$X(@r(X)||%Y@q(Y));
public class parseListenter extends caiBaseListener {

	static private Map<String, String> mySentence = new HashMap<String, String>();

	//每一次进去一个新的sentence的时候清空以前的语句所做的替换，避免干扰
	@Override
	public void enterExample(caiParser.ExampleContext ctx) {
		super.enterExample(ctx);
		if (mySentence.size() > 0)
			mySentence.clear();
	}
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

	//退出当前语句时将新生成的代入结果追加到newStr中，以后后面化简使用
	@Override
	public void exitExample(caiParser.ExampleContext ctx) {
		super.exitExample(ctx);
		// 替换以前已经做过的子式
		String Str = ctx.getText() + ";\r\n";
		Set<String> mySet = mySentence.keySet();
		for (String key : mySet) {
			String Keychange = replace(key);
			String Str1 = Str.replaceAll(Keychange, mySentence.get(key));
			Str = Str1;
		}

		mainAntlr.newStr += (Str);
	}

	
	//具体代入实现
	private void deal(String subStr, boolean f, caiParser.LcexpContext ctx) {
		caiParser.QuContext qu = ctx.qu();
		String qt = qu.getText();// 取得$或%
		//替换以前出现的代入结果
		Set<String> mySet = mySentence.keySet();
		for (String key : mySet) {
			String Keychange = replace(key);
			subStr = subStr.replaceAll(Keychange, mySentence.get(key));
		}
		
		// 处理新的情况
		String VarexpStr = ctx.varexp().getText();
		String str = "";
		boolean flag = false;
		for (String myvalue : mainAntlr.keySet) {
			String node = subStr.replaceAll(VarexpStr, myvalue);
			if (f)
				node = '(' + node + ')';
			if (qt.equals("%")) {
				if (flag)
					str += ("||" + node);
				else {
					str = node;
					flag = !flag;
				}
			} else {
				if (flag)
					str += ("&&" + node);
				else {
					str = node;
					flag = !flag;
				}
			}
		}

		str = "(" + str + ")";
		mySentence.clear();
		mySentence.put(ctx.getText(), str);
	}

	/*
	 * parse all and exist condition，将存在量词与全称量词所的作用域中的语句进行常量代入替换
	 */
	@Override
	public void exitLcexp(caiParser.LcexpContext ctx) {
		super.exitLcexp(ctx);

		if(mainAntlr.keySet.size()==0)
			return ;
		String subStr = null;
		caiParser.PreexpContext Preexp = ctx.preexp();
		//讨论三种不同的两次语句情况
		if (ctx.preexp() != null) {
			subStr = ctx.preexp().getText();
			deal(subStr, false, ctx);
		} else if (ctx.sentence() != null) {
			subStr = ctx.sentence().getText();
			deal(subStr, true, ctx);
		} else if (ctx.lcexp() != null) {
			subStr = ctx.lcexp().getText();
			deal(subStr, true, ctx);
		}
		

		// 替换以前已经做过的子式

	}
}
