package com.austinv11.bio.lang.fasta;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class FastaLexerAdapter extends FlexAdapter {

    public FastaLexerAdapter() {
        super(new _FastaLexer((Reader) null));
    }
}
