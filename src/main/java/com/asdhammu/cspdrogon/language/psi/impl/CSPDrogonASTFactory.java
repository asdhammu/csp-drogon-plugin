package com.asdhammu.cspdrogon.language.psi.impl;

import com.intellij.lang.DefaultASTFactory;
import com.intellij.psi.impl.source.tree.LeafElement;
import com.intellij.psi.impl.source.tree.PsiCommentImpl;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonASTFactory implements DefaultASTFactory {
    @Override
    public @NotNull LeafElement createComment(@NotNull IElementType iElementType, @NotNull CharSequence charSequence) {
        return new CSPDrogonCommentImpl(iElementType, charSequence);
    }

    public static class CSPDrogonCommentImpl extends PsiCommentImpl {
        public CSPDrogonCommentImpl(@NotNull IElementType type, @NotNull CharSequence text) {
            super(type, text);
        }
    }
}
