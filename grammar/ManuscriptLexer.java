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
		"\u0004\u0000\r\u0093\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000*\b\u0000\n\u0000"+
		"\f\u0000-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00018\b"+
		"\u0001\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0004\u0003B\b\u0003\u000b\u0003\f\u0003C\u0001\u0004"+
		"\u0003\u0004G\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003"+
		"\f[\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\rp\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0081\b\u000f\n\u000f\f\u000f\u0084\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u008a\b\u0010\n\u0010\f\u0010\u008d"+
		"\t\u0010\u0001\u0011\u0004\u0011\u0090\b\u0011\u000b\u0011\f\u0011\u0091"+
		"\u0001+\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0000\u0007\u0003\t"+
		"\u0004\u000b\u0000\r\u0000\u000f\u0000\u0011\u0005\u0013\u0006\u0015\u0007"+
		"\u0017\u0000\u0019\b\u001b\t\u001d\n\u001f\u000b!\f#\r\u0001\u0000\u0007"+
		"\u0003\u0000\n\n\r\r\u2028\u2029\u0002\u0000\t\t  \u0003\u0000AZ\u00c4"+
		"\u00c5\u00d6\u00d6\u0003\u0000az\u00e4\u00e5\u00f6\u00f6\u0001\u00000"+
		"9\u0005\u0000!!,,..:;??\t\u0000\"#%%\'\'*+//==@@||\u20ac\u20ac\u0096\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000"+
		"\u0005>\u0001\u0000\u0000\u0000\u0007A\u0001\u0000\u0000\u0000\tF\u0001"+
		"\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000"+
		"\u0000\u000fN\u0001\u0000\u0000\u0000\u0011P\u0001\u0000\u0000\u0000\u0013"+
		"R\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017V\u0001"+
		"\u0000\u0000\u0000\u0019Z\u0001\u0000\u0000\u0000\u001bo\u0001\u0000\u0000"+
		"\u0000\u001dq\u0001\u0000\u0000\u0000\u001f|\u0001\u0000\u0000\u0000!"+
		"\u0085\u0001\u0000\u0000\u0000#\u008f\u0001\u0000\u0000\u0000%&\u0005"+
		"/\u0000\u0000&\'\u0005*\u0000\u0000\'+\u0001\u0000\u0000\u0000(*\t\u0000"+
		"\u0000\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000./\u0005*\u0000\u0000/0\u0005/\u0000\u00000"+
		"1\u0001\u0000\u0000\u000012\u0006\u0000\u0000\u00002\u0002\u0001\u0000"+
		"\u0000\u000034\u0005/\u0000\u000045\u0005/\u0000\u000059\u0001\u0000\u0000"+
		"\u000068\b\u0000\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0006\u0001\u0000\u0000=\u0004"+
		"\u0001\u0000\u0000\u0000>?\u0007\u0001\u0000\u0000?\u0006\u0001\u0000"+
		"\u0000\u0000@B\u0003\u0005\u0002\u0000A@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"D\b\u0001\u0000\u0000\u0000EG\u0005\r\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005\n\u0000"+
		"\u0000I\n\u0001\u0000\u0000\u0000JK\u0007\u0002\u0000\u0000K\f\u0001\u0000"+
		"\u0000\u0000LM\u0007\u0003\u0000\u0000M\u000e\u0001\u0000\u0000\u0000"+
		"NO\u0007\u0004\u0000\u0000O\u0010\u0001\u0000\u0000\u0000PQ\u0007\u0005"+
		"\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0005(\u0000\u0000S\u0014"+
		"\u0001\u0000\u0000\u0000TU\u0005)\u0000\u0000U\u0016\u0001\u0000\u0000"+
		"\u0000VW\u0005-\u0000\u0000W\u0018\u0001\u0000\u0000\u0000X[\u0007\u0006"+
		"\u0000\u0000Y[\u0003\u0017\u000b\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\u001a\u0001\u0000\u0000\u0000\\]\u0005S\u0000\u0000"+
		"]^\u0005Y\u0000\u0000^_\u0005N\u0000\u0000_`\u0005O\u0000\u0000`a\u0005"+
		"P\u0000\u0000ab\u0005S\u0000\u0000bc\u0005I\u0000\u0000cp\u0005S\u0000"+
		"\u0000de\u0005T\u0000\u0000ef\u0005I\u0000\u0000fg\u0005I\u0000\u0000"+
		"gh\u0005V\u0000\u0000hi\u0005I\u0000\u0000ij\u0005S\u0000\u0000jk\u0005"+
		"T\u0000\u0000kl\u0005E\u0000\u0000lm\u0005L\u0000\u0000mn\u0005M\u0000"+
		"\u0000np\u0005\u00c4\u0000\u0000o\\\u0001\u0000\u0000\u0000od\u0001\u0000"+
		"\u0000\u0000p\u001c\u0001\u0000\u0000\u0000qr\u0005K\u0000\u0000rs\u0005"+
		"O\u0000\u0000st\u0005H\u0000\u0000tu\u0005T\u0000\u0000uv\u0005A\u0000"+
		"\u0000vw\u0005U\u0000\u0000wx\u0005K\u0000\u0000xy\u0005S\u0000\u0000"+
		"yz\u0005E\u0000\u0000z{\u0005T\u0000\u0000{\u001e\u0001\u0000\u0000\u0000"+
		"|\u0082\u0003\u000b\u0005\u0000}~\u0003\u0017\u000b\u0000~\u007f\u0003"+
		"\u000b\u0005\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080}\u0001\u0000"+
		"\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083 \u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u008b\u0003\r\u0006\u0000"+
		"\u0086\u0087\u0003\u0017\u000b\u0000\u0087\u0088\u0003\r\u0006\u0000\u0088"+
		"\u008a\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u008a"+
		"\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\"\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008e\u0090\u0003\u000f\u0007\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092$\u0001"+
		"\u0000\u0000\u0000\n\u0000+9CFZo\u0082\u008b\u0091\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}