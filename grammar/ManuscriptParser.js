// Generated from ManuscriptParser.g4 by ANTLR 4.9
// jshint ignore: start
import antlr4 from 'antlr4';
import ManuscriptParserListener from './ManuscriptParserListener.js';

const serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786",
    "\u5964\u0003\u000f\u0143\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004",
    "\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t",
    "\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004",
    "\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010",
    "\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013",
    "\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017",
    "\t\u0017\u0004\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a",
    "\u0004\u001b\t\u001b\u0003\u0002\u0005\u00028\n\u0002\u0003\u0002\u0005",
    "\u0002;\n\u0002\u0003\u0002\u0005\u0002>\n\u0002\u0003\u0002\u0005\u0002",
    "A\n\u0002\u0003\u0002\u0005\u0002D\n\u0002\u0003\u0002\u0003\u0002\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0006\u0003K\n\u0003\r\u0003\u000e\u0003",
    "L\u0006\u0003O\n\u0003\r\u0003\u000e\u0003P\u0003\u0004\u0003\u0004",
    "\u0003\u0005\u0003\u0005\u0003\u0005\u0006\u0005X\n\u0005\r\u0005\u000e",
    "\u0005Y\u0006\u0005\\\n\u0005\r\u0005\u000e\u0005]\u0003\u0006\u0003",
    "\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0006\u0007e\n\u0007\r\u0007",
    "\u000e\u0007f\u0003\b\u0003\b\u0003\t\u0003\t\u0006\tm\n\t\r\t\u000e",
    "\tn\u0003\t\u0005\tr\n\t\u0003\n\u0003\n\u0003\u000b\u0003\u000b\u0006",
    "\u000bx\n\u000b\r\u000b\u000e\u000by\u0006\u000b|\n\u000b\r\u000b\u000e",
    "\u000b}\u0003\f\u0003\f\u0003\r\u0003\r\u0003\u000e\u0005\u000e\u0085",
    "\n\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0006\u000f",
    "\u008b\n\u000f\r\u000f\u000e\u000f\u008c\u0003\u000f\u0005\u000f\u0090",
    "\n\u000f\u0003\u0010\u0003\u0010\u0003\u0011\u0006\u0011\u0095\n\u0011",
    "\r\u0011\u000e\u0011\u0096\u0003\u0012\u0003\u0012\u0006\u0012\u009b",
    "\n\u0012\r\u0012\u000e\u0012\u009c\u0003\u0012\u0003\u0012\u0006\u0012",
    "\u00a1\n\u0012\r\u0012\u000e\u0012\u00a2\u0007\u0012\u00a5\n\u0012\f",
    "\u0012\u000e\u0012\u00a8\u000b\u0012\u0003\u0012\u0003\u0012\u0003\u0012",
    "\u0006\u0012\u00ad\n\u0012\r\u0012\u000e\u0012\u00ae\u0003\u0012\u0003",
    "\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u00b5\n\u0012\u0003\u0012",
    "\u0006\u0012\u00b8\n\u0012\r\u0012\u000e\u0012\u00b9\u0006\u0012\u00bc",
    "\n\u0012\r\u0012\u000e\u0012\u00bd\u0006\u0012\u00c0\n\u0012\r\u0012",
    "\u000e\u0012\u00c1\u0006\u0012\u00c4\n\u0012\r\u0012\u000e\u0012\u00c5",
    "\u0003\u0013\u0003\u0013\u0003\u0014\u0006\u0014\u00cb\n\u0014\r\u0014",
    "\u000e\u0014\u00cc\u0003\u0014\u0003\u0014\u0006\u0014\u00d1\n\u0014",
    "\r\u0014\u000e\u0014\u00d2\u0007\u0014\u00d5\n\u0014\f\u0014\u000e\u0014",
    "\u00d8\u000b\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0007",
    "\u0015\u00de\n\u0015\f\u0015\u000e\u0015\u00e1\u000b\u0015\u0003\u0016",
    "\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0005\u0018",
    "\u00e9\n\u0018\u0003\u0018\u0006\u0018\u00ec\n\u0018\r\u0018\u000e\u0018",
    "\u00ed\u0003\u0018\u0005\u0018\u00f1\n\u0018\u0003\u0018\u0005\u0018",
    "\u00f4\n\u0018\u0007\u0018\u00f6\n\u0018\f\u0018\u000e\u0018\u00f9\u000b",
    "\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u00fd\n\u0018\u0003\u0018",
    "\u0007\u0018\u0100\n\u0018\f\u0018\u000e\u0018\u0103\u000b\u0018\u0003",
    "\u0018\u0005\u0018\u0106\n\u0018\u0003\u0018\u0005\u0018\u0109\n\u0018",
    "\u0006\u0018\u010b\n\u0018\r\u0018\u000e\u0018\u010c\u0005\u0018\u010f",
    "\n\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0006\u0019",
    "\u0115\n\u0019\r\u0019\u000e\u0019\u0116\u0003\u0019\u0003\u0019\u0003",
    "\u001a\u0007\u001a\u011c\n\u001a\f\u001a\u000e\u001a\u011f\u000b\u001a",
    "\u0003\u001a\u0003\u001a\u0007\u001a\u0123\n\u001a\f\u001a\u000e\u001a",
    "\u0126\u000b\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005",
    "\u001b\u012c\n\u001b\u0007\u001b\u012e\n\u001b\f\u001b\u000e\u001b\u0131",
    "\u000b\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b",
    "\u0003\u001b\u0003\u001b\u0005\u001b\u013a\n\u001b\u0007\u001b\u013c",
    "\n\u001b\f\u001b\u000e\u001b\u013f\u000b\u001b\u0005\u001b\u0141\n\u001b",
    "\u0003\u001b\u0002\u0002\u001c\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012",
    "\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0002\u0005\u0006\u0002",
    "\u0007\u0007\n\n\r\r\u000f\u000f\u0005\u0002\u0007\u0007\n\n\u000e\u000f",
    "\u0005\u0002\u0007\u0007\n\n\r\u000f\u0002\u015c\u00027\u0003\u0002",
    "\u0002\u0002\u0004G\u0003\u0002\u0002\u0002\u0006R\u0003\u0002\u0002",
    "\u0002\bT\u0003\u0002\u0002\u0002\n_\u0003\u0002\u0002\u0002\fa\u0003",
    "\u0002\u0002\u0002\u000eh\u0003\u0002\u0002\u0002\u0010j\u0003\u0002",
    "\u0002\u0002\u0012s\u0003\u0002\u0002\u0002\u0014{\u0003\u0002\u0002",
    "\u0002\u0016\u007f\u0003\u0002\u0002\u0002\u0018\u0081\u0003\u0002\u0002",
    "\u0002\u001a\u0084\u0003\u0002\u0002\u0002\u001c\u0088\u0003\u0002\u0002",
    "\u0002\u001e\u0091\u0003\u0002\u0002\u0002 \u0094\u0003\u0002\u0002",
    "\u0002\"\u0098\u0003\u0002\u0002\u0002$\u00c7\u0003\u0002\u0002\u0002",
    "&\u00ca\u0003\u0002\u0002\u0002(\u00d9\u0003\u0002\u0002\u0002*\u00e2",
    "\u0003\u0002\u0002\u0002,\u00e4\u0003\u0002\u0002\u0002.\u010e\u0003",
    "\u0002\u0002\u00020\u0110\u0003\u0002\u0002\u00022\u011d\u0003\u0002",
    "\u0002\u00024\u0140\u0003\u0002\u0002\u000268\u0005\u0004\u0003\u0002",
    "76\u0003\u0002\u0002\u000278\u0003\u0002\u0002\u00028:\u0003\u0002\u0002",
    "\u00029;\u0005\b\u0005\u0002:9\u0003\u0002\u0002\u0002:;\u0003\u0002",
    "\u0002\u0002;=\u0003\u0002\u0002\u0002<>\u0005\f\u0007\u0002=<\u0003",
    "\u0002\u0002\u0002=>\u0003\u0002\u0002\u0002>@\u0003\u0002\u0002\u0002",
    "?A\u0005\u0010\t\u0002@?\u0003\u0002\u0002\u0002@A\u0003\u0002\u0002",
    "\u0002AC\u0003\u0002\u0002\u0002BD\u0005\u001c\u000f\u0002CB\u0003\u0002",
    "\u0002\u0002CD\u0003\u0002\u0002\u0002DE\u0003\u0002\u0002\u0002EF\u0007",
    "\u0002\u0002\u0003F\u0003\u0003\u0002\u0002\u0002GN\u0005\u0018\r\u0002",
    "HJ\u0005\u0006\u0004\u0002IK\u0005\u001a\u000e\u0002JI\u0003\u0002\u0002",
    "\u0002KL\u0003\u0002\u0002\u0002LJ\u0003\u0002\u0002\u0002LM\u0003\u0002",
    "\u0002\u0002MO\u0003\u0002\u0002\u0002NH\u0003\u0002\u0002\u0002OP\u0003",
    "\u0002\u0002\u0002PN\u0003\u0002\u0002\u0002PQ\u0003\u0002\u0002\u0002",
    "Q\u0005\u0003\u0002\u0002\u0002RS\u0005&\u0014\u0002S\u0007\u0003\u0002",
    "\u0002\u0002T[\u0005\u0018\r\u0002UW\u0005\n\u0006\u0002VX\u0005\u001a",
    "\u000e\u0002WV\u0003\u0002\u0002\u0002XY\u0003\u0002\u0002\u0002YW\u0003",
    "\u0002\u0002\u0002YZ\u0003\u0002\u0002\u0002Z\\\u0003\u0002\u0002\u0002",
    "[U\u0003\u0002\u0002\u0002\\]\u0003\u0002\u0002\u0002][\u0003\u0002",
    "\u0002\u0002]^\u0003\u0002\u0002\u0002^\t\u0003\u0002\u0002\u0002_`",
    "\u00054\u001b\u0002`\u000b\u0003\u0002\u0002\u0002ab\u0005\u0018\r\u0002",
    "bd\u0005\u000e\b\u0002ce\u0005\u001a\u000e\u0002dc\u0003\u0002\u0002",
    "\u0002ef\u0003\u0002\u0002\u0002fd\u0003\u0002\u0002\u0002fg\u0003\u0002",
    "\u0002\u0002g\r\u0003\u0002\u0002\u0002hi\u00054\u001b\u0002i\u000f",
    "\u0003\u0002\u0002\u0002jl\u0005\u0012\n\u0002km\u0005\u001a\u000e\u0002",
    "lk\u0003\u0002\u0002\u0002mn\u0003\u0002\u0002\u0002nl\u0003\u0002\u0002",
    "\u0002no\u0003\u0002\u0002\u0002oq\u0003\u0002\u0002\u0002pr\u0005\u0014",
    "\u000b\u0002qp\u0003\u0002\u0002\u0002qr\u0003\u0002\u0002\u0002r\u0011",
    "\u0003\u0002\u0002\u0002st\u0007\u000b\u0002\u0002t\u0013\u0003\u0002",
    "\u0002\u0002uw\u0005\u0016\f\u0002vx\u0005\u001a\u000e\u0002wv\u0003",
    "\u0002\u0002\u0002xy\u0003\u0002\u0002\u0002yw\u0003\u0002\u0002\u0002",
    "yz\u0003\u0002\u0002\u0002z|\u0003\u0002\u0002\u0002{u\u0003\u0002\u0002",
    "\u0002|}\u0003\u0002\u0002\u0002}{\u0003\u0002\u0002\u0002}~\u0003\u0002",
    "\u0002\u0002~\u0015\u0003\u0002\u0002\u0002\u007f\u0080\u00054\u001b",
    "\u0002\u0080\u0017\u0003\u0002\u0002\u0002\u0081\u0082\u0007\u0005\u0002",
    "\u0002\u0082\u0019\u0003\u0002\u0002\u0002\u0083\u0085\u0005\u0018\r",
    "\u0002\u0084\u0083\u0003\u0002\u0002\u0002\u0084\u0085\u0003\u0002\u0002",
    "\u0002\u0085\u0086\u0003\u0002\u0002\u0002\u0086\u0087\u0007\u0006\u0002",
    "\u0002\u0087\u001b\u0003\u0002\u0002\u0002\u0088\u008a\u0005\u001e\u0010",
    "\u0002\u0089\u008b\u0005\u001a\u000e\u0002\u008a\u0089\u0003\u0002\u0002",
    "\u0002\u008b\u008c\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002",
    "\u0002\u008c\u008d\u0003\u0002\u0002\u0002\u008d\u008f\u0003\u0002\u0002",
    "\u0002\u008e\u0090\u0005 \u0011\u0002\u008f\u008e\u0003\u0002\u0002",
    "\u0002\u008f\u0090\u0003\u0002\u0002\u0002\u0090\u001d\u0003\u0002\u0002",
    "\u0002\u0091\u0092\u0007\f\u0002\u0002\u0092\u001f\u0003\u0002\u0002",
    "\u0002\u0093\u0095\u0005\"\u0012\u0002\u0094\u0093\u0003\u0002\u0002",
    "\u0002\u0095\u0096\u0003\u0002\u0002\u0002\u0096\u0094\u0003\u0002\u0002",
    "\u0002\u0096\u0097\u0003\u0002\u0002\u0002\u0097!\u0003\u0002\u0002",
    "\u0002\u0098\u009a\u0005$\u0013\u0002\u0099\u009b\u0005\u001a\u000e",
    "\u0002\u009a\u0099\u0003\u0002\u0002\u0002\u009b\u009c\u0003\u0002\u0002",
    "\u0002\u009c\u009a\u0003\u0002\u0002\u0002\u009c\u009d\u0003\u0002\u0002",
    "\u0002\u009d\u00c3\u0003\u0002\u0002\u0002\u009e\u00a0\u0005,\u0017",
    "\u0002\u009f\u00a1\u0005\u001a\u000e\u0002\u00a0\u009f\u0003\u0002\u0002",
    "\u0002\u00a1\u00a2\u0003\u0002\u0002\u0002\u00a2\u00a0\u0003\u0002\u0002",
    "\u0002\u00a2\u00a3\u0003\u0002\u0002\u0002\u00a3\u00a5\u0003\u0002\u0002",
    "\u0002\u00a4\u009e\u0003\u0002\u0002\u0002\u00a5\u00a8\u0003\u0002\u0002",
    "\u0002\u00a6\u00a4\u0003\u0002\u0002\u0002\u00a6\u00a7\u0003\u0002\u0002",
    "\u0002\u00a7\u00bf\u0003\u0002\u0002\u0002\u00a8\u00a6\u0003\u0002\u0002",
    "\u0002\u00a9\u00aa\u0005\u0018\r\u0002\u00aa\u00ac\u0005(\u0015\u0002",
    "\u00ab\u00ad\u0005\u001a\u000e\u0002\u00ac\u00ab\u0003\u0002\u0002\u0002",
    "\u00ad\u00ae\u0003\u0002\u0002\u0002\u00ae\u00ac\u0003\u0002\u0002\u0002",
    "\u00ae\u00af\u0003\u0002\u0002\u0002\u00af\u00bb\u0003\u0002\u0002\u0002",
    "\u00b0\u00b1\u0005\u0018\r\u0002\u00b1\u00b2\u0005*\u0016\u0002\u00b2",
    "\u00b5\u0003\u0002\u0002\u0002\u00b3\u00b5\u0005,\u0017\u0002\u00b4",
    "\u00b0\u0003\u0002\u0002\u0002\u00b4\u00b3\u0003\u0002\u0002\u0002\u00b5",
    "\u00b7\u0003\u0002\u0002\u0002\u00b6\u00b8\u0005\u001a\u000e\u0002\u00b7",
    "\u00b6\u0003\u0002\u0002\u0002\u00b8\u00b9\u0003\u0002\u0002\u0002\u00b9",
    "\u00b7\u0003\u0002\u0002\u0002\u00b9\u00ba\u0003\u0002\u0002\u0002\u00ba",
    "\u00bc\u0003\u0002\u0002\u0002\u00bb\u00b4\u0003\u0002\u0002\u0002\u00bc",
    "\u00bd\u0003\u0002\u0002\u0002\u00bd\u00bb\u0003\u0002\u0002\u0002\u00bd",
    "\u00be\u0003\u0002\u0002\u0002\u00be\u00c0\u0003\u0002\u0002\u0002\u00bf",
    "\u00a9\u0003\u0002\u0002\u0002\u00c0\u00c1\u0003\u0002\u0002\u0002\u00c1",
    "\u00bf\u0003\u0002\u0002\u0002\u00c1\u00c2\u0003\u0002\u0002\u0002\u00c2",
    "\u00c4\u0003\u0002\u0002\u0002\u00c3\u00a6\u0003\u0002\u0002\u0002\u00c4",
    "\u00c5\u0003\u0002\u0002\u0002\u00c5\u00c3\u0003\u0002\u0002\u0002\u00c5",
    "\u00c6\u0003\u0002\u0002\u0002\u00c6#\u0003\u0002\u0002\u0002\u00c7",
    "\u00c8\u0005&\u0014\u0002\u00c8%\u0003\u0002\u0002\u0002\u00c9\u00cb",
    "\t\u0002\u0002\u0002\u00ca\u00c9\u0003\u0002\u0002\u0002\u00cb\u00cc",
    "\u0003\u0002\u0002\u0002\u00cc\u00ca\u0003\u0002\u0002\u0002\u00cc\u00cd",
    "\u0003\u0002\u0002\u0002\u00cd\u00d6\u0003\u0002\u0002\u0002\u00ce\u00d0",
    "\u0005\u0018\r\u0002\u00cf\u00d1\t\u0002\u0002\u0002\u00d0\u00cf\u0003",
    "\u0002\u0002\u0002\u00d1\u00d2\u0003\u0002\u0002\u0002\u00d2\u00d0\u0003",
    "\u0002\u0002\u0002\u00d2\u00d3\u0003\u0002\u0002\u0002\u00d3\u00d5\u0003",
    "\u0002\u0002\u0002\u00d4\u00ce\u0003\u0002\u0002\u0002\u00d5\u00d8\u0003",
    "\u0002\u0002\u0002\u00d6\u00d4\u0003\u0002\u0002\u0002\u00d6\u00d7\u0003",
    "\u0002\u0002\u0002\u00d7\'\u0003\u0002\u0002\u0002\u00d8\u00d6\u0003",
    "\u0002\u0002\u0002\u00d9\u00df\u0007\r\u0002\u0002\u00da\u00db\u0005",
    "\u0018\r\u0002\u00db\u00dc\u0007\r\u0002\u0002\u00dc\u00de\u0003\u0002",
    "\u0002\u0002\u00dd\u00da\u0003\u0002\u0002\u0002\u00de\u00e1\u0003\u0002",
    "\u0002\u0002\u00df\u00dd\u0003\u0002\u0002\u0002\u00df\u00e0\u0003\u0002",
    "\u0002\u0002\u00e0)\u0003\u0002\u0002\u0002\u00e1\u00df\u0003\u0002",
    "\u0002\u0002\u00e2\u00e3\u0005.\u0018\u0002\u00e3+\u0003\u0002\u0002",
    "\u0002\u00e4\u00e5\u0005.\u0018\u0002\u00e5-\u0003\u0002\u0002\u0002",
    "\u00e6\u00f7\u00054\u001b\u0002\u00e7\u00e9\u0005\u0018\r\u0002\u00e8",
    "\u00e7\u0003\u0002\u0002\u0002\u00e8\u00e9\u0003\u0002\u0002\u0002\u00e9",
    "\u00ea\u0003\u0002\u0002\u0002\u00ea\u00ec\u00050\u0019\u0002\u00eb",
    "\u00e8\u0003\u0002\u0002\u0002\u00ec\u00ed\u0003\u0002\u0002\u0002\u00ed",
    "\u00eb\u0003\u0002\u0002\u0002\u00ed\u00ee\u0003\u0002\u0002\u0002\u00ee",
    "\u00f3\u0003\u0002\u0002\u0002\u00ef\u00f1\u0005\u0018\r\u0002\u00f0",
    "\u00ef\u0003\u0002\u0002\u0002\u00f0\u00f1\u0003\u0002\u0002\u0002\u00f1",
    "\u00f2\u0003\u0002\u0002\u0002\u00f2\u00f4\u00054\u001b\u0002\u00f3",
    "\u00f0\u0003\u0002\u0002\u0002\u00f3\u00f4\u0003\u0002\u0002\u0002\u00f4",
    "\u00f6\u0003\u0002\u0002\u0002\u00f5\u00eb\u0003\u0002\u0002\u0002\u00f6",
    "\u00f9\u0003\u0002\u0002\u0002\u00f7\u00f5\u0003\u0002\u0002\u0002\u00f7",
    "\u00f8\u0003\u0002\u0002\u0002\u00f8\u010f\u0003\u0002\u0002\u0002\u00f9",
    "\u00f7\u0003\u0002\u0002\u0002\u00fa\u0101\u00050\u0019\u0002\u00fb",
    "\u00fd\u0005\u0018\r\u0002\u00fc\u00fb\u0003\u0002\u0002\u0002\u00fc",
    "\u00fd\u0003\u0002\u0002\u0002\u00fd\u00fe\u0003\u0002\u0002\u0002\u00fe",
    "\u0100\u00050\u0019\u0002\u00ff\u00fc\u0003\u0002\u0002\u0002\u0100",
    "\u0103\u0003\u0002\u0002\u0002\u0101\u00ff\u0003\u0002\u0002\u0002\u0101",
    "\u0102\u0003\u0002\u0002\u0002\u0102\u0108\u0003\u0002\u0002\u0002\u0103",
    "\u0101\u0003\u0002\u0002\u0002\u0104\u0106\u0005\u0018\r\u0002\u0105",
    "\u0104\u0003\u0002\u0002\u0002\u0105\u0106\u0003\u0002\u0002\u0002\u0106",
    "\u0107\u0003\u0002\u0002\u0002\u0107\u0109\u00054\u001b\u0002\u0108",
    "\u0105\u0003\u0002\u0002\u0002\u0108\u0109\u0003\u0002\u0002\u0002\u0109",
    "\u010b\u0003\u0002\u0002\u0002\u010a\u00fa\u0003\u0002\u0002\u0002\u010b",
    "\u010c\u0003\u0002\u0002\u0002\u010c\u010a\u0003\u0002\u0002\u0002\u010c",
    "\u010d\u0003\u0002\u0002\u0002\u010d\u010f\u0003\u0002\u0002\u0002\u010e",
    "\u00e6\u0003\u0002\u0002\u0002\u010e\u010a\u0003\u0002\u0002\u0002\u010f",
    "/\u0003\u0002\u0002\u0002\u0110\u0114\u0007\b\u0002\u0002\u0111\u0115",
    "\u0005\u0018\r\u0002\u0112\u0115\u00054\u001b\u0002\u0113\u0115\u0007",
    "\r\u0002\u0002\u0114\u0111\u0003\u0002\u0002\u0002\u0114\u0112\u0003",
    "\u0002\u0002\u0002\u0114\u0113\u0003\u0002\u0002\u0002\u0115\u0116\u0003",
    "\u0002\u0002\u0002\u0116\u0114\u0003\u0002\u0002\u0002\u0116\u0117\u0003",
    "\u0002\u0002\u0002\u0117\u0118\u0003\u0002\u0002\u0002\u0118\u0119\u0007",
    "\t\u0002\u0002\u01191\u0003\u0002\u0002\u0002\u011a\u011c\u0007\r\u0002",
    "\u0002\u011b\u011a\u0003\u0002\u0002\u0002\u011c\u011f\u0003\u0002\u0002",
    "\u0002\u011d\u011b\u0003\u0002\u0002\u0002\u011d\u011e\u0003\u0002\u0002",
    "\u0002\u011e\u0120\u0003\u0002\u0002\u0002\u011f\u011d\u0003\u0002\u0002",
    "\u0002\u0120\u0124\t\u0003\u0002\u0002\u0121\u0123\t\u0004\u0002\u0002",
    "\u0122\u0121\u0003\u0002\u0002\u0002\u0123\u0126\u0003\u0002\u0002\u0002",
    "\u0124\u0122\u0003\u0002\u0002\u0002\u0124\u0125\u0003\u0002\u0002\u0002",
    "\u01253\u0003\u0002\u0002\u0002\u0126\u0124\u0003\u0002\u0002\u0002",
    "\u0127\u012f\u0007\r\u0002\u0002\u0128\u012b\u0005\u0018\r\u0002\u0129",
    "\u012c\u0007\r\u0002\u0002\u012a\u012c\u00052\u001a\u0002\u012b\u0129",
    "\u0003\u0002\u0002\u0002\u012b\u012a\u0003\u0002\u0002\u0002\u012c\u012e",
    "\u0003\u0002\u0002\u0002\u012d\u0128\u0003\u0002\u0002\u0002\u012e\u0131",
    "\u0003\u0002\u0002\u0002\u012f\u012d\u0003\u0002\u0002\u0002\u012f\u0130",
    "\u0003\u0002\u0002\u0002\u0130\u0132\u0003\u0002\u0002\u0002\u0131\u012f",
    "\u0003\u0002\u0002\u0002\u0132\u0133\u0005\u0018\r\u0002\u0133\u0134",
    "\u00052\u001a\u0002\u0134\u0141\u0003\u0002\u0002\u0002\u0135\u013d",
    "\u00052\u001a\u0002\u0136\u0139\u0005\u0018\r\u0002\u0137\u013a\u0007",
    "\r\u0002\u0002\u0138\u013a\u00052\u001a\u0002\u0139\u0137\u0003\u0002",
    "\u0002\u0002\u0139\u0138\u0003\u0002\u0002\u0002\u013a\u013c\u0003\u0002",
    "\u0002\u0002\u013b\u0136\u0003\u0002\u0002\u0002\u013c\u013f\u0003\u0002",
    "\u0002\u0002\u013d\u013b\u0003\u0002\u0002\u0002\u013d\u013e\u0003\u0002",
    "\u0002\u0002\u013e\u0141\u0003\u0002\u0002\u0002\u013f\u013d\u0003\u0002",
    "\u0002\u0002\u0140\u0127\u0003\u0002\u0002\u0002\u0140\u0135\u0003\u0002",
    "\u0002\u0002\u01415\u0003\u0002\u0002\u000257:=@CLPY]fnqy}\u0084\u008c",
    "\u008f\u0096\u009c\u00a2\u00a6\u00ae\u00b4\u00b9\u00bd\u00c1\u00c5\u00cc",
    "\u00d2\u00d6\u00df\u00e8\u00ed\u00f0\u00f3\u00f7\u00fc\u0101\u0105\u0108",
    "\u010c\u010e\u0114\u0116\u011d\u0124\u012b\u012f\u0139\u013d\u0140"].join("");


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class ManuscriptParser extends antlr4.Parser {

    static grammarFileName = "ManuscriptParser.g4";
    static literalNames = [ null, null, null, null, null, null, "'('", "')'", 
                            null, null, "'KOHTAUKSET'" ];
    static symbolicNames = [ null, "MultiLineComment", "SingleLineComment", 
                             "WSS", "EOL", "Punctuation", "LeftParenthesis", 
                             "RightParenthesis", "Extra", "Synopsis", "Scene", 
                             "CapitalWord", "MinusculeWord", "Number" ];
    static ruleNames = [ "manuscript", "titlePart", "title", "authorsPart", 
                         "authors", "dateParagraph", "date", "synopsisPart", 
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 53;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,0,this._ctx);
	        if(la_===1) {
	            this.state = 52;
	            this.titlePart();

	        }
	        this.state = 56;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
	        if(la_===1) {
	            this.state = 55;
	            this.authorsPart();

	        }
	        this.state = 59;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.WSS) {
	            this.state = 58;
	            this.dateParagraph();
	        }

	        this.state = 62;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.Synopsis) {
	            this.state = 61;
	            this.synopsisPart();
	        }

	        this.state = 65;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.Scene) {
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



	titlePart() {
	    let localctx = new TitlePartContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, ManuscriptParser.RULE_titlePart);
	    var _la = 0; // Token type
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 69;
	        this.wss();
	        this.state = 76; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 70;
	            this.title();
	            this.state = 72; 
	            this._errHandler.sync(this);
	            _alt = 1;
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
	            this.state = 78; 
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 80;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 82;
	        this.wss();
	        this.state = 89; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 83;
	            this.authors();
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
	            	_alt = this._interp.adaptivePredict(this._input,7, this._ctx);
	            } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	            this.state = 91; 
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 93;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 95;
	        this.wss();
	        this.state = 96;
	        this.date();
	        this.state = 98; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 97;
	            this.eol();
	            this.state = 100; 
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 102;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 104;
	        this.synopsisTitle();
	        this.state = 106; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 105;
	            this.eol();
	            this.state = 108; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===ManuscriptParser.WSS || _la===ManuscriptParser.EOL);
	        this.state = 111;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0)) {
	            this.state = 110;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 113;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 121; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 115;
	            this.synopsisParagraph();
	            this.state = 117; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            do {
	                this.state = 116;
	                this.eol();
	                this.state = 119; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            } while(_la===ManuscriptParser.WSS || _la===ManuscriptParser.EOL);
	            this.state = 123; 
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 125;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 127;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 130;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.WSS) {
	            this.state = 129;
	            this.wss();
	        }

	        this.state = 132;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 134;
	        this.scenesHeading();
	        this.state = 136; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 135;
	            this.eol();
	            this.state = 138; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===ManuscriptParser.WSS || _la===ManuscriptParser.EOL);
	        this.state = 141;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0)) {
	            this.state = 140;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 143;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 146; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 145;
	            this.scene();
	            this.state = 148; 
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
	    this.enterRule(localctx, 32, ManuscriptParser.RULE_scene);
	    var _la = 0; // Token type
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 150;
	        this.sceneHeading();
	        this.state = 152; 
	        this._errHandler.sync(this);
	        _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 151;
	        		this.eol();
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 154; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,18, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 193; 
	        this._errHandler.sync(this);
	        _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 164;
	        		this._errHandler.sync(this);
	        		_la = this._input.LA(1);
	        		while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.LeftParenthesis) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0)) {
	        		    this.state = 156;
	        		    this.parenthesis();
	        		    this.state = 158; 
	        		    this._errHandler.sync(this);
	        		    _alt = 1;
	        		    do {
	        		    	switch (_alt) {
	        		    	case 1:
	        		    		this.state = 157;
	        		    		this.eol();
	        		    		break;
	        		    	default:
	        		    		throw new antlr4.error.NoViableAltException(this);
	        		    	}
	        		    	this.state = 160; 
	        		    	this._errHandler.sync(this);
	        		    	_alt = this._interp.adaptivePredict(this._input,19, this._ctx);
	        		    } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        		    this.state = 166;
	        		    this._errHandler.sync(this);
	        		    _la = this._input.LA(1);
	        		}
	        		this.state = 189; 
	        		this._errHandler.sync(this);
	        		_alt = 1;
	        		do {
	        			switch (_alt) {
	        			case 1:
	        				this.state = 167;
	        				this.wss();
	        				this.state = 168;
	        				this.name();
	        				this.state = 170; 
	        				this._errHandler.sync(this);
	        				_alt = 1;
	        				do {
	        					switch (_alt) {
	        					case 1:
	        						this.state = 169;
	        						this.eol();
	        						break;
	        					default:
	        						throw new antlr4.error.NoViableAltException(this);
	        					}
	        					this.state = 172; 
	        					this._errHandler.sync(this);
	        					_alt = this._interp.adaptivePredict(this._input,21, this._ctx);
	        				} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        				this.state = 185; 
	        				this._errHandler.sync(this);
	        				_alt = 1;
	        				do {
	        					switch (_alt) {
	        					case 1:
	        						this.state = 178;
	        						this._errHandler.sync(this);
	        						switch(this._input.LA(1)) {
	        						case ManuscriptParser.WSS:
	        						    this.state = 174;
	        						    this.wss();
	        						    this.state = 175;
	        						    this.replique();
	        						    break;
	        						case ManuscriptParser.Punctuation:
	        						case ManuscriptParser.LeftParenthesis:
	        						case ManuscriptParser.Extra:
	        						case ManuscriptParser.CapitalWord:
	        						case ManuscriptParser.MinusculeWord:
	        						case ManuscriptParser.Number:
	        						    this.state = 177;
	        						    this.parenthesis();
	        						    break;
	        						default:
	        						    throw new antlr4.error.NoViableAltException(this);
	        						}
	        						this.state = 181; 
	        						this._errHandler.sync(this);
	        						_alt = 1;
	        						do {
	        							switch (_alt) {
	        							case 1:
	        								this.state = 180;
	        								this.eol();
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
	        				break;
	        			default:
	        				throw new antlr4.error.NoViableAltException(this);
	        			}
	        			this.state = 191; 
	        			this._errHandler.sync(this);
	        			_alt = this._interp.adaptivePredict(this._input,25, this._ctx);
	        		} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 195; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,26, this._ctx);
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 197;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 200; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 199;
	            _la = this._input.LA(1);
	            if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0))) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 202; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0));
	        this.state = 212;
	        this._errHandler.sync(this);
	        _alt = this._interp.adaptivePredict(this._input,29,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 204;
	                this.wss();
	                this.state = 206; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	                do {
	                    this.state = 205;
	                    _la = this._input.LA(1);
	                    if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0))) {
	                    this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 208; 
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0)); 
	            }
	            this.state = 214;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,29,this._ctx);
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 215;
	        this.match(ManuscriptParser.CapitalWord);
	        this.state = 221;
	        this._errHandler.sync(this);
	        _alt = this._interp.adaptivePredict(this._input,30,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 216;
	                this.wss();
	                this.state = 217;
	                this.match(ManuscriptParser.CapitalWord); 
	            }
	            this.state = 223;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,30,this._ctx);
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 224;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 226;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 268;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case ManuscriptParser.Punctuation:
	        case ManuscriptParser.Extra:
	        case ManuscriptParser.CapitalWord:
	        case ManuscriptParser.MinusculeWord:
	        case ManuscriptParser.Number:
	            this.state = 228;
	            this.nonCapitalText();
	            this.state = 245;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,35,this._ctx)
	            while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                if(_alt===1) {
	                    this.state = 233; 
	                    this._errHandler.sync(this);
	                    _alt = 1;
	                    do {
	                    	switch (_alt) {
	                    	case 1:
	                    		this.state = 230;
	                    		this._errHandler.sync(this);
	                    		_la = this._input.LA(1);
	                    		if(_la===ManuscriptParser.WSS) {
	                    		    this.state = 229;
	                    		    this.wss();
	                    		}

	                    		this.state = 232;
	                    		this.command();
	                    		break;
	                    	default:
	                    		throw new antlr4.error.NoViableAltException(this);
	                    	}
	                    	this.state = 235; 
	                    	this._errHandler.sync(this);
	                    	_alt = this._interp.adaptivePredict(this._input,32, this._ctx);
	                    } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	                    this.state = 241;
	                    this._errHandler.sync(this);
	                    var la_ = this._interp.adaptivePredict(this._input,34,this._ctx);
	                    if(la_===1) {
	                        this.state = 238;
	                        this._errHandler.sync(this);
	                        _la = this._input.LA(1);
	                        if(_la===ManuscriptParser.WSS) {
	                            this.state = 237;
	                            this.wss();
	                        }

	                        this.state = 240;
	                        this.nonCapitalText();

	                    } 
	                }
	                this.state = 247;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,35,this._ctx);
	            }

	            break;
	        case ManuscriptParser.LeftParenthesis:
	            this.state = 264; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            do {
	                this.state = 248;
	                this.command();
	                this.state = 255;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,37,this._ctx)
	                while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                    if(_alt===1) {
	                        this.state = 250;
	                        this._errHandler.sync(this);
	                        _la = this._input.LA(1);
	                        if(_la===ManuscriptParser.WSS) {
	                            this.state = 249;
	                            this.wss();
	                        }

	                        this.state = 252;
	                        this.command(); 
	                    }
	                    this.state = 257;
	                    this._errHandler.sync(this);
	                    _alt = this._interp.adaptivePredict(this._input,37,this._ctx);
	                }

	                this.state = 262;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,39,this._ctx);
	                if(la_===1) {
	                    this.state = 259;
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                    if(_la===ManuscriptParser.WSS) {
	                        this.state = 258;
	                        this.wss();
	                    }

	                    this.state = 261;
	                    this.nonCapitalText();

	                }
	                this.state = 266; 
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



	command() {
	    let localctx = new CommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 46, ManuscriptParser.RULE_command);
	    var _la = 0; // Token type
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 270;
	        this.match(ManuscriptParser.LeftParenthesis);
	        this.state = 274; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 274;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,42,this._ctx);
	            switch(la_) {
	            case 1:
	                this.state = 271;
	                this.wss();
	                break;

	            case 2:
	                this.state = 272;
	                this.nonCapitalText();
	                break;

	            case 3:
	                this.state = 273;
	                this.match(ManuscriptParser.CapitalWord);
	                break;

	            }
	            this.state = 276; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.WSS) | (1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0));
	        this.state = 278;
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 283;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===ManuscriptParser.CapitalWord) {
	            this.state = 280;
	            this.match(ManuscriptParser.CapitalWord);
	            this.state = 285;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 286;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 290;
	        this._errHandler.sync(this);
	        _alt = this._interp.adaptivePredict(this._input,45,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 287;
	                _la = this._input.LA(1);
	                if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.MinusculeWord) | (1 << ManuscriptParser.Number))) !== 0))) {
	                this._errHandler.recoverInline(this);
	                }
	                else {
	                	this._errHandler.reportMatch(this);
	                    this.consume();
	                } 
	            }
	            this.state = 292;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,45,this._ctx);
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
	    try { let  _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 318;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,50,this._ctx);
	        switch(la_) {
	        case 1:
	            this.state = 293;
	            this.match(ManuscriptParser.CapitalWord);
	            this.state = 301;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,47,this._ctx)
	            while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                if(_alt===1) {
	                    this.state = 294;
	                    this.wss();
	                    this.state = 297;
	                    this._errHandler.sync(this);
	                    var la_ = this._interp.adaptivePredict(this._input,46,this._ctx);
	                    switch(la_) {
	                    case 1:
	                        this.state = 295;
	                        this.match(ManuscriptParser.CapitalWord);
	                        break;

	                    case 2:
	                        this.state = 296;
	                        this.nonCapitalWord();
	                        break;

	                    } 
	                }
	                this.state = 303;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,47,this._ctx);
	            }

	            this.state = 304;
	            this.wss();
	            this.state = 305;
	            this.nonCapitalWord();
	            break;

	        case 2:
	            this.state = 307;
	            this.nonCapitalWord();
	            this.state = 315;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,49,this._ctx)
	            while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                if(_alt===1) {
	                    this.state = 308;
	                    this.wss();
	                    this.state = 311;
	                    this._errHandler.sync(this);
	                    var la_ = this._interp.adaptivePredict(this._input,48,this._ctx);
	                    switch(la_) {
	                    case 1:
	                        this.state = 309;
	                        this.match(ManuscriptParser.CapitalWord);
	                        break;

	                    case 2:
	                        this.state = 310;
	                        this.nonCapitalWord();
	                        break;

	                    } 
	                }
	                this.state = 317;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,49,this._ctx);
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
ManuscriptParser.CapitalWord = 11;
ManuscriptParser.MinusculeWord = 12;
ManuscriptParser.Number = 13;

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
