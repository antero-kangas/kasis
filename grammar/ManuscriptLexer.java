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
		"\u0004\u0000\u000e\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000,\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003D\b\u0003"+
		"\u000b\u0003\f\u0003E\u0001\u0004\u0003\u0004I\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0003\f]\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rr\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0004\u0010\u0088\b\u0010\u000b\u0010\f\u0010\u0089\u0001\u0011"+
		"\u0004\u0011\u008d\b\u0011\u000b\u0011\f\u0011\u008e\u0001\u0012\u0004"+
		"\u0012\u0092\b\u0012\u000b\u0012\f\u0012\u0093\u0001-\u0000\u0013\u0001"+
		"\u0001\u0003\u0002\u0005\u0000\u0007\u0003\t\u0004\u000b\u0000\r\u0000"+
		"\u000f\u0000\u0011\u0005\u0013\u0006\u0015\u0007\u0017\u0000\u0019\b\u001b"+
		"\t\u001d\n\u001f\u000b!\f#\r%\u000e\u0001\u0000\u0007\u0003\u0000\n\n"+
		"\r\r\u2028\u2029\u0002\u0000\t\t  \u0003\u0000AZ\u00c4\u00c5\u00d6\u00d6"+
		"\u0003\u0000az\u00e4\u00e5\u00f6\u00f6\u0001\u000009\u0005\u0000!!,,."+
		".:;??\t\u0000\"#%%\'\'*+//==@@||\u20ac\u20ac\u0098\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u00035\u0001"+
		"\u0000\u0000\u0000\u0005@\u0001\u0000\u0000\u0000\u0007C\u0001\u0000\u0000"+
		"\u0000\tH\u0001\u0000\u0000\u0000\u000bL\u0001\u0000\u0000\u0000\rN\u0001"+
		"\u0000\u0000\u0000\u000fP\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000"+
		"\u0000\u0013T\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017"+
		"X\u0001\u0000\u0000\u0000\u0019\\\u0001\u0000\u0000\u0000\u001bq\u0001"+
		"\u0000\u0000\u0000\u001ds\u0001\u0000\u0000\u0000\u001f~\u0001\u0000\u0000"+
		"\u0000!\u0087\u0001\u0000\u0000\u0000#\u008c\u0001\u0000\u0000\u0000%"+
		"\u0091\u0001\u0000\u0000\u0000\'(\u0005/\u0000\u0000()\u0005*\u0000\u0000"+
		")-\u0001\u0000\u0000\u0000*,\t\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000"+
		",/\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005*\u0000"+
		"\u000012\u0005/\u0000\u000023\u0001\u0000\u0000\u000034\u0006\u0000\u0000"+
		"\u00004\u0002\u0001\u0000\u0000\u000056\u0005/\u0000\u000067\u0005/\u0000"+
		"\u00007;\u0001\u0000\u0000\u00008:\b\u0000\u0000\u000098\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0006"+
		"\u0001\u0000\u0000?\u0004\u0001\u0000\u0000\u0000@A\u0007\u0001\u0000"+
		"\u0000A\u0006\u0001\u0000\u0000\u0000BD\u0003\u0005\u0002\u0000CB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000F\b\u0001\u0000\u0000\u0000GI\u0005\r\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JK\u0005\n\u0000\u0000K\n\u0001\u0000\u0000\u0000LM\u0007"+
		"\u0002\u0000\u0000M\f\u0001\u0000\u0000\u0000NO\u0007\u0003\u0000\u0000"+
		"O\u000e\u0001\u0000\u0000\u0000PQ\u0007\u0004\u0000\u0000Q\u0010\u0001"+
		"\u0000\u0000\u0000RS\u0007\u0005\u0000\u0000S\u0012\u0001\u0000\u0000"+
		"\u0000TU\u0005(\u0000\u0000U\u0014\u0001\u0000\u0000\u0000VW\u0005)\u0000"+
		"\u0000W\u0016\u0001\u0000\u0000\u0000XY\u0005-\u0000\u0000Y\u0018\u0001"+
		"\u0000\u0000\u0000Z]\u0007\u0006\u0000\u0000[]\u0003\u0017\u000b\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u001a\u0001\u0000"+
		"\u0000\u0000^_\u0005S\u0000\u0000_`\u0005Y\u0000\u0000`a\u0005N\u0000"+
		"\u0000ab\u0005O\u0000\u0000bc\u0005P\u0000\u0000cd\u0005S\u0000\u0000"+
		"de\u0005I\u0000\u0000er\u0005S\u0000\u0000fg\u0005T\u0000\u0000gh\u0005"+
		"I\u0000\u0000hi\u0005I\u0000\u0000ij\u0005V\u0000\u0000jk\u0005I\u0000"+
		"\u0000kl\u0005S\u0000\u0000lm\u0005T\u0000\u0000mn\u0005E\u0000\u0000"+
		"no\u0005L\u0000\u0000op\u0005M\u0000\u0000pr\u0005\u00c4\u0000\u0000q"+
		"^\u0001\u0000\u0000\u0000qf\u0001\u0000\u0000\u0000r\u001c\u0001\u0000"+
		"\u0000\u0000st\u0005K\u0000\u0000tu\u0005O\u0000\u0000uv\u0005H\u0000"+
		"\u0000vw\u0005T\u0000\u0000wx\u0005A\u0000\u0000xy\u0005U\u0000\u0000"+
		"yz\u0005K\u0000\u0000z{\u0005S\u0000\u0000{|\u0005E\u0000\u0000|}\u0005"+
		"T\u0000\u0000}\u001e\u0001\u0000\u0000\u0000~\u007f\u0005E\u0000\u0000"+
		"\u007f\u0080\u0005F\u0000\u0000\u0080\u0081\u0005E\u0000\u0000\u0081\u0082"+
		"\u0005K\u0000\u0000\u0082\u0083\u0005T\u0000\u0000\u0083\u0084\u0005I"+
		"\u0000\u0000\u0084\u0085\u0005T\u0000\u0000\u0085 \u0001\u0000\u0000\u0000"+
		"\u0086\u0088\u0003\u000b\u0005\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\"\u0001\u0000\u0000\u0000\u008b"+
		"\u008d\u0003\r\u0006\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f$\u0001\u0000\u0000\u0000\u0090\u0092\u0003"+
		"\u000f\u0007\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094&\u0001\u0000\u0000\u0000\n\u0000-;EH\\q\u0089"+
		"\u008e\u0093\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}