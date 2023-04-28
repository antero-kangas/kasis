// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WhiteSpace=3, Dollar=4, Semicolon=5, 
		LParen=6, RParen=7, Dot=8, Number=9, Id=10, Equal=11, Comma=12, Colon=13, 
		Plus=14, Minus=15, ToPower=16, Times=17, Div=18, Mod=19, DQString=20, 
		SQString=21;
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
			"Equal", "Comma", "Colon", "Plus", "Minus", "ToPower", "Times", "Div", 
			"Mod", "DQ", "SQ", "DQString", "SQString"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'#'", "';'", "'('", "')'", "'.'", null, null, 
			"'='", "','", "':'", "'+'", "'-'", "'\\u02C6'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WhiteSpace", "Dollar", 
			"Semicolon", "LParen", "RParen", "Dot", "Number", "Id", "Equal", "Comma", 
			"Colon", "Plus", "Minus", "ToPower", "Times", "Div", "Mod", "DQString", 
			"SQString"
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
		"\u0004\u0000\u0015\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000:\b\u0000\n\u0000\f\u0000=\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001H\b\u0001\n\u0001\f\u0001"+
		"K\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0004\t`\b\t\u000b\t\f\ta\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000bi\b\u000b\u0003\u000bk\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000bp\b\u000b\u0001\u000b\u0003\u000b"+
		"s\b\u000b\u0001\f\u0001\f\u0001\f\u0005\fx\b\f\n\f\f\f{\t\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u0095\b\u0018"+
		"\n\u0018\f\u0018\u0098\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u009e\b\u0019\n\u0019\f\u0019\u00a1\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0003;\u0096\u009f\u0000\u001a\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011\u0000"+
		"\u0013\u0000\u0015\b\u0017\t\u0019\n\u001b\u000b\u001d\f\u001f\r!\u000e"+
		"#\u000f%\u0010\'\u0011)\u0012+\u0013-\u0000/\u00001\u00143\u0015\u0001"+
		"\u0000\u0006\u0003\u0000\n\n\r\r\u2028\u2029\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000AZaz\u0001\u000009\u0002\u0000EEee\u0001\u0000\"\"\u00aa\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000"+
		"\u0000\u0003C\u0001\u0000\u0000\u0000\u0005N\u0001\u0000\u0000\u0000\u0007"+
		"R\u0001\u0000\u0000\u0000\tT\u0001\u0000\u0000\u0000\u000bV\u0001\u0000"+
		"\u0000\u0000\rX\u0001\u0000\u0000\u0000\u000fZ\u0001\u0000\u0000\u0000"+
		"\u0011\\\u0001\u0000\u0000\u0000\u0013_\u0001\u0000\u0000\u0000\u0015"+
		"c\u0001\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019t\u0001"+
		"\u0000\u0000\u0000\u001b|\u0001\u0000\u0000\u0000\u001d~\u0001\u0000\u0000"+
		"\u0000\u001f\u0080\u0001\u0000\u0000\u0000!\u0082\u0001\u0000\u0000\u0000"+
		"#\u0084\u0001\u0000\u0000\u0000%\u0086\u0001\u0000\u0000\u0000\'\u0088"+
		"\u0001\u0000\u0000\u0000)\u008a\u0001\u0000\u0000\u0000+\u008c\u0001\u0000"+
		"\u0000\u0000-\u008e\u0001\u0000\u0000\u0000/\u0090\u0001\u0000\u0000\u0000"+
		"1\u0092\u0001\u0000\u0000\u00003\u009b\u0001\u0000\u0000\u000056\u0005"+
		"/\u0000\u000067\u0005*\u0000\u00007;\u0001\u0000\u0000\u00008:\t\u0000"+
		"\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000>?\u0005*\u0000\u0000?@\u0005/\u0000\u0000@"+
		"A\u0001\u0000\u0000\u0000AB\u0006\u0000\u0000\u0000B\u0002\u0001\u0000"+
		"\u0000\u0000CD\u0005/\u0000\u0000DE\u0005/\u0000\u0000EI\u0001\u0000\u0000"+
		"\u0000FH\b\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0006\u0001\u0000\u0000M\u0004"+
		"\u0001\u0000\u0000\u0000NO\u0007\u0001\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0006\u0002\u0000\u0000Q\u0006\u0001\u0000\u0000\u0000RS\u0005"+
		"#\u0000\u0000S\b\u0001\u0000\u0000\u0000TU\u0005;\u0000\u0000U\n\u0001"+
		"\u0000\u0000\u0000VW\u0005(\u0000\u0000W\f\u0001\u0000\u0000\u0000XY\u0005"+
		")\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Z[\u0007\u0002\u0000\u0000"+
		"[\u0010\u0001\u0000\u0000\u0000\\]\u0007\u0003\u0000\u0000]\u0012\u0001"+
		"\u0000\u0000\u0000^`\u0003\u0011\b\u0000_^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"b\u0014\u0001\u0000\u0000\u0000cd\u0005.\u0000\u0000d\u0016\u0001\u0000"+
		"\u0000\u0000ej\u0003\u0013\t\u0000fh\u0003\u0015\n\u0000gi\u0003\u0013"+
		"\t\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000"+
		"\u0000\u0000jf\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kr\u0001"+
		"\u0000\u0000\u0000lo\u0007\u0004\u0000\u0000mp\u0003!\u0010\u0000np\u0003"+
		"#\u0011\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0003\u0013\t\u0000rl\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0018\u0001\u0000\u0000"+
		"\u0000ty\u0003\u000f\u0007\u0000ux\u0003\u000f\u0007\u0000vx\u0003\u0011"+
		"\b\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u001a"+
		"\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005=\u0000\u0000"+
		"}\u001c\u0001\u0000\u0000\u0000~\u007f\u0005,\u0000\u0000\u007f\u001e"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0005:\u0000\u0000\u0081 \u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005+\u0000\u0000\u0083\"\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005-\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\u02c6\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005*\u0000\u0000\u0089(\u0001\u0000\u0000\u0000\u008a\u008b\u0005/"+
		"\u0000\u0000\u008b*\u0001\u0000\u0000\u0000\u008c\u008d\u0005%\u0000\u0000"+
		"\u008d,\u0001\u0000\u0000\u0000\u008e\u008f\u0005\"\u0000\u0000\u008f"+
		".\u0001\u0000\u0000\u0000\u0090\u0091\u0005\'\u0000\u0000\u00910\u0001"+
		"\u0000\u0000\u0000\u0092\u0096\u0003-\u0016\u0000\u0093\u0095\b\u0005"+
		"\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0003-\u0016\u0000\u009a2\u0001\u0000\u0000\u0000"+
		"\u009b\u009f\u0003/\u0017\u0000\u009c\u009e\u0005\'\u0000\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0003/\u0017\u0000\u00a34\u0001\u0000\u0000\u0000\f\u0000;Iahj"+
		"orwy\u0096\u009f\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}