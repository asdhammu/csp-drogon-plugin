package com.asdhammu.cspdrogon.language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class CSPDrogonColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Tag", CSPDrogonHighlighter.TAG),
            new AttributesDescriptor("Parameter", CSPDrogonHighlighter.PARAM),
            new AttributesDescriptor("Comment", CSPDrogonHighlighter.COMMENT),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return null; // Add your icon here
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new CSPDrogonHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "<%view header.csp %>\n" +
                "<!-- This is a comment -->\n" +
                "<div class=\"main\">\n" +
                "    [[username]]\n" +
                "    <%c++ $$<< \"Hello\"; %>\n" +
                "</div>";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "CSP Drogon";
    }
}
