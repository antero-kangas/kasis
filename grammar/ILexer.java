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
		LParen=6, RParen=7, Number=8, Id=9, Equal=10, Comma=11, Colon=12, Plus=13, 
		Minus=14, ToPower=15, Times=16, Div=17, Mod=18, DQString=19, SQString=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MultiLineComment", "SingleLineComment", "WhiteSpace", "Dollar", "Semicolon", 
			"LParen", "RParen", "Letter", "Digit", "Int", "Number", "Id", "Equal", 
			"Comma", "Colon", "Plus", "Minus", "ToPower", "Times", "Div", "Mod", 
			"DQ", "SQ", "DQString", "SQString"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'#'", "';'", "'('", "')'", null, null, "'='", 
			"','", "':'", "'+'", "'-'", "'\\u02C6'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WhiteSpace", "Dollar", 
			"Semicolon", "LParen", "RParen", "Number", "Id", "Equal", "Comma", "Colon", 
			"Plus", "Minus", "ToPower", "Times", "Div", "Mod", "DQString", "SQString"
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
		"\u0004\u0000\u0014\u009f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u00008\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001F\b\u0001\n\u0001\f\u0001I\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004\t^"+
		"\b\t\u000b\t\f\t_\u0001\n\u0001\n\u0001\n\u0003\ne\b\n\u0003\ng\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\nl\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000bs\b\u000b\n\u000b\f\u000bv\t\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u0090\b\u0017\n"+
		"\u0017\f\u0017\u0093\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0099\b\u0018\n\u0018\f\u0018\u009c\t\u0018\u0001\u0018"+
		"\u0001\u0018\u00039\u0091\u009a\u0000\u0019\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011\u0000"+
		"\u0013\u0000\u0015\b\u0017\t\u0019\n\u001b\u000b\u001d\f\u001f\r!\u000e"+
		"#\u000f%\u0010\'\u0011)\u0012+\u0000-\u0000/\u00131\u0014\u0001\u0000"+
		"\u0006\u0003\u0000\n\n\r\r\u2028\u2029\u0002\u0000\t\t  \u0002\u0000A"+
		"Zaz\u0001\u000009\u0002\u0000EEee\u0001\u0000\"\"\u00a4\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00013\u0001\u0000\u0000\u0000\u0003A\u0001\u0000\u0000\u0000\u0005"+
		"L\u0001\u0000\u0000\u0000\u0007P\u0001\u0000\u0000\u0000\tR\u0001\u0000"+
		"\u0000\u0000\u000bT\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000"+
		"\u000fX\u0001\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000\u0013]"+
		"\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000\u0000\u0017o\u0001\u0000"+
		"\u0000\u0000\u0019w\u0001\u0000\u0000\u0000\u001by\u0001\u0000\u0000\u0000"+
		"\u001d{\u0001\u0000\u0000\u0000\u001f}\u0001\u0000\u0000\u0000!\u007f"+
		"\u0001\u0000\u0000\u0000#\u0081\u0001\u0000\u0000\u0000%\u0083\u0001\u0000"+
		"\u0000\u0000\'\u0085\u0001\u0000\u0000\u0000)\u0087\u0001\u0000\u0000"+
		"\u0000+\u0089\u0001\u0000\u0000\u0000-\u008b\u0001\u0000\u0000\u0000/"+
		"\u008d\u0001\u0000\u0000\u00001\u0096\u0001\u0000\u0000\u000034\u0005"+
		"/\u0000\u000045\u0005*\u0000\u000059\u0001\u0000\u0000\u000068\t\u0000"+
		"\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<=\u0005*\u0000\u0000=>\u0005/\u0000\u0000>"+
		"?\u0001\u0000\u0000\u0000?@\u0006\u0000\u0000\u0000@\u0002\u0001\u0000"+
		"\u0000\u0000AB\u0005/\u0000\u0000BC\u0005/\u0000\u0000CG\u0001\u0000\u0000"+
		"\u0000DF\b\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0006\u0001\u0000\u0000K\u0004"+
		"\u0001\u0000\u0000\u0000LM\u0007\u0001\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NO\u0006\u0002\u0000\u0000O\u0006\u0001\u0000\u0000\u0000PQ\u0005"+
		"#\u0000\u0000Q\b\u0001\u0000\u0000\u0000RS\u0005;\u0000\u0000S\n\u0001"+
		"\u0000\u0000\u0000TU\u0005(\u0000\u0000U\f\u0001\u0000\u0000\u0000VW\u0005"+
		")\u0000\u0000W\u000e\u0001\u0000\u0000\u0000XY\u0007\u0002\u0000\u0000"+
		"Y\u0010\u0001\u0000\u0000\u0000Z[\u0007\u0003\u0000\u0000[\u0012\u0001"+
		"\u0000\u0000\u0000\\^\u0003\u0011\b\u0000]\\\u0001\u0000\u0000\u0000^"+
		"_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`\u0014\u0001\u0000\u0000\u0000af\u0003\u0013\t\u0000bd\u0003\u001b"+
		"\r\u0000ce\u0003\u0013\t\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000eg\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0007\u0004\u0000\u0000"+
		"il\u0003\u001f\u000f\u0000jl\u0003!\u0010\u0000ki\u0001\u0000\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0003\u0013\t\u0000n\u0016\u0001\u0000\u0000\u0000ot\u0003\u000f"+
		"\u0007\u0000ps\u0003\u000f\u0007\u0000qs\u0003\u0011\b\u0000rp\u0001\u0000"+
		"\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0018\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000wx\u0005=\u0000\u0000x\u001a\u0001\u0000"+
		"\u0000\u0000yz\u0005,\u0000\u0000z\u001c\u0001\u0000\u0000\u0000{|\u0005"+
		":\u0000\u0000|\u001e\u0001\u0000\u0000\u0000}~\u0005+\u0000\u0000~ \u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005-\u0000\u0000\u0080\"\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005\u02c6\u0000\u0000\u0082$\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005*\u0000\u0000\u0084&\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005/\u0000\u0000\u0086(\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"%\u0000\u0000\u0088*\u0001\u0000\u0000\u0000\u0089\u008a\u0005\"\u0000"+
		"\u0000\u008a,\u0001\u0000\u0000\u0000\u008b\u008c\u0005\'\u0000\u0000"+
		"\u008c.\u0001\u0000\u0000\u0000\u008d\u0091\u0003+\u0015\u0000\u008e\u0090"+
		"\b\u0005\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0003+\u0015\u0000\u00950\u0001\u0000\u0000"+
		"\u0000\u0096\u009a\u0003-\u0016\u0000\u0097\u0099\u0005\'\u0000\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0003-\u0016\u0000\u009e2\u0001\u0000\u0000\u0000\u000b\u0000"+
		"9G_dfkrt\u0091\u009a\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}