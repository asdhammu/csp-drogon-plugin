// This is a generated file. Not intended for manual editing.
package com.asdhammu.cspdrogon.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.ContributedReferenceHost;
import com.intellij.psi.PsiLanguageInjectionHost;

public class CSPDrogonVisitor extends PsiElementVisitor {

  public void visitCppContentBlock(@NotNull CSPDrogonCppContentBlock o) {
    visitPsiLanguageInjectionHost(o);
  }

  public void visitCppDirective(@NotNull CSPDrogonCppDirective o) {
    visitContributedReferenceHost(o);
  }

  public void visitCppHeaderFile(@NotNull CSPDrogonCppHeaderFile o) {
    visitContributedReferenceHost(o);
  }

  public void visitCppIncDirective(@NotNull CSPDrogonCppIncDirective o) {
    visitContributedReferenceHost(o);
  }

  public void visitCspDirective(@NotNull CSPDrogonCspDirective o) {
    visitContributedReferenceHost(o);
  }

  public void visitLayoutDirective(@NotNull CSPDrogonLayoutDirective o) {
    visitContributedReferenceHost(o);
  }

  public void visitParamDirective(@NotNull CSPDrogonParamDirective o) {
    visitContributedReferenceHost(o);
  }

  public void visitViewDirective(@NotNull CSPDrogonViewDirective o) {
    visitContributedReferenceHost(o);
  }

  public void visitViewFilePath(@NotNull CSPDrogonViewFilePath o) {
    visitContributedReferenceHost(o);
  }

  public void visitPsiLanguageInjectionHost(@NotNull PsiLanguageInjectionHost o) {
    visitElement(o);
  }

  public void visitContributedReferenceHost(@NotNull ContributedReferenceHost o) {
    visitElement(o);
  }

}
