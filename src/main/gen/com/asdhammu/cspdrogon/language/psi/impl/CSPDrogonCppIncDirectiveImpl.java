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

public class CSPDrogonCppIncDirectiveImpl extends ASTWrapperPsiElement implements CSPDrogonCppIncDirective {

  public CSPDrogonCppIncDirectiveImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CSPDrogonVisitor visitor) {
    visitor.visitCppIncDirective(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSPDrogonVisitor) accept((CSPDrogonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSPDrogonCppHeaderFile getCppHeaderFile() {
    return findChildByClass(CSPDrogonCppHeaderFile.class);
  }

}
