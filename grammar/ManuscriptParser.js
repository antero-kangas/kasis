// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';
import ManuscriptParserListener from './ManuscriptParserListener.js';
const serializedATN = [4,1,14,295,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,1,0,3,0,54,8,0,
1,0,3,0,57,8,0,1,0,3,0,60,8,0,1,0,3,0,63,8,0,1,0,3,0,66,8,0,1,0,1,0,1,1,
1,1,1,1,4,1,73,8,1,11,1,12,1,74,1,2,1,2,1,3,1,3,1,3,4,3,82,8,3,11,3,12,3,
83,1,4,1,4,1,5,1,5,1,5,4,5,91,8,5,11,5,12,5,92,1,6,1,6,1,7,1,7,4,7,99,8,
7,11,7,12,7,100,1,7,3,7,104,8,7,1,8,1,8,1,9,1,9,4,9,110,8,9,11,9,12,9,111,
4,9,114,8,9,11,9,12,9,115,1,10,1,10,1,11,1,11,1,12,3,12,123,8,12,1,12,1,
12,1,13,1,13,4,13,129,8,13,11,13,12,13,130,1,13,3,13,134,8,13,1,14,1,14,
1,15,4,15,139,8,15,11,15,12,15,140,1,16,1,16,4,16,145,8,16,11,16,12,16,146,
1,16,1,16,4,16,151,8,16,11,16,12,16,152,5,16,155,8,16,10,16,12,16,158,9,
16,1,16,1,16,1,16,4,16,163,8,16,11,16,12,16,164,1,16,1,16,1,16,1,16,3,16,
171,8,16,1,16,4,16,174,8,16,11,16,12,16,175,4,16,178,8,16,11,16,12,16,179,
4,16,182,8,16,11,16,12,16,183,4,16,186,8,16,11,16,12,16,187,1,17,1,17,1,
18,4,18,193,8,18,11,18,12,18,194,1,18,1,18,4,18,199,8,18,11,18,12,18,200,
5,18,203,8,18,10,18,12,18,206,9,18,1,19,1,19,1,19,1,19,5,19,212,8,19,10,
19,12,19,215,9,19,1,20,1,20,1,21,1,21,1,22,1,22,3,22,223,8,22,1,22,4,22,
226,8,22,11,22,12,22,227,1,22,3,22,231,8,22,1,22,3,22,234,8,22,5,22,236,
8,22,10,22,12,22,239,9,22,1,22,1,22,3,22,243,8,22,1,22,5,22,246,8,22,10,
22,12,22,249,9,22,1,22,3,22,252,8,22,1,22,3,22,255,8,22,4,22,257,8,22,11,
22,12,22,258,3,22,261,8,22,1,23,1,23,1,23,1,23,4,23,267,8,23,11,23,12,23,
268,1,23,1,23,1,24,5,24,274,8,24,10,24,12,24,277,9,24,1,24,1,24,5,24,281,
8,24,10,24,12,24,284,9,24,1,25,1,25,1,25,1,25,5,25,290,8,25,10,25,12,25,
293,9,25,1,25,0,0,26,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,
38,40,42,44,46,48,50,0,3,3,0,7,7,10,10,13,14,3,0,6,7,10,10,13,14,3,0,6,7,
10,10,14,14,314,0,53,1,0,0,0,2,69,1,0,0,0,4,76,1,0,0,0,6,78,1,0,0,0,8,85,
1,0,0,0,10,87,1,0,0,0,12,94,1,0,0,0,14,96,1,0,0,0,16,105,1,0,0,0,18,113,
1,0,0,0,20,117,1,0,0,0,22,119,1,0,0,0,24,122,1,0,0,0,26,126,1,0,0,0,28,135,
1,0,0,0,30,138,1,0,0,0,32,142,1,0,0,0,34,189,1,0,0,0,36,192,1,0,0,0,38,207,
1,0,0,0,40,216,1,0,0,0,42,218,1,0,0,0,44,260,1,0,0,0,46,262,1,0,0,0,48,275,
1,0,0,0,50,285,1,0,0,0,52,54,3,2,1,0,53,52,1,0,0,0,53,54,1,0,0,0,54,56,1,
0,0,0,55,57,3,6,3,0,56,55,1,0,0,0,56,57,1,0,0,0,57,59,1,0,0,0,58,60,3,10,
5,0,59,58,1,0,0,0,59,60,1,0,0,0,60,62,1,0,0,0,61,63,3,14,7,0,62,61,1,0,0,
0,62,63,1,0,0,0,63,65,1,0,0,0,64,66,3,26,13,0,65,64,1,0,0,0,65,66,1,0,0,
0,66,67,1,0,0,0,67,68,5,0,0,1,68,1,1,0,0,0,69,70,3,22,11,0,70,72,3,4,2,0,
71,73,3,24,12,0,72,71,1,0,0,0,73,74,1,0,0,0,74,72,1,0,0,0,74,75,1,0,0,0,
75,3,1,0,0,0,76,77,3,36,18,0,77,5,1,0,0,0,78,79,3,22,11,0,79,81,3,8,4,0,
80,82,3,24,12,0,81,80,1,0,0,0,82,83,1,0,0,0,83,81,1,0,0,0,83,84,1,0,0,0,
84,7,1,0,0,0,85,86,3,50,25,0,86,9,1,0,0,0,87,88,3,22,11,0,88,90,3,12,6,0,
89,91,3,24,12,0,90,89,1,0,0,0,91,92,1,0,0,0,92,90,1,0,0,0,92,93,1,0,0,0,
93,11,1,0,0,0,94,95,3,50,25,0,95,13,1,0,0,0,96,98,3,16,8,0,97,99,3,24,12,
0,98,97,1,0,0,0,99,100,1,0,0,0,100,98,1,0,0,0,100,101,1,0,0,0,101,103,1,
0,0,0,102,104,3,18,9,0,103,102,1,0,0,0,103,104,1,0,0,0,104,15,1,0,0,0,105,
106,5,11,0,0,106,17,1,0,0,0,107,109,3,20,10,0,108,110,3,24,12,0,109,108,
1,0,0,0,110,111,1,0,0,0,111,109,1,0,0,0,111,112,1,0,0,0,112,114,1,0,0,0,
113,107,1,0,0,0,114,115,1,0,0,0,115,113,1,0,0,0,115,116,1,0,0,0,116,19,1,
0,0,0,117,118,3,50,25,0,118,21,1,0,0,0,119,120,5,3,0,0,120,23,1,0,0,0,121,
123,3,22,11,0,122,121,1,0,0,0,122,123,1,0,0,0,123,124,1,0,0,0,124,125,5,
4,0,0,125,25,1,0,0,0,126,128,3,28,14,0,127,129,3,24,12,0,128,127,1,0,0,0,
129,130,1,0,0,0,130,128,1,0,0,0,130,131,1,0,0,0,131,133,1,0,0,0,132,134,
3,30,15,0,133,132,1,0,0,0,133,134,1,0,0,0,134,27,1,0,0,0,135,136,5,12,0,
0,136,29,1,0,0,0,137,139,3,32,16,0,138,137,1,0,0,0,139,140,1,0,0,0,140,138,
1,0,0,0,140,141,1,0,0,0,141,31,1,0,0,0,142,144,3,34,17,0,143,145,3,24,12,
0,144,143,1,0,0,0,145,146,1,0,0,0,146,144,1,0,0,0,146,147,1,0,0,0,147,185,
1,0,0,0,148,150,3,42,21,0,149,151,3,24,12,0,150,149,1,0,0,0,151,152,1,0,
0,0,152,150,1,0,0,0,152,153,1,0,0,0,153,155,1,0,0,0,154,148,1,0,0,0,155,
158,1,0,0,0,156,154,1,0,0,0,156,157,1,0,0,0,157,181,1,0,0,0,158,156,1,0,
0,0,159,160,3,22,11,0,160,162,3,38,19,0,161,163,3,24,12,0,162,161,1,0,0,
0,163,164,1,0,0,0,164,162,1,0,0,0,164,165,1,0,0,0,165,177,1,0,0,0,166,167,
3,22,11,0,167,168,3,40,20,0,168,171,1,0,0,0,169,171,3,42,21,0,170,166,1,
0,0,0,170,169,1,0,0,0,171,173,1,0,0,0,172,174,3,24,12,0,173,172,1,0,0,0,
174,175,1,0,0,0,175,173,1,0,0,0,175,176,1,0,0,0,176,178,1,0,0,0,177,170,
1,0,0,0,178,179,1,0,0,0,179,177,1,0,0,0,179,180,1,0,0,0,180,182,1,0,0,0,
181,159,1,0,0,0,182,183,1,0,0,0,183,181,1,0,0,0,183,184,1,0,0,0,184,186,
1,0,0,0,185,156,1,0,0,0,186,187,1,0,0,0,187,185,1,0,0,0,187,188,1,0,0,0,
188,33,1,0,0,0,189,190,3,36,18,0,190,35,1,0,0,0,191,193,7,0,0,0,192,191,
1,0,0,0,193,194,1,0,0,0,194,192,1,0,0,0,194,195,1,0,0,0,195,204,1,0,0,0,
196,198,3,22,11,0,197,199,7,0,0,0,198,197,1,0,0,0,199,200,1,0,0,0,200,198,
1,0,0,0,200,201,1,0,0,0,201,203,1,0,0,0,202,196,1,0,0,0,203,206,1,0,0,0,
204,202,1,0,0,0,204,205,1,0,0,0,205,37,1,0,0,0,206,204,1,0,0,0,207,213,5,
13,0,0,208,209,3,22,11,0,209,210,5,13,0,0,210,212,1,0,0,0,211,208,1,0,0,
0,212,215,1,0,0,0,213,211,1,0,0,0,213,214,1,0,0,0,214,39,1,0,0,0,215,213,
1,0,0,0,216,217,3,44,22,0,217,41,1,0,0,0,218,219,3,44,22,0,219,43,1,0,0,
0,220,237,3,50,25,0,221,223,3,22,11,0,222,221,1,0,0,0,222,223,1,0,0,0,223,
224,1,0,0,0,224,226,3,46,23,0,225,222,1,0,0,0,226,227,1,0,0,0,227,225,1,
0,0,0,227,228,1,0,0,0,228,233,1,0,0,0,229,231,3,22,11,0,230,229,1,0,0,0,
230,231,1,0,0,0,231,232,1,0,0,0,232,234,3,50,25,0,233,230,1,0,0,0,233,234,
1,0,0,0,234,236,1,0,0,0,235,225,1,0,0,0,236,239,1,0,0,0,237,235,1,0,0,0,
237,238,1,0,0,0,238,261,1,0,0,0,239,237,1,0,0,0,240,247,3,46,23,0,241,243,
3,22,11,0,242,241,1,0,0,0,242,243,1,0,0,0,243,244,1,0,0,0,244,246,3,46,23,
0,245,242,1,0,0,0,246,249,1,0,0,0,247,245,1,0,0,0,247,248,1,0,0,0,248,254,
1,0,0,0,249,247,1,0,0,0,250,252,3,22,11,0,251,250,1,0,0,0,251,252,1,0,0,
0,252,253,1,0,0,0,253,255,3,50,25,0,254,251,1,0,0,0,254,255,1,0,0,0,255,
257,1,0,0,0,256,240,1,0,0,0,257,258,1,0,0,0,258,256,1,0,0,0,258,259,1,0,
0,0,259,261,1,0,0,0,260,220,1,0,0,0,260,256,1,0,0,0,261,45,1,0,0,0,262,266,
5,8,0,0,263,267,3,22,11,0,264,267,3,50,25,0,265,267,5,13,0,0,266,263,1,0,
0,0,266,264,1,0,0,0,266,265,1,0,0,0,267,268,1,0,0,0,268,266,1,0,0,0,268,
269,1,0,0,0,269,270,1,0,0,0,270,271,5,9,0,0,271,47,1,0,0,0,272,274,7,1,0,
0,273,272,1,0,0,0,274,277,1,0,0,0,275,273,1,0,0,0,275,276,1,0,0,0,276,278,
1,0,0,0,277,275,1,0,0,0,278,282,7,2,0,0,279,281,7,1,0,0,280,279,1,0,0,0,
281,284,1,0,0,0,282,280,1,0,0,0,282,283,1,0,0,0,283,49,1,0,0,0,284,282,1,
0,0,0,285,291,3,48,24,0,286,287,3,22,11,0,287,288,3,48,24,0,288,290,1,0,
0,0,289,286,1,0,0,0,290,293,1,0,0,0,291,289,1,0,0,0,291,292,1,0,0,0,292,
51,1,0,0,0,293,291,1,0,0,0,45,53,56,59,62,65,74,83,92,100,103,111,115,122,
130,133,140,146,152,156,164,170,175,179,183,187,194,200,204,213,222,227,
230,233,237,242,247,251,254,258,260,266,268,275,282,291];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class ManuscriptParser extends antlr4.Parser {

    static grammarFileName = "java-escape";
    static literalNames = [ null, null, null, null, null, null, null, null, 
                            "'('", "')'", null, null, "'KOHTAUKSET'" ];
    static symbolicNames = [ null, "MultiLineComment", "SingleLineComment", 
                             "WSS", "EOL", "Capital", "Minuscule", "Punctuation", 
                             "LeftParenthesis", "RightParenthesis", "Extra", 
                             "Synopsis", "Scene", "CapitalWord", "Number" ];
    static ruleNames = [ "manuscript", "titleParagraph", "title", "authorParagraph", 
                         "author", "dateParagraph", "date", "synopsisPart", 
                         "synopsisTitle", "synopsisParagraphs", "synopsisParagraph", 
                         "wss", "eol", "scenesPart", "scenesHeading", "scenes", 
                         "scene", "sceneHeading", "heading", "name", "replique", 
                         "parenthesis", "nonCapitalTextOrCommand", "command", 
                         "nonCapitalWord", "nonCapitalText" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = ManuscriptParser.ruleNames;
        this.literalNames = ManuscriptParser.literalNames;
        this.symbolicNames = ManuscriptParser.symbolicNames;
    }

    get atn() {
        return atn;
    }



	manuscript() {
	    let localctx = new ManuscriptContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, ManuscriptParser.RULE_manuscript);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 53;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,0,this._ctx);
	        if(la_===1) {
	            this.state = 52;
	            this.titleParagraph();

	        }
	        this.state = 56;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
	        if(la_===1) {
	            this.state = 55;
	            this.authorParagraph();

	        }
	        this.state = 59;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===3) {
	            this.state = 58;
	            this.dateParagraph();
	        }

	        this.state = 62;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===11) {
	            this.state = 61;
	            this.synopsisPart();
	        }

	        this.state = 65;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===12) {
	            this.state = 64;
	            this.scenesPart();
	        }

	        this.state = 67;
	        this.match(ManuscriptParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	titleParagraph() {
	    let localctx = new TitleParagraphContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, ManuscriptParser.RULE_titleParagraph);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 69;
	        this.wss();
	        this.state = 70;
	        this.title();
	        this.state = 72; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 71;
	        		this.eol();
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 74; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,5, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	title() {
	    let localctx = new TitleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, ManuscriptParser.RULE_title);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 76;
	        this.heading();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	authorParagraph() {
	    let localctx = new AuthorParagraphContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, ManuscriptParser.RULE_authorParagraph);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 78;
	        this.wss();
	        this.state = 79;
	        this.author();
	        this.state = 81; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 80;
	        		this.eol();
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 83; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,6, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	author() {
	    let localctx = new AuthorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, ManuscriptParser.RULE_author);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 85;
	        this.nonCapitalText();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	dateParagraph() {
	    let localctx = new DateParagraphContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, ManuscriptParser.RULE_dateParagraph);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 87;
	        this.wss();
	        this.state = 88;
	        this.date();
	        this.state = 90; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 89;
	            this.eol();
	            this.state = 92; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===3 || _la===4);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	date() {
	    let localctx = new DateContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, ManuscriptParser.RULE_date);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 94;
	        this.nonCapitalText();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	synopsisPart() {
	    let localctx = new SynopsisPartContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, ManuscriptParser.RULE_synopsisPart);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 96;
	        this.synopsisTitle();
	        this.state = 98; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 97;
	            this.eol();
	            this.state = 100; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===3 || _la===4);
	        this.state = 103;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & 25792) !== 0)) {
	            this.state = 102;
	            this.synopsisParagraphs();
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	synopsisTitle() {
	    let localctx = new SynopsisTitleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, ManuscriptParser.RULE_synopsisTitle);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 105;
	        this.match(ManuscriptParser.Synopsis);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	synopsisParagraphs() {
	    let localctx = new SynopsisParagraphsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, ManuscriptParser.RULE_synopsisParagraphs);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 113; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 107;
	            this.synopsisParagraph();
	            this.state = 109; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            do {
	                this.state = 108;
	                this.eol();
	                this.state = 111; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            } while(_la===3 || _la===4);
	            this.state = 115; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & 25792) !== 0));
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	synopsisParagraph() {
	    let localctx = new SynopsisParagraphContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, ManuscriptParser.RULE_synopsisParagraph);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 117;
	        this.nonCapitalText();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	wss() {
	    let localctx = new WssContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, ManuscriptParser.RULE_wss);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 119;
	        this.match(ManuscriptParser.WSS);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	eol() {
	    let localctx = new EolContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, ManuscriptParser.RULE_eol);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 122;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===3) {
	            this.state = 121;
	            this.wss();
	        }

	        this.state = 124;
	        this.match(ManuscriptParser.EOL);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	scenesPart() {
	    let localctx = new ScenesPartContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, ManuscriptParser.RULE_scenesPart);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 126;
	        this.scenesHeading();
	        this.state = 128; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 127;
	            this.eol();
	            this.state = 130; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===3 || _la===4);
	        this.state = 133;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & 25728) !== 0)) {
	            this.state = 132;
	            this.scenes();
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	scenesHeading() {
	    let localctx = new ScenesHeadingContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 28, ManuscriptParser.RULE_scenesHeading);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 135;
	        this.match(ManuscriptParser.Scene);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	scenes() {
	    let localctx = new ScenesContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, ManuscriptParser.RULE_scenes);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 138; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 137;
	            this.scene();
	            this.state = 140; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & 25728) !== 0));
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	scene() {
	    let localctx = new SceneContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 32, ManuscriptParser.RULE_scene);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 142;
	        this.sceneHeading();
	        this.state = 144; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 143;
	        		this.eol();
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 146; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,16, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 185; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 156;
	        		this._errHandler.sync(this);
	        		_la = this._input.LA(1);
	        		while((((_la) & ~0x1f) == 0 && ((1 << _la) & 26048) !== 0)) {
	        		    this.state = 148;
	        		    this.parenthesis();
	        		    this.state = 150; 
	        		    this._errHandler.sync(this);
	        		    var _alt = 1;
	        		    do {
	        		    	switch (_alt) {
	        		    	case 1:
	        		    		this.state = 149;
	        		    		this.eol();
	        		    		break;
	        		    	default:
	        		    		throw new antlr4.error.NoViableAltException(this);
	        		    	}
	        		    	this.state = 152; 
	        		    	this._errHandler.sync(this);
	        		    	_alt = this._interp.adaptivePredict(this._input,17, this._ctx);
	        		    } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        		    this.state = 158;
	        		    this._errHandler.sync(this);
	        		    _la = this._input.LA(1);
	        		}
	        		this.state = 181; 
	        		this._errHandler.sync(this);
	        		var _alt = 1;
	        		do {
	        			switch (_alt) {
	        			case 1:
	        				this.state = 159;
	        				this.wss();
	        				this.state = 160;
	        				this.name();
	        				this.state = 162; 
	        				this._errHandler.sync(this);
	        				var _alt = 1;
	        				do {
	        					switch (_alt) {
	        					case 1:
	        						this.state = 161;
	        						this.eol();
	        						break;
	        					default:
	        						throw new antlr4.error.NoViableAltException(this);
	        					}
	        					this.state = 164; 
	        					this._errHandler.sync(this);
	        					_alt = this._interp.adaptivePredict(this._input,19, this._ctx);
	        				} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        				this.state = 177; 
	        				this._errHandler.sync(this);
	        				var _alt = 1;
	        				do {
	        					switch (_alt) {
	        					case 1:
	        						this.state = 170;
	        						this._errHandler.sync(this);
	        						switch(this._input.LA(1)) {
	        						case 3:
	        						    this.state = 166;
	        						    this.wss();
	        						    this.state = 167;
	        						    this.replique();
	        						    break;
	        						case 6:
	        						case 7:
	        						case 8:
	        						case 10:
	        						case 13:
	        						case 14:
	        						    this.state = 169;
	        						    this.parenthesis();
	        						    break;
	        						default:
	        						    throw new antlr4.error.NoViableAltException(this);
	        						}
	        						this.state = 173; 
	        						this._errHandler.sync(this);
	        						var _alt = 1;
	        						do {
	        							switch (_alt) {
	        							case 1:
	        								this.state = 172;
	        								this.eol();
	        								break;
	        							default:
	        								throw new antlr4.error.NoViableAltException(this);
	        							}
	        							this.state = 175; 
	        							this._errHandler.sync(this);
	        							_alt = this._interp.adaptivePredict(this._input,21, this._ctx);
	        						} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        						break;
	        					default:
	        						throw new antlr4.error.NoViableAltException(this);
	        					}
	        					this.state = 179; 
	        					this._errHandler.sync(this);
	        					_alt = this._interp.adaptivePredict(this._input,22, this._ctx);
	        				} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        				break;
	        			default:
	        				throw new antlr4.error.NoViableAltException(this);
	        			}
	        			this.state = 183; 
	        			this._errHandler.sync(this);
	        			_alt = this._interp.adaptivePredict(this._input,23, this._ctx);
	        		} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 187; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,24, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	sceneHeading() {
	    let localctx = new SceneHeadingContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 34, ManuscriptParser.RULE_sceneHeading);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 189;
	        this.heading();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	heading() {
	    let localctx = new HeadingContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 36, ManuscriptParser.RULE_heading);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 192; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 191;
	            _la = this._input.LA(1);
	            if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & 25728) !== 0))) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 194; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & 25728) !== 0));
	        this.state = 204;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,27,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 196;
	                this.wss();
	                this.state = 198; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	                do {
	                    this.state = 197;
	                    _la = this._input.LA(1);
	                    if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & 25728) !== 0))) {
	                    this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 200; 
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                } while((((_la) & ~0x1f) == 0 && ((1 << _la) & 25728) !== 0)); 
	            }
	            this.state = 206;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,27,this._ctx);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	name() {
	    let localctx = new NameContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 38, ManuscriptParser.RULE_name);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 207;
	        this.match(ManuscriptParser.CapitalWord);
	        this.state = 213;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,28,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 208;
	                this.wss();
	                this.state = 209;
	                this.match(ManuscriptParser.CapitalWord); 
	            }
	            this.state = 215;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,28,this._ctx);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	replique() {
	    let localctx = new RepliqueContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 40, ManuscriptParser.RULE_replique);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 216;
	        this.nonCapitalTextOrCommand();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	parenthesis() {
	    let localctx = new ParenthesisContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 42, ManuscriptParser.RULE_parenthesis);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 218;
	        this.nonCapitalTextOrCommand();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	nonCapitalTextOrCommand() {
	    let localctx = new NonCapitalTextOrCommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 44, ManuscriptParser.RULE_nonCapitalTextOrCommand);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 260;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 6:
	        case 7:
	        case 10:
	        case 13:
	        case 14:
	            this.state = 220;
	            this.nonCapitalText();
	            this.state = 237;
	            this._errHandler.sync(this);
	            var _alt = this._interp.adaptivePredict(this._input,33,this._ctx)
	            while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                if(_alt===1) {
	                    this.state = 225; 
	                    this._errHandler.sync(this);
	                    var _alt = 1;
	                    do {
	                    	switch (_alt) {
	                    	case 1:
	                    		this.state = 222;
	                    		this._errHandler.sync(this);
	                    		_la = this._input.LA(1);
	                    		if(_la===3) {
	                    		    this.state = 221;
	                    		    this.wss();
	                    		}

	                    		this.state = 224;
	                    		this.command();
	                    		break;
	                    	default:
	                    		throw new antlr4.error.NoViableAltException(this);
	                    	}
	                    	this.state = 227; 
	                    	this._errHandler.sync(this);
	                    	_alt = this._interp.adaptivePredict(this._input,30, this._ctx);
	                    } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	                    this.state = 233;
	                    this._errHandler.sync(this);
	                    var la_ = this._interp.adaptivePredict(this._input,32,this._ctx);
	                    if(la_===1) {
	                        this.state = 230;
	                        this._errHandler.sync(this);
	                        _la = this._input.LA(1);
	                        if(_la===3) {
	                            this.state = 229;
	                            this.wss();
	                        }

	                        this.state = 232;
	                        this.nonCapitalText();

	                    } 
	                }
	                this.state = 239;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,33,this._ctx);
	            }

	            break;
	        case 8:
	            this.state = 256; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            do {
	                this.state = 240;
	                this.command();
	                this.state = 247;
	                this._errHandler.sync(this);
	                var _alt = this._interp.adaptivePredict(this._input,35,this._ctx)
	                while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                    if(_alt===1) {
	                        this.state = 242;
	                        this._errHandler.sync(this);
	                        _la = this._input.LA(1);
	                        if(_la===3) {
	                            this.state = 241;
	                            this.wss();
	                        }

	                        this.state = 244;
	                        this.command(); 
	                    }
	                    this.state = 249;
	                    this._errHandler.sync(this);
	                    _alt = this._interp.adaptivePredict(this._input,35,this._ctx);
	                }

	                this.state = 254;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,37,this._ctx);
	                if(la_===1) {
	                    this.state = 251;
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                    if(_la===3) {
	                        this.state = 250;
	                        this.wss();
	                    }

	                    this.state = 253;
	                    this.nonCapitalText();

	                }
	                this.state = 258; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            } while(_la===8);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	command() {
	    let localctx = new CommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 46, ManuscriptParser.RULE_command);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 262;
	        this.match(ManuscriptParser.LeftParenthesis);
	        this.state = 266; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 266;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,40,this._ctx);
	            switch(la_) {
	            case 1:
	                this.state = 263;
	                this.wss();
	                break;

	            case 2:
	                this.state = 264;
	                this.nonCapitalText();
	                break;

	            case 3:
	                this.state = 265;
	                this.match(ManuscriptParser.CapitalWord);
	                break;

	            }
	            this.state = 268; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & 25800) !== 0));
	        this.state = 270;
	        this.match(ManuscriptParser.RightParenthesis);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	nonCapitalWord() {
	    let localctx = new NonCapitalWordContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 48, ManuscriptParser.RULE_nonCapitalWord);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 275;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,42,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 272;
	                _la = this._input.LA(1);
	                if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & 25792) !== 0))) {
	                this._errHandler.recoverInline(this);
	                }
	                else {
	                	this._errHandler.reportMatch(this);
	                    this.consume();
	                } 
	            }
	            this.state = 277;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,42,this._ctx);
	        }

	        this.state = 278;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & 17600) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 282;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,43,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 279;
	                _la = this._input.LA(1);
	                if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & 25792) !== 0))) {
	                this._errHandler.recoverInline(this);
	                }
	                else {
	                	this._errHandler.reportMatch(this);
	                    this.consume();
	                } 
	            }
	            this.state = 284;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,43,this._ctx);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	nonCapitalText() {
	    let localctx = new NonCapitalTextContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 50, ManuscriptParser.RULE_nonCapitalText);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 285;
	        this.nonCapitalWord();
	        this.state = 291;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,44,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 286;
	                this.wss();
	                this.state = 287;
	                this.nonCapitalWord(); 
	            }
	            this.state = 293;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,44,this._ctx);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

ManuscriptParser.EOF = antlr4.Token.EOF;
ManuscriptParser.MultiLineComment = 1;
ManuscriptParser.SingleLineComment = 2;
ManuscriptParser.WSS = 3;
ManuscriptParser.EOL = 4;
ManuscriptParser.Capital = 5;
ManuscriptParser.Minuscule = 6;
ManuscriptParser.Punctuation = 7;
ManuscriptParser.LeftParenthesis = 8;
ManuscriptParser.RightParenthesis = 9;
ManuscriptParser.Extra = 10;
ManuscriptParser.Synopsis = 11;
ManuscriptParser.Scene = 12;
ManuscriptParser.CapitalWord = 13;
ManuscriptParser.Number = 14;

ManuscriptParser.RULE_manuscript = 0;
ManuscriptParser.RULE_titleParagraph = 1;
ManuscriptParser.RULE_title = 2;
ManuscriptParser.RULE_authorParagraph = 3;
ManuscriptParser.RULE_author = 4;
ManuscriptParser.RULE_dateParagraph = 5;
ManuscriptParser.RULE_date = 6;
ManuscriptParser.RULE_synopsisPart = 7;
ManuscriptParser.RULE_synopsisTitle = 8;
ManuscriptParser.RULE_synopsisParagraphs = 9;
ManuscriptParser.RULE_synopsisParagraph = 10;
ManuscriptParser.RULE_wss = 11;
ManuscriptParser.RULE_eol = 12;
ManuscriptParser.RULE_scenesPart = 13;
ManuscriptParser.RULE_scenesHeading = 14;
ManuscriptParser.RULE_scenes = 15;
ManuscriptParser.RULE_scene = 16;
ManuscriptParser.RULE_sceneHeading = 17;
ManuscriptParser.RULE_heading = 18;
ManuscriptParser.RULE_name = 19;
ManuscriptParser.RULE_replique = 20;
ManuscriptParser.RULE_parenthesis = 21;
ManuscriptParser.RULE_nonCapitalTextOrCommand = 22;
ManuscriptParser.RULE_command = 23;
ManuscriptParser.RULE_nonCapitalWord = 24;
ManuscriptParser.RULE_nonCapitalText = 25;

class ManuscriptContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_manuscript;
    }

	EOF() {
	    return this.getToken(ManuscriptParser.EOF, 0);
	};

	titleParagraph() {
	    return this.getTypedRuleContext(TitleParagraphContext,0);
	};

	authorParagraph() {
	    return this.getTypedRuleContext(AuthorParagraphContext,0);
	};

	dateParagraph() {
	    return this.getTypedRuleContext(DateParagraphContext,0);
	};

	synopsisPart() {
	    return this.getTypedRuleContext(SynopsisPartContext,0);
	};

	scenesPart() {
	    return this.getTypedRuleContext(ScenesPartContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterManuscript(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitManuscript(this);
		}
	}


}



class TitleParagraphContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_titleParagraph;
    }

	wss() {
	    return this.getTypedRuleContext(WssContext,0);
	};

	title() {
	    return this.getTypedRuleContext(TitleContext,0);
	};

	eol = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EolContext);
	    } else {
	        return this.getTypedRuleContext(EolContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterTitleParagraph(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitTitleParagraph(this);
		}
	}


}



class TitleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_title;
    }

	heading() {
	    return this.getTypedRuleContext(HeadingContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterTitle(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitTitle(this);
		}
	}


}



class AuthorParagraphContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_authorParagraph;
    }

	wss() {
	    return this.getTypedRuleContext(WssContext,0);
	};

	author() {
	    return this.getTypedRuleContext(AuthorContext,0);
	};

	eol = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EolContext);
	    } else {
	        return this.getTypedRuleContext(EolContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterAuthorParagraph(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitAuthorParagraph(this);
		}
	}


}



class AuthorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_author;
    }

	nonCapitalText() {
	    return this.getTypedRuleContext(NonCapitalTextContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterAuthor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitAuthor(this);
		}
	}


}



class DateParagraphContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_dateParagraph;
    }

	wss() {
	    return this.getTypedRuleContext(WssContext,0);
	};

	date() {
	    return this.getTypedRuleContext(DateContext,0);
	};

	eol = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EolContext);
	    } else {
	        return this.getTypedRuleContext(EolContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterDateParagraph(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitDateParagraph(this);
		}
	}


}



class DateContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_date;
    }

	nonCapitalText() {
	    return this.getTypedRuleContext(NonCapitalTextContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterDate(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitDate(this);
		}
	}


}



class SynopsisPartContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_synopsisPart;
    }

	synopsisTitle() {
	    return this.getTypedRuleContext(SynopsisTitleContext,0);
	};

	eol = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EolContext);
	    } else {
	        return this.getTypedRuleContext(EolContext,i);
	    }
	};

	synopsisParagraphs() {
	    return this.getTypedRuleContext(SynopsisParagraphsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterSynopsisPart(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitSynopsisPart(this);
		}
	}


}



class SynopsisTitleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_synopsisTitle;
    }

	Synopsis() {
	    return this.getToken(ManuscriptParser.Synopsis, 0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterSynopsisTitle(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitSynopsisTitle(this);
		}
	}


}



class SynopsisParagraphsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_synopsisParagraphs;
    }

	synopsisParagraph = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SynopsisParagraphContext);
	    } else {
	        return this.getTypedRuleContext(SynopsisParagraphContext,i);
	    }
	};

	eol = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EolContext);
	    } else {
	        return this.getTypedRuleContext(EolContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterSynopsisParagraphs(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitSynopsisParagraphs(this);
		}
	}


}



class SynopsisParagraphContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_synopsisParagraph;
    }

	nonCapitalText() {
	    return this.getTypedRuleContext(NonCapitalTextContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterSynopsisParagraph(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitSynopsisParagraph(this);
		}
	}


}



class WssContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_wss;
    }

	WSS() {
	    return this.getToken(ManuscriptParser.WSS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterWss(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitWss(this);
		}
	}


}



class EolContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_eol;
    }

	EOL() {
	    return this.getToken(ManuscriptParser.EOL, 0);
	};

	wss() {
	    return this.getTypedRuleContext(WssContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterEol(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitEol(this);
		}
	}


}



class ScenesPartContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_scenesPart;
    }

	scenesHeading() {
	    return this.getTypedRuleContext(ScenesHeadingContext,0);
	};

	eol = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EolContext);
	    } else {
	        return this.getTypedRuleContext(EolContext,i);
	    }
	};

	scenes() {
	    return this.getTypedRuleContext(ScenesContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterScenesPart(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitScenesPart(this);
		}
	}


}



class ScenesHeadingContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_scenesHeading;
    }

	Scene() {
	    return this.getToken(ManuscriptParser.Scene, 0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterScenesHeading(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitScenesHeading(this);
		}
	}


}



class ScenesContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_scenes;
    }

	scene = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SceneContext);
	    } else {
	        return this.getTypedRuleContext(SceneContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterScenes(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitScenes(this);
		}
	}


}



class SceneContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_scene;
    }

	sceneHeading() {
	    return this.getTypedRuleContext(SceneHeadingContext,0);
	};

	eol = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EolContext);
	    } else {
	        return this.getTypedRuleContext(EolContext,i);
	    }
	};

	parenthesis = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ParenthesisContext);
	    } else {
	        return this.getTypedRuleContext(ParenthesisContext,i);
	    }
	};

	wss = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(WssContext);
	    } else {
	        return this.getTypedRuleContext(WssContext,i);
	    }
	};

	name = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(NameContext);
	    } else {
	        return this.getTypedRuleContext(NameContext,i);
	    }
	};

	replique = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(RepliqueContext);
	    } else {
	        return this.getTypedRuleContext(RepliqueContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterScene(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitScene(this);
		}
	}


}



class SceneHeadingContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_sceneHeading;
    }

	heading() {
	    return this.getTypedRuleContext(HeadingContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterSceneHeading(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitSceneHeading(this);
		}
	}


}



class HeadingContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_heading;
    }

	wss = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(WssContext);
	    } else {
	        return this.getTypedRuleContext(WssContext,i);
	    }
	};

	CapitalWord = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.CapitalWord);
	    } else {
	        return this.getToken(ManuscriptParser.CapitalWord, i);
	    }
	};


	Number = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.Number);
	    } else {
	        return this.getToken(ManuscriptParser.Number, i);
	    }
	};


	Punctuation = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.Punctuation);
	    } else {
	        return this.getToken(ManuscriptParser.Punctuation, i);
	    }
	};


	Extra = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.Extra);
	    } else {
	        return this.getToken(ManuscriptParser.Extra, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterHeading(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitHeading(this);
		}
	}


}



class NameContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_name;
    }

	CapitalWord = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.CapitalWord);
	    } else {
	        return this.getToken(ManuscriptParser.CapitalWord, i);
	    }
	};


	wss = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(WssContext);
	    } else {
	        return this.getTypedRuleContext(WssContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterName(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitName(this);
		}
	}


}



class RepliqueContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_replique;
    }

	nonCapitalTextOrCommand() {
	    return this.getTypedRuleContext(NonCapitalTextOrCommandContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterReplique(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitReplique(this);
		}
	}


}



class ParenthesisContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_parenthesis;
    }

	nonCapitalTextOrCommand() {
	    return this.getTypedRuleContext(NonCapitalTextOrCommandContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterParenthesis(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitParenthesis(this);
		}
	}


}



class NonCapitalTextOrCommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_nonCapitalTextOrCommand;
    }

	nonCapitalText = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(NonCapitalTextContext);
	    } else {
	        return this.getTypedRuleContext(NonCapitalTextContext,i);
	    }
	};

	command = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CommandContext);
	    } else {
	        return this.getTypedRuleContext(CommandContext,i);
	    }
	};

	wss = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(WssContext);
	    } else {
	        return this.getTypedRuleContext(WssContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterNonCapitalTextOrCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitNonCapitalTextOrCommand(this);
		}
	}


}



class CommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_command;
    }

	LeftParenthesis() {
	    return this.getToken(ManuscriptParser.LeftParenthesis, 0);
	};

	RightParenthesis() {
	    return this.getToken(ManuscriptParser.RightParenthesis, 0);
	};

	wss = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(WssContext);
	    } else {
	        return this.getTypedRuleContext(WssContext,i);
	    }
	};

	nonCapitalText = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(NonCapitalTextContext);
	    } else {
	        return this.getTypedRuleContext(NonCapitalTextContext,i);
	    }
	};

	CapitalWord = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.CapitalWord);
	    } else {
	        return this.getToken(ManuscriptParser.CapitalWord, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitCommand(this);
		}
	}


}



class NonCapitalWordContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_nonCapitalWord;
    }

	Number = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.Number);
	    } else {
	        return this.getToken(ManuscriptParser.Number, i);
	    }
	};


	Punctuation = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.Punctuation);
	    } else {
	        return this.getToken(ManuscriptParser.Punctuation, i);
	    }
	};


	Extra = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.Extra);
	    } else {
	        return this.getToken(ManuscriptParser.Extra, i);
	    }
	};


	Minuscule = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.Minuscule);
	    } else {
	        return this.getToken(ManuscriptParser.Minuscule, i);
	    }
	};


	CapitalWord = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.CapitalWord);
	    } else {
	        return this.getToken(ManuscriptParser.CapitalWord, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterNonCapitalWord(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitNonCapitalWord(this);
		}
	}


}



class NonCapitalTextContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_nonCapitalText;
    }

	nonCapitalWord = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(NonCapitalWordContext);
	    } else {
	        return this.getTypedRuleContext(NonCapitalWordContext,i);
	    }
	};

	wss = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(WssContext);
	    } else {
	        return this.getTypedRuleContext(WssContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterNonCapitalText(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitNonCapitalText(this);
		}
	}


}




ManuscriptParser.ManuscriptContext = ManuscriptContext; 
ManuscriptParser.TitleParagraphContext = TitleParagraphContext; 
ManuscriptParser.TitleContext = TitleContext; 
ManuscriptParser.AuthorParagraphContext = AuthorParagraphContext; 
ManuscriptParser.AuthorContext = AuthorContext; 
ManuscriptParser.DateParagraphContext = DateParagraphContext; 
ManuscriptParser.DateContext = DateContext; 
ManuscriptParser.SynopsisPartContext = SynopsisPartContext; 
ManuscriptParser.SynopsisTitleContext = SynopsisTitleContext; 
ManuscriptParser.SynopsisParagraphsContext = SynopsisParagraphsContext; 
ManuscriptParser.SynopsisParagraphContext = SynopsisParagraphContext; 
ManuscriptParser.WssContext = WssContext; 
ManuscriptParser.EolContext = EolContext; 
ManuscriptParser.ScenesPartContext = ScenesPartContext; 
ManuscriptParser.ScenesHeadingContext = ScenesHeadingContext; 
ManuscriptParser.ScenesContext = ScenesContext; 
ManuscriptParser.SceneContext = SceneContext; 
ManuscriptParser.SceneHeadingContext = SceneHeadingContext; 
ManuscriptParser.HeadingContext = HeadingContext; 
ManuscriptParser.NameContext = NameContext; 
ManuscriptParser.RepliqueContext = RepliqueContext; 
ManuscriptParser.ParenthesisContext = ParenthesisContext; 
ManuscriptParser.NonCapitalTextOrCommandContext = NonCapitalTextOrCommandContext; 
ManuscriptParser.CommandContext = CommandContext; 
ManuscriptParser.NonCapitalWordContext = NonCapitalWordContext; 
ManuscriptParser.NonCapitalTextContext = NonCapitalTextContext; 
