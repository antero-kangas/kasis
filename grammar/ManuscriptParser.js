// Generated from ManuscriptParser.g4 by ANTLR 4.9
// jshint ignore: start
import antlr4 from 'antlr4';
import ManuscriptParserListener from './ManuscriptParserListener.js';

const serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786",
    "\u5964\u0003\u0012\u012a\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004",
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
    "L\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0006",
    "\u0005T\n\u0005\r\u0005\u000e\u0005U\u0003\u0006\u0003\u0006\u0003\u0007",
    "\u0003\u0007\u0003\u0007\u0006\u0007]\n\u0007\r\u0007\u000e\u0007^\u0003",
    "\b\u0003\b\u0003\t\u0003\t\u0006\te\n\t\r\t\u000e\tf\u0003\t\u0005\t",
    "j\n\t\u0003\n\u0003\n\u0003\u000b\u0006\u000bo\n\u000b\r\u000b\u000e",
    "\u000bp\u0003\u000b\u0007\u000bt\n\u000b\f\u000b\u000e\u000bw\u000b",
    "\u000b\u0006\u000by\n\u000b\r\u000b\u000e\u000bz\u0003\f\u0003\f\u0003",
    "\r\u0003\r\u0003\u000e\u0005\u000e\u0082\n\u000e\u0003\u000e\u0003\u000e",
    "\u0003\u000f\u0003\u000f\u0006\u000f\u0088\n\u000f\r\u000f\u000e\u000f",
    "\u0089\u0003\u000f\u0005\u000f\u008d\n\u000f\u0003\u0010\u0003\u0010",
    "\u0003\u0011\u0006\u0011\u0092\n\u0011\r\u0011\u000e\u0011\u0093\u0003",
    "\u0012\u0003\u0012\u0006\u0012\u0098\n\u0012\r\u0012\u000e\u0012\u0099",
    "\u0003\u0012\u0003\u0012\u0006\u0012\u009e\n\u0012\r\u0012\u000e\u0012",
    "\u009f\u0007\u0012\u00a2\n\u0012\f\u0012\u000e\u0012\u00a5\u000b\u0012",
    "\u0003\u0012\u0003\u0012\u0003\u0012\u0006\u0012\u00aa\n\u0012\r\u0012",
    "\u000e\u0012\u00ab\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005",
    "\u0012\u00b2\n\u0012\u0003\u0012\u0006\u0012\u00b5\n\u0012\r\u0012\u000e",
    "\u0012\u00b6\u0006\u0012\u00b9\n\u0012\r\u0012\u000e\u0012\u00ba\u0006",
    "\u0012\u00bd\n\u0012\r\u0012\u000e\u0012\u00be\u0006\u0012\u00c1\n\u0012",
    "\r\u0012\u000e\u0012\u00c2\u0003\u0013\u0003\u0013\u0003\u0014\u0006",
    "\u0014\u00c8\n\u0014\r\u0014\u000e\u0014\u00c9\u0003\u0014\u0003\u0014",
    "\u0006\u0014\u00ce\n\u0014\r\u0014\u000e\u0014\u00cf\u0007\u0014\u00d2",
    "\n\u0014\f\u0014\u000e\u0014\u00d5\u000b\u0014\u0003\u0015\u0003\u0015",
    "\u0003\u0015\u0003\u0015\u0007\u0015\u00db\n\u0015\f\u0015\u000e\u0015",
    "\u00de\u000b\u0015\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003",
    "\u0018\u0003\u0018\u0005\u0018\u00e6\n\u0018\u0003\u0018\u0006\u0018",
    "\u00e9\n\u0018\r\u0018\u000e\u0018\u00ea\u0003\u0018\u0005\u0018\u00ee",
    "\n\u0018\u0003\u0018\u0005\u0018\u00f1\n\u0018\u0007\u0018\u00f3\n\u0018",
    "\f\u0018\u000e\u0018\u00f6\u000b\u0018\u0003\u0018\u0003\u0018\u0005",
    "\u0018\u00fa\n\u0018\u0003\u0018\u0007\u0018\u00fd\n\u0018\f\u0018\u000e",
    "\u0018\u0100\u000b\u0018\u0003\u0018\u0005\u0018\u0103\n\u0018\u0003",
    "\u0018\u0005\u0018\u0106\n\u0018\u0006\u0018\u0108\n\u0018\r\u0018\u000e",
    "\u0018\u0109\u0005\u0018\u010c\n\u0018\u0003\u0019\u0003\u0019\u0005",
    "\u0019\u0110\n\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u0114\n\u0019",
    "\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001b\u0006\u001b",
    "\u011b\n\u001b\r\u001b\u000e\u001b\u011c\u0003\u001b\u0003\u001b\u0006",
    "\u001b\u0121\n\u001b\r\u001b\u000e\u001b\u0122\u0007\u001b\u0125\n\u001b",
    "\f\u001b\u000e\u001b\u0128\u000b\u001b\u0003\u001b\u0002\u0002\u001c",
    "\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c",
    "\u001e \"$&(*,.024\u0002\u0004\u0005\u0002\t\t\f\r\u0010\u0011\u0005",
    "\u0002\t\t\f\r\u0010\u0012\u0002\u013d\u00027\u0003\u0002\u0002\u0002",
    "\u0004G\u0003\u0002\u0002\u0002\u0006N\u0003\u0002\u0002\u0002\bP\u0003",
    "\u0002\u0002\u0002\nW\u0003\u0002\u0002\u0002\fY\u0003\u0002\u0002\u0002",
    "\u000e`\u0003\u0002\u0002\u0002\u0010b\u0003\u0002\u0002\u0002\u0012",
    "k\u0003\u0002\u0002\u0002\u0014x\u0003\u0002\u0002\u0002\u0016|\u0003",
    "\u0002\u0002\u0002\u0018~\u0003\u0002\u0002\u0002\u001a\u0081\u0003",
    "\u0002\u0002\u0002\u001c\u0085\u0003\u0002\u0002\u0002\u001e\u008e\u0003",
    "\u0002\u0002\u0002 \u0091\u0003\u0002\u0002\u0002\"\u0095\u0003\u0002",
    "\u0002\u0002$\u00c4\u0003\u0002\u0002\u0002&\u00c7\u0003\u0002\u0002",
    "\u0002(\u00d6\u0003\u0002\u0002\u0002*\u00df\u0003\u0002\u0002\u0002",
    ",\u00e1\u0003\u0002\u0002\u0002.\u010b\u0003\u0002\u0002\u00020\u010d",
    "\u0003\u0002\u0002\u00022\u0117\u0003\u0002\u0002\u00024\u011a\u0003",
    "\u0002\u0002\u000268\u0005\u0004\u0003\u000276\u0003\u0002\u0002\u0002",
    "78\u0003\u0002\u0002\u00028:\u0003\u0002\u0002\u00029;\u0005\b\u0005",
    "\u0002:9\u0003\u0002\u0002\u0002:;\u0003\u0002\u0002\u0002;=\u0003\u0002",
    "\u0002\u0002<>\u0005\f\u0007\u0002=<\u0003\u0002\u0002\u0002=>\u0003",
    "\u0002\u0002\u0002>@\u0003\u0002\u0002\u0002?A\u0005\u0010\t\u0002@",
    "?\u0003\u0002\u0002\u0002@A\u0003\u0002\u0002\u0002AC\u0003\u0002\u0002",
    "\u0002BD\u0005\u001c\u000f\u0002CB\u0003\u0002\u0002\u0002CD\u0003\u0002",
    "\u0002\u0002DE\u0003\u0002\u0002\u0002EF\u0007\u0002\u0002\u0003F\u0003",
    "\u0003\u0002\u0002\u0002GH\u0005\u0018\r\u0002HJ\u0005\u0006\u0004\u0002",
    "IK\u0005\u001a\u000e\u0002JI\u0003\u0002\u0002\u0002KL\u0003\u0002\u0002",
    "\u0002LJ\u0003\u0002\u0002\u0002LM\u0003\u0002\u0002\u0002M\u0005\u0003",
    "\u0002\u0002\u0002NO\u0005&\u0014\u0002O\u0007\u0003\u0002\u0002\u0002",
    "PQ\u0005\u0018\r\u0002QS\u0005\n\u0006\u0002RT\u0005\u001a\u000e\u0002",
    "SR\u0003\u0002\u0002\u0002TU\u0003\u0002\u0002\u0002US\u0003\u0002\u0002",
    "\u0002UV\u0003\u0002\u0002\u0002V\t\u0003\u0002\u0002\u0002WX\u0005",
    "4\u001b\u0002X\u000b\u0003\u0002\u0002\u0002YZ\u0005\u0018\r\u0002Z",
    "\\\u0005\u000e\b\u0002[]\u0005\u001a\u000e\u0002\\[\u0003\u0002\u0002",
    "\u0002]^\u0003\u0002\u0002\u0002^\\\u0003\u0002\u0002\u0002^_\u0003",
    "\u0002\u0002\u0002_\r\u0003\u0002\u0002\u0002`a\u00054\u001b\u0002a",
    "\u000f\u0003\u0002\u0002\u0002bd\u0005\u0012\n\u0002ce\u0005\u001a\u000e",
    "\u0002dc\u0003\u0002\u0002\u0002ef\u0003\u0002\u0002\u0002fd\u0003\u0002",
    "\u0002\u0002fg\u0003\u0002\u0002\u0002gi\u0003\u0002\u0002\u0002hj\u0005",
    "\u0014\u000b\u0002ih\u0003\u0002\u0002\u0002ij\u0003\u0002\u0002\u0002",
    "j\u0011\u0003\u0002\u0002\u0002kl\u0007\u000e\u0002\u0002l\u0013\u0003",
    "\u0002\u0002\u0002mo\u0005\u0016\f\u0002nm\u0003\u0002\u0002\u0002o",
    "p\u0003\u0002\u0002\u0002pn\u0003\u0002\u0002\u0002pq\u0003\u0002\u0002",
    "\u0002qu\u0003\u0002\u0002\u0002rt\u0005\u001a\u000e\u0002sr\u0003\u0002",
    "\u0002\u0002tw\u0003\u0002\u0002\u0002us\u0003\u0002\u0002\u0002uv\u0003",
    "\u0002\u0002\u0002vy\u0003\u0002\u0002\u0002wu\u0003\u0002\u0002\u0002",
    "xn\u0003\u0002\u0002\u0002yz\u0003\u0002\u0002\u0002zx\u0003\u0002\u0002",
    "\u0002z{\u0003\u0002\u0002\u0002{\u0015\u0003\u0002\u0002\u0002|}\u0005",
    "4\u001b\u0002}\u0017\u0003\u0002\u0002\u0002~\u007f\u0007\u0005\u0002",
    "\u0002\u007f\u0019\u0003\u0002\u0002\u0002\u0080\u0082\u0005\u0018\r",
    "\u0002\u0081\u0080\u0003\u0002\u0002\u0002\u0081\u0082\u0003\u0002\u0002",
    "\u0002\u0082\u0083\u0003\u0002\u0002\u0002\u0083\u0084\u0007\u0006\u0002",
    "\u0002\u0084\u001b\u0003\u0002\u0002\u0002\u0085\u0087\u0005$\u0013",
    "\u0002\u0086\u0088\u0005\u001a\u000e\u0002\u0087\u0086\u0003\u0002\u0002",
    "\u0002\u0088\u0089\u0003\u0002\u0002\u0002\u0089\u0087\u0003\u0002\u0002",
    "\u0002\u0089\u008a\u0003\u0002\u0002\u0002\u008a\u008c\u0003\u0002\u0002",
    "\u0002\u008b\u008d\u0005 \u0011\u0002\u008c\u008b\u0003\u0002\u0002",
    "\u0002\u008c\u008d\u0003\u0002\u0002\u0002\u008d\u001d\u0003\u0002\u0002",
    "\u0002\u008e\u008f\u0007\u000f\u0002\u0002\u008f\u001f\u0003\u0002\u0002",
    "\u0002\u0090\u0092\u0005\"\u0012\u0002\u0091\u0090\u0003\u0002\u0002",
    "\u0002\u0092\u0093\u0003\u0002\u0002\u0002\u0093\u0091\u0003\u0002\u0002",
    "\u0002\u0093\u0094\u0003\u0002\u0002\u0002\u0094!\u0003\u0002\u0002",
    "\u0002\u0095\u0097\u0005$\u0013\u0002\u0096\u0098\u0005\u001a\u000e",
    "\u0002\u0097\u0096\u0003\u0002\u0002\u0002\u0098\u0099\u0003\u0002\u0002",
    "\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u0099\u009a\u0003\u0002\u0002",
    "\u0002\u009a\u00c0\u0003\u0002\u0002\u0002\u009b\u009d\u0005,\u0017",
    "\u0002\u009c\u009e\u0005\u001a\u000e\u0002\u009d\u009c\u0003\u0002\u0002",
    "\u0002\u009e\u009f\u0003\u0002\u0002\u0002\u009f\u009d\u0003\u0002\u0002",
    "\u0002\u009f\u00a0\u0003\u0002\u0002\u0002\u00a0\u00a2\u0003\u0002\u0002",
    "\u0002\u00a1\u009b\u0003\u0002\u0002\u0002\u00a2\u00a5\u0003\u0002\u0002",
    "\u0002\u00a3\u00a1\u0003\u0002\u0002\u0002\u00a3\u00a4\u0003\u0002\u0002",
    "\u0002\u00a4\u00bc\u0003\u0002\u0002\u0002\u00a5\u00a3\u0003\u0002\u0002",
    "\u0002\u00a6\u00a7\u0005\u0018\r\u0002\u00a7\u00a9\u0005(\u0015\u0002",
    "\u00a8\u00aa\u0005\u001a\u000e\u0002\u00a9\u00a8\u0003\u0002\u0002\u0002",
    "\u00aa\u00ab\u0003\u0002\u0002\u0002\u00ab\u00a9\u0003\u0002\u0002\u0002",
    "\u00ab\u00ac\u0003\u0002\u0002\u0002\u00ac\u00b8\u0003\u0002\u0002\u0002",
    "\u00ad\u00ae\u0005\u0018\r\u0002\u00ae\u00af\u0005*\u0016\u0002\u00af",
    "\u00b2\u0003\u0002\u0002\u0002\u00b0\u00b2\u0005,\u0017\u0002\u00b1",
    "\u00ad\u0003\u0002\u0002\u0002\u00b1\u00b0\u0003\u0002\u0002\u0002\u00b2",
    "\u00b4\u0003\u0002\u0002\u0002\u00b3\u00b5\u0005\u001a\u000e\u0002\u00b4",
    "\u00b3\u0003\u0002\u0002\u0002\u00b5\u00b6\u0003\u0002\u0002\u0002\u00b6",
    "\u00b4\u0003\u0002\u0002\u0002\u00b6\u00b7\u0003\u0002\u0002\u0002\u00b7",
    "\u00b9\u0003\u0002\u0002\u0002\u00b8\u00b1\u0003\u0002\u0002\u0002\u00b9",
    "\u00ba\u0003\u0002\u0002\u0002\u00ba\u00b8\u0003\u0002\u0002\u0002\u00ba",
    "\u00bb\u0003\u0002\u0002\u0002\u00bb\u00bd\u0003\u0002\u0002\u0002\u00bc",
    "\u00a6\u0003\u0002\u0002\u0002\u00bd\u00be\u0003\u0002\u0002\u0002\u00be",
    "\u00bc\u0003\u0002\u0002\u0002\u00be\u00bf\u0003\u0002\u0002\u0002\u00bf",
    "\u00c1\u0003\u0002\u0002\u0002\u00c0\u00a3\u0003\u0002\u0002\u0002\u00c1",
    "\u00c2\u0003\u0002\u0002\u0002\u00c2\u00c0\u0003\u0002\u0002\u0002\u00c2",
    "\u00c3\u0003\u0002\u0002\u0002\u00c3#\u0003\u0002\u0002\u0002\u00c4",
    "\u00c5\u0005&\u0014\u0002\u00c5%\u0003\u0002\u0002\u0002\u00c6\u00c8",
    "\t\u0002\u0002\u0002\u00c7\u00c6\u0003\u0002\u0002\u0002\u00c8\u00c9",
    "\u0003\u0002\u0002\u0002\u00c9\u00c7\u0003\u0002\u0002\u0002\u00c9\u00ca",
    "\u0003\u0002\u0002\u0002\u00ca\u00d3\u0003\u0002\u0002\u0002\u00cb\u00cd",
    "\u0005\u0018\r\u0002\u00cc\u00ce\t\u0002\u0002\u0002\u00cd\u00cc\u0003",
    "\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00cf\u00cd\u0003",
    "\u0002\u0002\u0002\u00cf\u00d0\u0003\u0002\u0002\u0002\u00d0\u00d2\u0003",
    "\u0002\u0002\u0002\u00d1\u00cb\u0003\u0002\u0002\u0002\u00d2\u00d5\u0003",
    "\u0002\u0002\u0002\u00d3\u00d1\u0003\u0002\u0002\u0002\u00d3\u00d4\u0003",
    "\u0002\u0002\u0002\u00d4\'\u0003\u0002\u0002\u0002\u00d5\u00d3\u0003",
    "\u0002\u0002\u0002\u00d6\u00dc\u0007\u0010\u0002\u0002\u00d7\u00d8\u0005",
    "\u0018\r\u0002\u00d8\u00d9\u0007\u0010\u0002\u0002\u00d9\u00db\u0003",
    "\u0002\u0002\u0002\u00da\u00d7\u0003\u0002\u0002\u0002\u00db\u00de\u0003",
    "\u0002\u0002\u0002\u00dc\u00da\u0003\u0002\u0002\u0002\u00dc\u00dd\u0003",
    "\u0002\u0002\u0002\u00dd)\u0003\u0002\u0002\u0002\u00de\u00dc\u0003",
    "\u0002\u0002\u0002\u00df\u00e0\u0005.\u0018\u0002\u00e0+\u0003\u0002",
    "\u0002\u0002\u00e1\u00e2\u0005.\u0018\u0002\u00e2-\u0003\u0002\u0002",
    "\u0002\u00e3\u00f4\u00054\u001b\u0002\u00e4\u00e6\u0005\u0018\r\u0002",
    "\u00e5\u00e4\u0003\u0002\u0002\u0002\u00e5\u00e6\u0003\u0002\u0002\u0002",
    "\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u00e9\u00050\u0019\u0002",
    "\u00e8\u00e5\u0003\u0002\u0002\u0002\u00e9\u00ea\u0003\u0002\u0002\u0002",
    "\u00ea\u00e8\u0003\u0002\u0002\u0002\u00ea\u00eb\u0003\u0002\u0002\u0002",
    "\u00eb\u00f0\u0003\u0002\u0002\u0002\u00ec\u00ee\u0005\u0018\r\u0002",
    "\u00ed\u00ec\u0003\u0002\u0002\u0002\u00ed\u00ee\u0003\u0002\u0002\u0002",
    "\u00ee\u00ef\u0003\u0002\u0002\u0002\u00ef\u00f1\u00054\u001b\u0002",
    "\u00f0\u00ed\u0003\u0002\u0002\u0002\u00f0\u00f1\u0003\u0002\u0002\u0002",
    "\u00f1\u00f3\u0003\u0002\u0002\u0002\u00f2\u00e8\u0003\u0002\u0002\u0002",
    "\u00f3\u00f6\u0003\u0002\u0002\u0002\u00f4\u00f2\u0003\u0002\u0002\u0002",
    "\u00f4\u00f5\u0003\u0002\u0002\u0002\u00f5\u010c\u0003\u0002\u0002\u0002",
    "\u00f6\u00f4\u0003\u0002\u0002\u0002\u00f7\u00fe\u00050\u0019\u0002",
    "\u00f8\u00fa\u0005\u0018\r\u0002\u00f9\u00f8\u0003\u0002\u0002\u0002",
    "\u00f9\u00fa\u0003\u0002\u0002\u0002\u00fa\u00fb\u0003\u0002\u0002\u0002",
    "\u00fb\u00fd\u00050\u0019\u0002\u00fc\u00f9\u0003\u0002\u0002\u0002",
    "\u00fd\u0100\u0003\u0002\u0002\u0002\u00fe\u00fc\u0003\u0002\u0002\u0002",
    "\u00fe\u00ff\u0003\u0002\u0002\u0002\u00ff\u0105\u0003\u0002\u0002\u0002",
    "\u0100\u00fe\u0003\u0002\u0002\u0002\u0101\u0103\u0005\u0018\r\u0002",
    "\u0102\u0101\u0003\u0002\u0002\u0002\u0102\u0103\u0003\u0002\u0002\u0002",
    "\u0103\u0104\u0003\u0002\u0002\u0002\u0104\u0106\u00054\u001b\u0002",
    "\u0105\u0102\u0003\u0002\u0002\u0002\u0105\u0106\u0003\u0002\u0002\u0002",
    "\u0106\u0108\u0003\u0002\u0002\u0002\u0107\u00f7\u0003\u0002\u0002\u0002",
    "\u0108\u0109\u0003\u0002\u0002\u0002\u0109\u0107\u0003\u0002\u0002\u0002",
    "\u0109\u010a\u0003\u0002\u0002\u0002\u010a\u010c\u0003\u0002\u0002\u0002",
    "\u010b\u00e3\u0003\u0002\u0002\u0002\u010b\u0107\u0003\u0002\u0002\u0002",
    "\u010c/\u0003\u0002\u0002\u0002\u010d\u010f\u0007\n\u0002\u0002\u010e",
    "\u0110\u0005\u0018\r\u0002\u010f\u010e\u0003\u0002\u0002\u0002\u010f",
    "\u0110\u0003\u0002\u0002\u0002\u0110\u0111\u0003\u0002\u0002\u0002\u0111",
    "\u0113\u00054\u001b\u0002\u0112\u0114\u0005\u0018\r\u0002\u0113\u0112",
    "\u0003\u0002\u0002\u0002\u0113\u0114\u0003\u0002\u0002\u0002\u0114\u0115",
    "\u0003\u0002\u0002\u0002\u0115\u0116\u0007\u000b\u0002\u0002\u01161",
    "\u0003\u0002\u0002\u0002\u0117\u0118\u0007\u0010\u0002\u0002\u01183",
    "\u0003\u0002\u0002\u0002\u0119\u011b\t\u0003\u0002\u0002\u011a\u0119",
    "\u0003\u0002\u0002\u0002\u011b\u011c\u0003\u0002\u0002\u0002\u011c\u011a",
    "\u0003\u0002\u0002\u0002\u011c\u011d\u0003\u0002\u0002\u0002\u011d\u0126",
    "\u0003\u0002\u0002\u0002\u011e\u0120\u0005\u0018\r\u0002\u011f\u0121",
    "\t\u0003\u0002\u0002\u0120\u011f\u0003\u0002\u0002\u0002\u0121\u0122",
    "\u0003\u0002\u0002\u0002\u0122\u0120\u0003\u0002\u0002\u0002\u0122\u0123",
    "\u0003\u0002\u0002\u0002\u0123\u0125\u0003\u0002\u0002\u0002\u0124\u011e",
    "\u0003\u0002\u0002\u0002\u0125\u0128\u0003\u0002\u0002\u0002\u0126\u0124",
    "\u0003\u0002\u0002\u0002\u0126\u0127\u0003\u0002\u0002\u0002\u01275",
    "\u0003\u0002\u0002\u0002\u0128\u0126\u0003\u0002\u0002\u000207:=@CL",
    "U^fipuz\u0081\u0089\u008c\u0093\u0099\u009f\u00a3\u00ab\u00b1\u00b6",
    "\u00ba\u00be\u00c2\u00c9\u00cf\u00d3\u00dc\u00e5\u00ea\u00ed\u00f0\u00f4",
    "\u00f9\u00fe\u0102\u0105\u0109\u010b\u010f\u0113\u011c\u0122\u0126"].join("");


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class ManuscriptParser extends antlr4.Parser {

    static grammarFileName = "ManuscriptParser.g4";
    static literalNames = [ null, null, null, null, null, null, null, null, 
                            "'('", "')'", null, "'-'", null, "'KOHTAUKSET'" ];
    static symbolicNames = [ null, "MultiLineComment", "SingleLineComment", 
                             "WSS", "EOL", "Capital", "Minuscule", "Punctuation", 
                             "LeftParenthesis", "RightParenthesis", "Extra", 
                             "Minus", "Synopsis", "Scene", "CapitalWord", 
                             "Number", "MinusculeWord" ];
    static ruleNames = [ "manuscript", "titleParagraph", "title", "authorParagraph", 
                         "author", "dateParagraph", "date", "synopsisPart", 
                         "synopsisTitle", "synopsisParagraphs", "synopsisParagraph", 
                         "wss", "eol", "scenesPart", "scenesHeading", "scenes", 
                         "scene", "sceneHeading", "heading", "name", "replique", 
                         "parenthesis", "anyTextOrCommand", "command", "capitalword", 
                         "anyText" ];

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
	    try { let _alt
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
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.Minus) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0)) {
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 69;
	        this.wss();
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
	    try { let _alt
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 78;
	        this.wss();
	        this.state = 79;
	        this.author();
	        this.state = 81; 
	        this._errHandler.sync(this);
	        _alt = 1;
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 85;
	        this.anyText();
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
	    try { let _alt
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 94;
	        this.anyText();
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
	    try { let _alt
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
	        } while(_la===ManuscriptParser.WSS || _la===ManuscriptParser.EOL);
	        this.state = 103;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
	        if(la_===1) {
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
	    try { let _alt
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 118; 
	        this._errHandler.sync(this);
	        _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 108; 
	        		this._errHandler.sync(this);
	        		_alt = 1;
	        		do {
	        			switch (_alt) {
	        			case 1:
	        				this.state = 107;
	        				this.synopsisParagraph();
	        				break;
	        			default:
	        				throw new antlr4.error.NoViableAltException(this);
	        			}
	        			this.state = 110; 
	        			this._errHandler.sync(this);
	        			_alt = this._interp.adaptivePredict(this._input,10, this._ctx);
	        		} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        		this.state = 115;
	        		this._errHandler.sync(this);
	        		_la = this._input.LA(1);
	        		while(_la===ManuscriptParser.WSS || _la===ManuscriptParser.EOL) {
	        		    this.state = 112;
	        		    this.eol();
	        		    this.state = 117;
	        		    this._errHandler.sync(this);
	        		    _la = this._input.LA(1);
	        		}
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 120; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,12, this._ctx);
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



	synopsisParagraph() {
	    let localctx = new SynopsisParagraphContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, ManuscriptParser.RULE_synopsisParagraph);
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 122;
	        this.anyText();
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 124;
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 127;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.WSS) {
	            this.state = 126;
	            this.wss();
	        }

	        this.state = 129;
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 131;
	        this.sceneHeading();
	        this.state = 133; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 132;
	            this.eol();
	            this.state = 135; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===ManuscriptParser.WSS || _la===ManuscriptParser.EOL);
	        this.state = 138;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.Minus) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0)) {
	            this.state = 137;
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 140;
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 143; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 142;
	            this.scene();
	            this.state = 145; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.Minus) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0));
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 147;
	        this.sceneHeading();
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
	        	_alt = this._interp.adaptivePredict(this._input,17, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 190; 
	        this._errHandler.sync(this);
	        _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 161;
	        		this._errHandler.sync(this);
	        		_la = this._input.LA(1);
	        		while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.LeftParenthesis) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.Minus) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number) | (1 << ManuscriptParser.MinusculeWord))) !== 0)) {
	        		    this.state = 153;
	        		    this.parenthesis();
	        		    this.state = 155; 
	        		    this._errHandler.sync(this);
	        		    _alt = 1;
	        		    do {
	        		    	switch (_alt) {
	        		    	case 1:
	        		    		this.state = 154;
	        		    		this.eol();
	        		    		break;
	        		    	default:
	        		    		throw new antlr4.error.NoViableAltException(this);
	        		    	}
	        		    	this.state = 157; 
	        		    	this._errHandler.sync(this);
	        		    	_alt = this._interp.adaptivePredict(this._input,18, this._ctx);
	        		    } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        		    this.state = 163;
	        		    this._errHandler.sync(this);
	        		    _la = this._input.LA(1);
	        		}
	        		this.state = 186; 
	        		this._errHandler.sync(this);
	        		_alt = 1;
	        		do {
	        			switch (_alt) {
	        			case 1:
	        				this.state = 164;
	        				this.wss();
	        				this.state = 165;
	        				this.name();
	        				this.state = 167; 
	        				this._errHandler.sync(this);
	        				_alt = 1;
	        				do {
	        					switch (_alt) {
	        					case 1:
	        						this.state = 166;
	        						this.eol();
	        						break;
	        					default:
	        						throw new antlr4.error.NoViableAltException(this);
	        					}
	        					this.state = 169; 
	        					this._errHandler.sync(this);
	        					_alt = this._interp.adaptivePredict(this._input,20, this._ctx);
	        				} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        				this.state = 182; 
	        				this._errHandler.sync(this);
	        				_alt = 1;
	        				do {
	        					switch (_alt) {
	        					case 1:
	        						this.state = 175;
	        						this._errHandler.sync(this);
	        						switch(this._input.LA(1)) {
	        						case ManuscriptParser.WSS:
	        						    this.state = 171;
	        						    this.wss();
	        						    this.state = 172;
	        						    this.replique();
	        						    break;
	        						case ManuscriptParser.Punctuation:
	        						case ManuscriptParser.LeftParenthesis:
	        						case ManuscriptParser.Extra:
	        						case ManuscriptParser.Minus:
	        						case ManuscriptParser.CapitalWord:
	        						case ManuscriptParser.Number:
	        						case ManuscriptParser.MinusculeWord:
	        						    this.state = 174;
	        						    this.parenthesis();
	        						    break;
	        						default:
	        						    throw new antlr4.error.NoViableAltException(this);
	        						}
	        						this.state = 178; 
	        						this._errHandler.sync(this);
	        						_alt = 1;
	        						do {
	        							switch (_alt) {
	        							case 1:
	        								this.state = 177;
	        								this.eol();
	        								break;
	        							default:
	        								throw new antlr4.error.NoViableAltException(this);
	        							}
	        							this.state = 180; 
	        							this._errHandler.sync(this);
	        							_alt = this._interp.adaptivePredict(this._input,22, this._ctx);
	        						} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        						break;
	        					default:
	        						throw new antlr4.error.NoViableAltException(this);
	        					}
	        					this.state = 184; 
	        					this._errHandler.sync(this);
	        					_alt = this._interp.adaptivePredict(this._input,23, this._ctx);
	        				} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        				break;
	        			default:
	        				throw new antlr4.error.NoViableAltException(this);
	        			}
	        			this.state = 188; 
	        			this._errHandler.sync(this);
	        			_alt = this._interp.adaptivePredict(this._input,24, this._ctx);
	        		} while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 192; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,25, this._ctx);
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 194;
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 197; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 196;
	            _la = this._input.LA(1);
	            if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.Minus) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0))) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 199; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.Minus) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0));
	        this.state = 209;
	        this._errHandler.sync(this);
	        _alt = this._interp.adaptivePredict(this._input,28,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 201;
	                this.wss();
	                this.state = 203; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	                do {
	                    this.state = 202;
	                    _la = this._input.LA(1);
	                    if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.Minus) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0))) {
	                    this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 205; 
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.Minus) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number))) !== 0)); 
	            }
	            this.state = 211;
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



	name() {
	    let localctx = new NameContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 38, ManuscriptParser.RULE_name);
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 212;
	        this.match(ManuscriptParser.CapitalWord);
	        this.state = 218;
	        this._errHandler.sync(this);
	        _alt = this._interp.adaptivePredict(this._input,29,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 213;
	                this.wss();
	                this.state = 214;
	                this.match(ManuscriptParser.CapitalWord); 
	            }
	            this.state = 220;
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



	replique() {
	    let localctx = new RepliqueContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 40, ManuscriptParser.RULE_replique);
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 221;
	        this.anyTextOrCommand();
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 223;
	        this.anyTextOrCommand();
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



	anyTextOrCommand() {
	    let localctx = new AnyTextOrCommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 44, ManuscriptParser.RULE_anyTextOrCommand);
	    var _la = 0; // Token type
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 265;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case ManuscriptParser.Punctuation:
	        case ManuscriptParser.Extra:
	        case ManuscriptParser.Minus:
	        case ManuscriptParser.CapitalWord:
	        case ManuscriptParser.Number:
	        case ManuscriptParser.MinusculeWord:
	            this.state = 225;
	            this.anyText();
	            this.state = 242;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,34,this._ctx)
	            while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                if(_alt===1) {
	                    this.state = 230; 
	                    this._errHandler.sync(this);
	                    _alt = 1;
	                    do {
	                    	switch (_alt) {
	                    	case 1:
	                    		this.state = 227;
	                    		this._errHandler.sync(this);
	                    		_la = this._input.LA(1);
	                    		if(_la===ManuscriptParser.WSS) {
	                    		    this.state = 226;
	                    		    this.wss();
	                    		}

	                    		this.state = 229;
	                    		this.command();
	                    		break;
	                    	default:
	                    		throw new antlr4.error.NoViableAltException(this);
	                    	}
	                    	this.state = 232; 
	                    	this._errHandler.sync(this);
	                    	_alt = this._interp.adaptivePredict(this._input,31, this._ctx);
	                    } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	                    this.state = 238;
	                    this._errHandler.sync(this);
	                    var la_ = this._interp.adaptivePredict(this._input,33,this._ctx);
	                    if(la_===1) {
	                        this.state = 235;
	                        this._errHandler.sync(this);
	                        _la = this._input.LA(1);
	                        if(_la===ManuscriptParser.WSS) {
	                            this.state = 234;
	                            this.wss();
	                        }

	                        this.state = 237;
	                        this.anyText();

	                    } 
	                }
	                this.state = 244;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,34,this._ctx);
	            }

	            break;
	        case ManuscriptParser.LeftParenthesis:
	            this.state = 261; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            do {
	                this.state = 245;
	                this.command();
	                this.state = 252;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,36,this._ctx)
	                while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                    if(_alt===1) {
	                        this.state = 247;
	                        this._errHandler.sync(this);
	                        _la = this._input.LA(1);
	                        if(_la===ManuscriptParser.WSS) {
	                            this.state = 246;
	                            this.wss();
	                        }

	                        this.state = 249;
	                        this.command(); 
	                    }
	                    this.state = 254;
	                    this._errHandler.sync(this);
	                    _alt = this._interp.adaptivePredict(this._input,36,this._ctx);
	                }

	                this.state = 259;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,38,this._ctx);
	                if(la_===1) {
	                    this.state = 256;
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                    if(_la===ManuscriptParser.WSS) {
	                        this.state = 255;
	                        this.wss();
	                    }

	                    this.state = 258;
	                    this.anyText();

	                }
	                this.state = 263; 
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
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 267;
	        this.match(ManuscriptParser.LeftParenthesis);
	        this.state = 269;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.WSS) {
	            this.state = 268;
	            this.wss();
	        }

	        this.state = 271;
	        this.anyText();
	        this.state = 273;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===ManuscriptParser.WSS) {
	            this.state = 272;
	            this.wss();
	        }

	        this.state = 275;
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



	capitalword() {
	    let localctx = new CapitalwordContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 48, ManuscriptParser.RULE_capitalword);
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 277;
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



	anyText() {
	    let localctx = new AnyTextContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 50, ManuscriptParser.RULE_anyText);
	    var _la = 0; // Token type
	    try { let _alt
	        this.enterOuterAlt(localctx, 1);
	        this.state = 280; 
	        this._errHandler.sync(this);
	        _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 279;
	        		_la = this._input.LA(1);
	        		if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.Minus) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number) | (1 << ManuscriptParser.MinusculeWord))) !== 0))) {
	        		this._errHandler.recoverInline(this);
	        		}
	        		else {
	        			this._errHandler.reportMatch(this);
	        		    this.consume();
	        		}
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 282; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,43, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 292;
	        this._errHandler.sync(this);
	        _alt = this._interp.adaptivePredict(this._input,45,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 284;
	                this.wss();
	                this.state = 286; 
	                this._errHandler.sync(this);
	                _alt = 1;
	                do {
	                	switch (_alt) {
	                	case 1:
	                		this.state = 285;
	                		_la = this._input.LA(1);
	                		if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ManuscriptParser.Punctuation) | (1 << ManuscriptParser.Extra) | (1 << ManuscriptParser.Minus) | (1 << ManuscriptParser.CapitalWord) | (1 << ManuscriptParser.Number) | (1 << ManuscriptParser.MinusculeWord))) !== 0))) {
	                		this._errHandler.recoverInline(this);
	                		}
	                		else {
	                			this._errHandler.reportMatch(this);
	                		    this.consume();
	                		}
	                		break;
	                	default:
	                		throw new antlr4.error.NoViableAltException(this);
	                	}
	                	this.state = 288; 
	                	this._errHandler.sync(this);
	                	_alt = this._interp.adaptivePredict(this._input,44, this._ctx);
	                } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER ); 
	            }
	            this.state = 294;
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
ManuscriptParser.Minus = 11;
ManuscriptParser.Synopsis = 12;
ManuscriptParser.Scene = 13;
ManuscriptParser.CapitalWord = 14;
ManuscriptParser.Number = 15;
ManuscriptParser.MinusculeWord = 16;

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
ManuscriptParser.RULE_anyTextOrCommand = 22;
ManuscriptParser.RULE_command = 23;
ManuscriptParser.RULE_capitalword = 24;
ManuscriptParser.RULE_anyText = 25;

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

	anyText() {
	    return this.getTypedRuleContext(AnyTextContext,0);
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

	anyText() {
	    return this.getTypedRuleContext(AnyTextContext,0);
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

	anyText() {
	    return this.getTypedRuleContext(AnyTextContext,0);
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


	Minus = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.Minus);
	    } else {
	        return this.getToken(ManuscriptParser.Minus, i);
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

	anyTextOrCommand() {
	    return this.getTypedRuleContext(AnyTextOrCommandContext,0);
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

	anyTextOrCommand() {
	    return this.getTypedRuleContext(AnyTextOrCommandContext,0);
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



class AnyTextOrCommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_anyTextOrCommand;
    }

	anyText = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(AnyTextContext);
	    } else {
	        return this.getTypedRuleContext(AnyTextContext,i);
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
	        listener.enterAnyTextOrCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitAnyTextOrCommand(this);
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

	anyText() {
	    return this.getTypedRuleContext(AnyTextContext,0);
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



class CapitalwordContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_capitalword;
    }

	CapitalWord() {
	    return this.getToken(ManuscriptParser.CapitalWord, 0);
	};

	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterCapitalword(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitCapitalword(this);
		}
	}


}



class AnyTextContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ManuscriptParser.RULE_anyText;
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


	Minus = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ManuscriptParser.Minus);
	    } else {
	        return this.getToken(ManuscriptParser.Minus, i);
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


	enterRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.enterAnyText(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ManuscriptParserListener ) {
	        listener.exitAnyText(this);
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
ManuscriptParser.AnyTextOrCommandContext = AnyTextOrCommandContext; 
ManuscriptParser.CommandContext = CommandContext; 
ManuscriptParser.CapitalwordContext = CapitalwordContext; 
ManuscriptParser.AnyTextContext = AnyTextContext; 
