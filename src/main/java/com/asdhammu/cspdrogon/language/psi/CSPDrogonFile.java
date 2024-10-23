package com.asdhammu.cspdrogon.language.psi;

import com.asdhammu.cspdrogon.language.CSPDrogonFileType;
import com.asdhammu.cspdrogon.language.CSPDrogonLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class CSPDrogonFile extends PsiFileBase {

    public CSPDrogonFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CSPDrogonLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return CSPDrogonFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "CSP Drogon File";
    }
}
