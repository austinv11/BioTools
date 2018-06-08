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

public class FastaContentImpl extends ASTWrapperPsiElement implements FastaContent {

  public FastaContentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FastaVisitor visitor) {
    visitor.visitContent(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FastaVisitor) accept((FastaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FastaSequenceLine> getSequenceLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FastaSequenceLine.class);
  }

}
