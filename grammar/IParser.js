// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';
import IParserListener from './IParserListener.js';
const serializedATN = [4,1,20,231,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,27,
7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,1,0,1,0,3,0,67,8,0,1,0,1,0,
1,1,1,1,1,1,1,1,1,1,3,1,76,8,1,1,1,5,1,79,8,1,10,1,12,1,82,9,1,1,2,1,2,1,
2,1,2,1,2,1,2,1,2,1,2,3,2,92,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,
1,4,1,5,1,5,1,5,1,5,3,5,109,8,5,1,5,1,5,1,5,3,5,114,8,5,1,6,1,6,1,7,1,7,
1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,5,9,129,8,9,10,9,12,9,132,9,9,1,10,1,
10,1,11,1,11,1,11,1,11,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,
1,12,5,12,151,8,12,10,12,12,12,154,9,12,1,13,1,13,1,13,1,13,1,13,3,13,161,
8,13,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,
14,1,14,5,14,178,8,14,10,14,12,14,181,9,14,1,15,1,15,3,15,185,8,15,1,15,
1,15,1,15,1,15,1,15,1,15,1,15,3,15,194,8,15,1,16,1,16,1,16,3,16,199,8,16,
1,17,1,17,1,18,1,18,1,19,1,19,1,20,1,20,1,21,1,21,1,22,1,22,1,23,1,23,1,
24,1,24,1,25,1,25,1,26,1,26,1,27,1,27,1,28,1,28,1,29,1,29,1,30,1,30,1,31,
1,31,1,31,0,3,2,24,28,32,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,
36,38,40,42,44,46,48,50,52,54,56,58,60,62,0,1,1,0,19,20,219,0,64,1,0,0,0,
2,70,1,0,0,0,4,91,1,0,0,0,6,93,1,0,0,0,8,100,1,0,0,0,10,104,1,0,0,0,12,115,
1,0,0,0,14,117,1,0,0,0,16,119,1,0,0,0,18,124,1,0,0,0,20,133,1,0,0,0,22,135,
1,0,0,0,24,139,1,0,0,0,26,160,1,0,0,0,28,162,1,0,0,0,30,193,1,0,0,0,32,198,
1,0,0,0,34,200,1,0,0,0,36,202,1,0,0,0,38,204,1,0,0,0,40,206,1,0,0,0,42,208,
1,0,0,0,44,210,1,0,0,0,46,212,1,0,0,0,48,214,1,0,0,0,50,216,1,0,0,0,52,218,
1,0,0,0,54,220,1,0,0,0,56,222,1,0,0,0,58,224,1,0,0,0,60,226,1,0,0,0,62,228,
1,0,0,0,64,66,3,34,17,0,65,67,3,2,1,0,66,65,1,0,0,0,66,67,1,0,0,0,67,68,
1,0,0,0,68,69,3,34,17,0,69,1,1,0,0,0,70,71,6,1,-1,0,71,72,3,4,2,0,72,80,
1,0,0,0,73,75,10,2,0,0,74,76,5,5,0,0,75,74,1,0,0,0,75,76,1,0,0,0,76,77,1,
0,0,0,77,79,3,2,1,3,78,73,1,0,0,0,79,82,1,0,0,0,80,78,1,0,0,0,80,81,1,0,
0,0,81,3,1,0,0,0,82,80,1,0,0,0,83,92,3,6,3,0,84,92,3,16,8,0,85,92,3,22,11,
0,86,92,3,24,12,0,87,88,3,36,18,0,88,89,3,2,1,0,89,90,3,38,19,0,90,92,1,
0,0,0,91,83,1,0,0,0,91,84,1,0,0,0,91,85,1,0,0,0,91,86,1,0,0,0,91,87,1,0,
0,0,92,5,1,0,0,0,93,94,3,40,20,0,94,95,3,36,18,0,95,96,3,8,4,0,96,97,3,38,
19,0,97,98,3,42,21,0,98,99,3,4,2,0,99,7,1,0,0,0,100,101,3,10,5,0,101,102,
3,44,22,0,102,103,3,10,5,0,103,9,1,0,0,0,104,108,3,40,20,0,105,106,3,46,
23,0,106,107,3,12,6,0,107,109,1,0,0,0,108,105,1,0,0,0,108,109,1,0,0,0,109,
113,1,0,0,0,110,111,3,42,21,0,111,112,3,14,7,0,112,114,1,0,0,0,113,110,1,
0,0,0,113,114,1,0,0,0,114,11,1,0,0,0,115,116,3,40,20,0,116,13,1,0,0,0,117,
118,3,24,12,0,118,15,1,0,0,0,119,120,3,40,20,0,120,121,3,36,18,0,121,122,
3,18,9,0,122,123,3,38,19,0,123,17,1,0,0,0,124,130,3,20,10,0,125,126,3,44,
22,0,126,127,3,20,10,0,127,129,1,0,0,0,128,125,1,0,0,0,129,132,1,0,0,0,130,
128,1,0,0,0,130,131,1,0,0,0,131,19,1,0,0,0,132,130,1,0,0,0,133,134,3,24,
12,0,134,21,1,0,0,0,135,136,3,40,20,0,136,137,3,42,21,0,137,138,3,24,12,
0,138,23,1,0,0,0,139,140,6,12,-1,0,140,141,3,26,13,0,141,152,1,0,0,0,142,
143,10,3,0,0,143,144,3,48,24,0,144,145,3,26,13,0,145,151,1,0,0,0,146,147,
10,2,0,0,147,148,3,50,25,0,148,149,3,26,13,0,149,151,1,0,0,0,150,142,1,0,
0,0,150,146,1,0,0,0,151,154,1,0,0,0,152,150,1,0,0,0,152,153,1,0,0,0,153,
25,1,0,0,0,154,152,1,0,0,0,155,156,3,28,14,0,156,157,3,52,26,0,157,158,3,
26,13,0,158,161,1,0,0,0,159,161,3,28,14,0,160,155,1,0,0,0,160,159,1,0,0,
0,161,27,1,0,0,0,162,163,6,14,-1,0,163,164,3,30,15,0,164,179,1,0,0,0,165,
166,10,4,0,0,166,167,3,54,27,0,167,168,3,30,15,0,168,178,1,0,0,0,169,170,
10,3,0,0,170,171,3,56,28,0,171,172,3,30,15,0,172,178,1,0,0,0,173,174,10,
2,0,0,174,175,3,58,29,0,175,176,3,30,15,0,176,178,1,0,0,0,177,165,1,0,0,
0,177,169,1,0,0,0,177,173,1,0,0,0,178,181,1,0,0,0,179,177,1,0,0,0,179,180,
1,0,0,0,180,29,1,0,0,0,181,179,1,0,0,0,182,185,3,48,24,0,183,185,3,50,25,
0,184,182,1,0,0,0,184,183,1,0,0,0,185,186,1,0,0,0,186,187,3,30,15,0,187,
194,1,0,0,0,188,194,3,32,16,0,189,190,3,36,18,0,190,191,3,24,12,0,191,192,
3,38,19,0,192,194,1,0,0,0,193,184,1,0,0,0,193,188,1,0,0,0,193,189,1,0,0,
0,194,31,1,0,0,0,195,199,3,60,30,0,196,199,3,62,31,0,197,199,3,40,20,0,198,
195,1,0,0,0,198,196,1,0,0,0,198,197,1,0,0,0,199,33,1,0,0,0,200,201,5,4,0,
0,201,35,1,0,0,0,202,203,5,6,0,0,203,37,1,0,0,0,204,205,5,7,0,0,205,39,1,
0,0,0,206,207,5,9,0,0,207,41,1,0,0,0,208,209,5,10,0,0,209,43,1,0,0,0,210,
211,5,11,0,0,211,45,1,0,0,0,212,213,5,12,0,0,213,47,1,0,0,0,214,215,5,13,
0,0,215,49,1,0,0,0,216,217,5,14,0,0,217,51,1,0,0,0,218,219,5,15,0,0,219,
53,1,0,0,0,220,221,5,16,0,0,221,55,1,0,0,0,222,223,5,17,0,0,223,57,1,0,0,
0,224,225,5,18,0,0,225,59,1,0,0,0,226,227,5,8,0,0,227,61,1,0,0,0,228,229,
7,0,0,0,229,63,1,0,0,0,15,66,75,80,91,108,113,130,150,152,160,177,179,184,
193,198];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class IParser extends antlr4.Parser {

    static grammarFileName = "java-escape";
    static literalNames = [ null, null, null, null, "'#'", "';'", "'('", 
                            "')'", null, null, "'='", "','", "':'", "'+'", 
                            "'-'", "'\\u02C6'", "'*'", "'/'", "'%'" ];
    static symbolicNames = [ null, "MultiLineComment", "SingleLineComment", 
                             "WhiteSpace", "Dollar", "Semicolon", "LParen", 
                             "RParen", "Number", "Id", "Equal", "Comma", 
                             "Colon", "Plus", "Minus", "ToPower", "Times", 
                             "Div", "Mod", "DQString", "SQString" ];
    static ruleNames = [ "i", "statements", "statement", "definition", "sList", 
                         "sParam", "type", "defaultValue", "call", "vList", 
                         "vParam", "assignment", "expression", "power", 
                         "term", "factor", "value", "dollar", "lParen", 
                         "rParen", "id", "equal", "comma", "colon", "plus", 
                         "minus", "toPower", "times", "div", "mod", "number", 
                         "string" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = IParser.ruleNames;
        this.literalNames = IParser.literalNames;
        this.symbolicNames = IParser.symbolicNames;
    }

    get atn() {
        return atn;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 1:
    	    		return this.statements_sempred(localctx, predIndex);
    	case 12:
    	    		return this.expression_sempred(localctx, predIndex);
    	case 14:
    	    		return this.term_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    statements_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 2);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };

    expression_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 1:
    			return this.precpred(this._ctx, 3);
    		case 2:
    			return this.precpred(this._ctx, 2);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };

    term_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 3:
    			return this.precpred(this._ctx, 4);
    		case 4:
    			return this.precpred(this._ctx, 3);
    		case 5:
    			return this.precpred(this._ctx, 2);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };




	i() {
	    let localctx = new IContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, IParser.RULE_i);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 64;
	        this.dollar();
	        this.state = 66;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & 1598272) !== 0)) {
	            this.state = 65;
	            this.statements(0);
	        }

	        this.state = 68;
	        this.dollar();
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


	statements(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new StatementsContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 2;
	    this.enterRecursionRule(localctx, 2, IParser.RULE_statements, _p);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 71;
	        this.statement();
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 80;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,2,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                localctx = new StatementsContext(this, _parentctx, _parentState);
	                this.pushNewRecursionContext(localctx, _startState, IParser.RULE_statements);
	                this.state = 73;
	                if (!( this.precpred(this._ctx, 2))) {
	                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
	                }
	                this.state = 75;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	                if(_la===5) {
	                    this.state = 74;
	                    this.match(IParser.Semicolon);
	                }

	                this.state = 77;
	                this.statements(3); 
	            }
	            this.state = 82;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,2,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	statement() {
	    let localctx = new StatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, IParser.RULE_statement);
	    try {
	        this.state = 91;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,3,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 83;
	            this.definition();
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 84;
	            this.call();
	            break;

	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 85;
	            this.assignment();
	            break;

	        case 4:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 86;
	            this.expression(0);
	            break;

	        case 5:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 87;
	            this.lParen();
	            this.state = 88;
	            this.statements(0);
	            this.state = 89;
	            this.rParen();
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



	definition() {
	    let localctx = new DefinitionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, IParser.RULE_definition);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 93;
	        this.id();
	        this.state = 94;
	        this.lParen();
	        this.state = 95;
	        this.sList();
	        this.state = 96;
	        this.rParen();
	        this.state = 97;
	        this.equal();
	        this.state = 98;
	        this.statement();
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



	sList() {
	    let localctx = new SListContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, IParser.RULE_sList);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 100;
	        this.sParam();

	        this.state = 101;
	        this.comma();
	        this.state = 102;
	        this.sParam();
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



	sParam() {
	    let localctx = new SParamContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, IParser.RULE_sParam);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 104;
	        this.id();
	        this.state = 108;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===12) {
	            this.state = 105;
	            this.colon();
	            this.state = 106;
	            this.type();
	        }

	        this.state = 113;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===10) {
	            this.state = 110;
	            this.equal();
	            this.state = 111;
	            this.defaultValue();
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



	type() {
	    let localctx = new TypeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, IParser.RULE_type);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 115;
	        this.id();
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



	defaultValue() {
	    let localctx = new DefaultValueContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, IParser.RULE_defaultValue);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 117;
	        this.expression(0);
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
	    this.enterRule(localctx, 16, IParser.RULE_call);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 119;
	        this.id();
	        this.state = 120;
	        this.lParen();
	        this.state = 121;
	        this.vList();
	        this.state = 122;
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



	vList() {
	    let localctx = new VListContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, IParser.RULE_vList);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 124;
	        this.vParam();
	        this.state = 130;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===11) {
	            this.state = 125;
	            this.comma();
	            this.state = 126;
	            this.vParam();
	            this.state = 132;
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



	vParam() {
	    let localctx = new VParamContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, IParser.RULE_vParam);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 133;
	        this.expression(0);
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



	assignment() {
	    let localctx = new AssignmentContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, IParser.RULE_assignment);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 135;
	        this.id();
	        this.state = 136;
	        this.equal();
	        this.state = 137;
	        this.expression(0);
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


	expression(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new ExpressionContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 24;
	    this.enterRecursionRule(localctx, 24, IParser.RULE_expression, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 140;
	        this.power();
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 152;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,8,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 150;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,7,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new ExpressionContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, IParser.RULE_expression);
	                    this.state = 142;
	                    if (!( this.precpred(this._ctx, 3))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
	                    }
	                    this.state = 143;
	                    this.plus();
	                    this.state = 144;
	                    this.power();
	                    break;

	                case 2:
	                    localctx = new ExpressionContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, IParser.RULE_expression);
	                    this.state = 146;
	                    if (!( this.precpred(this._ctx, 2))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
	                    }
	                    this.state = 147;
	                    this.minus();
	                    this.state = 148;
	                    this.power();
	                    break;

	                } 
	            }
	            this.state = 154;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,8,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	power() {
	    let localctx = new PowerContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, IParser.RULE_power);
	    try {
	        this.state = 160;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 155;
	            this.term(0);
	            this.state = 156;
	            this.toPower();
	            this.state = 157;
	            this.power();
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 159;
	            this.term(0);
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


	term(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new TermContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 28;
	    this.enterRecursionRule(localctx, 28, IParser.RULE_term, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 163;
	        this.factor();
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 179;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,11,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 177;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,10,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new TermContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, IParser.RULE_term);
	                    this.state = 165;
	                    if (!( this.precpred(this._ctx, 4))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
	                    }
	                    this.state = 166;
	                    this.times();
	                    this.state = 167;
	                    this.factor();
	                    break;

	                case 2:
	                    localctx = new TermContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, IParser.RULE_term);
	                    this.state = 169;
	                    if (!( this.precpred(this._ctx, 3))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
	                    }
	                    this.state = 170;
	                    this.div();
	                    this.state = 171;
	                    this.factor();
	                    break;

	                case 3:
	                    localctx = new TermContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, IParser.RULE_term);
	                    this.state = 173;
	                    if (!( this.precpred(this._ctx, 2))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
	                    }
	                    this.state = 174;
	                    this.mod();
	                    this.state = 175;
	                    this.factor();
	                    break;

	                } 
	            }
	            this.state = 181;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,11,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	factor() {
	    let localctx = new FactorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, IParser.RULE_factor);
	    try {
	        this.state = 193;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 13:
	        case 14:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 184;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 13:
	                this.state = 182;
	                this.plus();
	                break;
	            case 14:
	                this.state = 183;
	                this.minus();
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 186;
	            this.factor();
	            break;
	        case 8:
	        case 9:
	        case 19:
	        case 20:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 188;
	            this.value();
	            break;
	        case 6:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 189;
	            this.lParen();
	            this.state = 190;
	            this.expression(0);
	            this.state = 191;
	            this.rParen();
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



	value() {
	    let localctx = new ValueContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 32, IParser.RULE_value);
	    try {
	        this.state = 198;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 8:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 195;
	            this.number();
	            break;
	        case 19:
	        case 20:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 196;
	            this.string();
	            break;
	        case 9:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 197;
	            this.id();
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



	dollar() {
	    let localctx = new DollarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 34, IParser.RULE_dollar);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 200;
	        this.match(IParser.Dollar);
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
	    this.enterRule(localctx, 36, IParser.RULE_lParen);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 202;
	        this.match(IParser.LParen);
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
	    this.enterRule(localctx, 38, IParser.RULE_rParen);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 204;
	        this.match(IParser.RParen);
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
	    this.enterRule(localctx, 40, IParser.RULE_id);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 206;
	        this.match(IParser.Id);
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
	    this.enterRule(localctx, 42, IParser.RULE_equal);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 208;
	        this.match(IParser.Equal);
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
	    this.enterRule(localctx, 44, IParser.RULE_comma);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 210;
	        this.match(IParser.Comma);
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



	colon() {
	    let localctx = new ColonContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 46, IParser.RULE_colon);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 212;
	        this.match(IParser.Colon);
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



	plus() {
	    let localctx = new PlusContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 48, IParser.RULE_plus);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 214;
	        this.match(IParser.Plus);
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



	minus() {
	    let localctx = new MinusContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 50, IParser.RULE_minus);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 216;
	        this.match(IParser.Minus);
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



	toPower() {
	    let localctx = new ToPowerContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 52, IParser.RULE_toPower);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 218;
	        this.match(IParser.ToPower);
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



	times() {
	    let localctx = new TimesContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 54, IParser.RULE_times);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 220;
	        this.match(IParser.Times);
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



	div() {
	    let localctx = new DivContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 56, IParser.RULE_div);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 222;
	        this.match(IParser.Div);
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



	mod() {
	    let localctx = new ModContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 58, IParser.RULE_mod);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 224;
	        this.match(IParser.Mod);
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
	    this.enterRule(localctx, 60, IParser.RULE_number);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 226;
	        this.match(IParser.Number);
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
	    this.enterRule(localctx, 62, IParser.RULE_string);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 228;
	        _la = this._input.LA(1);
	        if(!(_la===19 || _la===20)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
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

IParser.EOF = antlr4.Token.EOF;
IParser.MultiLineComment = 1;
IParser.SingleLineComment = 2;
IParser.WhiteSpace = 3;
IParser.Dollar = 4;
IParser.Semicolon = 5;
IParser.LParen = 6;
IParser.RParen = 7;
IParser.Number = 8;
IParser.Id = 9;
IParser.Equal = 10;
IParser.Comma = 11;
IParser.Colon = 12;
IParser.Plus = 13;
IParser.Minus = 14;
IParser.ToPower = 15;
IParser.Times = 16;
IParser.Div = 17;
IParser.Mod = 18;
IParser.DQString = 19;
IParser.SQString = 20;

IParser.RULE_i = 0;
IParser.RULE_statements = 1;
IParser.RULE_statement = 2;
IParser.RULE_definition = 3;
IParser.RULE_sList = 4;
IParser.RULE_sParam = 5;
IParser.RULE_type = 6;
IParser.RULE_defaultValue = 7;
IParser.RULE_call = 8;
IParser.RULE_vList = 9;
IParser.RULE_vParam = 10;
IParser.RULE_assignment = 11;
IParser.RULE_expression = 12;
IParser.RULE_power = 13;
IParser.RULE_term = 14;
IParser.RULE_factor = 15;
IParser.RULE_value = 16;
IParser.RULE_dollar = 17;
IParser.RULE_lParen = 18;
IParser.RULE_rParen = 19;
IParser.RULE_id = 20;
IParser.RULE_equal = 21;
IParser.RULE_comma = 22;
IParser.RULE_colon = 23;
IParser.RULE_plus = 24;
IParser.RULE_minus = 25;
IParser.RULE_toPower = 26;
IParser.RULE_times = 27;
IParser.RULE_div = 28;
IParser.RULE_mod = 29;
IParser.RULE_number = 30;
IParser.RULE_string = 31;

class IContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_i;
    }

	dollar = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DollarContext);
	    } else {
	        return this.getTypedRuleContext(DollarContext,i);
	    }
	};

	statements() {
	    return this.getTypedRuleContext(StatementsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterI(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitI(this);
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
        this.ruleIndex = IParser.RULE_statements;
    }

	statement() {
	    return this.getTypedRuleContext(StatementContext,0);
	};

	statements = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementsContext);
	    } else {
	        return this.getTypedRuleContext(StatementsContext,i);
	    }
	};

	Semicolon() {
	    return this.getToken(IParser.Semicolon, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterStatements(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
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
        this.ruleIndex = IParser.RULE_statement;
    }

	definition() {
	    return this.getTypedRuleContext(DefinitionContext,0);
	};

	call() {
	    return this.getTypedRuleContext(CallContext,0);
	};

	assignment() {
	    return this.getTypedRuleContext(AssignmentContext,0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	lParen() {
	    return this.getTypedRuleContext(LParenContext,0);
	};

	statements() {
	    return this.getTypedRuleContext(StatementsContext,0);
	};

	rParen() {
	    return this.getTypedRuleContext(RParenContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitStatement(this);
		}
	}


}



class DefinitionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_definition;
    }

	id() {
	    return this.getTypedRuleContext(IdContext,0);
	};

	lParen() {
	    return this.getTypedRuleContext(LParenContext,0);
	};

	sList() {
	    return this.getTypedRuleContext(SListContext,0);
	};

	rParen() {
	    return this.getTypedRuleContext(RParenContext,0);
	};

	equal() {
	    return this.getTypedRuleContext(EqualContext,0);
	};

	statement() {
	    return this.getTypedRuleContext(StatementContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterDefinition(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitDefinition(this);
		}
	}


}



class SListContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_sList;
    }

	sParam = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SParamContext);
	    } else {
	        return this.getTypedRuleContext(SParamContext,i);
	    }
	};

	comma() {
	    return this.getTypedRuleContext(CommaContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterSList(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitSList(this);
		}
	}


}



class SParamContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_sParam;
    }

	id() {
	    return this.getTypedRuleContext(IdContext,0);
	};

	colon() {
	    return this.getTypedRuleContext(ColonContext,0);
	};

	type() {
	    return this.getTypedRuleContext(TypeContext,0);
	};

	equal() {
	    return this.getTypedRuleContext(EqualContext,0);
	};

	defaultValue() {
	    return this.getTypedRuleContext(DefaultValueContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterSParam(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitSParam(this);
		}
	}


}



class TypeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_type;
    }

	id() {
	    return this.getTypedRuleContext(IdContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterType(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitType(this);
		}
	}


}



class DefaultValueContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_defaultValue;
    }

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterDefaultValue(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitDefaultValue(this);
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
        this.ruleIndex = IParser.RULE_call;
    }

	id() {
	    return this.getTypedRuleContext(IdContext,0);
	};

	lParen() {
	    return this.getTypedRuleContext(LParenContext,0);
	};

	vList() {
	    return this.getTypedRuleContext(VListContext,0);
	};

	rParen() {
	    return this.getTypedRuleContext(RParenContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterCall(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitCall(this);
		}
	}


}



class VListContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_vList;
    }

	vParam = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(VParamContext);
	    } else {
	        return this.getTypedRuleContext(VParamContext,i);
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
	    if(listener instanceof IParserListener ) {
	        listener.enterVList(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitVList(this);
		}
	}


}



class VParamContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_vParam;
    }

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterVParam(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitVParam(this);
		}
	}


}



class AssignmentContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_assignment;
    }

	id() {
	    return this.getTypedRuleContext(IdContext,0);
	};

	equal() {
	    return this.getTypedRuleContext(EqualContext,0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterAssignment(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitAssignment(this);
		}
	}


}



class ExpressionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_expression;
    }

	power() {
	    return this.getTypedRuleContext(PowerContext,0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	plus() {
	    return this.getTypedRuleContext(PlusContext,0);
	};

	minus() {
	    return this.getTypedRuleContext(MinusContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterExpression(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitExpression(this);
		}
	}


}



class PowerContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_power;
    }

	term() {
	    return this.getTypedRuleContext(TermContext,0);
	};

	toPower() {
	    return this.getTypedRuleContext(ToPowerContext,0);
	};

	power() {
	    return this.getTypedRuleContext(PowerContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterPower(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitPower(this);
		}
	}


}



class TermContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_term;
    }

	factor() {
	    return this.getTypedRuleContext(FactorContext,0);
	};

	term() {
	    return this.getTypedRuleContext(TermContext,0);
	};

	times() {
	    return this.getTypedRuleContext(TimesContext,0);
	};

	div() {
	    return this.getTypedRuleContext(DivContext,0);
	};

	mod() {
	    return this.getTypedRuleContext(ModContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterTerm(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitTerm(this);
		}
	}


}



class FactorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_factor;
    }

	factor() {
	    return this.getTypedRuleContext(FactorContext,0);
	};

	plus() {
	    return this.getTypedRuleContext(PlusContext,0);
	};

	minus() {
	    return this.getTypedRuleContext(MinusContext,0);
	};

	value() {
	    return this.getTypedRuleContext(ValueContext,0);
	};

	lParen() {
	    return this.getTypedRuleContext(LParenContext,0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	rParen() {
	    return this.getTypedRuleContext(RParenContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterFactor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitFactor(this);
		}
	}


}



class ValueContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_value;
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

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterValue(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitValue(this);
		}
	}


}



class DollarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_dollar;
    }

	Dollar() {
	    return this.getToken(IParser.Dollar, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterDollar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitDollar(this);
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
        this.ruleIndex = IParser.RULE_lParen;
    }

	LParen() {
	    return this.getToken(IParser.LParen, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterLParen(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
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
        this.ruleIndex = IParser.RULE_rParen;
    }

	RParen() {
	    return this.getToken(IParser.RParen, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterRParen(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitRParen(this);
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
        this.ruleIndex = IParser.RULE_id;
    }

	Id() {
	    return this.getToken(IParser.Id, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterId(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitId(this);
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
        this.ruleIndex = IParser.RULE_equal;
    }

	Equal() {
	    return this.getToken(IParser.Equal, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterEqual(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitEqual(this);
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
        this.ruleIndex = IParser.RULE_comma;
    }

	Comma() {
	    return this.getToken(IParser.Comma, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterComma(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitComma(this);
		}
	}


}



class ColonContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_colon;
    }

	Colon() {
	    return this.getToken(IParser.Colon, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterColon(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitColon(this);
		}
	}


}



class PlusContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_plus;
    }

	Plus() {
	    return this.getToken(IParser.Plus, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterPlus(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitPlus(this);
		}
	}


}



class MinusContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_minus;
    }

	Minus() {
	    return this.getToken(IParser.Minus, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterMinus(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitMinus(this);
		}
	}


}



class ToPowerContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_toPower;
    }

	ToPower() {
	    return this.getToken(IParser.ToPower, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterToPower(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitToPower(this);
		}
	}


}



class TimesContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_times;
    }

	Times() {
	    return this.getToken(IParser.Times, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterTimes(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitTimes(this);
		}
	}


}



class DivContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_div;
    }

	Div() {
	    return this.getToken(IParser.Div, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterDiv(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitDiv(this);
		}
	}


}



class ModContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = IParser.RULE_mod;
    }

	Mod() {
	    return this.getToken(IParser.Mod, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterMod(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitMod(this);
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
        this.ruleIndex = IParser.RULE_number;
    }

	Number() {
	    return this.getToken(IParser.Number, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterNumber(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitNumber(this);
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
        this.ruleIndex = IParser.RULE_string;
    }

	DQString() {
	    return this.getToken(IParser.DQString, 0);
	};

	SQString() {
	    return this.getToken(IParser.SQString, 0);
	};

	enterRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.enterString(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof IParserListener ) {
	        listener.exitString(this);
		}
	}


}




IParser.IContext = IContext; 
IParser.StatementsContext = StatementsContext; 
IParser.StatementContext = StatementContext; 
IParser.DefinitionContext = DefinitionContext; 
IParser.SListContext = SListContext; 
IParser.SParamContext = SParamContext; 
IParser.TypeContext = TypeContext; 
IParser.DefaultValueContext = DefaultValueContext; 
IParser.CallContext = CallContext; 
IParser.VListContext = VListContext; 
IParser.VParamContext = VParamContext; 
IParser.AssignmentContext = AssignmentContext; 
IParser.ExpressionContext = ExpressionContext; 
IParser.PowerContext = PowerContext; 
IParser.TermContext = TermContext; 
IParser.FactorContext = FactorContext; 
IParser.ValueContext = ValueContext; 
IParser.DollarContext = DollarContext; 
IParser.LParenContext = LParenContext; 
IParser.RParenContext = RParenContext; 
IParser.IdContext = IdContext; 
IParser.EqualContext = EqualContext; 
IParser.CommaContext = CommaContext; 
IParser.ColonContext = ColonContext; 
IParser.PlusContext = PlusContext; 
IParser.MinusContext = MinusContext; 
IParser.ToPowerContext = ToPowerContext; 
IParser.TimesContext = TimesContext; 
IParser.DivContext = DivContext; 
IParser.ModContext = ModContext; 
IParser.NumberContext = NumberContext; 
IParser.StringContext = StringContext; 
