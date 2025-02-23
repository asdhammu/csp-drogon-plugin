// This is a generated file. Not intended for manual editing.
package com.asdhammu.cspdrogon.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.asdhammu.cspdrogon.language.psi.CSPDrogonTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.asdhammu.cspdrogon.language.psi.*;

public class CSPDrogonCppContentImpl extends ASTWrapperPsiElement implements CSPDrogonCppContent {

  public CSPDrogonCppContentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CSPDrogonVisitor visitor) {
    visitor.visitCppContent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSPDrogonVisitor) accept((CSPDrogonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSPDrogonCppControlBlock getCppControlBlock() {
    return findChildByClass(CSPDrogonCppControlBlock.class);
  }

  @Override
  @Nullable
  public CSPDrogonStreamExpression getStreamExpression() {
    return findChildByClass(CSPDrogonStreamExpression.class);
  }

}
