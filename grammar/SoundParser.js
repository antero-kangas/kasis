// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';
import SoundParserListener from './SoundParserListener.js';
const serializedATN = [4,1,14,148,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
20,7,20,2,21,7,21,1,0,1,0,1,1,4,1,48,8,1,11,1,12,1,49,1,2,1,2,3,2,54,8,2,
1,3,1,3,1,3,3,3,59,8,3,1,3,1,3,1,3,1,3,3,3,65,8,3,1,3,1,3,1,4,1,4,1,4,1,
4,5,4,73,8,4,10,4,12,4,76,9,4,1,5,4,5,79,8,5,11,5,12,5,80,1,6,1,6,1,6,3,
6,86,8,6,1,6,1,6,1,6,3,6,91,8,6,1,6,1,6,1,7,1,7,1,7,1,7,5,7,99,8,7,10,7,
12,7,102,9,7,1,8,1,8,1,9,1,9,1,10,1,10,1,11,1,11,1,12,1,12,1,13,1,13,1,14,
1,14,1,15,1,15,1,16,1,16,1,17,1,17,1,18,1,18,1,19,1,19,3,19,128,8,19,1,19,
1,19,1,20,1,20,1,20,1,20,5,20,136,8,20,10,20,12,20,139,9,20,1,21,1,21,1,
21,1,21,1,21,3,21,146,8,21,1,21,0,0,22,0,2,4,6,8,10,12,14,16,18,20,22,24,
26,28,30,32,34,36,38,40,42,0,0,140,0,44,1,0,0,0,2,47,1,0,0,0,4,53,1,0,0,
0,6,55,1,0,0,0,8,68,1,0,0,0,10,78,1,0,0,0,12,85,1,0,0,0,14,94,1,0,0,0,16,
103,1,0,0,0,18,105,1,0,0,0,20,107,1,0,0,0,22,109,1,0,0,0,24,111,1,0,0,0,
26,113,1,0,0,0,28,115,1,0,0,0,30,117,1,0,0,0,32,119,1,0,0,0,34,121,1,0,0,
0,36,123,1,0,0,0,38,125,1,0,0,0,40,131,1,0,0,0,42,145,1,0,0,0,44,45,3,2,
1,0,45,1,1,0,0,0,46,48,3,4,2,0,47,46,1,0,0,0,48,49,1,0,0,0,49,47,1,0,0,0,
49,50,1,0,0,0,50,3,1,0,0,0,51,54,3,6,3,0,52,54,3,12,6,0,53,51,1,0,0,0,53,
52,1,0,0,0,54,5,1,0,0,0,55,56,3,32,16,0,56,58,3,22,11,0,57,59,3,8,4,0,58,
57,1,0,0,0,58,59,1,0,0,0,59,60,1,0,0,0,60,61,3,24,12,0,61,62,3,30,15,0,62,
64,3,22,11,0,63,65,3,10,5,0,64,63,1,0,0,0,64,65,1,0,0,0,65,66,1,0,0,0,66,
67,3,24,12,0,67,7,1,0,0,0,68,74,3,32,16,0,69,70,3,20,10,0,70,71,3,32,16,
0,71,73,1,0,0,0,72,69,1,0,0,0,73,76,1,0,0,0,74,72,1,0,0,0,74,75,1,0,0,0,
75,9,1,0,0,0,76,74,1,0,0,0,77,79,3,12,6,0,78,77,1,0,0,0,79,80,1,0,0,0,80,
78,1,0,0,0,80,81,1,0,0,0,81,11,1,0,0,0,82,83,3,32,16,0,83,84,3,30,15,0,84,
86,1,0,0,0,85,82,1,0,0,0,85,86,1,0,0,0,86,87,1,0,0,0,87,88,3,32,16,0,88,
90,3,22,11,0,89,91,3,14,7,0,90,89,1,0,0,0,90,91,1,0,0,0,91,92,1,0,0,0,92,
93,3,24,12,0,93,13,1,0,0,0,94,100,3,16,8,0,95,96,3,20,10,0,96,97,3,16,8,
0,97,99,1,0,0,0,98,95,1,0,0,0,99,102,1,0,0,0,100,98,1,0,0,0,100,101,1,0,
0,0,101,15,1,0,0,0,102,100,1,0,0,0,103,104,3,42,21,0,104,17,1,0,0,0,105,
106,5,5,0,0,106,19,1,0,0,0,107,108,5,6,0,0,108,21,1,0,0,0,109,110,5,10,0,
0,110,23,1,0,0,0,111,112,5,11,0,0,112,25,1,0,0,0,113,114,5,12,0,0,114,27,
1,0,0,0,115,116,5,13,0,0,116,29,1,0,0,0,117,118,5,7,0,0,118,31,1,0,0,0,119,
120,5,9,0,0,120,33,1,0,0,0,121,122,5,14,0,0,122,35,1,0,0,0,123,124,5,8,0,
0,124,37,1,0,0,0,125,127,3,26,13,0,126,128,3,40,20,0,127,126,1,0,0,0,127,
128,1,0,0,0,128,129,1,0,0,0,129,130,3,28,14,0,130,39,1,0,0,0,131,137,3,42,
21,0,132,133,3,20,10,0,133,134,3,42,21,0,134,136,1,0,0,0,135,132,1,0,0,0,
136,139,1,0,0,0,137,135,1,0,0,0,137,138,1,0,0,0,138,41,1,0,0,0,139,137,1,
0,0,0,140,146,3,36,18,0,141,146,3,34,17,0,142,146,3,32,16,0,143,146,3,38,
19,0,144,146,3,12,6,0,145,140,1,0,0,0,145,141,1,0,0,0,145,142,1,0,0,0,145,
143,1,0,0,0,145,144,1,0,0,0,146,43,1,0,0,0,12,49,53,58,64,74,80,85,90,100,
127,137,145];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class SoundParser extends antlr4.Parser {

    static grammarFileName = "java-escape";
    static literalNames = [ null, null, null, null, null, "';'", "','", 
                            "'='", null, null, "'('", "')'", "'['", "']'" ];
    static symbolicNames = [ null, "MultiLineComment", "SingleLineComment", 
                             "WhiteSpace", "EOL", "Semicolon", "Comma", 
                             "Equal", "Number", "Id", "LParen", "RParen", 
                             "LBracket", "RBracket", "String" ];
    static ruleNames = [ "sound", "statements", "statement", "def", "defParams", 
                         "calls", "call", "callParams", "callParam", "semicolon", 
                         "comma", "lParen", "rParen", "lBracket", "rBracket", 
                         "equal", "id", "string", "number", "array", "elements", 
                         "elem" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = SoundParser.ruleNames;
        this.literalNames = SoundParser.literalNames;
        this.symbolicNames = SoundParser.symbolicNames;
    }

    get atn() {
        return atn;
    }



	sound() {
	    let localctx = new SoundContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, SoundParser.RULE_sound);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 44;
	        this.statements();
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



	statements() {
	    let localctx = new StatementsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, SoundParser.RULE_statements);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 47; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 46;
	            this.statement();
	            this.state = 49; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===9);
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



	statement() {
	    let localctx = new StatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, SoundParser.RULE_statement);
	    try {
	        this.state = 53;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 51;
	            this.def();
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 52;
	            this.call();
	            break;

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



	def() {
	    let localctx = new DefContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, SoundParser.RULE_def);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 55;
	        this.id();
	        this.state = 56;
	        this.lParen();
	        this.state = 58;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===9) {
	            this.state = 57;
	            this.defParams();
	        }

	        this.state = 60;
	        this.rParen();
	        this.state = 61;
	        this.equal();
	        this.state = 62;
	        this.lParen();
	        this.state = 64;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===9) {
	            this.state = 63;
	            this.calls();
	        }

	        this.state = 66;
	        this.rParen();
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



	defParams() {
	    let localctx = new DefParamsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, SoundParser.RULE_defParams);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 68;
	        this.id();
	        this.state = 74;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===6) {
	            this.state = 69;
	            this.comma();
	            this.state = 70;
	            this.id();
	            this.state = 76;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
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



	calls() {
	    let localctx = new CallsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, SoundParser.RULE_calls);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 78; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 77;
	            this.call();
	            this.state = 80; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===9);
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



	call() {
	    let localctx = new CallContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, SoundParser.RULE_call);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 85;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,6,this._ctx);
	        if(la_===1) {
	            this.state = 82;
	            this.id();
	            this.state = 83;
	            this.equal();

	        }
	        this.state = 87;
	        this.id();
	        this.state = 88;
	        this.lParen();
	        this.state = 90;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & 21248) !== 0)) {
	            this.state = 89;
	            this.callParams();
	        }

	        this.state = 92;
	        this.rParen();
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



	callParams() {
	    let localctx = new CallParamsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, SoundParser.RULE_callParams);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 94;
	        this.callParam();
	        this.state = 100;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===6) {
	            this.state = 95;
	            this.comma();
	            this.state = 96;
	            this.callParam();
	            this.state = 102;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
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



	callParam() {
	    let localctx = new CallParamContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, SoundParser.RULE_callParam);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 103;
	        this.elem();
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



	semicolon() {
	    let localctx = new SemicolonContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, SoundParser.RULE_semicolon);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 105;
	        this.match(SoundParser.Semicolon);
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



	comma() {
	    let localctx = new CommaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, SoundParser.RULE_comma);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 107;
	        this.match(SoundParser.Comma);
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



	lParen() {
	    let localctx = new LParenContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, SoundParser.RULE_lParen);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 109;
	        this.match(SoundParser.LParen);
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



	rParen() {
	    let localctx = new RParenContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, SoundParser.RULE_rParen);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 111;
	        this.match(SoundParser.RParen);
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



	lBracket() {
	    let localctx = new LBracketContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, SoundParser.RULE_lBracket);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 113;
	        this.match(SoundParser.LBracket);
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



	rBracket() {
	    let localctx = new RBracketContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 28, SoundParser.RULE_rBracket);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 115;
	        this.match(SoundParser.RBracket);
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



	equal() {
	    let localctx = new EqualContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, SoundParser.RULE_equal);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 117;
	        this.match(SoundParser.Equal);
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



	id() {
	    let localctx = new IdContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 32, SoundParser.RULE_id);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 119;
	        this.match(SoundParser.Id);
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



	string() {
	    let localctx = new StringContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 34, SoundParser.RULE_string);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 121;
	        this.match(SoundParser.String);
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



	number() {
	    let localctx = new NumberContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 36, SoundParser.RULE_number);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 123;
	        this.match(SoundParser.Number);
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



	array() {
	    let localctx = new ArrayContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 38, SoundParser.RULE_array);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 125;
	        this.lBracket();
	        this.state = 127;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & 21248) !== 0)) {
	            this.state = 126;
	            this.elements();
	        }

	        this.state = 129;
	        this.rBracket();
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



	elements() {
	    let localctx = new ElementsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 40, SoundParser.RULE_elements);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 131;
	        this.elem();
	        this.state = 137;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===6) {
	            this.state = 132;
	            this.comma();
	            this.state = 133;
	            this.elem();
	            this.state = 139;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
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



	elem() {
	    let localctx = new ElemContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 42, SoundParser.RULE_elem);
	    try {
	        this.state = 145;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,11,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 140;
	            this.number();
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 141;
	            this.string();
	            break;

	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 142;
	            this.id();
	            break;

	        case 4:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 143;
	            this.array();
	            break;

	        case 5:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 144;
	            this.call();
	            break;

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

SoundParser.EOF = antlr4.Token.EOF;
SoundParser.MultiLineComment = 1;
SoundParser.SingleLineComment = 2;
SoundParser.WhiteSpace = 3;
SoundParser.EOL = 4;
SoundParser.Semicolon = 5;
SoundParser.Comma = 6;
SoundParser.Equal = 7;
SoundParser.Number = 8;
SoundParser.Id = 9;
SoundParser.LParen = 10;
SoundParser.RParen = 11;
SoundParser.LBracket = 12;
SoundParser.RBracket = 13;
SoundParser.String = 14;

SoundParser.RULE_sound = 0;
SoundParser.RULE_statements = 1;
SoundParser.RULE_statement = 2;
SoundParser.RULE_def = 3;
SoundParser.RULE_defParams = 4;
SoundParser.RULE_calls = 5;
SoundParser.RULE_call = 6;
SoundParser.RULE_callParams = 7;
SoundParser.RULE_callParam = 8;
SoundParser.RULE_semicolon = 9;
SoundParser.RULE_comma = 10;
SoundParser.RULE_lParen = 11;
SoundParser.RULE_rParen = 12;
SoundParser.RULE_lBracket = 13;
SoundParser.RULE_rBracket = 14;
SoundParser.RULE_equal = 15;
SoundParser.RULE_id = 16;
SoundParser.RULE_string = 17;
SoundParser.RULE_number = 18;
SoundParser.RULE_array = 19;
SoundParser.RULE_elements = 20;
SoundParser.RULE_elem = 21;

class SoundContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_sound;
    }

	statements() {
	    return this.getTypedRuleContext(StatementsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterSound(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitSound(this);
		}
	}


}



class StatementsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_statements;
    }

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterStatements(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitStatements(this);
		}
	}


}



class StatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_statement;
    }

	def() {
	    return this.getTypedRuleContext(DefContext,0);
	};

	call() {
	    return this.getTypedRuleContext(CallContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitStatement(this);
		}
	}


}



class DefContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_def;
    }

	id() {
	    return this.getTypedRuleContext(IdContext,0);
	};

	lParen = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(LParenContext);
	    } else {
	        return this.getTypedRuleContext(LParenContext,i);
	    }
	};

	rParen = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(RParenContext);
	    } else {
	        return this.getTypedRuleContext(RParenContext,i);
	    }
	};

	equal() {
	    return this.getTypedRuleContext(EqualContext,0);
	};

	defParams() {
	    return this.getTypedRuleContext(DefParamsContext,0);
	};

	calls() {
	    return this.getTypedRuleContext(CallsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterDef(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitDef(this);
		}
	}


}



class DefParamsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_defParams;
    }

	id = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(IdContext);
	    } else {
	        return this.getTypedRuleContext(IdContext,i);
	    }
	};

	comma = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CommaContext);
	    } else {
	        return this.getTypedRuleContext(CommaContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterDefParams(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitDefParams(this);
		}
	}


}



class CallsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_calls;
    }

	call = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CallContext);
	    } else {
	        return this.getTypedRuleContext(CallContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterCalls(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitCalls(this);
		}
	}


}



class CallContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_call;
    }

	id = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(IdContext);
	    } else {
	        return this.getTypedRuleContext(IdContext,i);
	    }
	};

	lParen() {
	    return this.getTypedRuleContext(LParenContext,0);
	};

	rParen() {
	    return this.getTypedRuleContext(RParenContext,0);
	};

	equal() {
	    return this.getTypedRuleContext(EqualContext,0);
	};

	callParams() {
	    return this.getTypedRuleContext(CallParamsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterCall(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitCall(this);
		}
	}


}



class CallParamsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_callParams;
    }

	callParam = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CallParamContext);
	    } else {
	        return this.getTypedRuleContext(CallParamContext,i);
	    }
	};

	comma = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CommaContext);
	    } else {
	        return this.getTypedRuleContext(CommaContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterCallParams(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitCallParams(this);
		}
	}


}



class CallParamContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_callParam;
    }

	elem() {
	    return this.getTypedRuleContext(ElemContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterCallParam(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitCallParam(this);
		}
	}


}



class SemicolonContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_semicolon;
    }

	Semicolon() {
	    return this.getToken(SoundParser.Semicolon, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterSemicolon(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitSemicolon(this);
		}
	}


}



class CommaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_comma;
    }

	Comma() {
	    return this.getToken(SoundParser.Comma, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterComma(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitComma(this);
		}
	}


}



class LParenContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_lParen;
    }

	LParen() {
	    return this.getToken(SoundParser.LParen, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterLParen(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitLParen(this);
		}
	}


}



class RParenContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_rParen;
    }

	RParen() {
	    return this.getToken(SoundParser.RParen, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterRParen(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitRParen(this);
		}
	}


}



class LBracketContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_lBracket;
    }

	LBracket() {
	    return this.getToken(SoundParser.LBracket, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterLBracket(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitLBracket(this);
		}
	}


}



class RBracketContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_rBracket;
    }

	RBracket() {
	    return this.getToken(SoundParser.RBracket, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterRBracket(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitRBracket(this);
		}
	}


}



class EqualContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_equal;
    }

	Equal() {
	    return this.getToken(SoundParser.Equal, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterEqual(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitEqual(this);
		}
	}


}



class IdContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_id;
    }

	Id() {
	    return this.getToken(SoundParser.Id, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterId(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitId(this);
		}
	}


}



class StringContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_string;
    }

	String() {
	    return this.getToken(SoundParser.String, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterString(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitString(this);
		}
	}


}



class NumberContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_number;
    }

	Number() {
	    return this.getToken(SoundParser.Number, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterNumber(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitNumber(this);
		}
	}


}



class ArrayContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_array;
    }

	lBracket() {
	    return this.getTypedRuleContext(LBracketContext,0);
	};

	rBracket() {
	    return this.getTypedRuleContext(RBracketContext,0);
	};

	elements() {
	    return this.getTypedRuleContext(ElementsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterArray(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitArray(this);
		}
	}


}



class ElementsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_elements;
    }

	elem = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ElemContext);
	    } else {
	        return this.getTypedRuleContext(ElemContext,i);
	    }
	};

	comma = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CommaContext);
	    } else {
	        return this.getTypedRuleContext(CommaContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterElements(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitElements(this);
		}
	}


}



class ElemContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SoundParser.RULE_elem;
    }

	number() {
	    return this.getTypedRuleContext(NumberContext,0);
	};

	string() {
	    return this.getTypedRuleContext(StringContext,0);
	};

	id() {
	    return this.getTypedRuleContext(IdContext,0);
	};

	array() {
	    return this.getTypedRuleContext(ArrayContext,0);
	};

	call() {
	    return this.getTypedRuleContext(CallContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.enterElem(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SoundParserListener ) {
	        listener.exitElem(this);
		}
	}


}




SoundParser.SoundContext = SoundContext; 
SoundParser.StatementsContext = StatementsContext; 
SoundParser.StatementContext = StatementContext; 
SoundParser.DefContext = DefContext; 
SoundParser.DefParamsContext = DefParamsContext; 
SoundParser.CallsContext = CallsContext; 
SoundParser.CallContext = CallContext; 
SoundParser.CallParamsContext = CallParamsContext; 
SoundParser.CallParamContext = CallParamContext; 
SoundParser.SemicolonContext = SemicolonContext; 
SoundParser.CommaContext = CommaContext; 
SoundParser.LParenContext = LParenContext; 
SoundParser.RParenContext = RParenContext; 
SoundParser.LBracketContext = LBracketContext; 
SoundParser.RBracketContext = RBracketContext; 
SoundParser.EqualContext = EqualContext; 
SoundParser.IdContext = IdContext; 
SoundParser.StringContext = StringContext; 
SoundParser.NumberContext = NumberContext; 
SoundParser.ArrayContext = ArrayContext; 
SoundParser.ElementsContext = ElementsContext; 
SoundParser.ElemContext = ElemContext; 
