// This is a generated file. Not intended for manual editing.
package com.asdhammu.cspdrogon.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.asdhammu.cspdrogon.language.psi.impl.*;

public interface CSPDrogonTypes {

  IElementType CPP_CONTENT_BLOCK = new CSPDrogonElementType("CPP_CONTENT_BLOCK");
  IElementType CPP_DIRECTIVE = new CSPDrogonElementType("CPP_DIRECTIVE");
  IElementType CPP_HEADER_FILE = new CSPDrogonElementType("CPP_HEADER_FILE");
  IElementType CPP_INC_DIRECTIVE = new CSPDrogonElementType("CPP_INC_DIRECTIVE");
  IElementType CSP_DIRECTIVE = new CSPDrogonElementType("CSP_DIRECTIVE");
  IElementType LAYOUT_DIRECTIVE = new CSPDrogonElementType("LAYOUT_DIRECTIVE");
  IElementType PARAM_DIRECTIVE = new CSPDrogonElementType("PARAM_DIRECTIVE");
  IElementType VIEW_DIRECTIVE = new CSPDrogonElementType("VIEW_DIRECTIVE");
  IElementType VIEW_FILE_PATH = new CSPDrogonElementType("VIEW_FILE_PATH");

  IElementType CPP_CONTENT_TOKEN = new CSPDrogonTokenType("CPP_CONTENT_TOKEN");
  IElementType CPP_INCLUDE = new CSPDrogonTokenType("CPP_INCLUDE");
  IElementType CPP_INCLUDE_END = new CSPDrogonTokenType("CPP_INCLUDE_END");
  IElementType CPP_INCLUDE_START = new CSPDrogonTokenType("CPP_INCLUDE_START");
  IElementType CPP_VIEW_END = new CSPDrogonTokenType("CPP_VIEW_END");
  IElementType CPP_VIEW_START = new CSPDrogonTokenType("CPP_VIEW_START");
  IElementType DIRECTIVE_END = new CSPDrogonTokenType("DIRECTIVE_END");
  IElementType FILE_NAME = new CSPDrogonTokenType("FILE_NAME");
  IElementType H_FILE = new CSPDrogonTokenType("H_FILE");
  IElementType H_FILE_END_DELIMITER = new CSPDrogonTokenType("H_FILE_END_DELIMITER");
  IElementType H_FILE_EXT = new CSPDrogonTokenType("H_FILE_EXT");
  IElementType H_FILE_START_DELIMITER = new CSPDrogonTokenType("H_FILE_START_DELIMITER");
  IElementType LAYOUT_START = new CSPDrogonTokenType("LAYOUT_START");
  IElementType OUTER_ELEMENT_TYPE = new CSPDrogonTokenType("OUTER_ELEMENT_TYPE");
  IElementType PARAM_END = new CSPDrogonTokenType("PARAM_END");
  IElementType PARAM_START = new CSPDrogonTokenType("PARAM_START");
  IElementType PARAM_VARIABLE_NAME = new CSPDrogonTokenType("PARAM_VARIABLE_NAME");
  IElementType TEMPLATE_DATA = new CSPDrogonTokenType("TEMPLATE_DATA");
  IElementType VIEW_START = new CSPDrogonTokenType("VIEW_START");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CPP_CONTENT_BLOCK) {
        return new CSPDrogonCppContentBlockImpl(node);
      }
      else if (type == CPP_DIRECTIVE) {
        return new CSPDrogonCppDirectiveImpl(node);
      }
      else if (type == CPP_HEADER_FILE) {
        return new CSPDrogonCppHeaderFileImpl(node);
      }
      else if (type == CPP_INC_DIRECTIVE) {
        return new CSPDrogonCppIncDirectiveImpl(node);
      }
      else if (type == CSP_DIRECTIVE) {
        return new CSPDrogonCspDirectiveImpl(node);
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
      else if (type == VIEW_FILE_PATH) {
        return new CSPDrogonViewFilePathImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
