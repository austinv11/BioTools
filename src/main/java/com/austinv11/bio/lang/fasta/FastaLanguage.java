package com.austinv11.bio.lang.fasta;

import com.intellij.lang.Language;

public class FastaLanguage extends Language {

    public static final FastaLanguage INSTANCE = new FastaLanguage();

    private FastaLanguage() {
        super("Generic Fasta");
    }
}
