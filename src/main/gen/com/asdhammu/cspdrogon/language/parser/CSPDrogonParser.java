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
  // item_*
  static boolean CSPDirectiveFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CSPDirectiveFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CSPDirectiveFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // view_directive | layout_directive | param_directive
  public static boolean csp_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "csp_directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CSP_DIRECTIVE, "<csp directive>");
    r = view_directive(b, l + 1);
    if (!r) r = layout_directive(b, l + 1);
    if (!r) r = param_directive(b, l + 1);
    exit_section_(b, l, m, r, false, CSPDrogonParser::directive_recover);
    return r;
  }

  /* ********************************************************** */
  // WHITE_SPACE* file_reference WHITE_SPACE* DIRECTIVE_END
  static boolean directive_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_content")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = directive_content_0(b, l + 1);
    r = r && file_reference(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, directive_content_2(b, l + 1));
    r = p && consumeToken(b, DIRECTIVE_END) && r;
    exit_section_(b, l, m, r, p, CSPDrogonParser::directive_content_recover);
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
  // !(VIEW_START | LAYOUT_START | PARAM_START | DIRECTIVE_END | '<')
  static boolean directive_content_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_content_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !directive_content_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VIEW_START | LAYOUT_START | PARAM_START | DIRECTIVE_END | '<'
  private static boolean directive_content_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_content_recover_0")) return false;
    boolean r;
    r = consumeToken(b, VIEW_START);
    if (!r) r = consumeToken(b, LAYOUT_START);
    if (!r) r = consumeToken(b, PARAM_START);
    if (!r) r = consumeToken(b, DIRECTIVE_END);
    if (!r) r = consumeToken(b, "<");
    return r;
  }

  /* ********************************************************** */
  // !(VIEW_START | LAYOUT_START | PARAM_START | '<')
  static boolean directive_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !directive_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VIEW_START | LAYOUT_START | PARAM_START | '<'
  private static boolean directive_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_recover_0")) return false;
    boolean r;
    r = consumeToken(b, VIEW_START);
    if (!r) r = consumeToken(b, LAYOUT_START);
    if (!r) r = consumeToken(b, PARAM_START);
    if (!r) r = consumeToken(b, "<");
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
  // csp_directive|OTHER
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = csp_directive(b, l + 1);
    if (!r) r = consumeToken(b, OTHER);
    exit_section_(b, m, null, r);
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
  // !(PARAM_START | VIEW_START | LAYOUT_START | PARAM_END | '<')
  static boolean param_content_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_content_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !param_content_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PARAM_START | VIEW_START | LAYOUT_START | PARAM_END | '<'
  private static boolean param_content_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_content_recover_0")) return false;
    boolean r;
    r = consumeToken(b, PARAM_START);
    if (!r) r = consumeToken(b, VIEW_START);
    if (!r) r = consumeToken(b, LAYOUT_START);
    if (!r) r = consumeToken(b, PARAM_END);
    if (!r) r = consumeToken(b, "<");
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
  // WHITE_SPACE* PARAM_VARIABLE_NAME WHITE_SPACE* PARAM_END
  static boolean param_directive_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_directive_content")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = param_directive_content_0(b, l + 1);
    r = r && consumeToken(b, PARAM_VARIABLE_NAME);
    p = r; // pin = 2
    r = r && report_error_(b, param_directive_content_2(b, l + 1));
    r = p && consumeToken(b, PARAM_END) && r;
    exit_section_(b, l, m, r, p, CSPDrogonParser::param_content_recover);
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
