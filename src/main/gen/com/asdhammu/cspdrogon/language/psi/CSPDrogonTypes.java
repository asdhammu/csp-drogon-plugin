// This is a generated file. Not intended for manual editing.
package com.asdhammu.cspdrogon.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.asdhammu.cspdrogon.language.psi.impl.*;

public interface CSPDrogonTypes {

  IElementType CSP_DIRECTIVE = new CSPDrogonElementType("CSP_DIRECTIVE");
  IElementType FILE_REFERENCE = new CSPDrogonElementType("FILE_REFERENCE");
  IElementType LAYOUT_DIRECTIVE = new CSPDrogonElementType("LAYOUT_DIRECTIVE");
  IElementType PARAM_DIRECTIVE = new CSPDrogonElementType("PARAM_DIRECTIVE");
  IElementType VIEW_DIRECTIVE = new CSPDrogonElementType("VIEW_DIRECTIVE");

  IElementType CSP_EXT = new CSPDrogonTokenType(".csp");
  IElementType DIRECTIVE_END = new CSPDrogonTokenType("%>");
  IElementType FILE_NAME = new CSPDrogonTokenType("FILE_NAME");
  IElementType LAYOUT_START = new CSPDrogonTokenType("<%layout");
  IElementType OTHER = new CSPDrogonTokenType("OTHER");
  IElementType PARAM_END = new CSPDrogonTokenType("]]");
  IElementType PARAM_START = new CSPDrogonTokenType("[[");
  IElementType PARAM_VARIABLE_NAME = new CSPDrogonTokenType("PARAM_VARIABLE_NAME");
  IElementType VIEW_START = new CSPDrogonTokenType("<%view");
  IElementType WHITE_SPACE = new CSPDrogonTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CSP_DIRECTIVE) {
        return new CSPDrogonCspDirectiveImpl(node);
      }
      else if (type == FILE_REFERENCE) {
        return new CSPDrogonFileReferenceImpl(node);
      }
      else if (type == LAYOUT_DIRECTIVE) {
        return new CSPDrogonLayoutDirectiveImpl(node);
      }
      else if (type == PARAM_DIRECTIVE) {
        return new CSPDrogonParamDirectiveImpl(node);
      }
      else if (type == VIEW_DIRECTIVE) {
        return new CSPDrogonViewDirectiveImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
