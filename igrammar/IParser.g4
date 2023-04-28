parser grammar IParser;
options {
	tokenVocab =ILexer;
}

i : dollar statements? dollar ;

statements : Semicolon* statement (Semicolon+ statement)* Semicolon* ;

statement : expression | assignment | lParen statements rParen ;

definition : id lParen sList? rParen equal statement ;
overload : id lParen sList? rParen defines statement ;

sList : sParam (comma sParam)* ;
sParam : id (colon type)? (equal defaultValue)? ;
type : id ;
defaultValue : expression ;

call : id lParen vList? rParen ;
vList : vParam (comma vParam)* ;
vParam : expression ;

assignment : id equal statement ;

expression : expression plus power | expression minus power | power ;
power : term toPower power | term ;
term : term times factor | term div factor | term mod factor | factor ;
factor : (plus | minus) factor | value | lParen statement rParen ;
value : number | string | id | definition | overload | call ;

dollar : Dollar ;
lParen : LParen ;
rParen : RParen ;
id : Id ;
defines: Defines ;
equal : Equal ;
comma : Comma ;
colon : Colon ;
plus : Plus ;
minus : Minus ;
toPower : ToPower ;
times : Times ;
div : Div ;
mod : Mod ;
number : Number ;

string : DQString | SQString ;
