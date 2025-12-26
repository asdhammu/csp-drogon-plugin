package com.asdhammu.cspdrogon.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.LiteralTextEscaper;
import com.intellij.psi.PsiLanguageInjectionHost;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonInjectionHostImpl extends ASTWrapperPsiElement implements PsiLanguageInjectionHost {

    public CSPDrogonInjectionHostImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public boolean isValidHost() {
        return true;
    }

    @Override
    public PsiLanguageInjectionHost updateText(@NotNull String text) {
        return this;
    }

    @Override
    public @NotNull LiteralTextEscaper<? extends PsiLanguageInjectionHost> createLiteralTextEscaper() {
        return new LiteralTextEscaper<PsiLanguageInjectionHost>(this) {
            @Override
            public boolean decode(@NotNull TextRange textRange, @NotNull StringBuilder stringBuilder) {
                stringBuilder.append(textRange.substring(myHost.getText()));
                return true;
            }

            @Override
            public int getOffsetInHost(int i, @NotNull TextRange textRange) {
                int offset = textRange.getStartOffset() + i;
                return offset <= textRange.getEndOffset() ? offset : -1;
            }

            @Override
            public boolean isOneLine() {
                return false;
            }
        };
    }
}
