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
  // CPP_CONTENT_TOKEN*
  public static boolean cpp_content_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_content_block")) return false;
    Marker m = enter_section_(b, l, _NONE_, CPP_CONTENT_BLOCK, "<cpp content block>");
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, CPP_CONTENT_TOKEN)) break;
      if (!empty_element_parsed_guard_(b, "cpp_content_block", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // CPP_VIEW_START cpp_content_block CPP_VIEW_END
  public static boolean cpp_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cpp_directive")) return false;
    if (!nextTokenIs(b, CPP_VIEW_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CPP_DIRECTIVE, null);
    r = consumeToken(b, CPP_VIEW_START);
    p = r; // pin = 1
    r = r && report_error_(b, cpp_content_block(b, l + 1));
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
  // FILE_NAME DIRECTIVE_END
  static boolean directive_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_content")) return false;
    if (!nextTokenIs(b, FILE_NAME)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, FILE_NAME, DIRECTIVE_END);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // csp_directive | TEMPLATE_DATA | OUTER_ELEMENT_TYPE
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = csp_directive(b, l + 1);
    if (!r) r = consumeToken(b, TEMPLATE_DATA);
    if (!r) r = consumeToken(b, OUTER_ELEMENT_TYPE);
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
  // PARAM_VARIABLE_NAME* PARAM_END
  static boolean param_directive_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_directive_content")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = param_directive_content_0(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, PARAM_END);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // PARAM_VARIABLE_NAME*
  private static boolean param_directive_content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_directive_content_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, PARAM_VARIABLE_NAME)) break;
      if (!empty_element_parsed_guard_(b, "param_directive_content_0", c)) break;
    }
    return true;
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

}
