// Generated from ManuscriptLexer.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ManuscriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WSS=3, EOL=4, Punctuation=5, 
		LeftParenthesis=6, RightParenthesis=7, Extra=8, Synopsis=9, Scene=10, 
		CapitalWord=11, MinusculeWord=12, Number=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MultiLineComment", "SingleLineComment", "WhiteSpace", "WSS", "EOL", 
			"Capital", "Minuscule", "Digit", "Punctuation", "LeftParenthesis", "RightParenthesis", 
			"Minus", "Extra", "Synopsis", "Scene", "CapitalWord", "MinusculeWord", 
			"Number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'('", "')'", null, null, "'KOHTAUKSET'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WSS", "EOL", "Punctuation", 
			"LeftParenthesis", "RightParenthesis", "Extra", "Synopsis", "Scene", 
			"CapitalWord", "MinusculeWord", "Number"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ManuscriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ManuscriptLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3\4\3\5\6\5"+
		"D\n\5\r\5\16\5E\3\6\5\6I\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16]\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17r\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\6\21\u0080\n\21\r\21\16\21\u0081\3\22\6\22\u0085\n\22\r\22\16\22\u0086"+
		"\3\23\6\23\u008a\n\23\r\23\16\23\u008b\3-\2\24\3\3\5\4\7\2\t\5\13\6\r"+
		"\2\17\2\21\2\23\7\25\b\27\t\31\2\33\n\35\13\37\f!\r#\16%\17\3\2\t\5\2"+
		"\f\f\17\17\u202a\u202b\4\2\13\13\"\"\5\2C\\\u00c6\u00c7\u00d8\u00d8\5"+
		"\2c|\u00e6\u00e7\u00f8\u00f8\3\2\62;\7\2##..\60\60<=AA\13\2$%\'\')),-"+
		"\61\61??BB~~\u20ae\u20ae\2\u0090\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\65"+
		"\3\2\2\2\7@\3\2\2\2\tC\3\2\2\2\13H\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21P"+
		"\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2\33\\\3\2\2\2"+
		"\35q\3\2\2\2\37s\3\2\2\2!\177\3\2\2\2#\u0084\3\2\2\2%\u0089\3\2\2\2\'"+
		"(\7\61\2\2()\7,\2\2)-\3\2\2\2*,\13\2\2\2+*\3\2\2\2,/\3\2\2\2-.\3\2\2\2"+
		"-+\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7,\2\2\61\62\7\61\2\2\62\63\3\2"+
		"\2\2\63\64\b\2\2\2\64\4\3\2\2\2\65\66\7\61\2\2\66\67\7\61\2\2\67;\3\2"+
		"\2\28:\n\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2"+
		"\2\2>?\b\3\2\2?\6\3\2\2\2@A\t\3\2\2A\b\3\2\2\2BD\5\7\4\2CB\3\2\2\2DE\3"+
		"\2\2\2EC\3\2\2\2EF\3\2\2\2F\n\3\2\2\2GI\7\17\2\2HG\3\2\2\2HI\3\2\2\2I"+
		"J\3\2\2\2JK\7\f\2\2K\f\3\2\2\2LM\t\4\2\2M\16\3\2\2\2NO\t\5\2\2O\20\3\2"+
		"\2\2PQ\t\6\2\2Q\22\3\2\2\2RS\t\7\2\2S\24\3\2\2\2TU\7*\2\2U\26\3\2\2\2"+
		"VW\7+\2\2W\30\3\2\2\2XY\7/\2\2Y\32\3\2\2\2Z]\t\b\2\2[]\5\31\r\2\\Z\3\2"+
		"\2\2\\[\3\2\2\2]\34\3\2\2\2^_\7U\2\2_`\7[\2\2`a\7P\2\2ab\7Q\2\2bc\7R\2"+
		"\2cd\7U\2\2de\7K\2\2er\7U\2\2fg\7V\2\2gh\7K\2\2hi\7K\2\2ij\7X\2\2jk\7"+
		"K\2\2kl\7U\2\2lm\7V\2\2mn\7G\2\2no\7N\2\2op\7O\2\2pr\7\u00c6\2\2q^\3\2"+
		"\2\2qf\3\2\2\2r\36\3\2\2\2st\7M\2\2tu\7Q\2\2uv\7J\2\2vw\7V\2\2wx\7C\2"+
		"\2xy\7W\2\2yz\7M\2\2z{\7U\2\2{|\7G\2\2|}\7V\2\2} \3\2\2\2~\u0080\5\r\7"+
		"\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\"\3\2\2\2\u0083\u0085\5\17\b\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087$\3\2\2\2\u0088"+
		"\u008a\5\21\t\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c&\3\2\2\2\f\2-;EH\\q\u0081\u0086\u008b"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}