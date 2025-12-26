package com.asdhammu.cspdrogon.language;

import com.asdhammu.cspdrogon.language.psi.CSPDrogonTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class CSPDrogonHighlighter extends SyntaxHighlighterBase {

    // Define color keys
    public static final TextAttributesKey TAG =
            createTextAttributesKey("CSP_TAG", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey PARAM =
            createTextAttributesKey("CSP_PARAM", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("CSP_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("CSP_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CSPDrogonLexerAdaptor();
    }

    @NotNull
    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CSPDrogonTypes.VIEW_START) ||
                tokenType.equals(CSPDrogonTypes.LAYOUT_START) ||
                tokenType.equals(CSPDrogonTypes.CPP_VIEW_START) ||
                tokenType.equals(CSPDrogonTypes.CPP_VIEW_END) ||
                tokenType.equals(CSPDrogonTypes.DIRECTIVE_END)) {
            return new TextAttributesKey[]{TAG};
        }
        if (tokenType.equals(CSPDrogonTypes.PARAM_START) ||
                tokenType.equals(CSPDrogonTypes.PARAM_END) ||
                tokenType.equals(CSPDrogonTypes.PARAM_VARIABLE_NAME)) {
            return new TextAttributesKey[]{PARAM};
        }
        if (tokenType.equals(CSPDrogonParserDefinition.CSP_COMMENT_START) ||
                tokenType.equals(CSPDrogonParserDefinition.CSP_COMMENT_CONTENT) ||
                tokenType.equals(CSPDrogonParserDefinition.CSP_COMMENT_END)) {
            return new TextAttributesKey[]{COMMENT};
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return new TextAttributesKey[]{BAD_CHARACTER};
        }
        return TextAttributesKey.EMPTY_ARRAY;
    }
}
