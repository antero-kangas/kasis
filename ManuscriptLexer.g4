lexer grammar ManuscriptLexer;

channels { ERROR };

MultiLineComment:               '/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment:              '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);
