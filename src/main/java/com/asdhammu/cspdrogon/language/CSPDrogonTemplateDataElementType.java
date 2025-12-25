package com.asdhammu.cspdrogon.language;

import com.intellij.lang.Language;
import com.intellij.psi.templateLanguages.TemplateDataElementType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonTemplateDataElementType extends TemplateDataElementType {
    public CSPDrogonTemplateDataElementType(@NonNls String debugName, Language language, @NotNull IElementType templateElementType, @NotNull IElementType outerElementType) {
        super(debugName, language, templateElementType, outerElementType);
    }
}
