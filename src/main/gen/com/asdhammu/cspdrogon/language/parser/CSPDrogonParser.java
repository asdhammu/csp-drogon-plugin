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
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // csp_directive|OTHER
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = csp_directive(b, l + 1);
    if (!r) r = consumeToken(b, OTHER);
    return r;
  }

  /* ********************************************************** */
  // LAYOUT_START WHITE_SPACE* FILE_NAME CSP_EXT WHITE_SPACE* DIRECTIVE_END
  public static boolean layout_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layout_directive")) return false;
    if (!nextTokenIs(b, LAYOUT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LAYOUT_START);
    r = r && layout_directive_1(b, l + 1);
    r = r && consumeTokens(b, 0, FILE_NAME, CSP_EXT);
    r = r && layout_directive_4(b, l + 1);
    r = r && consumeToken(b, DIRECTIVE_END);
    exit_section_(b, m, LAYOUT_DIRECTIVE, r);
    return r;
  }

  // WHITE_SPACE*
  private static boolean layout_directive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layout_directive_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "layout_directive_1", c)) break;
    }
    return true;
  }

  // WHITE_SPACE*
  private static boolean layout_directive_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layout_directive_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "layout_directive_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PARAM_START WHITE_SPACE* PARAM_VARIABLE_NAME WHITE_SPACE* PARAM_END
  public static boolean param_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_directive")) return false;
    if (!nextTokenIs(b, PARAM_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAM_START);
    r = r && param_directive_1(b, l + 1);
    r = r && consumeToken(b, PARAM_VARIABLE_NAME);
    r = r && param_directive_3(b, l + 1);
    r = r && consumeToken(b, PARAM_END);
    exit_section_(b, m, PARAM_DIRECTIVE, r);
    return r;
  }

  // WHITE_SPACE*
  private static boolean param_directive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_directive_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "param_directive_1", c)) break;
    }
    return true;
  }

  // WHITE_SPACE*
  private static boolean param_directive_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_directive_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "param_directive_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VIEW_START WHITE_SPACE* FILE_NAME CSP_EXT WHITE_SPACE* DIRECTIVE_END
  public static boolean view_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "view_directive")) return false;
    if (!nextTokenIs(b, VIEW_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VIEW_START);
    r = r && view_directive_1(b, l + 1);
    r = r && consumeTokens(b, 0, FILE_NAME, CSP_EXT);
    r = r && view_directive_4(b, l + 1);
    r = r && consumeToken(b, DIRECTIVE_END);
    exit_section_(b, m, VIEW_DIRECTIVE, r);
    return r;
  }

  // WHITE_SPACE*
  private static boolean view_directive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "view_directive_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "view_directive_1", c)) break;
    }
    return true;
  }

  // WHITE_SPACE*
  private static boolean view_directive_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "view_directive_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "view_directive_4", c)) break;
    }
    return true;
  }

}
