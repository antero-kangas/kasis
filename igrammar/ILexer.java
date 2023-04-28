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
		MultiLineComment=1, SingleLineComment=2, WhiteSpace=3, True=4, False=5, 
		Bool=6, Num=7, String=8, Dollar=9, Semicolon=10, LParen=11, RParen=12, 
		LBracket=13, RBracket=14, LCurly=15, RCurly=16, Dot=17, Number=18, Id=19, 
		Defines=20, Comma=21, Colon=22, Plus=23, Minus=24, ToPower=25, Times=26, 
		Div=27, Mod=28, DQString=29, SQString=30, Ge=31, Gt=32, Le=33, Lt=34, 
		Ne=35, Eq=36, And=37, Or=38, Not=39, Set=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MultiLineComment", "SingleLineComment", "WhiteSpace", "True", "False", 
			"Bool", "Num", "String", "Dollar", "Semicolon", "LParen", "RParen", "LBracket", 
			"RBracket", "LCurly", "RCurly", "Letter", "Digit", "Int", "Dot", "Number", 
			"Id", "Defines", "Comma", "Colon", "Plus", "Minus", "ToPower", "Times", 
			"Div", "Mod", "DQ", "SQ", "DQString", "SQString", "Ge", "Gt", "Le", "Lt", 
			"Ne", "Eq", "And", "Or", "Not", "Set"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'true'", "'false'", "'bool'", "'number'", "'string'", 
			"'$'", "';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", null, 
			null, "':='", "','", "':'", "'+'", "'-'", "'\u02C6'", "'*'", "'/'", "'%'", 
			null, null, null, "'>'", null, "'<'", null, "'=='", "'&&'", "'||'", "'!'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WhiteSpace", "True", 
			"False", "Bool", "Num", "String", "Dollar", "Semicolon", "LParen", "RParen", 
			"LBracket", "RBracket", "LCurly", "RCurly", "Dot", "Number", "Id", "Defines", 
			"Comma", "Colon", "Plus", "Minus", "ToPower", "Times", "Div", "Mod", 
			"DQString", "SQString", "Ge", "Gt", "Le", "Lt", "Ne", "Eq", "And", "Or", 
			"Not", "Set"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\6\24\u00ae\n\24\r\24\16\24\u00af\3\25\3\25\3\26\3\26\3\26\5"+
		"\26\u00b7\n\26\5\26\u00b9\n\26\3\26\3\26\3\26\5\26\u00be\n\26\3\26\5\26"+
		"\u00c1\n\26\3\27\3\27\3\27\7\27\u00c6\n\27\f\27\16\27\u00c9\13\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\7#\u00e6\n#\f#\16#\u00e9\13"+
		"#\3#\3#\3$\3$\3$\3$\7$\u00f1\n$\f$\16$\u00f4\13$\3$\3$\3%\3%\3%\5%\u00fb"+
		"\n%\3&\3&\3\'\3\'\3\'\5\'\u0102\n\'\3(\3(\3)\3)\3)\3)\3)\5)\u010b\n)\3"+
		"*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\5c\u00e7\u00f2\2/\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%"+
		"\2\'\2)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\2C\2E"+
		"\37G I!K\"M#O$Q%S&U\'W(Y)[*\3\2\b\5\2\f\f\17\17\u202a\u202b\5\2\13\f\17"+
		"\17\"\"\t\2C\\aac|\u00c6\u00c7\u00d8\u00d8\u00e6\u00e7\u00f8\u00f8\3\2"+
		"\62;\4\2GGgg\3\2$$\2\u0125\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\3]\3\2\2\2\5k\3\2\2\2\7v\3\2\2\2\tz\3\2\2\2\13\177\3\2\2\2\r"+
		"\u0085\3\2\2\2\17\u008a\3\2\2\2\21\u0091\3\2\2\2\23\u0098\3\2\2\2\25\u009a"+
		"\3\2\2\2\27\u009c\3\2\2\2\31\u009e\3\2\2\2\33\u00a0\3\2\2\2\35\u00a2\3"+
		"\2\2\2\37\u00a4\3\2\2\2!\u00a6\3\2\2\2#\u00a8\3\2\2\2%\u00aa\3\2\2\2\'"+
		"\u00ad\3\2\2\2)\u00b1\3\2\2\2+\u00b3\3\2\2\2-\u00c2\3\2\2\2/\u00ca\3\2"+
		"\2\2\61\u00cd\3\2\2\2\63\u00cf\3\2\2\2\65\u00d1\3\2\2\2\67\u00d3\3\2\2"+
		"\29\u00d5\3\2\2\2;\u00d7\3\2\2\2=\u00d9\3\2\2\2?\u00db\3\2\2\2A\u00dd"+
		"\3\2\2\2C\u00df\3\2\2\2E\u00e1\3\2\2\2G\u00ec\3\2\2\2I\u00fa\3\2\2\2K"+
		"\u00fc\3\2\2\2M\u0101\3\2\2\2O\u0103\3\2\2\2Q\u010a\3\2\2\2S\u010c\3\2"+
		"\2\2U\u010f\3\2\2\2W\u0112\3\2\2\2Y\u0115\3\2\2\2[\u0117\3\2\2\2]^\7\61"+
		"\2\2^_\7,\2\2_c\3\2\2\2`b\13\2\2\2a`\3\2\2\2be\3\2\2\2cd\3\2\2\2ca\3\2"+
		"\2\2df\3\2\2\2ec\3\2\2\2fg\7,\2\2gh\7\61\2\2hi\3\2\2\2ij\b\2\2\2j\4\3"+
		"\2\2\2kl\7\61\2\2lm\7\61\2\2mq\3\2\2\2np\n\2\2\2on\3\2\2\2ps\3\2\2\2q"+
		"o\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\b\3\2\2u\6\3\2\2\2vw\t\3\2\2"+
		"wx\3\2\2\2xy\b\4\2\2y\b\3\2\2\2z{\7v\2\2{|\7t\2\2|}\7w\2\2}~\7g\2\2~\n"+
		"\3\2\2\2\177\u0080\7h\2\2\u0080\u0081\7c\2\2\u0081\u0082\7n\2\2\u0082"+
		"\u0083\7u\2\2\u0083\u0084\7g\2\2\u0084\f\3\2\2\2\u0085\u0086\7d\2\2\u0086"+
		"\u0087\7q\2\2\u0087\u0088\7q\2\2\u0088\u0089\7n\2\2\u0089\16\3\2\2\2\u008a"+
		"\u008b\7p\2\2\u008b\u008c\7w\2\2\u008c\u008d\7o\2\2\u008d\u008e\7d\2\2"+
		"\u008e\u008f\7g\2\2\u008f\u0090\7t\2\2\u0090\20\3\2\2\2\u0091\u0092\7"+
		"u\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7p\2\2\u0096\u0097\7i\2\2\u0097\22\3\2\2\2\u0098\u0099\7&\2\2\u0099\24"+
		"\3\2\2\2\u009a\u009b\7=\2\2\u009b\26\3\2\2\2\u009c\u009d\7*\2\2\u009d"+
		"\30\3\2\2\2\u009e\u009f\7+\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7]\2\2\u00a1"+
		"\34\3\2\2\2\u00a2\u00a3\7_\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\7}\2\2\u00a5"+
		" \3\2\2\2\u00a6\u00a7\7\177\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\t\4\2\2\u00a9"+
		"$\3\2\2\2\u00aa\u00ab\t\5\2\2\u00ab&\3\2\2\2\u00ac\u00ae\5%\23\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7\60\2\2\u00b2*\3\2\2\2\u00b3\u00b8\5"+
		"\'\24\2\u00b4\u00b6\5)\25\2\u00b5\u00b7\5\'\24\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00c0\3\2\2\2\u00ba\u00bd\t\6\2\2\u00bb\u00be\5\65\33\2\u00bc"+
		"\u00be\5\67\34\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\5\'\24\2\u00c0\u00ba\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1,\3\2\2\2\u00c2\u00c7\5#\22\2\u00c3\u00c6\5#\22\2"+
		"\u00c4\u00c6\5%\23\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8.\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7<\2\2\u00cb\u00cc\7?\2\2\u00cc\60\3\2\2\2"+
		"\u00cd\u00ce\7.\2\2\u00ce\62\3\2\2\2\u00cf\u00d0\7<\2\2\u00d0\64\3\2\2"+
		"\2\u00d1\u00d2\7-\2\2\u00d2\66\3\2\2\2\u00d3\u00d4\7/\2\2\u00d48\3\2\2"+
		"\2\u00d5\u00d6\7\u02c8\2\2\u00d6:\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8<\3"+
		"\2\2\2\u00d9\u00da\7\61\2\2\u00da>\3\2\2\2\u00db\u00dc\7\'\2\2\u00dc@"+
		"\3\2\2\2\u00dd\u00de\7$\2\2\u00deB\3\2\2\2\u00df\u00e0\7)\2\2\u00e0D\3"+
		"\2\2\2\u00e1\u00e7\5A!\2\u00e2\u00e3\7^\2\2\u00e3\u00e6\7$\2\2\u00e4\u00e6"+
		"\n\7\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00eb\5A!\2\u00ebF\3\2\2\2\u00ec\u00f2\5C\"\2\u00ed\u00ee\7"+
		"^\2\2\u00ee\u00f1\7)\2\2\u00ef\u00f1\13\2\2\2\u00f0\u00ed\3\2\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\5C\"\2\u00f6"+
		"H\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8\u00fb\7?\2\2\u00f9\u00fb\7\u2267\2"+
		"\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fbJ\3\2\2\2\u00fc\u00fd"+
		"\7@\2\2\u00fdL\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff\u0102\7?\2\2\u0100\u0102"+
		"\7\u2266\2\2\u0101\u00fe\3\2\2\2\u0101\u0100\3\2\2\2\u0102N\3\2\2\2\u0103"+
		"\u0104\7>\2\2\u0104P\3\2\2\2\u0105\u0106\7#\2\2\u0106\u010b\7?\2\2\u0107"+
		"\u0108\7>\2\2\u0108\u010b\7@\2\2\u0109\u010b\7\u2262\2\2\u010a\u0105\3"+
		"\2\2\2\u010a\u0107\3\2\2\2\u010a\u0109\3\2\2\2\u010bR\3\2\2\2\u010c\u010d"+
		"\7?\2\2\u010d\u010e\7?\2\2\u010eT\3\2\2\2\u010f\u0110\7(\2\2\u0110\u0111"+
		"\7(\2\2\u0111V\3\2\2\2\u0112\u0113\7~\2\2\u0113\u0114\7~\2\2\u0114X\3"+
		"\2\2\2\u0115\u0116\7#\2\2\u0116Z\3\2\2\2\u0117\u0118\7?\2\2\u0118\\\3"+
		"\2\2\2\23\2cq\u00af\u00b6\u00b8\u00bd\u00c0\u00c5\u00c7\u00e5\u00e7\u00f0"+
		"\u00f2\u00fa\u0101\u010a\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}