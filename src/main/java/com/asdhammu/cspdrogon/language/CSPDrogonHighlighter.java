package com.asdhammu.cspdrogon.language;

import com.asdhammu.cspdrogon.language.psi.CSPDrogonTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.asdhammu.cspdrogon.language.CSPDrogonParserDefinition.*;

public class CSPDrogonHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey LAYOUT_DIRECTIVE_START =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.LAYOUT_START.toString(), DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VIEW_DIRECTIVE_START =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.VIEW_DIRECTIVE.toString(), DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey DIRECTIVE_END =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.DIRECTIVE_END.toString(), DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey FILE_NAME =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.FILE_NAME.toString(), DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey PARAM_START =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.PARAM_START.toString(), DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey PARAM_END =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.PARAM_END.toString(), DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey PARAM_VARIABLE_NAME =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.PARAM_VARIABLE_NAME.toString(), DefaultLanguageHighlighterColors.IDENTIFIER);

    public static final TextAttributesKey COMMENT =
            TextAttributesKey.createTextAttributesKey(CSP_COMMENT_START.toString(), DefaultLanguageHighlighterColors.BLOCK_COMMENT);

    public static final TextAttributesKey XML_START_TAG =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.XML_START_TAG_START.toString(), DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey XML_NAME =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.XML_NAME.toString(), DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey SEMICOLON_NAME =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.SEMICOLON.toString(), DefaultLanguageHighlighterColors.SEMICOLON);

    public static final TextAttributesKey CPLUS_VARIABLE_Name =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.IDENTIFIER.toString(), DefaultLanguageHighlighterColors.LOCAL_VARIABLE);

    public static final TextAttributesKey CPLUS_VIEW_DIRECTIVE =
            TextAttributesKey.createTextAttributesKey(CSPDrogonTypes.CPP_VIEW_START.toString(), DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);

    private static final TextAttributesKey[] LAYOUT_DIRECTIVE_START_KEYS = new TextAttributesKey[]{LAYOUT_DIRECTIVE_START};
    private static final TextAttributesKey[] VIEW_DIRECTIVE_START_KEYS = new TextAttributesKey[]{VIEW_DIRECTIVE_START};
    private static final TextAttributesKey[] DIRECTIVE_END_KEYS = new TextAttributesKey[]{DIRECTIVE_END};
    private static final TextAttributesKey[] FILE_NAME_KEYS = new TextAttributesKey[]{FILE_NAME};
    private static final TextAttributesKey[] PARAM_START_KEYS = new TextAttributesKey[]{PARAM_START};
    private static final TextAttributesKey[] PARAM_END_KEYS = new TextAttributesKey[]{PARAM_END};
    private static final TextAttributesKey[] PARAM_VARIABLE_NAME_KEYS = new TextAttributesKey[]{PARAM_VARIABLE_NAME};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] XML_START_TAG_KEYS = new TextAttributesKey[]{XML_START_TAG};
    private static final TextAttributesKey[] XML_NAME_KEYS = new TextAttributesKey[]{XML_NAME};

    private static final TextAttributesKey[] SEMICOLON_NAME_KEYS = new TextAttributesKey[]{SEMICOLON_NAME};
    private static final TextAttributesKey[] CPLUS_VARIABLE_NAME_KEYS = new TextAttributesKey[]{CPLUS_VARIABLE_Name};

    private static final TextAttributesKey[] CPLUS_VIEW_DIRECTIVE_KEYS = new TextAttributesKey[]{CPLUS_VIEW_DIRECTIVE};

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new CSPDrogonLexerAdaptor();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CSPDrogonTypes.PARAM_START)) {
            return PARAM_START_KEYS;
        }
        if (tokenType.equals(CSPDrogonTypes.PARAM_END)) {
            return PARAM_END_KEYS;
        }

        if (tokenType.equals(CSPDrogonTypes.PARAM_VARIABLE_NAME)) {
            return PARAM_VARIABLE_NAME_KEYS;
        }

        if (tokenType.equals(CSPDrogonTypes.LAYOUT_START)) {
            return LAYOUT_DIRECTIVE_START_KEYS;
        }

        if (tokenType.equals(CSPDrogonTypes.VIEW_START)) {
            return VIEW_DIRECTIVE_START_KEYS;
        }

        if (tokenType.equals(CSPDrogonTypes.DIRECTIVE_END)) {
            return DIRECTIVE_END_KEYS;
        }

        if (tokenType.equals(CSPDrogonTypes.FILE_NAME)) {
            return FILE_NAME_KEYS;
        }

        if (tokenType.equals(CSP_COMMENT_START) || tokenType.equals(CSP_COMMENT_CONTENT) || tokenType.equals(CSP_COMMENT_END)) {
            return COMMENT_KEYS;
        }

        if (tokenType.equals(CSPDrogonTypes.XML_START_TAG_START) || tokenType.equals(CSPDrogonTypes.XML_END_TAG_START)
                || tokenType.equals(CSPDrogonTypes.XML_TAG_END)) {
            return XML_START_TAG_KEYS;
        }

        if (tokenType.equals(CSPDrogonTypes.XML_NAME)) {
            return XML_NAME_KEYS;
        }

        if (tokenType.equals(CSPDrogonTypes.SEMICOLON)) {
            return SEMICOLON_NAME_KEYS;
        }

        if (tokenType.equals(CSPDrogonTypes.IDENTIFIER)) {
            return CPLUS_VARIABLE_NAME_KEYS;
        }

        if (tokenType.equals(CSPDrogonTypes.CPP_VIEW_START) || tokenType.equals(CSPDrogonTypes.CPP_VIEW_END)) {
            return CPLUS_VIEW_DIRECTIVE_KEYS;
        }

        return TextAttributesKey.EMPTY_ARRAY;
    }
}
