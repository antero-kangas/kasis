lexer grammar ManuscriptLexer;
options { 
    language = 'JavaScript';
}

MultiLineComment:   '/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment:  '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);


fragment WhiteSpace: [ \t];
WSS:				WhiteSpace+ ;
EOL:                '\r'? '\n';
fragment Capital:   [A-ZÅÄÖ];
fragment Minuscule: [a-zåäö];        
fragment Digit:     [0-9];
Punctuation:        [.,;:!?];
LeftParenthesis:    '(';
RightParenthesis:   ')';
fragment Minus:     '-';
Extra:              [+*=#"|'@€%/] | Minus ;

Synopsis:           'SYNOPSIS' | 'TIIVISTELMÄ';
Scene:				'KOHTAUKSET';
Effects:            'EFEKTIT';
CapitalWord:        Capital+;
MinusculeWord:      Minuscule+;
Number:             Digit+;