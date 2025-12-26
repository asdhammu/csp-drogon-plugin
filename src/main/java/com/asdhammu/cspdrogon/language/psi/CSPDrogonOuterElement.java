package com.asdhammu.cspdrogon.language.psi;

import com.intellij.psi.templateLanguages.OuterLanguageElementImpl;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonOuterElement extends OuterLanguageElementImpl {
    public CSPDrogonOuterElement(@NotNull IElementType type, @NotNull CharSequence text) {
        super(type, text);
    }
}
