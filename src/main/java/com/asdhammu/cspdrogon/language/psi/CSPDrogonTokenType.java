package com.asdhammu.cspdrogon.language.psi;

import com.asdhammu.cspdrogon.language.CSPDrogonLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonTokenType extends IElementType {
    public CSPDrogonTokenType(@NonNls @NotNull String debugName) {
        super(debugName, CSPDrogonLanguage.INSTANCE);
    }
}
