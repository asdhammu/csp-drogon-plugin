/*
package com.asdhammu.cspdrogon.language;

import com.asdhammu.cspdrogon.language.psi.*;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {

        if (element instanceof CSPDrogonStartTagElement) {
            String startTagName = element.getFirstChild().getNextSibling().getText();
            String endTagName = element.getLastChild().getPrevSibling().getText();
            if (startTagName != null && endTagName != null && !startTagName.equals(endTagName)) {
                holder.newAnnotation(HighlightSeverity.ERROR, String.format("Tag %s not closed", startTagName))
                        .range(element.getTextRange())
                        .create();
            }
        }


        if (element instanceof CSPDrogonViewDirective || element instanceof CSPDrogonLayoutDirective) {
            if (!hasDirectiveEnd(element)) {
                holder.newAnnotation(HighlightSeverity.ERROR, "Unclosed directive")
                        .range(element.getTextRange())
                        .create();
            }
        }

        if (element instanceof CSPDrogonParamDirective) {
            if (!hasParameterEnd(element)) {
                holder.newAnnotation(HighlightSeverity.ERROR, "Unclosed parameter")
                        .range(element.getTextRange())
                        .create();
            }
        }

        if (element instanceof CSPDrogonFileReference) {
            if (!hasValidExtension(element)) {
                holder.newAnnotation(HighlightSeverity.ERROR, "File must have .csp extension")
                        .range(element.getTextRange())
                        .create();
            }
        }
    }

    private boolean hasDirectiveEnd(PsiElement element) {
        return element.getNode().findChildByType(CSPDrogonTypes.DIRECTIVE_END) != null;
    }

    private boolean hasParameterEnd(PsiElement element) {
        return element.getNode().findChildByType(CSPDrogonTypes.PARAM_END) != null;
    }

    private boolean hasValidExtension(PsiElement element) {
        return element.getText().endsWith(".csp");
    }
}
*/
