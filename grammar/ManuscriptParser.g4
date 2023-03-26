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
author: nonCapitalText;

dateParagraph: wss date eol+;
date: nonCapitalText;

synopsisPart: synopsisTitle eol+ synopsisParagraphs?;
synopsisTitle: Synopsis;
synopsisParagraphs: (synopsisParagraph eol+)+;
synopsisParagraph: nonCapitalText;

wss: WSS;
eol: wss? EOL;

scenesPart: scenesHeading eol+ scenes?;
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
    (CapitalWord | Number | Punctuation | Extra)+ 
    (wss (CapitalWord | Number | Punctuation | Extra)+)* 
    ;

name: CapitalWord (wss CapitalWord)*;
replique : nonCapitalTextOrCommand ;
parenthesis: nonCapitalTextOrCommand ;

nonCapitalTextOrCommand: 
    ( nonCapitalText ((wss? command)+ (wss? nonCapitalText)?)* 
    | (command (wss? command)* (wss? nonCapitalText)?)+ 
    )
    ;
command: LeftParenthesis (wss | nonCapitalText | CapitalWord)+ RightParenthesis;

nonCapitalWord: 
    CapitalWord*
    (Number | Punctuation | Extra | Minuscule)
    (CapitalWord | Number | Punctuation | Extra | Minuscule)*
    ;

nonCapitalText: nonCapitalWord (wss nonCapitalWord)*;

