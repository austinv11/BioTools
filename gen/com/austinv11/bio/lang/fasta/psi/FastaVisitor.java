// This is a generated file. Not intended for manual editing.
package com.austinv11.bio.lang.fasta.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class FastaVisitor extends PsiElementVisitor {

  public void visitContent(@NotNull FastaContent o) {
    visitPsiElement(o);
  }

  public void visitDefinition(@NotNull FastaDefinition o) {
    visitPsiElement(o);
  }

  public void visitHeader(@NotNull FastaHeader o) {
    visitPsiElement(o);
  }

  public void visitProperties(@NotNull FastaProperties o) {
    visitPsiElement(o);
  }

  public void visitSequenceLine(@NotNull FastaSequenceLine o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
