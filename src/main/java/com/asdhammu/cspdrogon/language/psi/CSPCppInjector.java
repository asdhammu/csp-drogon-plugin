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
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CSPCppInjector implements MultiHostInjector {
    public void getLanguagesToInject(@NotNull MultiHostRegistrar registrar, @NotNull PsiElement host) {
        if (!(host instanceof CSPDrogonCppContentBlock)) return;

        PsiFile file = host.getContainingFile();
        // Gather ALL C++ blocks in the file
        List<CSPDrogonCppContentBlock> allBlocks = new ArrayList<>(
                PsiTreeUtil.findChildrenOfType(file, CSPDrogonCppContentBlock.class)
        );

        // CRITICAL: Only trigger the injection on the FIRST block
        // This allows the registrar to stitch all blocks into one virtual file
        if (allBlocks.isEmpty() || allBlocks.get(0) != host) return;

        Language cppLanguage = Language.findLanguageByID("CPP"); // Ensure this ID is correct for your environment
        if (cppLanguage == null) return;

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

    private List<CSPDrogonCppContentBlock> findAllCppBlocks(PsiFile file) {
        if (file == null) return Collections.emptyList();

        // Recursively finds all elements of the specified type in the file
        Collection<CSPDrogonCppContentBlock> foundBlocks =
                PsiTreeUtil.findChildrenOfType(file, CSPDrogonCppContentBlock.class);

        return new ArrayList<>(foundBlocks);
    }

    @Override
    public @NotNull List<? extends Class<? extends PsiElement>> elementsToInjectIn() {
        return Collections.singletonList(CSPDrogonCppContentBlock.class);
    }
}
