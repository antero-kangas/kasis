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
		MultiLineComment=1, SingleLineComment=2, WSS=3, EOL=4, Capital=5, Minuscule=6, 
		Punctuation=7, LeftParenthesis=8, RightParenthesis=9, Extra=10, Minus=11, 
		Synopsis=12, Scene=13, CapitalWord=14, Number=15, MinusculeWord=16;
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
			"Extra", "Minus", "Synopsis", "Scene", "CapitalWord", "Number", "MinusculeWord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'('", "')'", null, "'-'", 
			null, "'KOHTAUKSET'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WSS", "EOL", "Capital", 
			"Minuscule", "Punctuation", "LeftParenthesis", "RightParenthesis", "Extra", 
			"Minus", "Synopsis", "Scene", "CapitalWord", "Number", "MinusculeWord"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3\4\3\5\6\5"+
		"D\n\5\r\5\16\5E\3\6\5\6I\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17p\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21~\n\21"+
		"\r\21\16\21\177\3\21\3\21\6\21\u0084\n\21\r\21\16\21\u0085\7\21\u0088"+
		"\n\21\f\21\16\21\u008b\13\21\3\22\6\22\u008e\n\22\r\22\16\22\u008f\3\23"+
		"\3\23\6\23\u0094\n\23\r\23\16\23\u0095\3\23\3\23\3\23\6\23\u009b\n\23"+
		"\r\23\16\23\u009c\7\23\u009f\n\23\f\23\16\23\u00a2\13\23\3-\2\24\3\3\5"+
		"\4\7\2\t\5\13\6\r\7\17\b\21\2\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20"+
		"#\21%\22\3\2\t\5\2\f\f\17\17\u202a\u202b\4\2\13\13\"\"\5\2C\\\u00c6\u00c7"+
		"\u00d8\u00d8\5\2c|\u00e6\u00e7\u00f8\u00f8\3\2\62;\7\2##..\60\60<=AA\13"+
		"\2$%\'\')),-\61\61??BB~~\u20ae\u20ae\2\u00ae\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2"+
		"\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2"+
		"\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\65\3\2\2\2\7@\3\2\2\2"+
		"\tC\3\2\2\2\13H\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2"+
		"\25T\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35o\3\2\2\2\37q\3\2\2"+
		"\2!}\3\2\2\2#\u008d\3\2\2\2%\u0093\3\2\2\2\'(\7\61\2\2()\7,\2\2)-\3\2"+
		"\2\2*,\13\2\2\2+*\3\2\2\2,/\3\2\2\2-.\3\2\2\2-+\3\2\2\2.\60\3\2\2\2/-"+
		"\3\2\2\2\60\61\7,\2\2\61\62\7\61\2\2\62\63\3\2\2\2\63\64\b\2\2\2\64\4"+
		"\3\2\2\2\65\66\7\61\2\2\66\67\7\61\2\2\67;\3\2\2\28:\n\2\2\298\3\2\2\2"+
		":=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\b\3\2\2?\6\3\2\2"+
		"\2@A\t\3\2\2A\b\3\2\2\2BD\5\7\4\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2F\n\3\2\2\2GI\7\17\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\f\2\2K\f"+
		"\3\2\2\2LM\t\4\2\2M\16\3\2\2\2NO\t\5\2\2O\20\3\2\2\2PQ\t\6\2\2Q\22\3\2"+
		"\2\2RS\t\7\2\2S\24\3\2\2\2TU\7*\2\2U\26\3\2\2\2VW\7+\2\2W\30\3\2\2\2X"+
		"Y\t\b\2\2Y\32\3\2\2\2Z[\7/\2\2[\34\3\2\2\2\\]\7U\2\2]^\7[\2\2^_\7P\2\2"+
		"_`\7Q\2\2`a\7R\2\2ab\7U\2\2bc\7K\2\2cp\7U\2\2de\7V\2\2ef\7K\2\2fg\7K\2"+
		"\2gh\7X\2\2hi\7K\2\2ij\7U\2\2jk\7V\2\2kl\7G\2\2lm\7N\2\2mn\7O\2\2np\7"+
		"\u00c6\2\2o\\\3\2\2\2od\3\2\2\2p\36\3\2\2\2qr\7M\2\2rs\7Q\2\2st\7J\2\2"+
		"tu\7V\2\2uv\7C\2\2vw\7W\2\2wx\7M\2\2xy\7U\2\2yz\7G\2\2z{\7V\2\2{ \3\2"+
		"\2\2|~\5\r\7\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0089\3\2\2\2\u0081\u0083\5\33\16\2\u0082\u0084\5\r\7\2\u0083\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0081\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\"\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e"+
		"\5\21\t\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090$\3\2\2\2\u0091\u0094\5\17\b\2\u0092\u0094\5"+
		"\r\7\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00a0\3\2\2\2\u0097\u009a\5\33"+
		"\16\2\u0098\u009b\5\17\b\2\u0099\u009b\5\r\7\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u0097\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1&\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\21\2-;EHo\177\u0085\u0089\u008f\u0093\u0095\u009a\u009c\u00a0\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}