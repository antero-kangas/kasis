parser grammar IParser;
options {
	tokenVocab =ILexer;
}

i : dollar statements? dollar ;

statements : semicolon* statement (semicolon* statement)* semicolon* ;

statement : expression | relation | assignment | lParen statements rParen ;

definition : id lParen sList? rParen set statement ;
overload : id lParen sList? rParen defines statement ;

sList : sParam (comma sParam)* ;
sParam : id (colon type)? (set defaultValue)? ;
type : id ;
defaultValue : expression ;

call : id lParen vList? rParen ;
vList : vParam (comma vParam)* ;
vParam : statement ;

assignment : id indexing? set statement ;
indexing : list+ ;

expression : expression plus power | expression minus power | power ;
power : term toPower power | term ;
term : term times factor | term div factor | term mod factor | factor ;
factor : (plus | minus) factor | value | lParen statement rParen ;
value : number | string | bool | id indexing? | definition | overload | call | list | object ;

proposition: proposition or disjunction | disjunction ;
disjunction : disjunction and conjunction | conjunction ;
conjunction : not conjunction | bool | relation | lParen proposition rParen ;
relation : expression relationOperator expression ;
relationOperator : ge | gt | eq | ne | lt | le ;

list : lBracket vList? RBracket ;
object : lCurly keyValues? rCurly ;
keyValues : keyValue (comma keyValue)* ;
keyValue : key colon value ;
key : id | string ;
dollar : Dollar ;
semicolon : Semicolon ;
lParen : LParen ;
rParen : RParen ;
id : Id ;
defines: Defines ;
ge : Ge ;
gt : Gt ;
eq : Eq ; 
ne : Ne ;
le : Le ;
lt : Lt ;
set : Set ;

comma : Comma ;
colon : Colon ;
plus : Plus ;
minus : Minus ;
toPower : ToPower ;
times : Times ;
div : Div ;
mod : Mod ;
number : Number ;
bool : trueValue | falseValue ;
trueValue : True ;
falseValue : False ;

string : dQString | sQString ;
dQString : DQString ;
sQString : SQString ;

and : And ;
or : Or ;
not : Not ;

lBracket : LBracket ;
rBracket : RBracket ;
lCurly : LCurly ;
rCurly : RCurly ;


