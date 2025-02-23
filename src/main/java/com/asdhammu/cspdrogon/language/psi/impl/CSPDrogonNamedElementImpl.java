package com.asdhammu.cspdrogon.language.psi.impl;

import com.asdhammu.cspdrogon.language.psi.CSPDrogonNamedElement;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class CSPDrogonNamedElementImpl extends ASTWrapperPsiElement implements CSPDrogonNamedElement {

    public CSPDrogonNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
