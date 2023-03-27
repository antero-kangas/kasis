parser grammar ManuscriptParser;
options {
	tokenVocab = ManuscriptLexer;
}

manuscript: 
    titlePart? 
    authorsPart? 
    dateParagraph? 
    synopsisPart?
    scenesPart? 
    EOF;

titlePart: wss (title eol+)+;
title: heading;

authorsPart: wss (authors eol+)+;
authors: nonCapitalText;

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
    (Number | Punctuation | Extra | MinusculeWord)
    (CapitalWord | Number | Punctuation | Extra | MinusculeWord)*
    ;

nonCapitalText: 
    (
        (
            (CapitalWord 
                (wss (CapitalWord | nonCapitalWord))*
            ) wss nonCapitalWord
        )
    |
        nonCapitalWord
        (wss (CapitalWord | nonCapitalWord))* 
    )
    ;

