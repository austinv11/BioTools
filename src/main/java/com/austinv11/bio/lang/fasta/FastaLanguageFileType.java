package com.austinv11.bio.lang.fasta;

import com.austinv11.bio.assets.Icons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class FastaLanguageFileType extends LanguageFileType {

    public static final FastaLanguageFileType INSTANCE = new FastaLanguageFileType();

    private FastaLanguageFileType() {
        super(FastaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Generic FASTA file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "A generic FASTA file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "fasta";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.FASTA_ICON;
    }
}
