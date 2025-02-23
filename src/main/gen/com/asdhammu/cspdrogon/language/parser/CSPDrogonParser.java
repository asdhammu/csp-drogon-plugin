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
  // unary_expression (AND unary_expression)*
  static boolean and_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_expression(b, l + 1);
    r = r && and_expression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AND unary_expression)*
  private static boolean and_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!and_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "and_expression_1", c)) break;
    }
    return true;
  }

  // AND unary_expression
  private static boolean and_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && unary_expression(b, l + 1);
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
  // member_expression COMPARISON_OPEARTOR member_expression
  static boolean comparison_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_expression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_expression(b, l + 1);
    r = r && consumeToken(b, COMPARISON_OPEARTOR);
    r = r && member_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // stream_expression | cpp_control_block
  public static boolean cpp_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_CONTENT, "<cpp content>");
    r = stream_expression(b, l + 1);
    if (!r) r = cpp_control_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // cpp_control_block_start | cpp_control_block_end
  public static boolean cpp_control_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_control_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_CONTROL_BLOCK, "<cpp control block>");
    r = cpp_control_block_start(b, l + 1);
    if (!r) r = cpp_control_block_end(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RBRACE (ELSE LBRACE)?
  public static boolean cpp_control_block_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_control_block_end")) return false;
    if (!nextTokenIs(b, RBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RBRACE);
    r = r && cpp_control_block_end_1(b, l + 1);
    exit_section_(b, m, CPP_CONTROL_BLOCK_END, r);
    return r;
  }

  // (ELSE LBRACE)?
  private static boolean cpp_control_block_end_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_control_block_end_1")) return false;
    cpp_control_block_end_1_0(b, l + 1);
    return true;
  }

  // ELSE LBRACE
  private static boolean cpp_control_block_end_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_control_block_end_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, LBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (if_statement | while_statement | for_statement ) LBRACE
  public static boolean cpp_control_block_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_control_block_start")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_CONTROL_BLOCK_START, "<cpp control block start>");
    r = cpp_control_block_start_0(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // if_statement | while_statement | for_statement
  private static boolean cpp_control_block_start_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_control_block_start_0")) return false;
    boolean r;
    r = if_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CPP_VIEW_START cpp_content CPP_VIEW_END
  public static boolean cpp_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_directive")) return false;
    if (!nextTokenIs(b, CPP_VIEW_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_VIEW_START);
    r = r && cpp_content(b, l + 1);
    r = r && consumeToken(b, CPP_VIEW_END);
    exit_section_(b, m, CPP_DIRECTIVE, r);
    return r;
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
  // CPP_TYPE IDENTIFIER (CPP_EQ expression)? SEMICOLON
  static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    if (!nextTokenIs(b, CPP_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CPP_TYPE, IDENTIFIER);
    r = r && declaration_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CPP_EQ expression)?
  private static boolean declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_2")) return false;
    declaration_2_0(b, l + 1);
    return true;
  }

  // CPP_EQ expression
  private static boolean declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_EQ);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
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
  // or_expression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = or_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // declaration | expression
  static boolean for_init(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_init")) return false;
    boolean r;
    r = declaration(b, l + 1);
    if (!r) r = expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // FOR LPAREN for_init? SEMICOLON condition? SEMICOLON for_update? RPAREN
  static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LPAREN);
    r = r && for_statement_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && for_statement_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && for_statement_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // for_init?
  private static boolean for_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_2")) return false;
    for_init(b, l + 1);
    return true;
  }

  // condition?
  private static boolean for_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_4")) return false;
    condition(b, l + 1);
    return true;
  }

  // for_update?
  private static boolean for_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_6")) return false;
    for_update(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expression
  static boolean for_update(PsiBuilder b, int l) {
    return expression(b, l + 1);
  }

  /* ********************************************************** */
  // empty_element | start_tag_element | csp_directive
  public static boolean html_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "html_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HTML_ELEMENT, "<html element>");
    r = empty_element(b, l + 1);
    if (!r) r = start_tag_element(b, l + 1);
    if (!r) r = csp_directive(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IF LPAREN condition RPAREN
  static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAREN);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
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
  // IDENTIFIER (DOT IDENTIFIER (LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN)*)*
  static boolean member_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_expression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && member_expression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT IDENTIFIER (LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN)*)*
  private static boolean member_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!member_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "member_expression_1", c)) break;
    }
    return true;
  }

  // DOT IDENTIFIER (LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN)*
  private static boolean member_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    r = r && member_expression_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN)*
  private static boolean member_expression_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_expression_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!member_expression_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "member_expression_1_0_2", c)) break;
    }
    return true;
  }

  // LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN
  private static boolean member_expression_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_expression_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && member_expression_1_0_2_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IDENTIFIER (COMMA IDENTIFIER)*)?
  private static boolean member_expression_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_expression_1_0_2_0_1")) return false;
    member_expression_1_0_2_0_1_0(b, l + 1);
    return true;
  }

  // IDENTIFIER (COMMA IDENTIFIER)*
  private static boolean member_expression_1_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_expression_1_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && member_expression_1_0_2_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean member_expression_1_0_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_expression_1_0_2_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!member_expression_1_0_2_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "member_expression_1_0_2_0_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean member_expression_1_0_2_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_expression_1_0_2_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // and_expression (OR and_expression)*
  static boolean or_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = and_expression(b, l + 1);
    r = r && or_expression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OR and_expression)*
  private static boolean or_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!or_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "or_expression_1", c)) break;
    }
    return true;
  }

  // OR and_expression
  private static boolean or_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && and_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // comparison_expression
  //         | member_expression
  static boolean primary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    r = comparison_expression(b, l + 1);
    if (!r) r = member_expression(b, l + 1);
    return r;
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
  // STREAM_OBJECT STREAM_OPERATOR IDENTIFIER SEMICOLON
  public static boolean stream_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stream_expression")) return false;
    if (!nextTokenIs(b, STREAM_OBJECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STREAM_OBJECT, STREAM_OPERATOR, IDENTIFIER, SEMICOLON);
    exit_section_(b, m, STREAM_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // NOT? primary_expression | LPAREN expression RPAREN
  static boolean unary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_expression_0(b, l + 1);
    if (!r) r = unary_expression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT? primary_expression
  private static boolean unary_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_expression_0_0(b, l + 1);
    r = r && primary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT?
  private static boolean unary_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_0_0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  // LPAREN expression RPAREN
  private static boolean unary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
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
  // WHILE LPAREN condition RPAREN
  static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE, LPAREN);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

}
