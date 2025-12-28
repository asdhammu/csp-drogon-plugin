package com.asdhammu.cspdrogon.language.psi.impl;

import com.asdhammu.cspdrogon.language.psi.CSPDrogonViewFilePath;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry;

public class CSPDrogonPsiImplUtil {


    public static PsiReference[] getReferences(CSPDrogonViewFilePath element) {
        return ReferenceProvidersRegistry.getReferencesFromProviders(element);
    }

}
