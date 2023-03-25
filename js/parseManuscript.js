import antlr4 from 'antlr4';
import ManuscriptLexer from '../grammar/ManuscriptLexer.js';
import ManuscriptParser from '../grammar/ManuscriptParser.js';
import ManuscriptListener from '../js/manuscriptListener.js';


export default function parseManuscript(input){
    
    const chars = new antlr4.InputStream(input);
    const lexer = new ManuscriptLexer(chars);
    const tokens  = new antlr4.CommonTokenStream(lexer);
    const parser = new ManuscriptParser(tokens);
    parser.buildParseTrees = true;

    // parser.removeErrorListeners();
    // let errorListener = new ManuscriptErrorListener();
    const Manuscript = new ManuscriptListener();
    // errorListener.addChannel(Manuscript);
    // parser.addErrorListener(errorListener);

    const tree = parser.manuscript() // only repeated here for reference

    antlr4.tree.ParseTreeWalker.DEFAULT.walk(Manuscript, tree);
    
    return new Promise((resolve, reject) => resolve(Manuscript));
};

// class ManuscriptErrorListener extends antlr4.error.ErrorListener {
//     addChannel(channel) {
//         this.channel = channel;
//     };

//     syntaxError(recognizer, offendingSymbol, line, column, msg, err) {
//         this.channel.syntaxErrorMsg(`${offendingSymbol}: ${msg}
//     Rivi ${line}, positio ${column}`);
//     }
//   }