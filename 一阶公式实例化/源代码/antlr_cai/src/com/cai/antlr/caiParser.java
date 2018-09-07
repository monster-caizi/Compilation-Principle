// Generated from cai.g by ANTLR 4.5.3
package com.cai.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class caiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, Pre=17, 
		Var=18, Con=19, Lowercase=20, Uppercase=21, Digit=22, WS=23;
	public static final int
		RULE_program = 0, RULE_example = 1, RULE_sentence = 2, RULE_lcexp = 3, 
		RULE_logexp = 4, RULE_tcexp = 5, RULE_key = 6, RULE_orexp = 7, RULE_andexp = 8, 
		RULE_compexp = 9, RULE_exp = 10, RULE_preexp = 11, RULE_varexp = 12, RULE_conexp = 13, 
		RULE_pexp = 14, RULE_not = 15, RULE_and = 16, RULE_or = 17, RULE_sd = 18, 
		RULE_bd = 19, RULE_qu = 20, RULE_eq = 21, RULE_ab = 22, RULE_bl = 23, 
		RULE_be = 24, RULE_ae = 25, RULE_ne = 26, RULE_lk = 27, RULE_rk = 28;
	public static final String[] ruleNames = {
		"program", "example", "sentence", "lcexp", "logexp", "tcexp", "key", "orexp", 
		"andexp", "compexp", "exp", "preexp", "varexp", "conexp", "pexp", "not", 
		"and", "or", "sd", "bd", "qu", "eq", "ab", "bl", "be", "ae", "ne", "lk", 
		"rk"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'~'", "'&&'", "'||'", "'->'", "'<->'", "'%'", "'$'", "'='", 
		"'>'", "'<'", "'<='", "'>='", "'!='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "Pre", "Var", "Con", "Lowercase", "Uppercase", 
		"Digit", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "cai.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public caiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ExampleContext> example() {
			return getRuleContexts(ExampleContext.class);
		}
		public ExampleContext example(int i) {
			return getRuleContext(ExampleContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__14) | (1L << Pre) | (1L << Var) | (1L << Con))) != 0)) {
				{
				{
				setState(58);
				example();
				setState(59);
				match(T__0);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExampleContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ExampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_example; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterExample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitExample(this);
		}
	}

	public final ExampleContext example() throws RecognitionException {
		ExampleContext _localctx = new ExampleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_example);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			sentence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public LcexpContext lcexp() {
			return getRuleContext(LcexpContext.class,0);
		}
		public LogexpContext logexp() {
			return getRuleContext(LogexpContext.class,0);
		}
		public CompexpContext compexp() {
			return getRuleContext(CompexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				lcexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				logexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				compexp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				exp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LcexpContext extends ParserRuleContext {
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public PreexpContext preexp() {
			return getRuleContext(PreexpContext.class,0);
		}
		public LcexpContext lcexp() {
			return getRuleContext(LcexpContext.class,0);
		}
		public QuContext qu() {
			return getRuleContext(QuContext.class,0);
		}
		public LkContext lk() {
			return getRuleContext(LkContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public RkContext rk() {
			return getRuleContext(RkContext.class,0);
		}
		public LcexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterLcexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitLcexp(this);
		}
	}

	public final LcexpContext lcexp() throws RecognitionException {
		LcexpContext _localctx = new LcexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lcexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(74);
			qu();
			}
			setState(75);
			varexp();
			}
			setState(83);
			switch (_input.LA(1)) {
			case T__1:
			case Pre:
				{
				setState(77);
				preexp();
				}
				break;
			case T__14:
				{
				{
				setState(78);
				lk();
				setState(79);
				sentence();
				setState(80);
				rk();
				}
				}
				break;
			case T__6:
			case T__7:
				{
				setState(82);
				lcexp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogexpContext extends ParserRuleContext {
		public TcexpContext tcexp() {
			return getRuleContext(TcexpContext.class,0);
		}
		public LogexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterLogexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitLogexp(this);
		}
	}

	public final LogexpContext logexp() throws RecognitionException {
		LogexpContext _localctx = new LogexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			tcexp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TcexpContext extends ParserRuleContext {
		public List<OrexpContext> orexp() {
			return getRuleContexts(OrexpContext.class);
		}
		public OrexpContext orexp(int i) {
			return getRuleContext(OrexpContext.class,i);
		}
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public TcexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterTcexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitTcexp(this);
		}
	}

	public final TcexpContext tcexp() throws RecognitionException {
		TcexpContext _localctx = new TcexpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tcexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			orexp();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				{
				setState(88);
				key();
				setState(89);
				orexp();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public SdContext sd() {
			return getRuleContext(SdContext.class,0);
		}
		public BdContext bd() {
			return getRuleContext(BdContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(96);
				sd();
				}
				break;
			case T__5:
				{
				setState(97);
				bd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrexpContext extends ParserRuleContext {
		public List<AndexpContext> andexp() {
			return getRuleContexts(AndexpContext.class);
		}
		public AndexpContext andexp(int i) {
			return getRuleContext(AndexpContext.class,i);
		}
		public List<OrContext> or() {
			return getRuleContexts(OrContext.class);
		}
		public OrContext or(int i) {
			return getRuleContext(OrContext.class,i);
		}
		public OrexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterOrexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitOrexp(this);
		}
	}

	public final OrexpContext orexp() throws RecognitionException {
		OrexpContext _localctx = new OrexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_orexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			andexp();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(101);
				or();
				setState(102);
				andexp();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndexpContext extends ParserRuleContext {
		public List<CompexpContext> compexp() {
			return getRuleContexts(CompexpContext.class);
		}
		public CompexpContext compexp(int i) {
			return getRuleContext(CompexpContext.class,i);
		}
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public AndexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterAndexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitAndexp(this);
		}
	}

	public final AndexpContext andexp() throws RecognitionException {
		AndexpContext _localctx = new AndexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_andexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			compexp();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(110);
				and();
				setState(111);
				compexp();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public BlContext bl() {
			return getRuleContext(BlContext.class,0);
		}
		public AbContext ab() {
			return getRuleContext(AbContext.class,0);
		}
		public BeContext be() {
			return getRuleContext(BeContext.class,0);
		}
		public AeContext ae() {
			return getRuleContext(AeContext.class,0);
		}
		public NeContext ne() {
			return getRuleContext(NeContext.class,0);
		}
		public CompexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterCompexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitCompexp(this);
		}
	}

	public final CompexpContext compexp() throws RecognitionException {
		CompexpContext _localctx = new CompexpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			exp();
			setState(129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				setState(125);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(119);
					eq();
					}
					break;
				case T__10:
					{
					setState(120);
					bl();
					}
					break;
				case T__9:
					{
					setState(121);
					ab();
					}
					break;
				case T__11:
					{
					setState(122);
					be();
					}
					break;
				case T__12:
					{
					setState(123);
					ae();
					}
					break;
				case T__13:
					{
					setState(124);
					ne();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127);
				exp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(caiParser.Var, 0); }
		public ConexpContext conexp() {
			return getRuleContext(ConexpContext.class,0);
		}
		public LkContext lk() {
			return getRuleContext(LkContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public RkContext rk() {
			return getRuleContext(RkContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public PreexpContext preexp() {
			return getRuleContext(PreexpContext.class,0);
		}
		public LcexpContext lcexp() {
			return getRuleContext(LcexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				conexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(133);
					not();
					}
				}

				{
				setState(136);
				lk();
				setState(137);
				sentence();
				setState(138);
				rk();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				preexp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				lcexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreexpContext extends ParserRuleContext {
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
		}
		public LkContext lk() {
			return getRuleContext(LkContext.class,0);
		}
		public RkContext rk() {
			return getRuleContext(RkContext.class,0);
		}
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public ConexpContext conexp() {
			return getRuleContext(ConexpContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public PreexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterPreexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitPreexp(this);
		}
	}

	public final PreexpContext preexp() throws RecognitionException {
		PreexpContext _localctx = new PreexpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_preexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(144);
				not();
				}
			}

			setState(147);
			pexp();
			setState(148);
			lk();
			setState(151);
			switch (_input.LA(1)) {
			case Var:
				{
				setState(149);
				varexp();
				}
				break;
			case Con:
				{
				setState(150);
				conexp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(153);
			rk();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarexpContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(caiParser.Var, 0); }
		public VarexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterVarexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitVarexp(this);
		}
	}

	public final VarexpContext varexp() throws RecognitionException {
		VarexpContext _localctx = new VarexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(Var);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConexpContext extends ParserRuleContext {
		public TerminalNode Con() { return getToken(caiParser.Con, 0); }
		public ConexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterConexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitConexp(this);
		}
	}

	public final ConexpContext conexp() throws RecognitionException {
		ConexpContext _localctx = new ConexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Con);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PexpContext extends ParserRuleContext {
		public TerminalNode Pre() { return getToken(caiParser.Pre, 0); }
		public PexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterPexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitPexp(this);
		}
	}

	public final PexpContext pexp() throws RecognitionException {
		PexpContext _localctx = new PexpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(Pre);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SdContext extends ParserRuleContext {
		public SdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterSd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitSd(this);
		}
	}

	public final SdContext sd() throws RecognitionException {
		SdContext _localctx = new SdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BdContext extends ParserRuleContext {
		public BdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterBd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitBd(this);
		}
	}

	public final BdContext bd() throws RecognitionException {
		BdContext _localctx = new BdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuContext extends ParserRuleContext {
		public QuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterQu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitQu(this);
		}
	}

	public final QuContext qu() throws RecognitionException {
		QuContext _localctx = new QuContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_qu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqContext extends ParserRuleContext {
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitEq(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbContext extends ParserRuleContext {
		public AbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterAb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitAb(this);
		}
	}

	public final AbContext ab() throws RecognitionException {
		AbContext _localctx = new AbContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlContext extends ParserRuleContext {
		public BlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterBl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitBl(this);
		}
	}

	public final BlContext bl() throws RecognitionException {
		BlContext _localctx = new BlContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeContext extends ParserRuleContext {
		public BeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_be; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterBe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitBe(this);
		}
	}

	public final BeContext be() throws RecognitionException {
		BeContext _localctx = new BeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_be);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AeContext extends ParserRuleContext {
		public AeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ae; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterAe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitAe(this);
		}
	}

	public final AeContext ae() throws RecognitionException {
		AeContext _localctx = new AeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ae);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NeContext extends ParserRuleContext {
		public NeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterNe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitNe(this);
		}
	}

	public final NeContext ne() throws RecognitionException {
		NeContext _localctx = new NeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LkContext extends ParserRuleContext {
		public LkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterLk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitLk(this);
		}
	}

	public final LkContext lk() throws RecognitionException {
		LkContext _localctx = new LkContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RkContext extends ParserRuleContext {
		public RkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).enterRk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof caiListener ) ((caiListener)listener).exitRk(this);
		}
	}

	public final RkContext rk() throws RecognitionException {
		RkContext _localctx = new RkContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00c0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5V\n\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13"+
		"\7\3\b\3\b\5\be\n\b\3\t\3\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\n\3\n\3"+
		"\n\3\n\7\nt\n\n\f\n\16\nw\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0080\n\13\3\13\3\13\5\13\u0084\n\13\3\f\3\f\3\f\5\f\u0089\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0091\n\f\3\r\5\r\u0094\n\r\3\r\3\r\3\r\3\r\5\r"+
		"\u009a\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\2\2\37\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\3\3\2\t\n\u00b9"+
		"\2A\3\2\2\2\4D\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16"+
		"d\3\2\2\2\20f\3\2\2\2\22o\3\2\2\2\24x\3\2\2\2\26\u0090\3\2\2\2\30\u0093"+
		"\3\2\2\2\32\u009d\3\2\2\2\34\u009f\3\2\2\2\36\u00a1\3\2\2\2 \u00a3\3\2"+
		"\2\2\"\u00a5\3\2\2\2$\u00a7\3\2\2\2&\u00a9\3\2\2\2(\u00ab\3\2\2\2*\u00ad"+
		"\3\2\2\2,\u00af\3\2\2\2.\u00b1\3\2\2\2\60\u00b3\3\2\2\2\62\u00b5\3\2\2"+
		"\2\64\u00b7\3\2\2\2\66\u00b9\3\2\2\28\u00bb\3\2\2\2:\u00bd\3\2\2\2<=\5"+
		"\4\3\2=>\7\3\2\2>@\3\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3"+
		"\3\2\2\2CA\3\2\2\2DE\5\6\4\2E\5\3\2\2\2FK\5\b\5\2GK\5\n\6\2HK\5\24\13"+
		"\2IK\5\26\f\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LM\5*"+
		"\26\2MN\5\32\16\2NU\3\2\2\2OV\5\30\r\2PQ\58\35\2QR\5\6\4\2RS\5:\36\2S"+
		"V\3\2\2\2TV\5\b\5\2UO\3\2\2\2UP\3\2\2\2UT\3\2\2\2V\t\3\2\2\2WX\5\f\7\2"+
		"X\13\3\2\2\2Y_\5\20\t\2Z[\5\16\b\2[\\\5\20\t\2\\^\3\2\2\2]Z\3\2\2\2^a"+
		"\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\r\3\2\2\2a_\3\2\2\2be\5&\24\2ce\5(\25\2"+
		"db\3\2\2\2dc\3\2\2\2e\17\3\2\2\2fl\5\22\n\2gh\5$\23\2hi\5\22\n\2ik\3\2"+
		"\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\21\3\2\2\2nl\3\2\2\2ou\5"+
		"\24\13\2pq\5\"\22\2qr\5\24\13\2rt\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2v\23\3\2\2\2wu\3\2\2\2x\u0083\5\26\f\2y\u0080\5,\27\2z\u0080"+
		"\5\60\31\2{\u0080\5.\30\2|\u0080\5\62\32\2}\u0080\5\64\33\2~\u0080\5\66"+
		"\34\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2"+
		"\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5\26\f\2\u0082\u0084\3\2"+
		"\2\2\u0083\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085\u0091"+
		"\7\24\2\2\u0086\u0091\5\34\17\2\u0087\u0089\5 \21\2\u0088\u0087\3\2\2"+
		"\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\58\35\2\u008b\u008c"+
		"\5\6\4\2\u008c\u008d\5:\36\2\u008d\u0091\3\2\2\2\u008e\u0091\5\30\r\2"+
		"\u008f\u0091\5\b\5\2\u0090\u0085\3\2\2\2\u0090\u0086\3\2\2\2\u0090\u0088"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\27\3\2\2\2\u0092"+
		"\u0094\5 \21\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\5\36\20\2\u0096\u0099\58\35\2\u0097\u009a\5\32\16\2\u0098"+
		"\u009a\5\34\17\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u009c\5:\36\2\u009c\31\3\2\2\2\u009d\u009e\7\24\2\2\u009e"+
		"\33\3\2\2\2\u009f\u00a0\7\25\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\7\23\2\2"+
		"\u00a2\37\3\2\2\2\u00a3\u00a4\7\4\2\2\u00a4!\3\2\2\2\u00a5\u00a6\7\5\2"+
		"\2\u00a6#\3\2\2\2\u00a7\u00a8\7\6\2\2\u00a8%\3\2\2\2\u00a9\u00aa\7\7\2"+
		"\2\u00aa\'\3\2\2\2\u00ab\u00ac\7\b\2\2\u00ac)\3\2\2\2\u00ad\u00ae\t\2"+
		"\2\2\u00ae+\3\2\2\2\u00af\u00b0\7\13\2\2\u00b0-\3\2\2\2\u00b1\u00b2\7"+
		"\f\2\2\u00b2/\3\2\2\2\u00b3\u00b4\7\r\2\2\u00b4\61\3\2\2\2\u00b5\u00b6"+
		"\7\16\2\2\u00b6\63\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8\65\3\2\2\2\u00b9"+
		"\u00ba\7\20\2\2\u00ba\67\3\2\2\2\u00bb\u00bc\7\21\2\2\u00bc9\3\2\2\2\u00bd"+
		"\u00be\7\22\2\2\u00be;\3\2\2\2\17AJU_dlu\177\u0083\u0088\u0090\u0093\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}