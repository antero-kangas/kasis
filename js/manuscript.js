import antlr4 from 'antlr4';
import ManuscriptLexer from '../grammar/ManuscriptLexer.js';
import ManuscriptParser from '../grammar/ManuscriptParser.js';
import ManuscriptListener from './ManuscriptListener.js';

const input = "your text to parse here"
const chars = new antlr4.InputStream(input);
const lexer = new ManuscriptLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new ManuscriptParser(tokens);
parser.buildParseTrees = true;
const tree = parser.MyStartRule();