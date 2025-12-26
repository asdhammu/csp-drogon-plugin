package com.asdhammu.cspdrogon.language;

import com.asdhammu.cspdrogon.language.parser.CSPDrogonParser;
import com.asdhammu.cspdrogon.language.psi.CSPDrogonFile;
import com.asdhammu.cspdrogon.language.psi.CSPDrogonTokenType;
import com.asdhammu.cspdrogon.language.psi.CSPDrogonTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonParserDefinition implements ParserDefinition {

    // Comment tokens
    public static final IElementType CSP_COMMENT_START = new CSPDrogonTokenType("CSP_COMMENT_START");
    public static final IElementType CSP_COMMENT_CONTENT = new CSPDrogonTokenType("CSP_COMMENT_CONTENT");
    public static final IElementType CSP_COMMENT_END = new CSPDrogonTokenType("CSP_COMMENT_END");


    public static final IFileElementType FILE = new IFileElementType(CSPDrogonLanguage.INSTANCE);

    // Marks tokens that HTML should ignore
    public static final IElementType OUTER_ELEMENT_TYPE = new CSPDrogonTokenType("OUTER_ELEMENT_TYPE");

    // The filter that separates HTML content from CSP/C++
    public static final IElementType TEMPLATE_DATA = new CSPDrogonTemplateDataElementType(
            "CSP_TEMPLATE_DATA",
            CSPDrogonLanguage.INSTANCE,
            CSPDrogonTypes.TEMPLATE_DATA,
            OUTER_ELEMENT_TYPE
    );

    @Override
    public @NotNull Lexer createLexer(Project project) { return new CSPDrogonLexerAdaptor(); }

    @Override
    public @NotNull PsiParser createParser(Project project) { return new CSPDrogonParser(); }

    @Override
    public @NotNull IFileElementType getFileNodeType() { return FILE; }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return TokenSet.create(CSP_COMMENT_START, CSP_COMMENT_CONTENT, CSP_COMMENT_END);
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() { return TokenSet.EMPTY; }

    @Override
    public @NotNull TokenSet getWhitespaceTokens() { return TokenSet.create(TokenType.WHITE_SPACE); }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) { return CSPDrogonTypes.Factory.createElement(node); }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) { return new CSPDrogonFile(viewProvider); }
}