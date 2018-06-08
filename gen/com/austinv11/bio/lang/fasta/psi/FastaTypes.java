// This is a generated file. Not intended for manual editing.
package com.austinv11.bio.lang.fasta.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.austinv11.bio.lang.fasta.psi.impl.*;

public interface FastaTypes {

  IElementType CONTENT = new FastaElementType("CONTENT");
  IElementType DEFINITION = new FastaElementType("DEFINITION");
  IElementType HEADER = new FastaElementType("HEADER");
  IElementType PROPERTIES = new FastaElementType("PROPERTIES");
  IElementType SEQUENCE_LINE = new FastaElementType("SEQUENCE_LINE");

  IElementType GENERIC_FASTA = new FastaTokenType("GENERIC_FASTA");
  IElementType IDENTIFIER = new FastaTokenType("IDENTIFIER");
  IElementType START = new FastaTokenType("START");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CONTENT) {
        return new FastaContentImpl(node);
      }
      else if (type == DEFINITION) {
        return new FastaDefinitionImpl(node);
      }
      else if (type == HEADER) {
        return new FastaHeaderImpl(node);
      }
      else if (type == PROPERTIES) {
        return new FastaPropertiesImpl(node);
      }
      else if (type == SEQUENCE_LINE) {
        return new FastaSequenceLineImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
