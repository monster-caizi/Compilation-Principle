package com.cai.handleListenter;

import java.util.HashMap;
import java.util.Map;

import com.cai.mainAntlr;
import com.cai.antlr.caiBaseListener;
import com.cai.antlr.caiParser;

public class constantListenter extends caiBaseListener {
	/*
	 * get constant to constitute the domain of discourse
	 */

	@Override
	public void exitConexp(caiParser.ConexpContext ctx) {

		super.exitConexp(ctx);
		// ctx.Con().getText();
		mainAntlr.constValue.put(ctx.Con().getText(), true);
	}

	/*
	 * get constant to constitute the domain of discourse
	 */

	@Override
	public void exitPreexp(caiParser.PreexpContext ctx) {
		super.exitPreexp(ctx);
		if (ctx.conexp() != null) {
			if(ctx.not()==null){
				mainAntlr.preValue.put(ctx.getText(), true);
				//StringBuilder sb = new StringBuilder(ctx.getText());
				//sb =sb.insert(0, "~");
				//mainAntlr.preValue.put(sb.toString(), false);
			}else
			{
				//mainAntlr.preValue.put(ctx.getText(), false);
				String notStr = ctx.getText().substring(1, ctx.getText().length());
				mainAntlr.preValue.put(notStr, false);
			}
		}

	}

}
