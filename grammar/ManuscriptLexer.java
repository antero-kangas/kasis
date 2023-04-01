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
		Effects=11, CapitalWord=12, MinusculeWord=13, Number=14;
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
			"Minus", "Extra", "Synopsis", "Scene", "Effects", "CapitalWord", "MinusculeWord", 
			"Number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'('", "')'", null, null, "'KOHTAUKSET'", 
			"'EFEKTIT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WSS", "EOL", "Punctuation", 
			"LeftParenthesis", "RightParenthesis", "Extra", "Synopsis", "Scene", 
			"Effects", "CapitalWord", "MinusculeWord", "Number"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3\4"+
		"\3\4\3\5\6\5F\n\5\r\5\16\5G\3\6\5\6K\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16_\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17t\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\6\22\u008a\n\22"+
		"\r\22\16\22\u008b\3\23\6\23\u008f\n\23\r\23\16\23\u0090\3\24\6\24\u0094"+
		"\n\24\r\24\16\24\u0095\3/\2\25\3\3\5\4\7\2\t\5\13\6\r\2\17\2\21\2\23\7"+
		"\25\b\27\t\31\2\33\n\35\13\37\f!\r#\16%\17\'\20\3\2\t\5\2\f\f\17\17\u202a"+
		"\u202b\4\2\13\13\"\"\5\2C\\\u00c6\u00c7\u00d8\u00d8\5\2c|\u00e6\u00e7"+
		"\u00f8\u00f8\3\2\62;\7\2##..\60\60<=AA\13\2$%\'\')),-\61\61??BB~~\u20ae"+
		"\u20ae\2\u009a\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\67\3\2\2"+
		"\2\7B\3\2\2\2\tE\3\2\2\2\13J\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21R\3\2\2"+
		"\2\23T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33^\3\2\2\2\35s\3\2"+
		"\2\2\37u\3\2\2\2!\u0080\3\2\2\2#\u0089\3\2\2\2%\u008e\3\2\2\2\'\u0093"+
		"\3\2\2\2)*\7\61\2\2*+\7,\2\2+/\3\2\2\2,.\13\2\2\2-,\3\2\2\2.\61\3\2\2"+
		"\2/\60\3\2\2\2/-\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7,\2\2\63\64"+
		"\7\61\2\2\64\65\3\2\2\2\65\66\b\2\2\2\66\4\3\2\2\2\678\7\61\2\289\7\61"+
		"\2\29=\3\2\2\2:<\n\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2"+
		"\2\2?=\3\2\2\2@A\b\3\2\2A\6\3\2\2\2BC\t\3\2\2C\b\3\2\2\2DF\5\7\4\2ED\3"+
		"\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\n\3\2\2\2IK\7\17\2\2JI\3\2\2\2J"+
		"K\3\2\2\2KL\3\2\2\2LM\7\f\2\2M\f\3\2\2\2NO\t\4\2\2O\16\3\2\2\2PQ\t\5\2"+
		"\2Q\20\3\2\2\2RS\t\6\2\2S\22\3\2\2\2TU\t\7\2\2U\24\3\2\2\2VW\7*\2\2W\26"+
		"\3\2\2\2XY\7+\2\2Y\30\3\2\2\2Z[\7/\2\2[\32\3\2\2\2\\_\t\b\2\2]_\5\31\r"+
		"\2^\\\3\2\2\2^]\3\2\2\2_\34\3\2\2\2`a\7U\2\2ab\7[\2\2bc\7P\2\2cd\7Q\2"+
		"\2de\7R\2\2ef\7U\2\2fg\7K\2\2gt\7U\2\2hi\7V\2\2ij\7K\2\2jk\7K\2\2kl\7"+
		"X\2\2lm\7K\2\2mn\7U\2\2no\7V\2\2op\7G\2\2pq\7N\2\2qr\7O\2\2rt\7\u00c6"+
		"\2\2s`\3\2\2\2sh\3\2\2\2t\36\3\2\2\2uv\7M\2\2vw\7Q\2\2wx\7J\2\2xy\7V\2"+
		"\2yz\7C\2\2z{\7W\2\2{|\7M\2\2|}\7U\2\2}~\7G\2\2~\177\7V\2\2\177 \3\2\2"+
		"\2\u0080\u0081\7G\2\2\u0081\u0082\7H\2\2\u0082\u0083\7G\2\2\u0083\u0084"+
		"\7M\2\2\u0084\u0085\7V\2\2\u0085\u0086\7K\2\2\u0086\u0087\7V\2\2\u0087"+
		"\"\3\2\2\2\u0088\u008a\5\r\7\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c$\3\2\2\2\u008d\u008f\5"+
		"\17\b\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091&\3\2\2\2\u0092\u0094\5\21\t\2\u0093\u0092\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096(\3"+
		"\2\2\2\f\2/=GJ^s\u008b\u0090\u0095\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}