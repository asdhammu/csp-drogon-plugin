package com.asdhammu.cspdrogon.language;

import com.intellij.lang.Language;
import com.intellij.lang.LanguageParserDefinitions;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.MultiplePsiFilesPerDocumentFileViewProvider;
import com.intellij.psi.PsiManager;
import com.intellij.psi.impl.source.PsiFileImpl;
import com.intellij.psi.templateLanguages.TemplateLanguageFileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public class CSPDrogonFileViewProvider extends MultiplePsiFilesPerDocumentFileViewProvider implements TemplateLanguageFileViewProvider {

    private static final Language HTML = Language.findLanguageByID("HTML");

    public CSPDrogonFileViewProvider(PsiManager manager, VirtualFile virtualFile, boolean eventSystemEnabled) {
        super(manager, virtualFile, eventSystemEnabled);
    }

    @NotNull @Override
    public Language getBaseLanguage() { return CSPDrogonLanguage.INSTANCE; }

    @NotNull @Override
    public Language getTemplateDataLanguage() { return HTML != null ? HTML : Language.ANY; }

    @NotNull @Override
    public Set<Language> getLanguages() { return Set.of(getBaseLanguage(), getTemplateDataLanguage()); }

    @Override
    protected @NotNull MultiplePsiFilesPerDocumentFileViewProvider cloneInner(@NotNull VirtualFile virtualFile) {
        return new CSPDrogonFileViewProvider(getManager(), virtualFile, false);
    }

    @Override
    protected @Nullable PsiFileImpl createFile(@NotNull Language lang) {
        if (lang == getBaseLanguage()) {
            return (PsiFileImpl) LanguageParserDefinitions.INSTANCE.forLanguage(lang).createFile(this);
        }
        if (lang.isKindOf(getTemplateDataLanguage())) {
            PsiFileImpl file = (PsiFileImpl) LanguageParserDefinitions.INSTANCE.forLanguage(lang).createFile(this);
            // Link the HTML tree to the template filter
            file.setContentElementType(CSPDrogonParserDefinition.TEMPLATE_DATA);
            return file;
        }
        return null;
    }
}
