// Generated from cai.g by ANTLR 4.5.3
package com.cai.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link caiParser}.
 */
public interface caiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link caiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(caiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(caiParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#example}.
	 * @param ctx the parse tree
	 */
	void enterExample(caiParser.ExampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#example}.
	 * @param ctx the parse tree
	 */
	void exitExample(caiParser.ExampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(caiParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(caiParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#lcexp}.
	 * @param ctx the parse tree
	 */
	void enterLcexp(caiParser.LcexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#lcexp}.
	 * @param ctx the parse tree
	 */
	void exitLcexp(caiParser.LcexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#logexp}.
	 * @param ctx the parse tree
	 */
	void enterLogexp(caiParser.LogexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#logexp}.
	 * @param ctx the parse tree
	 */
	void exitLogexp(caiParser.LogexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#tcexp}.
	 * @param ctx the parse tree
	 */
	void enterTcexp(caiParser.TcexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#tcexp}.
	 * @param ctx the parse tree
	 */
	void exitTcexp(caiParser.TcexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(caiParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(caiParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#orexp}.
	 * @param ctx the parse tree
	 */
	void enterOrexp(caiParser.OrexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#orexp}.
	 * @param ctx the parse tree
	 */
	void exitOrexp(caiParser.OrexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#andexp}.
	 * @param ctx the parse tree
	 */
	void enterAndexp(caiParser.AndexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#andexp}.
	 * @param ctx the parse tree
	 */
	void exitAndexp(caiParser.AndexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#compexp}.
	 * @param ctx the parse tree
	 */
	void enterCompexp(caiParser.CompexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#compexp}.
	 * @param ctx the parse tree
	 */
	void exitCompexp(caiParser.CompexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(caiParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(caiParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#preexp}.
	 * @param ctx the parse tree
	 */
	void enterPreexp(caiParser.PreexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#preexp}.
	 * @param ctx the parse tree
	 */
	void exitPreexp(caiParser.PreexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#varexp}.
	 * @param ctx the parse tree
	 */
	void enterVarexp(caiParser.VarexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#varexp}.
	 * @param ctx the parse tree
	 */
	void exitVarexp(caiParser.VarexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#conexp}.
	 * @param ctx the parse tree
	 */
	void enterConexp(caiParser.ConexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#conexp}.
	 * @param ctx the parse tree
	 */
	void exitConexp(caiParser.ConexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterPexp(caiParser.PexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitPexp(caiParser.PexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(caiParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(caiParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(caiParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(caiParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(caiParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(caiParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#sd}.
	 * @param ctx the parse tree
	 */
	void enterSd(caiParser.SdContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#sd}.
	 * @param ctx the parse tree
	 */
	void exitSd(caiParser.SdContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#bd}.
	 * @param ctx the parse tree
	 */
	void enterBd(caiParser.BdContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#bd}.
	 * @param ctx the parse tree
	 */
	void exitBd(caiParser.BdContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#qu}.
	 * @param ctx the parse tree
	 */
	void enterQu(caiParser.QuContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#qu}.
	 * @param ctx the parse tree
	 */
	void exitQu(caiParser.QuContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(caiParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(caiParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#ab}.
	 * @param ctx the parse tree
	 */
	void enterAb(caiParser.AbContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#ab}.
	 * @param ctx the parse tree
	 */
	void exitAb(caiParser.AbContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#bl}.
	 * @param ctx the parse tree
	 */
	void enterBl(caiParser.BlContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#bl}.
	 * @param ctx the parse tree
	 */
	void exitBl(caiParser.BlContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#be}.
	 * @param ctx the parse tree
	 */
	void enterBe(caiParser.BeContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#be}.
	 * @param ctx the parse tree
	 */
	void exitBe(caiParser.BeContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#ae}.
	 * @param ctx the parse tree
	 */
	void enterAe(caiParser.AeContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#ae}.
	 * @param ctx the parse tree
	 */
	void exitAe(caiParser.AeContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#ne}.
	 * @param ctx the parse tree
	 */
	void enterNe(caiParser.NeContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#ne}.
	 * @param ctx the parse tree
	 */
	void exitNe(caiParser.NeContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#lk}.
	 * @param ctx the parse tree
	 */
	void enterLk(caiParser.LkContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#lk}.
	 * @param ctx the parse tree
	 */
	void exitLk(caiParser.LkContext ctx);
	/**
	 * Enter a parse tree produced by {@link caiParser#rk}.
	 * @param ctx the parse tree
	 */
	void enterRk(caiParser.RkContext ctx);
	/**
	 * Exit a parse tree produced by {@link caiParser#rk}.
	 * @param ctx the parse tree
	 */
	void exitRk(caiParser.RkContext ctx);
}