// Generated from SoundLexer.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SoundLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\5\5D"+
		"\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\5\nS\n\n\3\n"+
		"\6\nV\n\n\r\n\16\nW\3\n\3\n\6\n\\\n\n\r\n\16\n]\5\n`\n\n\3\13\3\13\7\13"+
		"d\n\13\f\13\16\13g\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\7\20s\n\20\f\20\16\20v\13\20\3\20\3\20\3\21\3\21\7\21|\n\21\f\21\16\21"+
		"\177\13\21\3\21\3\21\3\22\3\22\5\22\u0085\n\22\3+\2\23\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\2\23\n\25\13\27\f\31\r\33\16\35\17\37\2!\2#\20\3\2\n"+
		"\5\2\f\f\17\17\u202a\u202b\4\2\13\13\"\"\3\2\62;\4\2--//\t\2C\\aac|\u00c6"+
		"\u00c7\u00d8\u00d8\u00e6\u00e7\u00f8\u00f8\n\2\62;C\\aac|\u00c6\u00c7"+
		"\u00d8\u00d8\u00e6\u00e7\u00f8\u00f8\3\2$$\3\2))\2\u008d\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\63\3\2\2\2\7>\3\2\2\2\tC\3\2\2\2\13"+
		"I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23R\3\2\2\2\25a\3\2\2\2\27"+
		"h\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!y\3\2\2\2#\u0084"+
		"\3\2\2\2%&\7\61\2\2&\'\7,\2\2\'+\3\2\2\2(*\13\2\2\2)(\3\2\2\2*-\3\2\2"+
		"\2+,\3\2\2\2+)\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7,\2\2/\60\7\61\2\2\60\61"+
		"\3\2\2\2\61\62\b\2\2\2\62\4\3\2\2\2\63\64\7\61\2\2\64\65\7\61\2\2\659"+
		"\3\2\2\2\668\n\2\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3"+
		"\2\2\2;9\3\2\2\2<=\b\3\2\2=\6\3\2\2\2>?\t\3\2\2?@\3\2\2\2@A\b\4\3\2A\b"+
		"\3\2\2\2BD\7\17\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\f\2\2FG\3\2\2\2"+
		"GH\b\5\3\2H\n\3\2\2\2IJ\7=\2\2J\f\3\2\2\2KL\7.\2\2L\16\3\2\2\2MN\7?\2"+
		"\2N\20\3\2\2\2OP\t\4\2\2P\22\3\2\2\2QS\t\5\2\2RQ\3\2\2\2RS\3\2\2\2SU\3"+
		"\2\2\2TV\5\21\t\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X_\3\2\2\2Y["+
		"\7\60\2\2Z\\\5\21\t\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2"+
		"\2_Y\3\2\2\2_`\3\2\2\2`\24\3\2\2\2ae\t\6\2\2bd\t\7\2\2cb\3\2\2\2dg\3\2"+
		"\2\2ec\3\2\2\2ef\3\2\2\2f\26\3\2\2\2ge\3\2\2\2hi\7*\2\2i\30\3\2\2\2jk"+
		"\7+\2\2k\32\3\2\2\2lm\7]\2\2m\34\3\2\2\2no\7_\2\2o\36\3\2\2\2pt\7$\2\2"+
		"qs\n\b\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2"+
		"wx\7$\2\2x \3\2\2\2y}\7)\2\2z|\n\t\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7)\2\2\u0081\"\3"+
		"\2\2\2\u0082\u0085\5\37\20\2\u0083\u0085\5!\21\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085$\3\2\2\2\16\2+9CRW]_et}\u0084\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}