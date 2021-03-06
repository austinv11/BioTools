// This is a generated file. Not intended for manual editing.
package com.austinv11.bio.lang.fasta.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.austinv11.bio.lang.fasta.psi.FastaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.austinv11.bio.lang.fasta.psi.*;

public class FastaSequenceLineImpl extends ASTWrapperPsiElement implements FastaSequenceLine {

  public FastaSequenceLineImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FastaVisitor visitor) {
    visitor.visitSequenceLine(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FastaVisitor) accept((FastaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getGenericFasta() {
    return findNotNullChildByType(GENERIC_FASTA);
  }

}
