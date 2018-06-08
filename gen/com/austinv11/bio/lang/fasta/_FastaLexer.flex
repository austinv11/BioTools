package com.austinv11.bio.lang.fasta;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.austinv11.bio.lang.fasta.psi.FastaTypes.*;

%%

%{
  public _FastaLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _FastaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

IDENTIFIER=(.)+
START=([>;])([ \t\n\x0B\f\r])?
NEW_LINE=(\r\n)|(\n)
GENERIC_FASTA=([a-zA-Z*\-?])+

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }


  {IDENTIFIER}         { return IDENTIFIER; }
  {START}              { return START; }
  {NEW_LINE}           { return NEW_LINE; }
  {GENERIC_FASTA}      { return GENERIC_FASTA; }

}

[^] { return BAD_CHARACTER; }
