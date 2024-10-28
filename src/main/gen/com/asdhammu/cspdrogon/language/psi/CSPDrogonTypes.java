// This is a generated file. Not intended for manual editing.
package com.asdhammu.cspdrogon.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.asdhammu.cspdrogon.language.psi.impl.*;

public interface CSPDrogonTypes {

  IElementType CSP_DIRECTIVE = new CSPDrogonElementType("CSP_DIRECTIVE");
  IElementType FILE_REFERENCE = new CSPDrogonElementType("FILE_REFERENCE");
  IElementType HTML_ELEMENT = new CSPDrogonElementType("HTML_ELEMENT");
  IElementType LAYOUT_DIRECTIVE = new CSPDrogonElementType("LAYOUT_DIRECTIVE");
  IElementType PARAM_DIRECTIVE = new CSPDrogonElementType("PARAM_DIRECTIVE");
  IElementType VIEW_DIRECTIVE = new CSPDrogonElementType("VIEW_DIRECTIVE");

  IElementType CSP_EXT = new CSPDrogonTokenType("CSP_EXT");
  IElementType DIRECTIVE_END = new CSPDrogonTokenType("DIRECTIVE_END");
  IElementType FILE_NAME = new CSPDrogonTokenType("FILE_NAME");
  IElementType LAYOUT_START = new CSPDrogonTokenType("LAYOUT_START");
  IElementType PARAM_END = new CSPDrogonTokenType("PARAM_END");
  IElementType PARAM_START = new CSPDrogonTokenType("PARAM_START");
  IElementType PARAM_VARIABLE_NAME = new CSPDrogonTokenType("PARAM_VARIABLE_NAME");
  IElementType VIEW_START = new CSPDrogonTokenType("VIEW_START");
  IElementType WHITE_SPACE = new CSPDrogonTokenType("WHITE_SPACE");
  IElementType XML_ATTRIBUTE_VALUE_END_DELIMITER = new CSPDrogonTokenType("XML_ATTRIBUTE_VALUE_END_DELIMITER");
  IElementType XML_ATTRIBUTE_VALUE_START_DELIMITER = new CSPDrogonTokenType("XML_ATTRIBUTE_VALUE_START_DELIMITER");
  IElementType XML_ATTRIBUTE_VALUE_TOKEN = new CSPDrogonTokenType("XML_ATTRIBUTE_VALUE_TOKEN");
  IElementType XML_CHAR_ENTITY_REF = new CSPDrogonTokenType("XML_CHAR_ENTITY_REF");
  IElementType XML_DATA_CHARACTERS = new CSPDrogonTokenType("XML_DATA_CHARACTERS");
  IElementType XML_EMPTY_ELEMENT_END = new CSPDrogonTokenType("XML_EMPTY_ELEMENT_END");
  IElementType XML_END_TAG_START = new CSPDrogonTokenType("XML_END_TAG_START");
  IElementType XML_ENTITY_REF_TOKEN = new CSPDrogonTokenType("XML_ENTITY_REF_TOKEN");
  IElementType XML_EQ = new CSPDrogonTokenType("XML_EQ");
  IElementType XML_NAME = new CSPDrogonTokenType("XML_NAME");
  IElementType XML_START_TAG_START = new CSPDrogonTokenType("XML_START_TAG_START");
  IElementType XML_TAG_CHARACTERS = new CSPDrogonTokenType("XML_TAG_CHARACTERS");
  IElementType XML_TAG_END = new CSPDrogonTokenType("XML_TAG_END");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CSP_DIRECTIVE) {
        return new CSPDrogonCspDirectiveImpl(node);
      }
      else if (type == FILE_REFERENCE) {
        return new CSPDrogonFileReferenceImpl(node);
      }
      else if (type == HTML_ELEMENT) {
        return new CSPDrogonHtmlElementImpl(node);
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
