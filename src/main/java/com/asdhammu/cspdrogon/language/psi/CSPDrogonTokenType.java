package com.asdhammu.cspdrogon.language.psi;

import com.asdhammu.cspdrogon.language.CSPDrogonLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonTokenType extends IElementType {
    protected CSPDrogonTokenType(@NonNls @NotNull String debugName) {
        super(debugName, CSPDrogonLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CSPDrogonTokenType." + super.toString();
    }
}
