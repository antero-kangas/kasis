lexer grammar SoundLexer;
options { 
    language = 'JavaScript';
}

MultiLineComment:   '/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment:  '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);


WhiteSpace: 	[ \t] -> skip;
EOL:        	'\r'? '\n' -> skip;

Semicolon:  	';';
Comma:      	',';
Equal: 			'=';
fragment Digit:	[0-9];
Number: 		[+-]? Digit+ ('.' Digit+)?;
Id: 			[A-ZÅÄÖa-zåäö_][A-ZÅÄÖa-zåäö_0-9]*;
LParen: 		'(';
RParen:			')';
LBracket:		'[';
RBracket:		']';
fragment DQString:		'"' ~'"'* '"';
fragment SQString:		'\'' ~'\''* '\'';
String: DQString | SQString;




