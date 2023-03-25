parser grammar ManuscriptParser;
options {
	tokenVocab = ManuscriptLexer;
}

manuscript: 
    titleParagraph? 
    authorParagraph? 
    dateParagraph? 
    synopsisPart?
    scenesPart? 
    EOF;

titleParagraph: wss title eol+;
title: heading;
authorParagraph: wss author eol+;
author: anyText;
dateParagraph: wss date eol+;
date: anyText;

synopsisPart: synopsisTitle eol+ synopsisParagraphs?;
synopsisTitle: Synopsis;
synopsisParagraphs: (synopsisParagraph+ eol*)+;
synopsisParagraph: anyText;

wss: WSS;
eol: wss? EOL;

scenesPart: sceneHeading eol+ scenes?;
scenesHeading: Scene;
scenes: scene+;

scene: 
    sceneHeading eol+ 
    (
        (parenthesis eol+)*
        (wss name eol+ 
         (
            ( (wss replique)
            | parenthesis
            ) eol+
         )+
        )+
    )+ 
    ;

sceneHeading: heading;

heading:
    (CapitalWord | Number | Punctuation | Extra | Minus)+ 
    (wss (CapitalWord | Number | Punctuation | Extra | Minus)+)* 
    ;

name: CapitalWord (wss CapitalWord)*;
replique : anyTextOrCommand ;
parenthesis: anyTextOrCommand ;
//anyTextOrCommand: (anyText | command) (wss? anyText | wss? command)* ;
anyTextOrCommand: 
    ( anyText ((wss? command)+ (wss? anyText)?)* 
    | (command (wss? command)* (wss? anyText)?)+ 
    )
    ;
command: LeftParenthesis wss? anyText wss? RightParenthesis;

capitalword: CapitalWord ;

anyText: 
    (CapitalWord | Number | Punctuation | Extra | Minus | MinusculeWord)+
    ( wss (CapitalWord | Number | Punctuation | Extra | Minus | MinusculeWord)+
    )*
    ;
