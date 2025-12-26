package com.asdhammu.cspdrogon.language;

import com.intellij.lang.Language;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.FileViewProviderFactory;
import com.intellij.psi.PsiManager;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonFileViewProviderFactory implements FileViewProviderFactory {
    @Override
    public @NotNull FileViewProvider createFileViewProvider(
            @NotNull VirtualFile virtualFile,
            Language language,
            @NotNull PsiManager psiManager,
            boolean eventSystemEnabled) {
        return new CSPDrogonFileViewProvider(psiManager, virtualFile, eventSystemEnabled);
    }
}
