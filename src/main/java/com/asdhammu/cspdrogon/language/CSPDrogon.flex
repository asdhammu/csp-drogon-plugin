package com.asdhammu.cspdrogon.language;

import com.asdhammu.cspdrogon.language.psi.CSPDrogonTypes;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static com.asdhammu.cspdrogon.language.CSPDrogonParserDefinition.*;

%%

%unicode


%class CSPDrogonLexer
%implements FlexLexer
%function advance
%type IElementType
%eof{  return;
%eof}

WHITE_SPACE=[ \t\n\x0B\f\r]+
PARAM_NAME=[a-zA-Z_][a-zA-Z0-9_]*
COMMENT_CONTENT = ([^-] | [-][^-] | [-][-][^>])*
// CPP
CPP_INCLUDE = #include

//TEMPLATE_DATA=[^] // Catch-all for everything not matched by specific <%c++ etc.

%state IN_DIRECTIVE
%state IN_PARAMETER
%state IN_COMMENT
%state IN_CPP_DATA
%state START_CPP_INCLUDE
%state CPP_H_INCLUDE_DELIMITER
%%


<YYINITIAL> {
  "<%view"                        { yybegin(IN_DIRECTIVE); return CSPDrogonTypes.VIEW_START; }
  "<%layout"                      { yybegin(IN_DIRECTIVE); return CSPDrogonTypes.LAYOUT_START; }
  "[["                            { yybegin(IN_PARAMETER); return CSPDrogonTypes.PARAM_START;}
  "<!--"                          { yybegin(IN_COMMENT);return CSP_COMMENT_START;}
  "<%inc"                         { yybegin(START_CPP_INCLUDE); return CSPDrogonTypes.CPP_INCLUDE_START;}
  "<%c++"                         { yybegin(IN_CPP_DATA); return CSPDrogonTypes.CPP_VIEW_START; }
  [^]                             { return CSPDrogonTypes.TEMPLATE_DATA; }

}

<START_CPP_INCLUDE> {
   {CPP_INCLUDE}               { return CSPDrogonTypes.CPP_INCLUDE;}
    "\""                       {yybegin(CPP_H_INCLUDE_DELIMITER); return CSPDrogonTypes.H_FILE_START_DELIMITER;}
   "%>"                        { yybegin(YYINITIAL); return CSPDrogonTypes.CPP_INCLUDE_END;}
   {WHITE_SPACE}               { return TokenType.WHITE_SPACE;}
}

<CPP_H_INCLUDE_DELIMITER> {
    {PARAM_NAME}            {return CSPDrogonTypes.H_FILE;}
    ".h"                        {return CSPDrogonTypes.H_FILE_EXT;}
    "\""                        { yybegin(START_CPP_INCLUDE); return CSPDrogonTypes.H_FILE_END_DELIMITER;}
    {WHITE_SPACE}               {return TokenType.WHITE_SPACE;}
}

<IN_CPP_DATA> {
    "%>" {
            yybegin(YYINITIAL);
            return CSPDrogonTypes.CPP_VIEW_END;
        }

        // 2. Match whitespaces explicitly to preserve them for the injector
        [ \t\n\r]+ {
            return CSPDrogonTypes.CPP_CONTENT_TOKEN;
        }

        // 3. Match everything else EXCEPT the start of a closing tag
        // This regex matches:
        // - Any character that is not '%'
        // - A '%' that is NOT followed by a '>'
        ([^%]|%[^>])+ {
            return CSPDrogonTypes.CPP_CONTENT_TOKEN;
        }
}

<IN_COMMENT>{
    {COMMENT_CONTENT}                {return CSP_COMMENT_CONTENT;}
    "-->"                       {yybegin(YYINITIAL);return CSP_COMMENT_END;}
    {WHITE_SPACE}              { return TokenType.WHITE_SPACE; }
}

<IN_DIRECTIVE> {
  [a-zA-Z0-9_\-\./]+\.csp      { return CSPDrogonTypes.FILE_NAME; }
  "%>"                       { yybegin(YYINITIAL); return CSPDrogonTypes.DIRECTIVE_END; }
  {WHITE_SPACE}              { return TokenType.WHITE_SPACE; }
  [^]                               { yybegin(YYINITIAL);return TokenType.BAD_CHARACTER; }
}

<IN_PARAMETER>{
 {PARAM_NAME}               {return CSPDrogonTypes.PARAM_VARIABLE_NAME;}
  "]]"                      { yybegin(YYINITIAL); return CSPDrogonTypes.PARAM_END;}
  {WHITE_SPACE}             {return TokenType.WHITE_SPACE;}
}