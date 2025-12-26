// This is a generated file. Not intended for manual editing.
package com.asdhammu.cspdrogon.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLanguageInjectionHost;

public class CSPDrogonVisitor extends PsiElementVisitor {

  public void visitCppContentBlock(@NotNull CSPDrogonCppContentBlock o) {
    visitPsiLanguageInjectionHost(o);
  }

  public void visitCppDirective(@NotNull CSPDrogonCppDirective o) {
    visitPsiElement(o);
  }

  public void visitCppHeaderFile(@NotNull CSPDrogonCppHeaderFile o) {
    visitPsiElement(o);
  }

  public void visitCppIncDirective(@NotNull CSPDrogonCppIncDirective o) {
    visitPsiElement(o);
  }

  public void visitCspDirective(@NotNull CSPDrogonCspDirective o) {
    visitPsiElement(o);
  }

  public void visitLayoutDirective(@NotNull CSPDrogonLayoutDirective o) {
    visitPsiElement(o);
  }

  public void visitParamDirective(@NotNull CSPDrogonParamDirective o) {
    visitPsiElement(o);
  }

  public void visitViewDirective(@NotNull CSPDrogonViewDirective o) {
    visitPsiElement(o);
  }

  public void visitPsiLanguageInjectionHost(@NotNull PsiLanguageInjectionHost o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
