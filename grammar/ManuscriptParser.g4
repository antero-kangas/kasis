parser grammar ManuscriptParser;
	tokenVocab = ManuscriptLexer;
}

manuscript: title? author? date? synopsis? scenes? EOF;
title: wss sceneHeading eol eol;
author: replique;
date: replique;

synopsis: Synopsis eol eol (parenthesis+ eol*)+;
wss: WhiteSpace+;
eol: WhiteSpace* EOL;

scenes: scene+;

scene: sceneHeading (parenthesis  | (name replique+)+ )+;

sceneHeading:
    (capitalword | Number | Punctuation)+ 
    (wss (capitalword | Number | Punctuation)+)* 
    eol;

capitalword: CapitalWord (Minus CapitalWord)*;

name: wss capitalWord eol;
anyWord: 
    ( CapitalWord 
    | MinusculeWord 
    | Number 
    | LeftParenthesis 
    | RightParenthesis
    )+;
minusculeWord: MinusculeWord;
anyText: (capitalWord | anyWord)* minusculeword (capitalWord | anyWord)*;
replique : wss anyText eol;

parenthesis: anyText eol;