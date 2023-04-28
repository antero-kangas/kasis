// Generated from ILexer.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WhiteSpace=3, Dollar=4, Semicolon=5, 
		LParen=6, RParen=7, Dot=8, Number=9, Id=10, Defines=11, Equal=12, Comma=13, 
		Colon=14, Plus=15, Minus=16, ToPower=17, Times=18, Div=19, Mod=20, DQString=21, 
		SQString=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MultiLineComment", "SingleLineComment", "WhiteSpace", "Dollar", "Semicolon", 
			"LParen", "RParen", "Letter", "Digit", "Int", "Dot", "Number", "Id", 
			"Defines", "Equal", "Comma", "Colon", "Plus", "Minus", "ToPower", "Times", 
			"Div", "Mod", "DQ", "SQ", "DQString", "SQString"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'$'", "';'", "'('", "')'", "'.'", null, null, 
			"':='", "'='", "','", "':'", "'+'", "'-'", "'\u02C6'", "'*'", "'/'", 
			"'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WhiteSpace", "Dollar", 
			"Semicolon", "LParen", "RParen", "Dot", "Number", "Id", "Defines", "Equal", 
			"Comma", "Colon", "Plus", "Minus", "ToPower", "Times", "Div", "Mod", 
			"DQString", "SQString"
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


	public ILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ILexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\6\13d\n\13\r\13\16\13e\3\f\3\f\3\r\3\r\3\r\5\rm\n\r\5\ro\n\r\3\r\3"+
		"\r\3\r\5\rt\n\r\3\r\5\rw\n\r\3\16\3\16\3\16\7\16|\n\16\f\16\16\16\177"+
		"\13\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\7\33\u009c\n\33\f\33\16\33\u009f\13\33\3\33\3\33\3\34\3\34\7\34\u00a5"+
		"\n\34\f\34\16\34\u00a8\13\34\3\34\3\34\5?\u009d\u00a6\2\35\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\n\31\13\33\f\35\r\37\16!\17#\20%"+
		"\21\'\22)\23+\24-\25/\26\61\2\63\2\65\27\67\30\3\2\b\5\2\f\f\17\17\u202a"+
		"\u202b\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;\4\2GGgg\3\2$$\2\u00b1\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5G\3\2"+
		"\2\2\7R\3\2\2\2\tV\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21^\3\2"+
		"\2\2\23`\3\2\2\2\25c\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33x\3\2\2\2\35\u0080"+
		"\3\2\2\2\37\u0083\3\2\2\2!\u0085\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2"+
		"\'\u008b\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0093\3"+
		"\2\2\2\61\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u0099\3\2\2\2\67\u00a2\3\2"+
		"\2\29:\7\61\2\2:;\7,\2\2;?\3\2\2\2<>\13\2\2\2=<\3\2\2\2>A\3\2\2\2?@\3"+
		"\2\2\2?=\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7,\2\2CD\7\61\2\2DE\3\2\2\2EF\b"+
		"\2\2\2F\4\3\2\2\2GH\7\61\2\2HI\7\61\2\2IM\3\2\2\2JL\n\2\2\2KJ\3\2\2\2"+
		"LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\b\3\2\2Q\6\3\2\2"+
		"\2RS\t\3\2\2ST\3\2\2\2TU\b\4\2\2U\b\3\2\2\2VW\7&\2\2W\n\3\2\2\2XY\7=\2"+
		"\2Y\f\3\2\2\2Z[\7*\2\2[\16\3\2\2\2\\]\7+\2\2]\20\3\2\2\2^_\t\4\2\2_\22"+
		"\3\2\2\2`a\t\5\2\2a\24\3\2\2\2bd\5\23\n\2cb\3\2\2\2de\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2f\26\3\2\2\2gh\7\60\2\2h\30\3\2\2\2in\5\25\13\2jl\5\27\f\2"+
		"km\5\25\13\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2nj\3\2\2\2no\3\2\2\2ov\3\2\2"+
		"\2ps\t\6\2\2qt\5%\23\2rt\5\'\24\2sq\3\2\2\2sr\3\2\2\2st\3\2\2\2tu\3\2"+
		"\2\2uw\5\25\13\2vp\3\2\2\2vw\3\2\2\2w\32\3\2\2\2x}\5\21\t\2y|\5\21\t\2"+
		"z|\5\23\n\2{y\3\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\34\3"+
		"\2\2\2\177}\3\2\2\2\u0080\u0081\7<\2\2\u0081\u0082\7?\2\2\u0082\36\3\2"+
		"\2\2\u0083\u0084\7?\2\2\u0084 \3\2\2\2\u0085\u0086\7.\2\2\u0086\"\3\2"+
		"\2\2\u0087\u0088\7<\2\2\u0088$\3\2\2\2\u0089\u008a\7-\2\2\u008a&\3\2\2"+
		"\2\u008b\u008c\7/\2\2\u008c(\3\2\2\2\u008d\u008e\7\u02c8\2\2\u008e*\3"+
		"\2\2\2\u008f\u0090\7,\2\2\u0090,\3\2\2\2\u0091\u0092\7\61\2\2\u0092.\3"+
		"\2\2\2\u0093\u0094\7\'\2\2\u0094\60\3\2\2\2\u0095\u0096\7$\2\2\u0096\62"+
		"\3\2\2\2\u0097\u0098\7)\2\2\u0098\64\3\2\2\2\u0099\u009d\5\61\31\2\u009a"+
		"\u009c\n\7\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a1\5\61\31\2\u00a1\66\3\2\2\2\u00a2\u00a6\5\63\32\2\u00a3\u00a5\7"+
		")\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\5\63"+
		"\32\2\u00aa8\3\2\2\2\16\2?Melnsv{}\u009d\u00a6\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}