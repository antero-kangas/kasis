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
public class ManuscriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WSS=3, EOL=4, Capital=5, Minuscule=6, 
		Punctuation=7, LeftParenthesis=8, RightParenthesis=9, Extra=10, Synopsis=11, 
		Scene=12, CapitalWord=13, Number=14;
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
			"Minus", "Extra", "Synopsis", "Scene", "CapitalWord", "Number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'('", "')'", null, null, 
			"'KOHTAUKSET'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WSS", "EOL", "Capital", 
			"Minuscule", "Punctuation", "LeftParenthesis", "RightParenthesis", "Extra", 
			"Synopsis", "Scene", "CapitalWord", "Number"
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
		"\u0004\u0000\u000e\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u0001"+
		"9\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0004\u0003@\b\u0003\u000b\u0003\f\u0003A\u0001\u0004\u0003\u0004E\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\fY\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\rn\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0004\u000f|\b\u000f\u000b\u000f\f\u000f}\u0001\u0010"+
		"\u0004\u0010\u0081\b\u0010\u000b\u0010\f\u0010\u0082\u0001)\u0000\u0011"+
		"\u0001\u0001\u0003\u0002\u0005\u0000\u0007\u0003\t\u0004\u000b\u0005\r"+
		"\u0006\u000f\u0000\u0011\u0007\u0013\b\u0015\t\u0017\u0000\u0019\n\u001b"+
		"\u000b\u001d\f\u001f\r!\u000e\u0001\u0000\u0007\u0003\u0000\n\n\r\r\u2028"+
		"\u2029\u0002\u0000\t\t  \u0003\u0000AZ\u00c4\u00c5\u00d6\u00d6\u0003\u0000"+
		"az\u00e4\u00e5\u00f6\u00f6\u0001\u000009\u0005\u0000!!,,..:;??\t\u0000"+
		"\"#%%\'\'*+//==@@||\u20ac\u20ac\u0088\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000"+
		"\u0000\u0005<\u0001\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\t"+
		"D\u0001\u0000\u0000\u0000\u000bH\u0001\u0000\u0000\u0000\rJ\u0001\u0000"+
		"\u0000\u0000\u000fL\u0001\u0000\u0000\u0000\u0011N\u0001\u0000\u0000\u0000"+
		"\u0013P\u0001\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017T"+
		"\u0001\u0000\u0000\u0000\u0019X\u0001\u0000\u0000\u0000\u001bm\u0001\u0000"+
		"\u0000\u0000\u001do\u0001\u0000\u0000\u0000\u001f{\u0001\u0000\u0000\u0000"+
		"!\u0080\u0001\u0000\u0000\u0000#$\u0005/\u0000\u0000$%\u0005*\u0000\u0000"+
		"%)\u0001\u0000\u0000\u0000&(\t\u0000\u0000\u0000\'&\u0001\u0000\u0000"+
		"\u0000(+\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005"+
		"*\u0000\u0000-.\u0005/\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0006\u0000"+
		"\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0005/\u0000\u000023\u0005"+
		"/\u0000\u000037\u0001\u0000\u0000\u000046\b\u0000\u0000\u000054\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:;\u0006\u0001\u0000\u0000;\u0004\u0001\u0000\u0000\u0000<=\u0007"+
		"\u0001\u0000\u0000=\u0006\u0001\u0000\u0000\u0000>@\u0003\u0005\u0002"+
		"\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000B\b\u0001\u0000\u0000\u0000CE\u0005"+
		"\r\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FG\u0005\n\u0000\u0000G\n\u0001\u0000\u0000\u0000HI"+
		"\u0007\u0002\u0000\u0000I\f\u0001\u0000\u0000\u0000JK\u0007\u0003\u0000"+
		"\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0007\u0004\u0000\u0000M\u0010"+
		"\u0001\u0000\u0000\u0000NO\u0007\u0005\u0000\u0000O\u0012\u0001\u0000"+
		"\u0000\u0000PQ\u0005(\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RS\u0005"+
		")\u0000\u0000S\u0016\u0001\u0000\u0000\u0000TU\u0005-\u0000\u0000U\u0018"+
		"\u0001\u0000\u0000\u0000VY\u0007\u0006\u0000\u0000WY\u0003\u0017\u000b"+
		"\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u001a\u0001"+
		"\u0000\u0000\u0000Z[\u0005S\u0000\u0000[\\\u0005Y\u0000\u0000\\]\u0005"+
		"N\u0000\u0000]^\u0005O\u0000\u0000^_\u0005P\u0000\u0000_`\u0005S\u0000"+
		"\u0000`a\u0005I\u0000\u0000an\u0005S\u0000\u0000bc\u0005T\u0000\u0000"+
		"cd\u0005I\u0000\u0000de\u0005I\u0000\u0000ef\u0005V\u0000\u0000fg\u0005"+
		"I\u0000\u0000gh\u0005S\u0000\u0000hi\u0005T\u0000\u0000ij\u0005E\u0000"+
		"\u0000jk\u0005L\u0000\u0000kl\u0005M\u0000\u0000ln\u0005\u00c4\u0000\u0000"+
		"mZ\u0001\u0000\u0000\u0000mb\u0001\u0000\u0000\u0000n\u001c\u0001\u0000"+
		"\u0000\u0000op\u0005K\u0000\u0000pq\u0005O\u0000\u0000qr\u0005H\u0000"+
		"\u0000rs\u0005T\u0000\u0000st\u0005A\u0000\u0000tu\u0005U\u0000\u0000"+
		"uv\u0005K\u0000\u0000vw\u0005S\u0000\u0000wx\u0005E\u0000\u0000xy\u0005"+
		"T\u0000\u0000y\u001e\u0001\u0000\u0000\u0000z|\u0003\u000b\u0005\u0000"+
		"{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0003\u000f\u0007\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\"\u0001\u0000\u0000\u0000\t\u0000)7ADX"+
		"m}\u0082\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}