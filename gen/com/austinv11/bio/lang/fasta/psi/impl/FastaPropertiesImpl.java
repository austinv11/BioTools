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

public class FastaPropertiesImpl extends ASTWrapperPsiElement implements FastaProperties {

  public FastaPropertiesImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FastaVisitor visitor) {
    visitor.visitProperties(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FastaVisitor) accept((FastaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @NotNull
  public PsiElement getStart() {
    return findNotNullChildByType(START);
  }

}
