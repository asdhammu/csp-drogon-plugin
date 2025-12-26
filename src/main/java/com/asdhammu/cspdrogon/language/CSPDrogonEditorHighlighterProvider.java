package com.asdhammu.cspdrogon.language;

import com.asdhammu.cspdrogon.language.psi.CSPDrogonTypes;
import com.intellij.ide.highlighter.HtmlFileHighlighter;
import com.intellij.lang.Language;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.ex.util.LayerDescriptor;
import com.intellij.openapi.editor.ex.util.LayeredLexerEditorHighlighter;
import com.intellij.openapi.editor.highlighter.EditorHighlighter;
import com.intellij.openapi.fileTypes.EditorHighlighterProvider;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CSPDrogonEditorHighlighterProvider implements EditorHighlighterProvider {
    @Override
    public EditorHighlighter getEditorHighlighter(@Nullable Project project,
                                                  @NotNull FileType fileType,
                                                  @Nullable VirtualFile virtualFile,
                                                  @NotNull EditorColorsScheme colors) {

        // 1. Create the base highlighters
        LayeredLexerEditorHighlighter highlighter = new LayeredLexerEditorHighlighter(
                new CSPDrogonHighlighter(),
                colors
        );

        // 2. Register the HTML layer
        highlighter.registerLayer(
                CSPDrogonTypes.TEMPLATE_DATA,
                new LayerDescriptor(new HtmlFileHighlighter(), "")
        );

        // using ObjectiveC as there is no cpp language
        Language cppLanguage = Language.findLanguageByID("ObjectiveC");
        if (cppLanguage != null) {
            SyntaxHighlighter cppHighlighter = SyntaxHighlighterFactory.getSyntaxHighlighter(cppLanguage, project, virtualFile);
            if (cppHighlighter != null) {
                highlighter.registerLayer(
                        CSPDrogonTypes.CPP_CONTENT_TOKEN,
                        new LayerDescriptor(cppHighlighter, "")
                );
            }
        }
        return highlighter;
    }
}