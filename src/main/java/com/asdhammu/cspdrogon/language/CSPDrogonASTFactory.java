package com.asdhammu.cspdrogon.language;

import com.asdhammu.cspdrogon.language.psi.CSPDrogonOuterElement;
import com.intellij.lang.ASTFactory;
import com.intellij.psi.impl.source.tree.LeafElement;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CSPDrogonASTFactory extends ASTFactory {

    @Override
    public @Nullable LeafElement createLeaf(@NotNull IElementType type, @NotNull CharSequence text) {
        if(type == CSPDrogonParserDefinition.OUTER_ELEMENT_TYPE){
            return new CSPDrogonOuterElement(type, text);
        }
        return super.createLeaf(type, text);
    }
}
