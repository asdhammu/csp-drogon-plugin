package com.asdhammu.cspdrogon.language;

import com.intellij.lexer.FlexAdapter;

public class CSPDrogonLexerAdaptor extends FlexAdapter {
    public CSPDrogonLexerAdaptor() {
        super(new CSPDrogonLexer(null));
    }
}
