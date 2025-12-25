package com.asdhammu.cspdrogon.language;

import com.intellij.ide.highlighter.HtmlFileHighlighter;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CSPDrogonSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

    private static final Language HTML = Language.findLanguageByID("HTML");

    @Override
    public @NotNull SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
        // If we can determine the context via the FileViewProvider, we can delegate to HTML
        /*if (project != null && virtualFile != null) {
            PsiManager psiManager = PsiManager.getInstance(project);
            FileViewProvider viewProvider = psiManager.findViewProvider(virtualFile);

            if (viewProvider instanceof CSPDrogonFileViewProvider) {
                // If the IDE is specifically asking for the template data language's highlighter
                // Note: The IDE usually manages the "layering" of highlighters automatically
                // when using MultiplePsiFilesPerDocumentFileViewProvider.
                if (viewProvider.getLanguages().contains(HTML)) {
                    // We return our custom highlighter as the primary one.
                    // The HTML highlighting is merged by the IDE's template system.
                    return new CSPDrogonHighlighter();
                }
            }
        }*/

        // Default to our custom CSP highlighter to ensure directives are colored
        return new CSPDrogonHighlighter();
    }
}
