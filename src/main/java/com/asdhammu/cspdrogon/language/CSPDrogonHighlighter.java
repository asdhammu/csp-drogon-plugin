package com.asdhammu.cspdrogon.language;

import com.asdhammu.cspdrogon.language.psi.CSPDrogonTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

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

    private static final TextAttributesKey[] LAYOUT_DIRECTIVE_START_KEYS = new TextAttributesKey[]{LAYOUT_DIRECTIVE_START};
    private static final TextAttributesKey[] VIEW_DIRECTIVE_START_KEYS = new TextAttributesKey[]{VIEW_DIRECTIVE_START};
    private static final TextAttributesKey[] DIRECTIVE_END_KEYS = new TextAttributesKey[]{DIRECTIVE_END};
    private static final TextAttributesKey[] FILE_NAME_KEYS = new TextAttributesKey[]{FILE_NAME};
    private static final TextAttributesKey[] PARAM_START_KEYS = new TextAttributesKey[]{PARAM_START};
    private static final TextAttributesKey[] PARAM_END_KEYS = new TextAttributesKey[]{PARAM_END};
    private static final TextAttributesKey[] PARAM_VARIABLE_NAME_KEYS = new TextAttributesKey[]{PARAM_VARIABLE_NAME};

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

        return TextAttributesKey.EMPTY_ARRAY;
    }
}
