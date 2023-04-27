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
public class SoundLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WhiteSpace=3, EOL=4, Semicolon=5, 
		Comma=6, Equal=7, Number=8, Id=9, LParen=10, RParen=11, LBracket=12, RBracket=13, 
		String=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MultiLineComment", "SingleLineComment", "WhiteSpace", "EOL", "Semicolon", 
			"Comma", "Equal", "Digit", "Number", "Id", "LParen", "RParen", "LBracket", 
			"RBracket", "DQString", "SQString", "String"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "';'", "','", "'='", null, null, "'('", 
			"')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WhiteSpace", "EOL", "Semicolon", 
			"Comma", "Equal", "Number", "Id", "LParen", "RParen", "LBracket", "RBracket", 
			"String"
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


	public SoundLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SoundLexer.g4"; }

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
		"9\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0003\bQ\b\b"+
		"\u0001\b\u0004\bT\b\b\u000b\b\f\bU\u0001\b\u0001\b\u0004\bZ\b\b\u000b"+
		"\b\f\b[\u0003\b^\b\b\u0001\t\u0001\t\u0005\tb\b\t\n\t\f\te\t\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000eq\b\u000e\n\u000e\f\u000et\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000fz\b\u000f\n\u000f"+
		"\f\u000f}\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0083\b\u0010\u0001)\u0000\u0011\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011\b\u0013"+
		"\t\u0015\n\u0017\u000b\u0019\f\u001b\r\u001d\u0000\u001f\u0000!\u000e"+
		"\u0001\u0000\b\u0003\u0000\n\n\r\r\u2028\u2029\u0002\u0000\t\t  \u0001"+
		"\u000009\u0002\u0000++--\u0007\u0000AZ__az\u00c4\u00c5\u00d6\u00d6\u00e4"+
		"\u00e5\u00f6\u00f6\b\u000009AZ__az\u00c4\u00c5\u00d6\u00d6\u00e4\u00e5"+
		"\u00f6\u00f6\u0001\u0000\"\"\u0001\u0000\'\'\u008b\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u00031"+
		"\u0001\u0000\u0000\u0000\u0005<\u0001\u0000\u0000\u0000\u0007A\u0001\u0000"+
		"\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000bI\u0001\u0000\u0000\u0000"+
		"\rK\u0001\u0000\u0000\u0000\u000fM\u0001\u0000\u0000\u0000\u0011P\u0001"+
		"\u0000\u0000\u0000\u0013_\u0001\u0000\u0000\u0000\u0015f\u0001\u0000\u0000"+
		"\u0000\u0017h\u0001\u0000\u0000\u0000\u0019j\u0001\u0000\u0000\u0000\u001b"+
		"l\u0001\u0000\u0000\u0000\u001dn\u0001\u0000\u0000\u0000\u001fw\u0001"+
		"\u0000\u0000\u0000!\u0082\u0001\u0000\u0000\u0000#$\u0005/\u0000\u0000"+
		"$%\u0005*\u0000\u0000%)\u0001\u0000\u0000\u0000&(\t\u0000\u0000\u0000"+
		"\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,-\u0005*\u0000\u0000-.\u0005/\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/0\u0006\u0000\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0005"+
		"/\u0000\u000023\u0005/\u0000\u000037\u0001\u0000\u0000\u000046\b\u0000"+
		"\u0000\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u0000:;\u0006\u0001\u0000\u0000;\u0004\u0001\u0000"+
		"\u0000\u0000<=\u0007\u0001\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0006"+
		"\u0002\u0001\u0000?\u0006\u0001\u0000\u0000\u0000@B\u0005\r\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CD\u0005\n\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0006\u0003\u0001"+
		"\u0000F\b\u0001\u0000\u0000\u0000GH\u0005;\u0000\u0000H\n\u0001\u0000"+
		"\u0000\u0000IJ\u0005,\u0000\u0000J\f\u0001\u0000\u0000\u0000KL\u0005="+
		"\u0000\u0000L\u000e\u0001\u0000\u0000\u0000MN\u0007\u0002\u0000\u0000"+
		"N\u0010\u0001\u0000\u0000\u0000OQ\u0007\u0003\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RT\u0003"+
		"\u000f\u0007\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V]\u0001\u0000\u0000"+
		"\u0000WY\u0005.\u0000\u0000XZ\u0003\u000f\u0007\u0000YX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\^\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^\u0012\u0001\u0000\u0000\u0000_c\u0007\u0004\u0000"+
		"\u0000`b\u0007\u0005\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0014"+
		"\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005(\u0000\u0000"+
		"g\u0016\u0001\u0000\u0000\u0000hi\u0005)\u0000\u0000i\u0018\u0001\u0000"+
		"\u0000\u0000jk\u0005[\u0000\u0000k\u001a\u0001\u0000\u0000\u0000lm\u0005"+
		"]\u0000\u0000m\u001c\u0001\u0000\u0000\u0000nr\u0005\"\u0000\u0000oq\b"+
		"\u0006\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000uv\u0005\"\u0000\u0000v\u001e\u0001\u0000"+
		"\u0000\u0000w{\u0005\'\u0000\u0000xz\b\u0007\u0000\u0000yx\u0001\u0000"+
		"\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\'\u0000\u0000\u007f \u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0003\u001d\u000e\u0000\u0081\u0083\u0003\u001f\u000f\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\"\u0001"+
		"\u0000\u0000\u0000\f\u0000)7APU[]cr{\u0082\u0002\u0000\u0001\u0000\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}