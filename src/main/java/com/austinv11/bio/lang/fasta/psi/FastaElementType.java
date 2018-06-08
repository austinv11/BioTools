package com.austinv11.bio.lang.fasta.psi;

import com.austinv11.bio.lang.fasta.FastaLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class FastaElementType extends IElementType {
    public FastaElementType(@NotNull @NonNls String debugName) {
        super(debugName, FastaLanguage.INSTANCE);
    }
}
