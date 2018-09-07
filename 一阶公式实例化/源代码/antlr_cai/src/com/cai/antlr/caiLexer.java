// Generated from cai.g by ANTLR 4.5.3
package com.cai.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class caiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, Pre=17, 
		Var=18, Con=19, Lowercase=20, Uppercase=21, Digit=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "Pre", "Var", 
		"Con", "Lowercase", "Uppercase", "Digit", "WS"
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


	public caiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cai.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\6\22\\\n\22\r\22\16\22]\3\23\6"+
		"\23a\n\23\r\23\16\23b\3\24\3\24\7\24g\n\24\f\24\16\24j\13\24\3\24\3\24"+
		"\3\24\7\24o\n\24\f\24\16\24r\13\24\5\24t\n\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\6\30}\n\30\r\30\16\30~\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\3\2\6\3\2c|\3\2C\\\3\2\62;\6\2\13\f\17\17\"\"))\u0088"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t8\3\2\2\2\13;\3\2\2\2\r>\3"+
		"\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25H\3\2\2\2\27J\3\2\2\2\31"+
		"L\3\2\2\2\33O\3\2\2\2\35R\3\2\2\2\37U\3\2\2\2!W\3\2\2\2#Y\3\2\2\2%`\3"+
		"\2\2\2\'s\3\2\2\2)u\3\2\2\2+w\3\2\2\2-y\3\2\2\2/|\3\2\2\2\61\62\7=\2\2"+
		"\62\4\3\2\2\2\63\64\7\u0080\2\2\64\6\3\2\2\2\65\66\7(\2\2\66\67\7(\2\2"+
		"\67\b\3\2\2\289\7~\2\29:\7~\2\2:\n\3\2\2\2;<\7/\2\2<=\7@\2\2=\f\3\2\2"+
		"\2>?\7>\2\2?@\7/\2\2@A\7@\2\2A\16\3\2\2\2BC\7\'\2\2C\20\3\2\2\2DE\7&\2"+
		"\2E\22\3\2\2\2FG\7?\2\2G\24\3\2\2\2HI\7@\2\2I\26\3\2\2\2JK\7>\2\2K\30"+
		"\3\2\2\2LM\7>\2\2MN\7?\2\2N\32\3\2\2\2OP\7@\2\2PQ\7?\2\2Q\34\3\2\2\2R"+
		"S\7#\2\2ST\7?\2\2T\36\3\2\2\2UV\7*\2\2V \3\2\2\2WX\7+\2\2X\"\3\2\2\2Y"+
		"[\7B\2\2Z\\\5)\25\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^$\3\2\2\2"+
		"_a\5+\26\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c&\3\2\2\2dh\5-\27\2"+
		"eg\5-\27\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2it\3\2\2\2jh\3\2\2\2"+
		"kp\5)\25\2lo\5-\27\2mo\5)\25\2nl\3\2\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2"+
		"pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2sd\3\2\2\2sk\3\2\2\2t(\3\2\2\2uv\t\2\2\2"+
		"v*\3\2\2\2wx\t\3\2\2x,\3\2\2\2yz\t\4\2\2z.\3\2\2\2{}\t\5\2\2|{\3\2\2\2"+
		"}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\30\2"+
		"\2\u0081\60\3\2\2\2\n\2]bhnps~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}