lexer grammar ManuscriptLexer;

channels { ERROR };

MultiLineComment:   '/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment:  '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);


WhiteSpace:         [ \t];
EOL:                '\r'? '\n';
Capital:            [A-ZÅÄÖ];
Minuscule:          [a-zåäö];        
Digit:              [0-9];
Punctuation:        [\.,;:!?];
LeftParenthesis:    '(';
RightParenthesis:   ')';
Plus:               '+';
Minus:              '-';

CapitalWord:        Capital+ (Minus Capital+)*;
Number:             Digit+;
MinusculeWord:      (Minuscule | Capital)+ (Minus (Minuscule | Capital)+)*;
Synopsis:           'SYNOPSIS';