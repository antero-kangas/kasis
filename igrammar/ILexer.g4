lexer grammar ILexer;
options { 
    language = 'JavaScript';
}

MultiLineComment:   '/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment:  '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);


WhiteSpace: [ \t\n\r] -> channel(HIDDEN);

True : 'true' ;
False : 'false' ;
Bool : 'bool' ;
Num : 'number' ;
String : 'string' ; 

Dollar : '$' ;
Semicolon : ';' ;
LParen : '(' ;
RParen : ')' ;
LBracket : '[' ;
RBracket : ']' ;
LCurly : '{' ;
RCurly : '}' ;
fragment Letter : [_a-zåäöA-ZÅÄÖ] ;
fragment Digit : [0-9] ;
fragment Int : Digit+ ;
Dot : '.' ;
Number : Int (Dot Int?)? ([Ee](Plus | Minus)? Int)? ;
Id : Letter (Letter | Digit)* ;
Defines : ':=' ;
Comma : ',' ;
Colon : ':' ;
Plus : '+' ;
Minus : '-' ;
ToPower : 'ˆ' ;
Times : '*' ;
Div : '/' ;
Mod : '%' ; 
fragment DQ : '"' ;
fragment SQ : '\'' ;
DQString : DQ ('\\"' | ~'"')*? DQ ;
SQString : SQ ('\\\'' | .)*? SQ ;
Ge : '>=' | '≥' ;
Gt : '>' ;
Le : '<=' | '≤' ;
Lt : '<' ;
Ne : '!=' | '<>' | '≠' ;
Eq : '==' ;
And : '&&' ;
Or : '||' ;
Not : '!' ;
Set : '=' ;

