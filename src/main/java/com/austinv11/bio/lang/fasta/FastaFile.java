package com.austinv11.bio.lang.fasta;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class FastaFile extends PsiFileBase {

    public FastaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, FastaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return FastaLanguageFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "FASTA File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
