package com.asdhammu.cspdrogon.language;

import com.asdhammu.cspdrogon.language.parser.CSPDrogonParser;
import com.asdhammu.cspdrogon.language.psi.CSPDrogonFile;
import com.asdhammu.cspdrogon.language.psi.CSPDrogonTokenSets;
import com.asdhammu.cspdrogon.language.psi.CSPDrogonTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(CSPDrogonLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new CSPDrogonLexerAdaptor();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new CSPDrogonParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return CSPDrogonTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new CSPDrogonFile(viewProvider);
    }
}
