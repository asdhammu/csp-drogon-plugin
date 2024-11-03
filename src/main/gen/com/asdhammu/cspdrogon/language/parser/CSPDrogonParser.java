// This is a generated file. Not intended for manual editing.
package com.asdhammu.cspdrogon.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.asdhammu.cspdrogon.language.psi.CSPDrogonTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CSPDrogonParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return CSPDirectiveFile(b, l + 1);
  }

  /* ********************************************************** */
  // (item_)*
  static boolean CSPDirectiveFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CSPDirectiveFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CSPDirectiveFile_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CSPDirectiveFile", c)) break;
    }
    return true;
  }

  // (item_)
  private static boolean CSPDirectiveFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CSPDirectiveFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = item_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // XML_NAME XML_EQ attributeValue
  static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, XML_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, XML_NAME, XML_EQ);
    r = r && attributeValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // XML_ATTRIBUTE_VALUE_START_DELIMITER XML_ATTRIBUTE_VALUE_TOKEN* XML_ATTRIBUTE_VALUE_END_DELIMITER | XML_ATTRIBUTE_VALUE_TOKEN
  static boolean attributeValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeValue")) return false;
    if (!nextTokenIs(b, "", XML_ATTRIBUTE_VALUE_START_DELIMITER, XML_ATTRIBUTE_VALUE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attributeValue_0(b, l + 1);
    if (!r) r = consumeToken(b, XML_ATTRIBUTE_VALUE_TOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  // XML_ATTRIBUTE_VALUE_START_DELIMITER XML_ATTRIBUTE_VALUE_TOKEN* XML_ATTRIBUTE_VALUE_END_DELIMITER
  private static boolean attributeValue_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeValue_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_ATTRIBUTE_VALUE_START_DELIMITER);
    r = r && attributeValue_0_1(b, l + 1);
    r = r && consumeToken(b, XML_ATTRIBUTE_VALUE_END_DELIMITER);
    exit_section_(b, m, null, r);
    return r;
  }

  // XML_ATTRIBUTE_VALUE_TOKEN*
  private static boolean attributeValue_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeValue_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, XML_ATTRIBUTE_VALUE_TOKEN)) break;
      if (!empty_element_parsed_guard_(b, "attributeValue_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ( html_element
  // | XML_DATA_CHARACTERS
  // | XML_CHAR_ENTITY_REF
  // | XML_TAG_CHARACTERS
  // | XML_ENTITY_REF_TOKEN
  // | WHITE_SPACE
  // )*
  static boolean content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content")) return false;
    while (true) {
      int c = current_position_(b);
      if (!content_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "content", c)) break;
    }
    return true;
  }

  // html_element
  // | XML_DATA_CHARACTERS
  // | XML_CHAR_ENTITY_REF
  // | XML_TAG_CHARACTERS
  // | XML_ENTITY_REF_TOKEN
  // | WHITE_SPACE
  private static boolean content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_0")) return false;
    boolean r;
    r = html_element(b, l + 1);
    if (!r) r = consumeToken(b, XML_DATA_CHARACTERS);
    if (!r) r = consumeToken(b, XML_CHAR_ENTITY_REF);
    if (!r) r = consumeToken(b, XML_TAG_CHARACTERS);
    if (!r) r = consumeToken(b, XML_ENTITY_REF_TOKEN);
    if (!r) r = consumeToken(b, WHITE_SPACE);
    return r;
  }

  /* ********************************************************** */
  // cpp_variable_content
  public static boolean cpp_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_content")) return false;
    if (!nextTokenIs(b, DOLLARSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cpp_variable_content(b, l + 1);
    exit_section_(b, m, CPP_CONTENT, r);
    return r;
  }

  /* ********************************************************** */
  // CPP_VIEW_START cpp_content CPP_VIEW_END
  public static boolean cpp_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_directive")) return false;
    if (!nextTokenIs(b, CPP_VIEW_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CPP_DIRECTIVE, null);
    r = consumeToken(b, CPP_VIEW_START);
    p = r; // pin = 1
    r = r && report_error_(b, cpp_content(b, l + 1));
    r = p && consumeToken(b, CPP_VIEW_END) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // H_FILE_START_DELIMITER H_FILE H_FILE_EXT H_FILE_END_DELIMITER
  public static boolean cpp_header_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_header_file")) return false;
    if (!nextTokenIs(b, H_FILE_START_DELIMITER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, H_FILE_START_DELIMITER, H_FILE, H_FILE_EXT, H_FILE_END_DELIMITER);
    exit_section_(b, m, CPP_HEADER_FILE, r);
    return r;
  }

  /* ********************************************************** */
  // CPP_INCLUDE_START CPP_INCLUDE cpp_header_file CPP_INCLUDE_END
  public static boolean cpp_inc_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_inc_directive")) return false;
    if (!nextTokenIs(b, CPP_INCLUDE_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CPP_INC_DIRECTIVE, null);
    r = consumeTokens(b, 1, CPP_INCLUDE_START, CPP_INCLUDE);
    p = r; // pin = 1
    r = r && report_error_(b, cpp_header_file(b, l + 1));
    r = p && consumeToken(b, CPP_INCLUDE_END) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // DOLLARSIGN CPP_VARIABLE_NAME SEMICOLON
  public static boolean cpp_variable_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_variable_content")) return false;
    if (!nextTokenIs(b, DOLLARSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOLLARSIGN, CPP_VARIABLE_NAME, SEMICOLON);
    exit_section_(b, m, CPP_VARIABLE_CONTENT, r);
    return r;
  }

  /* ********************************************************** */
  // view_directive | layout_directive | param_directive | cpp_directive | cpp_inc_directive
  public static boolean csp_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "csp_directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CSP_DIRECTIVE, "<csp directive>");
    r = view_directive(b, l + 1);
    if (!r) r = layout_directive(b, l + 1);
    if (!r) r = param_directive(b, l + 1);
    if (!r) r = cpp_directive(b, l + 1);
    if (!r) r = cpp_inc_directive(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // WHITE_SPACE* file_reference WHITE_SPACE* DIRECTIVE_END
  static boolean directive_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_content")) return false;
    if (!nextTokenIs(b, "", FILE_NAME, WHITE_SPACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = directive_content_0(b, l + 1);
    r = r && file_reference(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, directive_content_2(b, l + 1));
    r = p && consumeToken(b, DIRECTIVE_END) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // WHITE_SPACE*
  private static boolean directive_content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_content_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "directive_content_0", c)) break;
    }
    return true;
  }

  // WHITE_SPACE*
  private static boolean directive_content_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_content_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "directive_content_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // XML_DOCTYPE_START doctype_content* XML_DOCTYPE_END
  public static boolean doctype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doctype")) return false;
    if (!nextTokenIs(b, XML_DOCTYPE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XML_DOCTYPE_START);
    r = r && doctype_1(b, l + 1);
    r = r && consumeToken(b, XML_DOCTYPE_END);
    exit_section_(b, m, DOCTYPE, r);
    return r;
  }

  // doctype_content*
  private static boolean doctype_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doctype_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!doctype_content(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "doctype_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // XML_NAME | XML_DOCTYPE_PUBLIC | XML_ATTRIBUTE_VALUE_TOKEN
  public static boolean doctype_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doctype_content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOCTYPE_CONTENT, "<doctype content>");
    r = consumeToken(b, XML_NAME);
    if (!r) r = consumeToken(b, XML_DOCTYPE_PUBLIC);
    if (!r) r = consumeToken(b, XML_ATTRIBUTE_VALUE_TOKEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // startEmptyTag XML_EMPTY_ELEMENT_END
  public static boolean empty_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "empty_element")) return false;
    if (!nextTokenIs(b, XML_START_TAG_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = startEmptyTag(b, l + 1);
    r = r && consumeToken(b, XML_EMPTY_ELEMENT_END);
    exit_section_(b, m, EMPTY_ELEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // XML_END_TAG_START XML_NAME XML_TAG_END
  static boolean endTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endTag")) return false;
    if (!nextTokenIs(b, XML_END_TAG_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, XML_END_TAG_START, XML_NAME, XML_TAG_END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FILE_NAME CSP_EXT
  public static boolean file_reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_reference")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FILE_REFERENCE, "<file reference>");
    r = consumeTokens(b, 1, FILE_NAME, CSP_EXT);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, CSPDrogonParser::file_reference_recover);
    return r || p;
  }

  /* ********************************************************** */
  // !(DIRECTIVE_END | WHITE_SPACE)
  static boolean file_reference_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_reference_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !file_reference_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DIRECTIVE_END | WHITE_SPACE
  private static boolean file_reference_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_reference_recover_0")) return false;
    boolean r;
    r = consumeToken(b, DIRECTIVE_END);
    if (!r) r = consumeToken(b, WHITE_SPACE);
    return r;
  }

  /* ********************************************************** */
  // void_element | empty_element | start_tag_element | csp_directive
  public static boolean html_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "html_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HTML_ELEMENT, "<html element>");
    r = void_element(b, l + 1);
    if (!r) r = empty_element(b, l + 1);
    if (!r) r = start_tag_element(b, l + 1);
    if (!r) r = csp_directive(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // html_element | doctype
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = html_element(b, l + 1);
    if (!r) r = doctype(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LAYOUT_START directive_content
  public static boolean layout_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layout_directive")) return false;
    if (!nextTokenIs(b, LAYOUT_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LAYOUT_DIRECTIVE, null);
    r = consumeToken(b, LAYOUT_START);
    p = r; // pin = 1
    r = r && directive_content(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // PARAM_START param_directive_content
  public static boolean param_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_directive")) return false;
    if (!nextTokenIs(b, PARAM_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARAM_DIRECTIVE, null);
    r = consumeToken(b, PARAM_START);
    p = r; // pin = 1
    r = r && param_directive_content(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // WHITE_SPACE* PARAM_VARIABLE_NAME* WHITE_SPACE* PARAM_END
  static boolean param_directive_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_directive_content")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = param_directive_content_0(b, l + 1);
    r = r && param_directive_content_1(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, param_directive_content_2(b, l + 1));
    r = p && consumeToken(b, PARAM_END) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // WHITE_SPACE*
  private static boolean param_directive_content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_directive_content_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "param_directive_content_0", c)) break;
    }
    return true;
  }

  // PARAM_VARIABLE_NAME*
  private static boolean param_directive_content_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_directive_content_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, PARAM_VARIABLE_NAME)) break;
      if (!empty_element_parsed_guard_(b, "param_directive_content_1", c)) break;
    }
    return true;
  }

  // WHITE_SPACE*
  private static boolean param_directive_content_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_directive_content_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "param_directive_content_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // XML_START_TAG_START XML_NAME attribute*
  static boolean startEmptyTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "startEmptyTag")) return false;
    if (!nextTokenIs(b, XML_START_TAG_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, XML_START_TAG_START, XML_NAME);
    r = r && startEmptyTag_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attribute*
  private static boolean startEmptyTag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "startEmptyTag_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "startEmptyTag_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // XML_START_TAG_START XML_NAME attribute* XML_TAG_END
  static boolean startTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "startTag")) return false;
    if (!nextTokenIs(b, XML_START_TAG_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, XML_START_TAG_START, XML_NAME);
    r = r && startTag_2(b, l + 1);
    r = r && consumeToken(b, XML_TAG_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // attribute*
  private static boolean startTag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "startTag_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "startTag_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // startTag content endTag
  public static boolean start_tag_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "start_tag_element")) return false;
    if (!nextTokenIs(b, XML_START_TAG_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = startTag(b, l + 1);
    r = r && content(b, l + 1);
    r = r && endTag(b, l + 1);
    exit_section_(b, m, START_TAG_ELEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // VIEW_START directive_content
  public static boolean view_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "view_directive")) return false;
    if (!nextTokenIs(b, VIEW_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VIEW_DIRECTIVE, null);
    r = consumeToken(b, VIEW_START);
    p = r; // pin = 1
    r = r && directive_content(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // startEmptyTag XML_VOID_ELEMENT_END
  public static boolean void_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "void_element")) return false;
    if (!nextTokenIs(b, XML_START_TAG_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = startEmptyTag(b, l + 1);
    r = r && consumeToken(b, XML_VOID_ELEMENT_END);
    exit_section_(b, m, VOID_ELEMENT, r);
    return r;
  }

}
