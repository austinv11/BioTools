package com.austinv11.bio.lang;

import com.austinv11.bio.lang.fasta.FastaLanguageFileType;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class BioFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(FastaLanguageFileType.INSTANCE, "fs;fasta"); //Generic fasta
    }
}
