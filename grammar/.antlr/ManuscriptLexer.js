// Generated from /Users/antero/Rojektit/kasis/grammar/ManuscriptLexer.g4 by ANTLR 4.9.2
// jshint ignore: start
import antlr4 from 'antlr4';



const serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786",
    "\u5964\u0002\u000f\u008d\b\u0001\u0004\u0002\t\u0002\u0004\u0003\t\u0003",
    "\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007",
    "\t\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004",
    "\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010",
    "\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013",
    "\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002,\n\u0002",
    "\f\u0002\u000e\u0002/\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002",
    "\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0007\u0003:\n\u0003\f\u0003\u000e\u0003=\u000b\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0006\u0005D\n\u0005\r\u0005",
    "\u000e\u0005E\u0003\u0006\u0005\u0006I\n\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0007\u0003\u0007\u0003\b\u0003\b\u0003\t\u0003\t\u0003\n\u0003",
    "\n\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0003\r\u0003\r\u0003\u000e",
    "\u0003\u000e\u0005\u000e]\n\u000e\u0003\u000f\u0003\u000f\u0003\u000f",
    "\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f",
    "\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f",
    "\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000fr\n\u000f",
    "\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010",
    "\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011",
    "\u0006\u0011\u0080\n\u0011\r\u0011\u000e\u0011\u0081\u0003\u0012\u0006",
    "\u0012\u0085\n\u0012\r\u0012\u000e\u0012\u0086\u0003\u0013\u0006\u0013",
    "\u008a\n\u0013\r\u0013\u000e\u0013\u008b\u0003-\u0002\u0014\u0003\u0003",
    "\u0005\u0004\u0007\u0002\t\u0005\u000b\u0006\r\u0002\u000f\u0002\u0011",
    "\u0002\u0013\u0007\u0015\b\u0017\t\u0019\u0002\u001b\n\u001d\u000b\u001f",
    "\f!\r#\u000e%\u000f\u0003\u0002\t\u0005\u0002\f\f\u000f\u000f\u202a",
    "\u202b\u0004\u0002\u000b\u000b\"\"\u0005\u0002C\\\u00c6\u00c7\u00d8",
    "\u00d8\u0005\u0002c|\u00e6\u00e7\u00f8\u00f8\u0003\u00022;\u0007\u0002",
    "##..00<=AA\u000b\u0002$%\'\')),-11??BB~~\u20ae\u20ae\u0002\u0090\u0002",
    "\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002",
    "\t\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002",
    "\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002",
    "\u0017\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002",
    "\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002",
    "!\u0003\u0002\u0002\u0002\u0002#\u0003\u0002\u0002\u0002\u0002%\u0003",
    "\u0002\u0002\u0002\u0003\'\u0003\u0002\u0002\u0002\u00055\u0003\u0002",
    "\u0002\u0002\u0007@\u0003\u0002\u0002\u0002\tC\u0003\u0002\u0002\u0002",
    "\u000bH\u0003\u0002\u0002\u0002\rL\u0003\u0002\u0002\u0002\u000fN\u0003",
    "\u0002\u0002\u0002\u0011P\u0003\u0002\u0002\u0002\u0013R\u0003\u0002",
    "\u0002\u0002\u0015T\u0003\u0002\u0002\u0002\u0017V\u0003\u0002\u0002",
    "\u0002\u0019X\u0003\u0002\u0002\u0002\u001b\\\u0003\u0002\u0002\u0002",
    "\u001dq\u0003\u0002\u0002\u0002\u001fs\u0003\u0002\u0002\u0002!\u007f",
    "\u0003\u0002\u0002\u0002#\u0084\u0003\u0002\u0002\u0002%\u0089\u0003",
    "\u0002\u0002\u0002\'(\u00071\u0002\u0002()\u0007,\u0002\u0002)-\u0003",
    "\u0002\u0002\u0002*,\u000b\u0002\u0002\u0002+*\u0003\u0002\u0002\u0002",
    ",/\u0003\u0002\u0002\u0002-.\u0003\u0002\u0002\u0002-+\u0003\u0002\u0002",
    "\u0002.0\u0003\u0002\u0002\u0002/-\u0003\u0002\u0002\u000201\u0007,",
    "\u0002\u000212\u00071\u0002\u000223\u0003\u0002\u0002\u000234\b\u0002",
    "\u0002\u00024\u0004\u0003\u0002\u0002\u000256\u00071\u0002\u000267\u0007",
    "1\u0002\u00027;\u0003\u0002\u0002\u00028:\n\u0002\u0002\u000298\u0003",
    "\u0002\u0002\u0002:=\u0003\u0002\u0002\u0002;9\u0003\u0002\u0002\u0002",
    ";<\u0003\u0002\u0002\u0002<>\u0003\u0002\u0002\u0002=;\u0003\u0002\u0002",
    "\u0002>?\b\u0003\u0002\u0002?\u0006\u0003\u0002\u0002\u0002@A\t\u0003",
    "\u0002\u0002A\b\u0003\u0002\u0002\u0002BD\u0005\u0007\u0004\u0002CB",
    "\u0003\u0002\u0002\u0002DE\u0003\u0002\u0002\u0002EC\u0003\u0002\u0002",
    "\u0002EF\u0003\u0002\u0002\u0002F\n\u0003\u0002\u0002\u0002GI\u0007",
    "\u000f\u0002\u0002HG\u0003\u0002\u0002\u0002HI\u0003\u0002\u0002\u0002",
    "IJ\u0003\u0002\u0002\u0002JK\u0007\f\u0002\u0002K\f\u0003\u0002\u0002",
    "\u0002LM\t\u0004\u0002\u0002M\u000e\u0003\u0002\u0002\u0002NO\t\u0005",
    "\u0002\u0002O\u0010\u0003\u0002\u0002\u0002PQ\t\u0006\u0002\u0002Q\u0012",
    "\u0003\u0002\u0002\u0002RS\t\u0007\u0002\u0002S\u0014\u0003\u0002\u0002",
    "\u0002TU\u0007*\u0002\u0002U\u0016\u0003\u0002\u0002\u0002VW\u0007+",
    "\u0002\u0002W\u0018\u0003\u0002\u0002\u0002XY\u0007/\u0002\u0002Y\u001a",
    "\u0003\u0002\u0002\u0002Z]\t\b\u0002\u0002[]\u0005\u0019\r\u0002\\Z",
    "\u0003\u0002\u0002\u0002\\[\u0003\u0002\u0002\u0002]\u001c\u0003\u0002",
    "\u0002\u0002^_\u0007U\u0002\u0002_`\u0007[\u0002\u0002`a\u0007P\u0002",
    "\u0002ab\u0007Q\u0002\u0002bc\u0007R\u0002\u0002cd\u0007U\u0002\u0002",
    "de\u0007K\u0002\u0002er\u0007U\u0002\u0002fg\u0007V\u0002\u0002gh\u0007",
    "K\u0002\u0002hi\u0007K\u0002\u0002ij\u0007X\u0002\u0002jk\u0007K\u0002",
    "\u0002kl\u0007U\u0002\u0002lm\u0007V\u0002\u0002mn\u0007G\u0002\u0002",
    "no\u0007N\u0002\u0002op\u0007O\u0002\u0002pr\u0007\u00c6\u0002\u0002",
    "q^\u0003\u0002\u0002\u0002qf\u0003\u0002\u0002\u0002r\u001e\u0003\u0002",
    "\u0002\u0002st\u0007M\u0002\u0002tu\u0007Q\u0002\u0002uv\u0007J\u0002",
    "\u0002vw\u0007V\u0002\u0002wx\u0007C\u0002\u0002xy\u0007W\u0002\u0002",
    "yz\u0007M\u0002\u0002z{\u0007U\u0002\u0002{|\u0007G\u0002\u0002|}\u0007",
    "V\u0002\u0002} \u0003\u0002\u0002\u0002~\u0080\u0005\r\u0007\u0002\u007f",
    "~\u0003\u0002\u0002\u0002\u0080\u0081\u0003\u0002\u0002\u0002\u0081",
    "\u007f\u0003\u0002\u0002\u0002\u0081\u0082\u0003\u0002\u0002\u0002\u0082",
    "\"\u0003\u0002\u0002\u0002\u0083\u0085\u0005\u000f\b\u0002\u0084\u0083",
    "\u0003\u0002\u0002\u0002\u0085\u0086\u0003\u0002\u0002\u0002\u0086\u0084",
    "\u0003\u0002\u0002\u0002\u0086\u0087\u0003\u0002\u0002\u0002\u0087$",
    "\u0003\u0002\u0002\u0002\u0088\u008a\u0005\u0011\t\u0002\u0089\u0088",
    "\u0003\u0002\u0002\u0002\u008a\u008b\u0003\u0002\u0002\u0002\u008b\u0089",
    "\u0003\u0002\u0002\u0002\u008b\u008c\u0003\u0002\u0002\u0002\u008c&",
    "\u0003\u0002\u0002\u0002\f\u0002-;EH\\q\u0081\u0086\u008b\u0003\u0002",
    "\u0003\u0002"].join("");


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

export default class ManuscriptLexer extends antlr4.Lexer {

    static grammarFileName = "ManuscriptLexer.g4";
    static channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	static modeNames = [ "DEFAULT_MODE" ];
	static literalNames = [ null, null, null, null, null, null, "'('", "')'", 
                         null, null, "'KOHTAUKSET'" ];
	static symbolicNames = [ null, "MultiLineComment", "SingleLineComment", 
                          "WSS", "EOL", "Punctuation", "LeftParenthesis", 
                          "RightParenthesis", "Extra", "Synopsis", "Scene", 
                          "CapitalWord", "MinusculeWord", "Number" ];
	static ruleNames = [ "MultiLineComment", "SingleLineComment", "WhiteSpace", 
                      "WSS", "EOL", "Capital", "Minuscule", "Digit", "Punctuation", 
                      "LeftParenthesis", "RightParenthesis", "Minus", "Extra", 
                      "Synopsis", "Scene", "CapitalWord", "MinusculeWord", 
                      "Number" ];

    constructor(input) {
        super(input)
        this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.atn.PredictionContextCacheContextCache());
    }

    get atn() {
        return atn;
    }
}

ManuscriptLexer.EOF = antlr4.Token.EOF;
ManuscriptLexer.MultiLineComment = 1;
ManuscriptLexer.SingleLineComment = 2;
ManuscriptLexer.WSS = 3;
ManuscriptLexer.EOL = 4;
ManuscriptLexer.Punctuation = 5;
ManuscriptLexer.LeftParenthesis = 6;
ManuscriptLexer.RightParenthesis = 7;
ManuscriptLexer.Extra = 8;
ManuscriptLexer.Synopsis = 9;
ManuscriptLexer.Scene = 10;
ManuscriptLexer.CapitalWord = 11;
ManuscriptLexer.MinusculeWord = 12;
ManuscriptLexer.Number = 13;



