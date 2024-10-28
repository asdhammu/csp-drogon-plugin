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
COMMENT_CONTENT = ([^-] | [-][^-] | [-][-][^>])*

ALPHA=[:letter:]
DIGIT=[0-9]
WHITE_SPACE_CHARS=[ \n\r\t\f\u2028\u2029\u0085]+

TAG_NAME=({ALPHA}|"_"|":")({ALPHA}|{DIGIT}|"_"|":"|"."|"-")*
/* see http://www.w3.org/TR/html5/syntax.html#syntax-attribute-name */
ATTRIBUTE_NAME=([^ \n\r\t\f\"\'<>/=])+

DTD_REF= "\"" [^\"]* "\"" | "'" [^']* "'"
DOCTYPE= "<!" (D|d)(O|o)(C|c)(T|t)(Y|y)(P|p)(E|e)
HTML= (H|h)(T|t)(M|m)(L|l)
PUBLIC= (P|p)(U|u)(B|b)(L|l)(I|i)(C|c)

%state IN_DIRECTIVE
%state IN_PARAMETER
%state IN_COMMENT

%state START_TAG_NAME
%state END_TAG_NAME
%state BEFORE_TAG_ATTRIBUTES
%state TAG_ATTRIBUTES
%state ATTRIBUTE_VALUE_START
%state ATTRIBUTE_VALUE_DQ
%state ATTRIBUTE_VALUE_SQ
%state PROCESSING_INSTRUCTION
%state TAG_CHARACTERS

%%

<YYINITIAL> {
  "<%view"                        { yybegin(IN_DIRECTIVE); return CSPDrogonTypes.VIEW_START; }
  "<%layout"                      { yybegin(IN_DIRECTIVE); return CSPDrogonTypes.LAYOUT_START; }
  "[["                            { yybegin(IN_PARAMETER); return CSPDrogonTypes.PARAM_START;}
  "<!--"                          { yybegin(IN_COMMENT);return CSP_COMMENT_START;}
  "<" {TAG_NAME}                  { yybegin(START_TAG_NAME); yypushback(yylength()); }
  "</" {TAG_NAME}                 { yybegin(END_TAG_NAME); yypushback(yylength()); }
  //"</"                            { return CSPDrogonTypes.XML_END_TAG_START; }
  \\\$                           { return CSPDrogonTypes.XML_DATA_CHARACTERS;}
  {WHITE_SPACE}                   { return TokenType.WHITE_SPACE; }
}

<START_TAG_NAME, TAG_CHARACTERS> "<" { return CSPDrogonTypes.XML_START_TAG_START; }
<YYINITIAL, END_TAG_NAME> "</" { return CSPDrogonTypes.XML_END_TAG_START; }

<START_TAG_NAME, END_TAG_NAME> {TAG_NAME} { yybegin(BEFORE_TAG_ATTRIBUTES); return CSPDrogonTypes.XML_NAME; }

<BEFORE_TAG_ATTRIBUTES, TAG_CHARACTERS> ">" { yybegin(YYINITIAL); return CSPDrogonTypes.XML_TAG_END; }
<BEFORE_TAG_ATTRIBUTES, TAG_CHARACTERS> "/>" { yybegin(YYINITIAL); return CSPDrogonTypes.XML_EMPTY_ELEMENT_END; }
<BEFORE_TAG_ATTRIBUTES> {WHITE_SPACE_CHARS} { yybegin(TAG_ATTRIBUTES); return TokenType.WHITE_SPACE;}
<BEFORE_TAG_ATTRIBUTES, START_TAG_NAME, END_TAG_NAME> [^] { yybegin(YYINITIAL); yypushback(1); break; }

<TAG_CHARACTERS> [^] { return CSPDrogonTypes.XML_TAG_CHARACTERS; }

<TAG_ATTRIBUTES> {
  {ATTRIBUTE_NAME}     { return CSPDrogonTypes.XML_NAME; }
  "/>"                 { yybegin(YYINITIAL); return CSPDrogonTypes.XML_EMPTY_ELEMENT_END; }
  ">"                  { yybegin(YYINITIAL); return CSPDrogonTypes.XML_TAG_END; }
  "="                  { yybegin(ATTRIBUTE_VALUE_START); return CSPDrogonTypes.XML_EQ; }
  "\""                 { yybegin(ATTRIBUTE_VALUE_DQ); return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_START_DELIMITER; }
  "'"                  { yybegin(ATTRIBUTE_VALUE_SQ); return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_START_DELIMITER; }
  {WHITE_SPACE}        {return TokenType.WHITE_SPACE;}
  [^]                  { yybegin(YYINITIAL); yypushback(1); break; }
}

<ATTRIBUTE_VALUE_START> ">" { yybegin(YYINITIAL); return CSPDrogonTypes.XML_TAG_END; }
<ATTRIBUTE_VALUE_START> "/>" { yybegin(YYINITIAL); return CSPDrogonTypes.XML_EMPTY_ELEMENT_END; }

<ATTRIBUTE_VALUE_START> [^ \n\r\t\f'\"\>]([^ \n\r\t\f\>]|(\/[^\>]))* { yybegin(TAG_ATTRIBUTES); return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_TOKEN; }
<ATTRIBUTE_VALUE_START> "\"" { yybegin(ATTRIBUTE_VALUE_DQ); return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_START_DELIMITER; }
<ATTRIBUTE_VALUE_START> "'" { yybegin(ATTRIBUTE_VALUE_SQ); return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_START_DELIMITER; }

<ATTRIBUTE_VALUE_DQ> {
  "\"" { yybegin(TAG_ATTRIBUTES); return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_END_DELIMITER; }
  \\\$ { return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_TOKEN; }
  [^] { return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_TOKEN;}
}

<ATTRIBUTE_VALUE_SQ> {
  "'" { yybegin(TAG_ATTRIBUTES); return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_END_DELIMITER; }
  \\\$ { return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_TOKEN; }
  [^] { return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_TOKEN;}
}

"&lt;" |
"&gt;" |
"&apos;" |
"&quot;" |
"&nbsp;" |
"&amp;" |
"&#"{DIGIT}+";" |
"&#"[xX]({DIGIT}|[a-fA-F])+";" { return CSPDrogonTypes.XML_CHAR_ENTITY_REF; }
"&"{TAG_NAME}";" { return CSPDrogonTypes.XML_ENTITY_REF_TOKEN; }

<YYINITIAL> ([^<&\$# \n\r\t\f]|(\\\$)|(\\#))* { return CSPDrogonTypes.XML_DATA_CHARACTERS; }
<YYINITIAL> [^] { return CSPDrogonTypes.XML_DATA_CHARACTERS; }

<IN_COMMENT>{
    {COMMENT_CONTENT}                {return CSP_COMMENT_CONTENT;}
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