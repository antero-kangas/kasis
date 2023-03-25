import antlr4 from 'antlr4';
import GherkinLexer from '../../grammar/GherkinLexer';
import GherkinParser from '../../grammar/GherkinParser';
import Gherkin from './gherkin';
import getMethods from '../tools/getMethods';
import getStructure from '../tools/getStructure';


/**
 * Jäsentää Gherkin-tekstin Gherkin-puuksi (antlr4 tree) ja
 * Läpikäy Gherkin-puun ja tuottaa JS-objektin (Gherkin-olio)
 * Huom! antlr4:n virtheilmoitukset uudelleen ohjattu  
 * @param {string*} input - yksi ominaisuus merkkijonona 
 * @returns Gherkin-olio
 */

export default function parseGherkin(input){
    const chars = new antlr4.InputStream(input);
    const lexer = new GherkinLexer(chars);
    const tokens  = new antlr4.CommonTokenStream(lexer);
    const parser = new GherkinParser(tokens);
    parser.buildParseTrees = true;

    parser.removeErrorListeners();
    let errorListener = new GherkinErrorListener();
    const gherkin = new Gherkin();
    errorListener.addChannel(gherkin);
    parser.addErrorListener(errorListener);

    const tree = parser.feature() // only repeated here for reference

    antlr4.tree.ParseTreeWalker.DEFAULT.walk(gherkin, tree);
    
    return new Promise((resolve, reject) => resolve(gherkin));
};

class GherkinErrorListener extends antlr4.error.ErrorListener {
    addChannel(channel) {
        this.channel = channel;
    };

    syntaxError(recognizer, offendingSymbol, line, column, msg, err) {
        this.channel.syntaxErrorMsg(`${offendingSymbol}: ${msg}
    Rivi ${line}, positio ${column}`);
    }
  }