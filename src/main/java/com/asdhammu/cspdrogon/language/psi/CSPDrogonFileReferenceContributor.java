package com.asdhammu.cspdrogon.language.psi;

import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceSet;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonFileReferenceContributor extends PsiReferenceContributor {


    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(
                PlatformPatterns.psiElement(CSPDrogonTypes.VIEW_FILE_PATH),
                new PsiReferenceProvider() {
                    @Override
                    public PsiReference @NotNull [] getReferencesByElement(@NotNull PsiElement psiElement, @NotNull ProcessingContext processingContext) {

                        String text = ElementManipulators.getValueText(psiElement);

                        FileReferenceSet referenceSet = new FileReferenceSet(text, psiElement, 0, null, true);
                        return referenceSet.getAllReferences();
                    }
                }
        );
    }
}
