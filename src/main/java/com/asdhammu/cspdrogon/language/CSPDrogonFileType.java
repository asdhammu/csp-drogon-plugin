package com.asdhammu.cspdrogon.language;


import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CSPDrogonFileType extends LanguageFileType {

    public static final CSPDrogonFileType INSTANCE = new CSPDrogonFileType();

    private CSPDrogonFileType() {
        super(CSPDrogonLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "CSP Drogon";
    }

    @Override
    public @NotNull String getDescription() {
        return "CSP Drogon file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "csp";
    }

    @Override
    public Icon getIcon() {
        return CSPDrogonIcons.FILE;
    }
}
