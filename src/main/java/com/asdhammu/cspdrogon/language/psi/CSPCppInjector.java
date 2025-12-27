package com.asdhammu.cspdrogon.language.psi;

import com.intellij.lang.Language;
import com.intellij.lang.injection.MultiHostInjector;
import com.intellij.lang.injection.MultiHostRegistrar;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSPCppInjector implements MultiHostInjector {
    public void getLanguagesToInject(@NotNull MultiHostRegistrar registrar, @NotNull PsiElement host) {
        if (!(host instanceof CSPDrogonCppContentBlock)) return;

        PsiFile file = host.getContainingFile();
        // Gather all C++ blocks in the file
        List<CSPDrogonCppContentBlock> allBlocks = new ArrayList<>(
                PsiTreeUtil.findChildrenOfType(file, CSPDrogonCppContentBlock.class)
        );
        if (allBlocks.isEmpty() || allBlocks.getFirst() != host) return;

        Language cppLanguage = Language.findLanguageByID("C++");
        if (cppLanguage == null) {
            // Fallback to Objective-C
            cppLanguage = Language.findLanguageByID("ObjectiveC");
            if (cppLanguage == null) return;
        };

        // Prefixes ensure the code is wrapped in a valid function scope
        String prefix = "void __dummy_func() { ";
        String suffix = " }";

        registrar.startInjecting(cppLanguage);
        for (int i = 0; i < allBlocks.size(); i++) {
            CSPDrogonCppContentBlock block = allBlocks.get(i);
            registrar.addPlace(
                    (i == 0) ? prefix : null, // Prefix only the very first fragment
                    (i == allBlocks.size() - 1) ? suffix : null, // Suffix only the very last fragment
                    (PsiLanguageInjectionHost) block,
                    new TextRange(0, block.getTextLength())
            );
        }
        registrar.doneInjecting();
    }

    @Override
    public @NotNull List<? extends Class<? extends PsiElement>> elementsToInjectIn() {
        return Collections.singletonList(CSPDrogonCppContentBlock.class);
    }
}
