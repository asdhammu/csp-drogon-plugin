package com.asdhammu.cspdrogon.language.psi;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class CSPDrogonFileReference extends PsiReferenceBase<PsiElement> {

    public CSPDrogonFileReference(@NotNull PsiElement element) {
        super(element, ElementManipulators.getValueTextRange(element));
    }

    @Override
    public Object @NotNull [] getVariants() {

        Project project = myElement.getProject();

        Collection<VirtualFile> virtualFiles = FilenameIndex
                .getAllFilesByExt(project, "csp", GlobalSearchScope.projectScope(project));
        List<LookupElement> variants = new ArrayList<>();
        for (VirtualFile virtualFile : virtualFiles) {
            variants.add(LookupElementBuilder
                    .create(virtualFile.getName())
                    .withIcon(AllIcons.FileTypes.Custom)
                    .withTypeText("CSP View")
                    .withCaseSensitivity(false)
            );
        }
        return variants.toArray();
    }

    @Override
    public @Nullable PsiElement resolve() {

        String fileName = ElementManipulators.getValueText(getElement());
        Project project = myElement.getProject();
        Collection<VirtualFile> virtualFiles = FilenameIndex.getVirtualFilesByName(
                fileName,
                GlobalSearchScope.allScope(project)
        );

        return virtualFiles.stream()
                .map(virtualFile -> PsiManager.getInstance(project).findFile(virtualFile))
                .filter(Objects::nonNull)
                .filter(psiFile -> psiFile instanceof CSPDrogonFile)
                .findFirst()
                .orElse(null);
    }
}
