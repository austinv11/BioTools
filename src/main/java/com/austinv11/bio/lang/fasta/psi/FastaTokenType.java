package com.austinv11.bio.lang.fasta.psi;

import com.austinv11.bio.lang.fasta.FastaLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class FastaTokenType extends IElementType {
    public FastaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, FastaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "FastaTokenType." + super.toString();
    }
}