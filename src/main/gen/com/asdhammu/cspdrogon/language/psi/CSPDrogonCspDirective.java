// This is a generated file. Not intended for manual editing.
package com.asdhammu.cspdrogon.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ContributedReferenceHost;

public interface CSPDrogonCspDirective extends ContributedReferenceHost {

  @Nullable
  CSPDrogonCppDirective getCppDirective();

  @Nullable
  CSPDrogonCppIncDirective getCppIncDirective();

  @Nullable
  CSPDrogonLayoutDirective getLayoutDirective();

  @Nullable
  CSPDrogonParamDirective getParamDirective();

  @Nullable
  CSPDrogonViewDirective getViewDirective();

}
