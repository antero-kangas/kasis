parser grammar IParser;
options {
	tokenVocab =ILexer;
}

i : dollar statements? dollar ;

statements : statement (Semicolon+ statement)* Semicolon* ;

statement : definition | expression | call | assignment | expression | lParen statements rParen ;

definition : id lParen sList? rParen equal statement ;
sList : sParam (comma sParam)* ;
sParam : id (colon type)? (equal defaultValue)? ;
type : id ;
defaultValue : expression ;

call : id lParen vList? rParen ;
vList : vParam (comma vParam)* ;
vParam : expression ;

assignment : id equal expression ;
expression : expression plus power | expression minus power | power ;
power : term toPower power | term ;
term : term times factor | term div factor | term mod factor | factor ;
factor : (plus | minus) factor | value | lParen expression rParen ;
value : number | string | id ;

dollar : Dollar ;
lParen : LParen ;
rParen : RParen ;
id : Id ;
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
