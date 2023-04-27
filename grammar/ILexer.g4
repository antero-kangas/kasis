lexer grammar ILexer;
options { 
    language = 'JavaScript';
}

MultiLineComment:   '/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment:  '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);


WhiteSpace: [ \t] -> channel(HIDDEN);

Dollar : '#' ;
Semicolon : ';' ;
LParen : '(' ;
RParen : ')' ;
fragment Letter : [a-zA-Z] ;
fragment Digit : [0-9] ;
fragment Int : Digit+ ;
Number : Int (Comma Int?)? [Ee](Plus | Minus)? Int ;
Id : Letter (Letter | Digit) * ;
Equal : '=' ;
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
DQString : DQ ~'"'*? DQ ;
SQString : SQ '\''*? SQ ;
