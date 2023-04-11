parser grammar SoundParser;
options {
	tokenVocab = SoundLexer;
}


sound: statements;
statements: statement+;
statement: def | call;
def: id lParen defParams? rParen  equal lParen calls? rParen ;

defParams: id (comma id)*;

calls: call+;

call: (id equal)? id lParen callParams? rParen;
callParams: callParam (comma callParam)*;
callParam: elem;

semicolon: Semicolon;
comma: Comma;
lParen: LParen;
rParen: RParen;
lBracket: LBracket;
rBracket: RBracket;
equal: Equal;
id: Id;
string: String;
number: Number;

array: lBracket elements? rBracket;
elements: elem (comma elem)*;
elem: number | string | id | array | call;