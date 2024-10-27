// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.asdhammu.cspdrogon.language;

import com.asdhammu.cspdrogon.language.psi.CSPDrogonTypes;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static com.asdhammu.cspdrogon.language.CSPDrogonParserDefinition.*;

%%

%class CSPDrogonLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}
RLF=\R
WHITE_SPACE=[ \t\n\x0B\f\r]+
PARAM_NAME=[a-zA-Z_][a-zA-Z0-9_]*

%state IN_DIRECTIVE
%state IN_PARAMETER
%state IN_COMMENT

%%

<YYINITIAL> {
  "<%view"                        { yybegin(IN_DIRECTIVE); return CSPDrogonTypes.VIEW_START; }
  "<%layout"                      { yybegin(IN_DIRECTIVE); return CSPDrogonTypes.LAYOUT_START; }
  "[["                            { yybegin(IN_PARAMETER); return CSPDrogonTypes.PARAM_START;}
  "<!--"                          { yybegin(IN_COMMENT);return CSP_COMMENT_START;}
  {WHITE_SPACE}                   { return TokenType.WHITE_SPACE; }
}

<IN_COMMENT>{
    {PARAM_NAME}                {return CSP_COMMENT_CONTENT;}
    "-->"                       {yybegin(YYINITIAL);return CSP_COMMENT_END;}
    {WHITE_SPACE}              { return TokenType.WHITE_SPACE; }
}

<IN_DIRECTIVE> {
  [a-zA-Z0-9_-]+             { return CSPDrogonTypes.FILE_NAME; }
  ".csp"                     { return CSPDrogonTypes.CSP_EXT; }
  "%>"                       { yybegin(YYINITIAL); return CSPDrogonTypes.DIRECTIVE_END; }
  {WHITE_SPACE}              { return TokenType.WHITE_SPACE; }
}

<IN_PARAMETER>{
 {PARAM_NAME}               {return CSPDrogonTypes.PARAM_VARIABLE_NAME;}
  "]]"                      { yybegin(YYINITIAL); return CSPDrogonTypes.PARAM_END;}
  {WHITE_SPACE}             {return TokenType.WHITE_SPACE;}
}

[^]                               { yybegin(YYINITIAL);return TokenType.BAD_CHARACTER; }