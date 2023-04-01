// Generated from ManuscriptParser.g4 by ANTLR 4.9
// jshint ignore: start
import antlr4 from 'antlr4';
import ManuscriptParserListener from './ManuscriptParserListener.js';

const serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786",
    "\u5964\u0003\u0010\u016b\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004",
    "\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t",
    "\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004",
    "\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010",
    "\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013",
    "\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017",
    "\t\u0017\u0004\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a",
    "\u0004\u001b\t\u001b\u0004\u001c\t\u001c\u0004\u001d\t\u001d\u0004\u001e",
    "\t\u001e\u0004\u001f\t\u001f\u0004 \t \u0003\u0002\u0005\u0002B\n\u0002",
    "\u0003\u0002\u0005\u0002E\n\u0002\u0003\u0002\u0005\u0002H\n\u0002\u0003",
    "\u0002\u0005\u0002K\n\u0002\u0003\u0002\u0005\u0002N\n\u0002\u0003\u0002",
    "\u0005\u0002Q\n\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0006\u0003X\n\u0003\r\u0003\u000e\u0003Y\u0006\u0003\\",
    "\n\u0003\r\u0003\u000e\u0003]\u0003\u0004\u0003\u0004\u0003\u0005\u0003",
    "\u0005\u0003\u0005\u0006\u0005e\n\u0005\r\u0005\u000e\u0005f\u0006\u0005",
    "i\n\u0005\r\u0005\u000e\u0005j\u0003\u0006\u0003\u0006\u0003\u0007\u0003",
    "\u0007\u0003\u0007\u0006\u0007r\n\u0007\r\u0007\u000e\u0007s\u0003\b",
    "\u0003\b\u0003\t\u0003\t\u0006\tz\n\t\r\t\u000e\t{\u0003\t\u0005\t\u007f",
    "\n\t\u0003\n\u0003\n\u0003\u000b\u0003\u000b\u0006\u000b\u0085\n\u000b",
    "\r\u000b\u000e\u000b\u0086\u0006\u000b\u0089\n\u000b\r\u000b\u000e\u000b",
    "\u008a\u0003\f\u0003\f\u0003\r\u0003\r\u0003\u000e\u0005\u000e\u0092",
    "\n\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0006\u000f",
    "\u0098\n\u000f\r\u000f\u000e\u000f\u0099\u0003\u000f\u0005\u000f\u009d",
    "\n\u000f\u0003\u0010\u0003\u0010\u0003\u0011\u0005\u0011\u00a2\n\u0011",
    "\u0003\u0011\u0003\u0011\u0006\u0011\u00a6\n\u0011\r\u0011\u000e\u0011",
    "\u00a7\u0006\u0011\u00aa\n\u0011\r\u0011\u000e\u0011\u00ab\u0003\u0012",
    "\u0003\u0012\u0006\u0012\u00b0\n\u0012\r\u0012\u000e\u0012\u00b1\u0003",
    "\u0012\u0005\u0012\u00b5\n\u0012\u0003\u0013\u0003\u0013\u0003\u0014",
    "\u0006\u0014\u00ba\n\u0014\r\u0014\u000e\u0014\u00bb\u0003\u0015\u0003",
    "\u0015\u0006\u0015\u00c0\n\u0015\r\u0015\u000e\u0015\u00c1\u0003\u0015",
    "\u0003\u0015\u0006\u0015\u00c6\n\u0015\r\u0015\u000e\u0015\u00c7\u0007",
    "\u0015\u00ca\n\u0015\f\u0015\u000e\u0015\u00cd\u000b\u0015\u0003\u0015",
    "\u0003\u0015\u0003\u0015\u0006\u0015\u00d2\n\u0015\r\u0015\u000e\u0015",
    "\u00d3\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u00da",
    "\n\u0015\u0003\u0015\u0006\u0015\u00dd\n\u0015\r\u0015\u000e\u0015\u00de",
    "\u0006\u0015\u00e1\n\u0015\r\u0015\u000e\u0015\u00e2\u0006\u0015\u00e5",
    "\n\u0015\r\u0015\u000e\u0015\u00e6\u0006\u0015\u00e9\n\u0015\r\u0015",
    "\u000e\u0015\u00ea\u0003\u0016\u0003\u0016\u0003\u0017\u0006\u0017\u00f0",
    "\n\u0017\r\u0017\u000e\u0017\u00f1\u0003\u0017\u0003\u0017\u0006\u0017",
    "\u00f6\n\u0017\r\u0017\u000e\u0017\u00f7\u0007\u0017\u00fa\n\u0017\f",
    "\u0017\u000e\u0017\u00fd\u000b\u0017\u0003\u0018\u0003\u0018\u0003\u0018",
    "\u0003\u0018\u0007\u0018\u0103\n\u0018\f\u0018\u000e\u0018\u0106\u000b",
    "\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001b\u0003",
    "\u001b\u0005\u001b\u010e\n\u001b\u0003\u001b\u0006\u001b\u0111\n\u001b",
    "\r\u001b\u000e\u001b\u0112\u0003\u001b\u0005\u001b\u0116\n\u001b\u0003",
    "\u001b\u0005\u001b\u0119\n\u001b\u0007\u001b\u011b\n\u001b\f\u001b\u000e",
    "\u001b\u011e\u000b\u001b\u0003\u001b\u0003\u001b\u0005\u001b\u0122\n",
    "\u001b\u0003\u001b\u0007\u001b\u0125\n\u001b\f\u001b\u000e\u001b\u0128",
    "\u000b\u001b\u0003\u001b\u0005\u001b\u012b\n\u001b\u0003\u001b\u0005",
    "\u001b\u012e\n\u001b\u0006\u001b\u0130\n\u001b\r\u001b\u000e\u001b\u0131",
    "\u0005\u001b\u0134\n\u001b\u0003\u001c\u0003\u001c\u0003\u001d\u0003",
    "\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0006",
    "\u001e\u013f\n\u001e\r\u001e\u000e\u001e\u0140\u0003\u001f\u0007\u001f",
    "\u0144\n\u001f\f\u001f\u000e\u001f\u0147\u000b\u001f\u0003\u001f\u0003",
    "\u001f\u0007\u001f\u014b\n\u001f\f\u001f\u000e\u001f\u014e\u000b\u001f",
    "\u0003 \u0003 \u0003 \u0003 \u0005 \u0154\n \u0007 \u0156\n \f \u000e",
    " \u0159\u000b \u0003 \u0003 \u0003 \u0003 \u0003 \u0003 \u0003 \u0005",
    " \u0162\n \u0007 \u0164\n \f \u000e \u0167\u000b \u0005 \u0169\n \u0003",
    " \u0002\u0002!\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016",
    "\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0002\u0005\u0006\u0002\u0007",
    "\u0007\n\n\u000e\u000e\u0010\u0010\u0005\u0002\u0007\u0007\n\n\u000f",
    "\u0010\u0005\u0002\u0007\u0007\n\n\u000e\u0010\u0002\u0185\u0002A\u0003",
    "\u0002\u0002\u0002\u0004T\u0003\u0002\u0002\u0002\u0006_\u0003\u0002",
    "\u0002\u0002\ba\u0003\u0002\u0002\u0002\nl\u0003\u0002\u0002\u0002\f",
    "n\u0003\u0002\u0002\u0002\u000eu\u0003\u0002\u0002\u0002\u0010w\u0003",
    "\u0002\u0002\u0002\u0012\u0080\u0003\u0002\u0002\u0002\u0014\u0088\u0003",
    "\u0002\u0002\u0002\u0016\u008c\u0003\u0002\u0002\u0002\u0018\u008e\u0003",
    "\u0002\u0002\u0002\u001a\u0091\u0003\u0002\u0002\u0002\u001c\u0095\u0003",
    "\u0002\u0002\u0002\u001e\u009e\u0003\u0002\u0002\u0002 \u00a9\u0003",
    "\u0002\u0002\u0002\"\u00ad\u0003\u0002\u0002\u0002$\u00b6\u0003\u0002",
    "\u0002\u0002&\u00b9\u0003\u0002\u0002\u0002(\u00bd\u0003\u0002\u0002",
    "\u0002*\u00ec\u0003\u0002\u0002\u0002,\u00ef\u0003\u0002\u0002\u0002",
    ".\u00fe\u0003\u0002\u0002\u00020\u0107\u0003\u0002\u0002\u00022\u0109",
    "\u0003\u0002\u0002\u00024\u0133\u0003\u0002\u0002\u00026\u0135\u0003",
    "\u0002\u0002\u00028\u0137\u0003\u0002\u0002\u0002:\u013e\u0003\u0002",
    "\u0002\u0002<\u0145\u0003\u0002\u0002\u0002>\u0168\u0003\u0002\u0002",
    "\u0002@B\u0005\u0004\u0003\u0002A@\u0003\u0002\u0002\u0002AB\u0003\u0002",
    "\u0002\u0002BD\u0003\u0002\u0002\u0002CE\u0005\b\u0005\u0002DC\u0003",
    "\u0002\u0002\u0002DE\u0003\u0002\u0002\u0002EG\u0003\u0002\u0002\u0002",
    "FH\u0005\f\u0007\u0002GF\u0003\u0002\u0002\u0002GH\u0003\u0002\u0002",
    "\u0002HJ\u0003\u0002\u0002\u0002IK\u0005\u0010\t\u0002JI\u0003\u0002",
    "\u0002\u0002JK\u0003\u0002\u0002\u0002KM\u0003\u0002\u0002\u0002LN\u0005",
    "\u001c\u000f\u0002ML\u0003\u0002\u0002\u0002MN\u0003\u0002\u0002\u0002",
    "NP\u0003\u0002\u0002\u0002OQ\u0005\"\u0012\u0002PO\u0003\u0002\u0002",
    "\u0002PQ\u0003\u0002\u0002\u0002QR\u0003\u0002\u0002\u0002RS\u0007\u0002",
    "\u0002\u0003S\u0003\u0003\u0002\u0002\u0002T[\u0005\u0018\r\u0002UW",
    "\u0005\u0006\u0004\u0002VX\u0005\u001a\u000e\u0002WV\u0003\u0002\u0002",
    "\u0002XY\u0003\u0002\u0002\u0002YW\u0003\u0002\u0002\u0002YZ\u0003\u0002",
    "\u0002\u0002Z\\\u0003\u0002\u0002\u0002[U\u0003\u0002\u0002\u0002\\",
    "]\u0003\u0002\u0002\u0002][\u0003\u0002\u0002\u0002]^\u0003\u0002\u0002",
    "\u0002^\u0005\u0003\u0002\u0002\u0002_`\u0005,\u0017\u0002`\u0007\u0003",
    "\u0002\u0002\u0002ah\u0005\u0018\r\u0002bd\u0005\n\u0006\u0002ce\u0005",
    "\u001a\u000e\u0002dc\u0003\u0002\u0002\u0002ef\u0003\u0002\u0002\u0002",
    "fd\u0003\u0002\u0002\u0002fg\u0003\u0002\u0002\u0002gi\u0003\u0002\u0002",
    "\u0002hb\u0003\u0002\u0002\u0002ij\u0003\u0002\u0002\u0002jh\u0003\u0002",
    "\u0002\u0002jk\u0003\u0002\u0002\u0002k\t\u0003\u0002\u0002\u0002lm",
    "\u0005> \u0002m\u000b\u0003\u0002\u0002\u0002no\u0005\u0018\r\u0002",
    "oq\u0005\u000e\b\u0002pr\u0005\u001a\u000e\u0002qp\u0003\u0002\u0002",
    "\u0002rs\u0003\u0002\u0002\u0002sq\u0003\u0002\u0002\u0002st\u0003\u0002",
    "\u0002\u0002t\r\u0003\u0002\u0002\u0002uv\u0005> \u0002v\u000f\u0003",
    "\u0002\u0002\u0002wy\u0005\u0012\n\u0002xz\u0005\u001a\u000e\u0002y",
    "x\u0003\u0002\u0002\u0002z{\u0003\u0002\u0002\u0002{y\u0003\u0002\u0002",
    "\u0002{|\u0003\u0002\u0002\u0002|~\u0003\u0002\u0002\u0002}\u007f\u0005",
    "\u0014\u000b\u0002~}\u0003\u0002\u0002\u0002~\u007f\u0003\u0002\u0002",
    "\u0002\u007f\u0011\u0003\u0002\u0002\u0002\u0080\u0081\u0007\u000b\u0002",
    "\u0002\u0081\u0013\u0003\u0002\u0002\u0002\u0082\u0084\u0005\u0016\f",
    "\u0002\u0083\u0085\u0005\u001a\u000e\u0002\u0084\u0083\u0003\u0002\u0002",
    "\u0002\u0085\u0086\u0003\u0002\u0002\u0002\u0086\u0084\u0003\u0002\u0002",
    "\u0002\u0086\u0087\u0003\u0002\u0002\u0002\u0087\u0089\u0003\u0002\u0002",
    "\u0002\u0088\u0082\u0003\u0002\u0002\u0002\u0089\u008a\u0003\u0002\u0002",
    "\u0002\u008a\u0088\u0003\u0002\u0002\u0002\u008a\u008b\u0003\u0002\u0002",
    "\u0002\u008b\u0015\u0003\u0002\u0002\u0002\u008c\u008d\u0005> \u0002",
    "\u008d\u0017\u0003\u0002\u0002\u0002\u008e\u008f\u0007\u0005\u0002\u0002",
    "\u008f\u0019\u0003\u0002\u0002\u0002\u0090\u0092\u0005\u0018\r\u0002",
    "\u0091\u0090\u0003\u0002\u0002\u0002\u0091\u0092\u0003\u0002\u0002\u0002",
    "\u0092\u0093\u0003\u0002\u0002\u0002\u0093\u0094\u0007\u0006\u0002\u0002",
    "\u0094\u001b\u0003\u0002\u0002\u0002\u0095\u0097\u0005\u001e\u0010\u0002",
    "\u0096\u0098\u0005\u001a\u000e\u0002\u0097\u0096\u0003\u0002\u0002\u0002",
    "\u0098\u0099\u0003\u0002\u0002\u0002\u0099\u0097\u0003\u0002\u0002\u0002",
    "\u0099\u009a\u0003\u0002\u0002\u0002\u009a\u009c\u0003\u0002\u0002\u0002",
    "\u009b\u009d\u0005 \u0011\u0002\u009c\u009b\u0003\u0002\u0002\u0002",
    "\u009c\u009d\u0003\u0002\u0002\u0002\u009d\u001d\u0003\u0002\u0002\u0002",
    "\u009e\u009f\u0007\r\u0002\u0002\u009f\u001f\u0003\u0002\u0002\u0002",
    "\u00a0\u00a2\u0005\u0018\r\u0002\u00a1\u00a0\u0003\u0002\u0002\u0002",
    "\u00a1\u00a2\u0003\u0002\u0002\u0002\u00a2\u00a3\u0003\u0002\u0002\u0002",
    "\u00a3\u00a5\u00058\u001d\u0002\u00a4\u00a6\u0005\u001a\u000e\u0002",
    "\u00a5\u00a4\u0003\u0002\u0002\u0002\u00a6\u00a7\u0003\u0002\u0002\u0002",
    "\u00a7\u00a5\u0003\u0002\u0002\u0002\u00a7\u00a8\u0003\u0002\u0002\u0002",
    "\u00a8\u00aa\u0003\u0002\u0002\u0002\u00a9\u00a1\u0003\u0002\u0002\u0002",
    "\u00aa\u00ab\u0003\u0002\u0002\u0002\u00ab\u00a9\u0003\u0002\u0002\u0002",
    "\u00ab\u00ac\u0003\u0002\u0002\u0002\u00ac!\u0003\u0002\u0002\u0002",
    "\u00ad\u00af\u0005$\u0013\u0002\u00ae\u00b0\u0005\u001a\u000e\u0002",
    "\u00af\u00ae\u0003\u0002\u0002\u0002\u00b0\u00b1\u0003\u0002\u0002\u0002",
    "\u00b1\u00af\u0003\u0002\u0002\u0002\u00b1\u00b2\u0003\u0002\u0002\u0002",
    "\u00b2\u00b4\u0003\u0002\u0002\u0002\u00b3\u00b5\u0005&\u0014\u0002",
    "\u00b4\u00b3\u0003\u0002\u0002\u0002\u00b4\u00b5\u0003\u0002\u0002\u0002",
    "\u00b5#\u0003\u0002\u0002\u0002\u00b6\u00b7\u0007\f\u0002\u0002\u00b7",
    "%\u0003\u0002\u0002\u0002\u00b8\u00ba\u0005(\u0015\u0002\u00b9\u00b8",
    "\u0003\u0002\u0002\u0002\u00ba\u00bb\u0003\u0002\u0002\u0002\u00bb\u00b9",
    "\u0003\u0002\u0002\u0002\u00bb\u00bc\u0003\u0002\u0002\u0002\u00bc\'",
    "\u0003\u0002\u0002\u0002\u00bd\u00bf\u0005*\u0016\u0002\u00be\u00c0",
    "\u0005\u001a\u000e\u0002\u00bf\u00be\u0003\u0002\u0002\u0002\u00c0\u00c1",
    "\u0003\u0002\u0002\u0002\u00c1\u00bf\u0003\u0002\u0002\u0002\u00c1\u00c2",
    "\u0003\u0002\u0002\u0002\u00c2\u00e8\u0003\u0002\u0002\u0002\u00c3\u00c5",
    "\u00052\u001a\u0002\u00c4\u00c6\u0005\u001a\u000e\u0002\u00c5\u00c4",
    "\u0003\u0002\u0002\u0002\u00c6\u00c7\u0003\u0002\u0002\u0002\u00c7\u00c5",
    "\u0003\u0002\u0002\u0002\u00c7\u00c8\u0003\u0002\u0002\u0002\u00c8\u00ca",
    "\u0003\u0002\u0002\u0002\u00c9\u00c3\u0003\u0002\u0002\u0002\u00ca\u00cd",
    "\u0003\u0002\u0002\u0002\u00cb\u00c9\u0003\u0002\u0002\u0002\u00cb\u00cc",
    "\u0003\u0002\u0002\u0002\u00cc\u00e4\u0003\u0002\u0002\u0002\u00cd\u00cb",
    "\u0003\u0002\u0002\u0002\u00ce\u00cf\u0005\u0018\r\u0002\u00cf\u00d1",
    "\u0005.\u0018\u0002\u00d0\u00d2\u0005\u001a\u000e\u0002\u00d1\u00d0",
    "\u0003\u0002\u0002\u0002\u00d2\u00d3\u0003\u0002\u0002\u0002\u00d3\u00d1",
    "\u0003\u0002\u0002\u0002\u00d3\u00d4\u0003\u0002\u0002\u0002\u00d4\u00e0",
    "\u0003\u0002\u0002\u0002\u00d5\u00d6\u0005\u0018\r\u0002\u00d6\u00d7",
    "\u00050\u0019\u0002\u00d7\u00da\u0003\u0002\u0002\u0002\u00d8\u00da",
    "\u00052\u001a\u0002\u00d9\u00d5\u0003\u0002\u0002\u0002\u00d9\u00d8",
    "\u0003\u0002\u0002\u0002\u00da\u00dc\u0003\u0002\u0002\u0002\u00db\u00dd",
    "\u0005\u001a\u000e\u0002\u00dc\u00db\u0003\u0002\u0002\u0002\u00dd\u00de",
    "\u0003\u0002\u0002\u0002\u00de\u00dc\u0003\u0002\u0002\u0002\u00de\u00df",
    "\u0003\u0002\u0002\u0002\u00df\u00e1\u0003\u0002\u0002\u0002\u00e0\u00d9",
    "\u0003\u0002\u0002\u0002\u00e1\u00e2\u0003\u0002\u0002\u0002\u00e2\u00e0",
    "\u0003\u0002\u0002\u0002\u00e2\u00e3\u0003\u0002\u0002\u0002\u00e3\u00e5",
    "\u0003\u0002\u0002\u0002\u00e4\u00ce\u0003\u0002\u0002\u0002\u00e5\u00e6",
    "\u0003\u0002\u0002\u0002\u00e6\u00e4\u0003\u0002\u0002\u0002\u00e6\u00e7",
    "\u0003\u0002\u0002\u0002\u00e7\u00e9\u0003\u0002\u0002\u0002\u00e8\u00cb",
    "\u0003\u0002\u0002\u0002\u00e9\u00ea\u0003\u0002\u0002\u0002\u00ea\u00e8",
    "\u0003\u0002\u0002\u0002\u00ea\u00eb\u0003\u0002\u0002\u0002\u00eb)",
    "\u0003\u0002\u0002\u0002\u00ec\u00ed\u0005,\u0017\u0002\u00ed+\u0003",
    "\u0002\u0002\u0002\u00ee\u00f0\t\u0002\u0002\u0002\u00ef\u00ee\u0003",
    "\u0002\u0002\u0002\u00f0\u00f1\u0003\u0002\u0002\u0002\u00f1\u00ef\u0003",
    "\u0002\u0002\u0002\u00f1\u00f2\u0003\u0002\u0002\u0002\u00f2\u00fb\u0003",
    "\u0002\u0002\u0002\u00f3\u00f5\u0005\u0018\r\u0002\u00f4\u00f6\t\u0002",
    "\u0002\u0002\u00f5\u00f4\u0003\u0002\u0002\u0002\u00f6\u00f7\u0003\u0002",
    "\u0002\u0002\u00f7\u00f5\u0003\u0002\u0002\u0002\u00f7\u00f8\u0003\u0002",
    "\u0002\u0002\u00f8\u00fa\u0003\u0002\u0002\u0002\u00f9\u00f3\u0003\u0002",
    "\u0002\u0002\u00fa\u00fd\u0003\u0002\u0002\u0002\u00fb\u00f9\u0003\u0002",
    "\u0002\u0002\u00fb\u00fc\u0003\u0002\u0002\u0002\u00fc-\u0003\u0002",
    "\u0002\u0002\u00fd\u00fb\u0003\u0002\u0002\u0002\u00fe\u0104\u0007\u000e",
    "\u0002\u0002\u00ff\u0100\u0005\u0018\r\u0002\u0100\u0101\u0007\u000e",
    "\u0002\u0002\u0101\u0103\u0003\u0002\u0002\u0002\u0102\u00ff\u0003\u0002",
    "\u0002\u0002\u0103\u0106\u0003\u0002\u0002\u0002\u0104\u0102\u0003\u0002",
    "\u0002\u0002\u0104\u0105\u0003\u0002\u0002\u0002\u0105/\u0003\u0002",
    "\u0002\u0002\u0106\u0104\u0003\u0002\u0002\u0002\u0107\u0108\u00054",
    "\u001b\u0002\u01081\u0003\u0002\u0002\u0002\u0109\u010a\u00054\u001b",
    "\u0002\u010a3\u0003\u0002\u0002\u0002\u010b\u011c\u0005> \u0002\u010c",
    "\u010e\u0005\u0018\r\u0002\u010d\u010c\u0003\u0002\u0002\u0002\u010d",
    "\u010e\u0003\u0002\u0002\u0002\u010e\u010f\u0003\u0002\u0002\u0002\u010f",
    "\u0111\u00058\u001d\u0002\u0110\u010d\u0003\u0002\u0002\u0002\u0111",
    "\u0112\u0003\u0002\u0002\u0002\u0112\u0110\u0003\u0002\u0002\u0002\u0112",
    "\u0113\u0003\u0002\u0002\u0002\u0113\u0118\u0003\u0002\u0002\u0002\u0114",
    "\u0116\u0005\u0018\r\u0002\u0115\u0114\u0003\u0002\u0002\u0002\u0115",
    "\u0116\u0003\u0002\u0002\u0002\u0116\u0117\u0003\u0002\u0002\u0002\u0117",
    "\u0119\u0005> \u0002\u0118\u0115\u0003\u0002\u0002\u0002\u0118\u0119",
    "\u0003\u0002\u0002\u0002\u0119\u011b\u0003\u0002\u0002\u0002\u011a\u0110",
    "\u0003\u0002\u0002\u0002\u011b\u011e\u0003\u0002\u0002\u0002\u011c\u011a",
    "\u0003\u0002\u0002\u0002\u011c\u011d\u0003\u0002\u0002\u0002\u011d\u0134",
    "\u0003\u0002\u0002\u0002\u011e\u011c\u0003\u0002\u0002\u0002\u011f\u0126",
    "\u00058\u001d\u0002\u0120\u0122\u0005\u0018\r\u0002\u0121\u0120\u0003",
    "\u0002\u0002\u0002\u0121\u0122\u0003\u0002\u0002\u0002\u0122\u0123\u0003",
    "\u0002\u0002\u0002\u0123\u0125\u00058\u001d\u0002\u0124\u0121\u0003",
    "\u0002\u0002\u0002\u0125\u0128\u0003\u0002\u0002\u0002\u0126\u0124\u0003",
    "\u0002\u0002\u0002\u0126\u0127\u0003\u0002\u0002\u0002\u0127\u012d\u0003",
    "\u0002\u0002\u0002\u0128\u0126\u0003\u0002\u0002\u0002\u0129\u012b\u0005",
    "\u0018\r\u0002\u012a\u0129\u0003\u0002\u0002\u0002\u012a\u012b\u0003",
    "\u0002\u0002\u0002\u012b\u012c\u0003\u0002\u0002\u0002\u012c\u012e\u0005",
    "> \u0002\u012d\u012a\u0003\u0002\u0002\u0002\u012d\u012e\u0003\u0002",
    "\u0002\u0002\u012e\u0130\u0003\u0002\u0002\u0002\u012f\u011f\u0003\u0002",
    "\u0002\u0002\u0130\u0131\u0003\u0002\u0002\u0002\u0131\u012f\u0003\u0002",
    "\u0002\u0002\u0131\u0132\u0003\u0002\u0002\u0002\u0132\u0134\u0003\u0002",
    "\u0002\u0002\u0133\u010b\u0003\u0002\u0002\u0002\u0133\u012f\u0003\u0002",
    "\u0002\u0002\u01345\u0003\u0002\u0002\u0002\u0135\u0136\u0007\u000e",
    "\u0002\u0002\u01367\u0003\u0002\u0002\u0002\u0137\u0138\u0007\b\u0002",
    "\u0002\u0138\u0139\u0005:\u001e\u0002\u0139\u013a\u0007\t\u0002\u0002",
    "\u013a9\u0003\u0002\u0002\u0002\u013b\u013f\u0005\u0018\r\u0002\u013c",
    "\u013f\u0005> \u0002\u013d\u013f\u00056\u001c\u0002\u013e\u013b\u0003",
    "\u0002\u0002\u0002\u013e\u013c\u0003\u0002\u0002\u0002\u013e\u013d\u0003",
    "\u0002\u0002\u0002\u013f\u0140\u0003\u0002\u0002\u0002\u0140\u013e\u0003",
    "\u0002\u0002\u0002\u0140\u0141\u0003\u0002\u0002\u0002\u0141;\u0003",
    "\u0002\u0002\u0002\u0142\u0144\u0007\u000e\u0002\u0002\u0143\u0142\u0003",
    "\u0002\u0002\u0002\u0144\u0147\u0003\u0002\u0002\u0002\u0145\u0143\u0003",
    "\u0002\u0002\u0002\u0145\u0146\u0003\u0002\u0002\u0002\u0146\u0148\u0003",
    "\u0002\u0002\u0002\u0147\u0145\u0003\u0002\u0002\u0002\u0148\u014c\t",
    "\u0003\u0002\u0002\u0149\u014b\t\u0004\u0002\u0002\u014a\u0149\u0003",
    "\u0002\u0002\u0002\u014b\u014e\u0003\u0002\u0002\u0002\u014c\u014a\u0003",
    "\u0002\u0002\u0002\u014c\u014d\u0003\u0002\u0002\u0002\u014d=\u0003",
    "\u0002\u0002\u0002\u014e\u014c\u0003\u0002\u0002\u0002\u014f\u0157\u0007",
    "\u000e\u0002\u0002\u0150\u0153\u0005\u0018\r\u0002\u0151\u0154\u0007",
    "\u000e\u0002\u0002\u0152\u0154\u0005<\u001f\u0002\u0153\u0151\u0003",
    "\u0002\u0002\u0002\u0153\u0152\u0003\u0002\u0002\u0002\u0154\u0156\u0003",
    "\u0002\u0002\u0002\u0155\u0150\u0003\u0002\u0002\u0002\u0156\u0159\u0003",
    "\u0002\u0002\u0002\u0157\u0155\u0003\u0002\u0002\u0002\u0157\u0158\u0003",
    "\u0002\u0002\u0002\u0158\u015a\u0003\u0002\u0002\u0002\u0159\u0157\u0003",
    "\u0002\u0002\u0002\u015a\u015b\u0005\u0018\r\u0002\u015b\u015c\u0005",
    "<\u001f\u0002\u015c\u0169\u0003\u0002\u0002\u0002\u015d\u0165\u0005",
    "<\u001f\u0002\u015e\u0161\u0005\u0018\r\u0002\u015f\u0162\u0007\u000e",
    "\u0002\u0002\u0160\u0162\u0005<\u001f\u0002\u0161\u015f\u0003\u0002",
    "\u0002\u0002\u0161\u0160\u0003\u0002\u0002\u0002\u0162\u0164\u0003\u0002",
    "\u0002\u0002\u0163\u015e\u0003\u0002\u0002\u0002\u0164\u0167\u0003\u0002",
    "\u0002\u0002\u0165\u0163\u0003\u0002\u0002\u0002\u0165\u0166\u0003\u0002",
    "\u0002\u0002\u0166\u0169\u0003\u0002\u0002\u0002\u0167\u0165\u0003\u0002",
    "\u0002\u0002\u0168\u014f\u0003\u0002\u0002\u0002\u0168\u015d\u0003\u0002",
    "\u0002\u0002\u0169?\u0003\u0002\u0002\u0002;ADGJMPY]fjs{~\u0086\u008a",
    "\u0091\u0099\u009c\u00a1\u00a7\u00ab\u00b1\u00b4\u00bb\u00c1\u00c7\u00cb",
    "\u00d3\u00d9\u00de\u00e2\u00e6\u00ea\u00f1\u00f7\u00fb\u0104\u010d\u0112",
    "\u0115\u0118\u011c\u0121\u0126\u012a\u012d\u0131\u0133\u013e\u0140\u0145",
    "\u014c\u0153\u0157\u0161\u0165\u0168"].join("");


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class ManuscriptParser extends antlr4.Parser {

    static grammarFileName = "ManuscriptParser.g4";
    static literalNames = [ null, null, null, null, null, null, "'('", "')'", 
                            null, null, "'KOHTAUKSET'", "'EFEKTIT'" ];
    static symbolicNames = [ null, "MultiLineComment", "SingleLineComment", 
                             "WSS", "EOL", "Punctuation", "LeftParenthesis", 
                             "RightParenthesis", "Extra", "Synopsis", "Scene", 
                             "Effects", "CapitalWord", "MinusculeWord", 
                             "Number" ];
    static ruleNames = [ "manuscript", "titlePart", "title", "authorsPart", 
                         "authors", "dateParagraph", "date", "synopsisPart", 
                         "synopsisTitle", "synopsisParagraphs", "synopsisParagraph", 
                         "wss", "eol", "effectsPart", "effectsTitle", "effects", 
                         "scenesPart", "scenesHeading", "scenes", "scene", 
                         "sceneHeading", "heading", "name", "replique", 
                         "parenthesis", "nonCapitalTextOrCommand", "capitalWord", 
                         "command", "commandText", "nonCapitalWord", "nonCapitalText" ];

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
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 63;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,0,this._ctx);
	        if(la_===1) {
	            this.state = 62;
	            this.titlePart();

	        }
	        this.state = 66;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
	        if(la_===1) {
	            this.state = 65;
	            this.authorsPart();

	        }
	        this.state = 69;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.WSS) {
	            this.state = 68;
	            this.dateParagraph();
	        }

	        this.state = 72;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.Synopsis) {
	            this.state = 71;
	            this.synopsisPart();
	        }

	        this.state = 75;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.Effects) {
	            this.state = 74;
	            this.effectsPart();
	        }

	        this.state = 78;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.Scene) {
	            this.state = 77;
	            this.scenesPart();
	        }

	        this.state = 80;
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



	titlePart() {
	    let localctx = new TitlePartContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, ManuscriptParser.RULE_titlePart);
	    var _la = 0; // Token type
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 82;
	        this.wss();
	        this.state = 89; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 83;
	            this.title();
	            this.state = 85; 
	            this._errHandler.sync(this);
	            _alt = 1;
	            do {
	            	switch (_alt) {
	            	case 1:
	            		this.state = 84;
	            		this.eol();
	            		break;
	            	default:
	            		throw new antlr4.error.NoViableAltException(this);
	            	}
	            	this.state = 87; 
	            	this._errHandler.sync(this);
	            	_alt = this._interp.adaptivePredict(this._input,6, this._ctx);
	            } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	            this.state = 91; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0));
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
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 93;
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



	authorsPart() {
	    let localctx = new AuthorsPartContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, ManuscriptParser.RULE_authorsPart);
	    var _la = 0; // Token type
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 95;
	        this.wss();
	        this.state = 102; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 96;
	            this.authors();
	            this.state = 98; 
	            this._errHandler.sync(this);
	            _alt = 1;
	            do {
	            	switch (_alt) {
	            	case 1:
	            		this.state = 97;
	            		this.eol();
	            		break;
	            	default:
	            		throw new antlr4.error.NoViableAltException(this);
	            	}
	            	this.state = 100; 
	            	this._errHandler.sync(this);
	            	_alt = this._interp.adaptivePredict(this._input,8, this._ctx);
	            } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	            this.state = 104; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0));
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



	authors() {
	    let localctx = new AuthorsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, ManuscriptParser.RULE_authors);
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 106;
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
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 108;
	        this.wss();
	        this.state = 109;
	        this.date();
	        this.state = 111; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 110;
	            this.eol();
	            this.state = 113; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===ManuscriptParser.WSS || _la===ManuscriptParser.EOL);
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
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 115;
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
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 117;
	        this.synopsisTitle();
	        this.state = 119; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 118;
	            this.eol();
	            this.state = 121; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===ManuscriptParser.WSS || _la===ManuscriptParser.EOL);
	        this.state = 124;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0)) {
	            this.state = 123;
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
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 126;
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
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 134; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 128;
	            this.synopsisParagraph();
	            this.state = 130; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            do {
	                this.state = 129;
	                this.eol();
	                this.state = 132; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            } while(_la===ManuscriptParser.WSS || _la===ManuscriptParser.EOL);
	            this.state = 136; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0));
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
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 138;
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
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 140;
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
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 143;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.WSS) {
	            this.state = 142;
	            this.wss();
	        }

	        this.state = 145;
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



	effectsPart() {
	    let localctx = new EffectsPartContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, ManuscriptParser.RULE_effectsPart);
	    var _la = 0; // Token type
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 147;
	        this.effectsTitle();
	        this.state = 149; 
	        this._errHandler.sync(this);
	        _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 148;
	        		this.eol();
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 151; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,16, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 154;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.WSS || _la===ManuscriptParser.LeftParenthesis) {
	            this.state = 153;
	            this.effects();
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



	effectsTitle() {
	    let localctx = new EffectsTitleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 28, ManuscriptParser.RULE_effectsTitle);
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 156;
	        this.match(ManuscriptParser.Effects);
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



	effects() {
	    let localctx = new EffectsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, ManuscriptParser.RULE_effects);
	    var _la = 0; // Token type
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 167; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 159;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===ManuscriptParser.WSS) {
	                this.state = 158;
	                this.wss();
	            }

	            this.state = 161;
	            this.command();
	            this.state = 163; 
	            this._errHandler.sync(this);
	            _alt = 1;
	            do {
	            	switch (_alt) {
	            	case 1:
	            		this.state = 162;
	            		this.eol();
	            		break;
	            	default:
	            		throw new antlr4.error.NoViableAltException(this);
	            	}
	            	this.state = 165; 
	            	this._errHandler.sync(this);
	            	_alt = this._interp.adaptivePredict(this._input,19, this._ctx);
	            } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	            this.state = 169; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===ManuscriptParser.WSS || _la===ManuscriptParser.LeftParenthesis);
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
	    this.enterRule(localctx, 32, ManuscriptParser.RULE_scenesPart);
	    var _la = 0; // Token type
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 171;
	        this.scenesHeading();
	        this.state = 173; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 172;
	            this.eol();
	            this.state = 175; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===ManuscriptParser.WSS || _la===ManuscriptParser.EOL);
	        this.state = 178;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0)) {
	            this.state = 177;
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
	    this.enterRule(localctx, 34, ManuscriptParser.RULE_scenesHeading);
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 180;
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
	    this.enterRule(localctx, 36, ManuscriptParser.RULE_scenes);
	    var _la = 0; // Token type
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 183; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 182;
	            this.scene();
	            this.state = 185; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0));
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
	    this.enterRule(localctx, 38, ManuscriptParser.RULE_scene);
	    var _la = 0; // Token type
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 187;
	        this.sceneHeading();
	        this.state = 189; 
	        this._errHandler.sync(this);
	        _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 188;
	        		this.eol();
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 191; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,24, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 230; 
	        this._errHandler.sync(this);
	        _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 201;
	        		this._errHandler.sync(this);
	        		_la = this._input.LA(1);
	        		while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.LeftParenthesis) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0)) {
	        		    this.state = 193;
	        		    this.parenthesis();
	        		    this.state = 195; 
	        		    this._errHandler.sync(this);
	        		    _alt = 1;
	        		    do {
	        		    	switch (_alt) {
	        		    	case 1:
	        		    		this.state = 194;
	        		    		this.eol();
	        		    		break;
	        		    	default:
	        		    		throw new antlr4.error.NoViableAltException(this);
	        		    	}
	        		    	this.state = 197; 
	        		    	this._errHandler.sync(this);
	        		    	_alt = this._interp.adaptivePredict(this._input,25, this._ctx);
	        		    } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        		    this.state = 203;
	        		    this._errHandler.sync(this);
	        		    _la = this._input.LA(1);
	        		}
	        		this.state = 226; 
	        		this._errHandler.sync(this);
	        		_alt = 1;
	        		do {
	        			switch (_alt) {
	        			case 1:
	        				this.state = 204;
	        				this.wss();
	        				this.state = 205;
	        				this.name();
	        				this.state = 207; 
	        				this._errHandler.sync(this);
	        				_alt = 1;
	        				do {
	        					switch (_alt) {
	        					case 1:
	        						this.state = 206;
	        						this.eol();
	        						break;
	        					default:
	        						throw new antlr4.error.NoViableAltException(this);
	        					}
	        					this.state = 209; 
	        					this._errHandler.sync(this);
	        					_alt = this._interp.adaptivePredict(this._input,27, this._ctx);
	        				} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        				this.state = 222; 
	        				this._errHandler.sync(this);
	        				_alt = 1;
	        				do {
	        					switch (_alt) {
	        					case 1:
	        						this.state = 215;
	        						this._errHandler.sync(this);
	        						switch(this._input.LA(1)) {
	        						case ManuscriptParser.WSS:
	        						    this.state = 211;
	        						    this.wss();
	        						    this.state = 212;
	        						    this.replique();
	        						    break;
	        						case ManuscriptParser.Punctuation:
	        						case ManuscriptParser.LeftParenthesis:
	        						case ManuscriptParser.Extra:
	        						case ManuscriptParser.CapitalWord:
	        						case ManuscriptParser.MinusculeWord:
	        						case ManuscriptParser.Number:
	        						    this.state = 214;
	        						    this.parenthesis();
	        						    break;
	        						default:
	        						    throw new antlr4.error.NoViableAltException(this);
	        						}
	        						this.state = 218; 
	        						this._errHandler.sync(this);
	        						_alt = 1;
	        						do {
	        							switch (_alt) {
	        							case 1:
	        								this.state = 217;
	        								this.eol();
	        								break;
	        							default:
	        								throw new antlr4.error.NoViableAltException(this);
	        							}
	        							this.state = 220; 
	        							this._errHandler.sync(this);
	        							_alt = this._interp.adaptivePredict(this._input,29, this._ctx);
	        						} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        						break;
	        					default:
	        						throw new antlr4.error.NoViableAltException(this);
	        					}
	        					this.state = 224; 
	        					this._errHandler.sync(this);
	        					_alt = this._interp.adaptivePredict(this._input,30, this._ctx);
	        				} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        				break;
	        			default:
	        				throw new antlr4.error.NoViableAltException(this);
	        			}
	        			this.state = 228; 
	        			this._errHandler.sync(this);
	        			_alt = this._interp.adaptivePredict(this._input,31, this._ctx);
	        		} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 232; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,32, this._ctx);
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
	    this.enterRule(localctx, 40, ManuscriptParser.RULE_sceneHeading);
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 234;
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
	    this.enterRule(localctx, 42, ManuscriptParser.RULE_heading);
	    var _la = 0; // Token type
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 237; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 236;
	            _la = this._input.LA(1);
	            if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0))) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 239; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0));
	        this.state = 249;
	        this._errHandler.sync(this);
	        _alt = this._interp.adaptivePredict(this._input,35,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 241;
	                this.wss();
	                this.state = 243; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	                do {
	                    this.state = 242;
	                    _la = this._input.LA(1);
	                    if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0))) {
	                    this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 245; 
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0)); 
	            }
	            this.state = 251;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,35,this._ctx);
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
	    this.enterRule(localctx, 44, ManuscriptParser.RULE_name);
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 252;
	        this.match(ManuscriptParser.CapitalWord);
	        this.state = 258;
	        this._errHandler.sync(this);
	        _alt = this._interp.adaptivePredict(this._input,36,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 253;
	                this.wss();
	                this.state = 254;
	                this.match(ManuscriptParser.CapitalWord); 
	            }
	            this.state = 260;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,36,this._ctx);
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
	    this.enterRule(localctx, 46, ManuscriptParser.RULE_replique);
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 261;
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
	    this.enterRule(localctx, 48, ManuscriptParser.RULE_parenthesis);
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 263;
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
	    this.enterRule(localctx, 50, ManuscriptParser.RULE_nonCapitalTextOrCommand);
	    var _la = 0; // Token type
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 305;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case ManuscriptParser.Punctuation:
	        case ManuscriptParser.Extra:
	        case ManuscriptParser.CapitalWord:
	        case ManuscriptParser.MinusculeWord:
	        case ManuscriptParser.Number:
	            this.state = 265;
	            this.nonCapitalText();
	            this.state = 282;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,41,this._ctx)
	            while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                if(_alt===1) {
	                    this.state = 270; 
	                    this._errHandler.sync(this);
	                    _alt = 1;
	                    do {
	                    	switch (_alt) {
	                    	case 1:
	                    		this.state = 267;
	                    		this._errHandler.sync(this);
	                    		_la = this._input.LA(1);
	                    		if(_la===ManuscriptParser.WSS) {
	                    		    this.state = 266;
	                    		    this.wss();
	                    		}

	                    		this.state = 269;
	                    		this.command();
	                    		break;
	                    	default:
	                    		throw new antlr4.error.NoViableAltException(this);
	                    	}
	                    	this.state = 272; 
	                    	this._errHandler.sync(this);
	                    	_alt = this._interp.adaptivePredict(this._input,38, this._ctx);
	                    } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	                    this.state = 278;
	                    this._errHandler.sync(this);
	                    var la_ = this._interp.adaptivePredict(this._input,40,this._ctx);
	                    if(la_===1) {
	                        this.state = 275;
	                        this._errHandler.sync(this);
	                        _la = this._input.LA(1);
	                        if(_la===ManuscriptParser.WSS) {
	                            this.state = 274;
	                            this.wss();
	                        }

	                        this.state = 277;
	                        this.nonCapitalText();

	                    } 
	                }
	                this.state = 284;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,41,this._ctx);
	            }

	            break;
	        case ManuscriptParser.LeftParenthesis:
	            this.state = 301; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            do {
	                this.state = 285;
	                this.command();
	                this.state = 292;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,43,this._ctx)
	                while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                    if(_alt===1) {
	                        this.state = 287;
	                        this._errHandler.sync(this);
	                        _la = this._input.LA(1);
	                        if(_la===ManuscriptParser.WSS) {
	                            this.state = 286;
	                            this.wss();
	                        }

	                        this.state = 289;
	                        this.command(); 
	                    }
	                    this.state = 294;
	                    this._errHandler.sync(this);
	                    _alt = this._interp.adaptivePredict(this._input,43,this._ctx);
	                }

	                this.state = 299;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,45,this._ctx);
	                if(la_===1) {
	                    this.state = 296;
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                    if(_la===ManuscriptParser.WSS) {
	                        this.state = 295;
	                        this.wss();
	                    }

	                    this.state = 298;
	                    this.nonCapitalText();

	                }
	                this.state = 303; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            } while(_la===ManuscriptParser.LeftParenthesis);
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



	capitalWord() {
	    let localctx = new CapitalWordContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 52, ManuscriptParser.RULE_capitalWord);
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 307;
	        this.match(ManuscriptParser.CapitalWord);
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
	    this.enterRule(localctx, 54, ManuscriptParser.RULE_command);
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 309;
	        this.match(ManuscriptParser.LeftParenthesis);
	        this.state = 310;
	        this.commandText();
	        this.state = 311;
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



	commandText() {
	    let localctx = new CommandTextContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 56, ManuscriptParser.RULE_commandText);
	    var _la = 0; // Token type
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 316; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 316;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,48,this._ctx);
	            switch(la_) {
	            case 1:
	                this.state = 313;
	                this.wss();
	                break;

	            case 2:
	                this.state = 314;
	                this.nonCapitalText();
	                break;

	            case 3:
	                this.state = 315;
	                this.capitalWord();
	                break;

	            }
	            this.state = 318; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.WSS) | (1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0));
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
	    this.enterRule(localctx, 58, ManuscriptParser.RULE_nonCapitalWord);
	    var _la = 0; // Token type
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 323;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===ManuscriptParser.CapitalWord) {
	            this.state = 320;
	            this.match(ManuscriptParser.CapitalWord);
	            this.state = 325;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 326;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 330;
	        this._errHandler.sync(this);
	        _alt = this._interp.adaptivePredict(this._input,51,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 327;
	                _la = this._input.LA(1);
	                if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0))) {
	                this._errHandler.recoverInline(this);
	                }
	                else {
	                	this._errHandler.reportMatch(this);
	                    this.consume();
	                } 
	            }
	            this.state = 332;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,51,this._ctx);
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
	    this.enterRule(localctx, 60, ManuscriptParser.RULE_nonCapitalText);
	    try { let _alt;
	        this.enterOuterAlt(localctx, 1);
	        this.state = 358;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,56,this._ctx);
	        switch(la_) {
	        case 1:
	            this.state = 333;
	            this.match(ManuscriptParser.CapitalWord);
	            this.state = 341;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,53,this._ctx)
	            while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                if(_alt===1) {
	                    this.state = 334;
	                    this.wss();
	                    this.state = 337;
	                    this._errHandler.sync(this);
	                    var la_ = this._interp.adaptivePredict(this._input,52,this._ctx);
	                    switch(la_) {
	                    case 1:
	                        this.state = 335;
	                        this.match(ManuscriptParser.CapitalWord);
	                        break;

	                    case 2:
	                        this.state = 336;
	                        this.nonCapitalWord();
	                        break;

	                    } 
	                }
	                this.state = 343;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,53,this._ctx);
	            }

	            this.state = 344;
	            this.wss();
	            this.state = 345;
	            this.nonCapitalWord();
	            break;

	        case 2:
	            this.state = 347;
	            this.nonCapitalWord();
	            this.state = 355;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,55,this._ctx)
	            while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                if(_alt===1) {
	                    this.state = 348;
	                    this.wss();
	                    this.state = 351;
	                    this._errHandler.sync(this);
	                    var la_ = this._interp.adaptivePredict(this._input,54,this._ctx);
	                    switch(la_) {
	                    case 1:
	                        this.state = 349;
	                        this.match(ManuscriptParser.CapitalWord);
	                        break;

	                    case 2:
	                        this.state = 350;
	                        this.nonCapitalWord();
	                        break;

	                    } 
	                }
	                this.state = 357;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,55,this._ctx);
	            }

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

ManuscriptParser.EOF = antlr4.Token.EOF;
ManuscriptParser.MultiLineComment = 1;
ManuscriptParser.SingleLineComment = 2;
ManuscriptParser.WSS = 3;
ManuscriptParser.EOL = 4;
ManuscriptParser.Punctuation = 5;
ManuscriptParser.LeftParenthesis = 6;
ManuscriptParser.RightParenthesis = 7;
ManuscriptParser.Extra = 8;
ManuscriptParser.Synopsis = 9;
ManuscriptParser.Scene = 10;
ManuscriptParser.Effects = 11;
ManuscriptParser.CapitalWord = 12;
ManuscriptParser.MinusculeWord = 13;
ManuscriptParser.Number = 14;

ManuscriptParser.RULE_manuscript = 0;
ManuscriptParser.RULE_titlePart = 1;
ManuscriptParser.RULE_title = 2;
ManuscriptParser.RULE_authorsPart = 3;
ManuscriptParser.RULE_authors = 4;
ManuscriptParser.RULE_dateParagraph = 5;
ManuscriptParser.RULE_date = 6;
ManuscriptParser.RULE_synopsisPart = 7;
ManuscriptParser.RULE_synopsisTitle = 8;
ManuscriptParser.RULE_synopsisParagraphs = 9;
ManuscriptParser.RULE_synopsisParagraph = 10;
ManuscriptParser.RULE_wss = 11;
ManuscriptParser.RULE_eol = 12;
ManuscriptParser.RULE_effectsPart = 13;
ManuscriptParser.RULE_effectsTitle = 14;
ManuscriptParser.RULE_effects = 15;
ManuscriptParser.RULE_scenesPart = 16;
ManuscriptParser.RULE_scenesHeading = 17;
ManuscriptParser.RULE_scenes = 18;
ManuscriptParser.RULE_scene = 19;
ManuscriptParser.RULE_sceneHeading = 20;
ManuscriptParser.RULE_heading = 21;
ManuscriptParser.RULE_name = 22;
ManuscriptParser.RULE_replique = 23;
ManuscriptParser.RULE_parenthesis = 24;
ManuscriptParser.RULE_nonCapitalTextOrCommand = 25;
ManuscriptParser.RULE_capitalWord = 26;
ManuscriptParser.RULE_command = 27;
ManuscriptParser.RULE_commandText = 28;
ManuscriptParser.RULE_nonCapitalWord = 29;
ManuscriptParser.RULE_nonCapitalText = 30;

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

	titlePart() {
	    return this.getTypedRuleContext(TitlePartContext,0);
	};

	authorsPart() {
	    return this.getTypedRuleContext(AuthorsPartContext,0);
	};

	dateParagraph() {
	    return this.getTypedRuleContext(DateParagraphContext,0);
	};

	synopsisPart() {
	    return this.getTypedRuleContext(SynopsisPartContext,0);
	};

	effectsPart() {
	    return this.getTypedRuleContext(EffectsPartContext,0);
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



class TitlePartContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_titlePart;
    }

	wss() {
	    return this.getTypedRuleContext(WssContext,0);
	};

	title = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(TitleContext);
	    } else {
	        return this.getTypedRuleContext(TitleContext,i);
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
	        listener.enterTitlePart(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitTitlePart(this);
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



class AuthorsPartContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_authorsPart;
    }

	wss() {
	    return this.getTypedRuleContext(WssContext,0);
	};

	authors = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(AuthorsContext);
	    } else {
	        return this.getTypedRuleContext(AuthorsContext,i);
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
	        listener.enterAuthorsPart(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitAuthorsPart(this);
		}
	}


}



class AuthorsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_authors;
    }

	nonCapitalText() {
	    return this.getTypedRuleContext(NonCapitalTextContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterAuthors(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitAuthors(this);
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



class EffectsPartContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_effectsPart;
    }

	effectsTitle() {
	    return this.getTypedRuleContext(EffectsTitleContext,0);
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

	effects() {
	    return this.getTypedRuleContext(EffectsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterEffectsPart(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitEffectsPart(this);
		}
	}


}



class EffectsTitleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_effectsTitle;
    }

	Effects() {
	    return this.getToken(ManuscriptParser.Effects, 0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterEffectsTitle(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitEffectsTitle(this);
		}
	}


}



class EffectsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_effects;
    }

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
	        listener.enterEffects(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitEffects(this);
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



class CapitalWordContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_capitalWord;
    }

	CapitalWord() {
	    return this.getToken(ManuscriptParser.CapitalWord, 0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterCapitalWord(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitCapitalWord(this);
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

	commandText() {
	    return this.getTypedRuleContext(CommandTextContext,0);
	};

	RightParenthesis() {
	    return this.getToken(ManuscriptParser.RightParenthesis, 0);
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



class CommandTextContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_commandText;
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

	capitalWord = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CapitalWordContext);
	    } else {
	        return this.getTypedRuleContext(CapitalWordContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterCommandText(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitCommandText(this);
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


	MinusculeWord = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.MinusculeWord);
	    } else {
	        return this.getToken(ManuscriptParser.MinusculeWord, i);
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
ManuscriptParser.TitlePartContext = TitlePartContext; 
ManuscriptParser.TitleContext = TitleContext; 
ManuscriptParser.AuthorsPartContext = AuthorsPartContext; 
ManuscriptParser.AuthorsContext = AuthorsContext; 
ManuscriptParser.DateParagraphContext = DateParagraphContext; 
ManuscriptParser.DateContext = DateContext; 
ManuscriptParser.SynopsisPartContext = SynopsisPartContext; 
ManuscriptParser.SynopsisTitleContext = SynopsisTitleContext; 
ManuscriptParser.SynopsisParagraphsContext = SynopsisParagraphsContext; 
ManuscriptParser.SynopsisParagraphContext = SynopsisParagraphContext; 
ManuscriptParser.WssContext = WssContext; 
ManuscriptParser.EolContext = EolContext; 
ManuscriptParser.EffectsPartContext = EffectsPartContext; 
ManuscriptParser.EffectsTitleContext = EffectsTitleContext; 
ManuscriptParser.EffectsContext = EffectsContext; 
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
ManuscriptParser.CapitalWordContext = CapitalWordContext; 
ManuscriptParser.CommandContext = CommandContext; 
ManuscriptParser.CommandTextContext = CommandTextContext; 
ManuscriptParser.NonCapitalWordContext = NonCapitalWordContext; 
ManuscriptParser.NonCapitalTextContext = NonCapitalTextContext; 
