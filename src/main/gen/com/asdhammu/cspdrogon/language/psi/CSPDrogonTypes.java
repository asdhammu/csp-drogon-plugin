// This is a generated file. Not intended for manual editing.
package com.asdhammu.cspdrogon.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.asdhammu.cspdrogon.language.psi.impl.*;

public interface CSPDrogonTypes {

  IElementType CONDITION = new CSPDrogonElementType("CONDITION");
  IElementType CPP_CONTENT = new CSPDrogonElementType("CPP_CONTENT");
  IElementType CPP_CONTROL_BLOCK = new CSPDrogonElementType("CPP_CONTROL_BLOCK");
  IElementType CPP_CONTROL_BLOCK_END = new CSPDrogonElementType("CPP_CONTROL_BLOCK_END");
  IElementType CPP_CONTROL_BLOCK_START = new CSPDrogonElementType("CPP_CONTROL_BLOCK_START");
  IElementType CPP_DIRECTIVE = new CSPDrogonElementType("CPP_DIRECTIVE");
  IElementType CPP_HEADER_FILE = new CSPDrogonElementType("CPP_HEADER_FILE");
  IElementType CPP_INC_DIRECTIVE = new CSPDrogonElementType("CPP_INC_DIRECTIVE");
  IElementType CSP_DIRECTIVE = new CSPDrogonElementType("CSP_DIRECTIVE");
  IElementType DOCTYPE = new CSPDrogonElementType("DOCTYPE");
  IElementType DOCTYPE_CONTENT = new CSPDrogonElementType("DOCTYPE_CONTENT");
  IElementType EMPTY_ELEMENT = new CSPDrogonElementType("EMPTY_ELEMENT");
  IElementType EXPRESSION = new CSPDrogonElementType("EXPRESSION");
  IElementType FILE_REFERENCE = new CSPDrogonElementType("FILE_REFERENCE");
  IElementType HTML_ELEMENT = new CSPDrogonElementType("HTML_ELEMENT");
  IElementType LAYOUT_DIRECTIVE = new CSPDrogonElementType("LAYOUT_DIRECTIVE");
  IElementType PARAM_DIRECTIVE = new CSPDrogonElementType("PARAM_DIRECTIVE");
  IElementType START_TAG_ELEMENT = new CSPDrogonElementType("START_TAG_ELEMENT");
  IElementType STREAM_EXPRESSION = new CSPDrogonElementType("STREAM_EXPRESSION");
  IElementType VIEW_DIRECTIVE = new CSPDrogonElementType("VIEW_DIRECTIVE");

  IElementType AND = new CSPDrogonTokenType("AND");
  IElementType COMMA = new CSPDrogonTokenType("COMMA");
  IElementType COMPARISON_OPEARTOR = new CSPDrogonTokenType("COMPARISON_OPEARTOR");
  IElementType CPP_EQ = new CSPDrogonTokenType("CPP_EQ");
  IElementType CPP_INCLUDE = new CSPDrogonTokenType("CPP_INCLUDE");
  IElementType CPP_INCLUDE_END = new CSPDrogonTokenType("CPP_INCLUDE_END");
  IElementType CPP_INCLUDE_START = new CSPDrogonTokenType("CPP_INCLUDE_START");
  IElementType CPP_TYPE = new CSPDrogonTokenType("CPP_TYPE");
  IElementType CPP_VIEW_END = new CSPDrogonTokenType("CPP_VIEW_END");
  IElementType CPP_VIEW_START = new CSPDrogonTokenType("CPP_VIEW_START");
  IElementType CSP_EXT = new CSPDrogonTokenType("CSP_EXT");
  IElementType DIRECTIVE_END = new CSPDrogonTokenType("DIRECTIVE_END");
  IElementType DOT = new CSPDrogonTokenType("DOT");
  IElementType ELSE = new CSPDrogonTokenType("ELSE");
  IElementType FILE_NAME = new CSPDrogonTokenType("FILE_NAME");
  IElementType FOR = new CSPDrogonTokenType("FOR");
  IElementType H_FILE = new CSPDrogonTokenType("H_FILE");
  IElementType H_FILE_END_DELIMITER = new CSPDrogonTokenType("H_FILE_END_DELIMITER");
  IElementType H_FILE_EXT = new CSPDrogonTokenType("H_FILE_EXT");
  IElementType H_FILE_START_DELIMITER = new CSPDrogonTokenType("H_FILE_START_DELIMITER");
  IElementType IDENTIFIER = new CSPDrogonTokenType("IDENTIFIER");
  IElementType IF = new CSPDrogonTokenType("IF");
  IElementType LAYOUT_START = new CSPDrogonTokenType("LAYOUT_START");
  IElementType LBRACE = new CSPDrogonTokenType("LBRACE");
  IElementType LPAREN = new CSPDrogonTokenType("LPAREN");
  IElementType NOT = new CSPDrogonTokenType("NOT");
  IElementType OR = new CSPDrogonTokenType("OR");
  IElementType PARAM_END = new CSPDrogonTokenType("PARAM_END");
  IElementType PARAM_START = new CSPDrogonTokenType("PARAM_START");
  IElementType PARAM_VARIABLE_NAME = new CSPDrogonTokenType("PARAM_VARIABLE_NAME");
  IElementType RBRACE = new CSPDrogonTokenType("RBRACE");
  IElementType RPAREN = new CSPDrogonTokenType("RPAREN");
  IElementType SEMICOLON = new CSPDrogonTokenType("SEMICOLON");
  IElementType STREAM_OBJECT = new CSPDrogonTokenType("STREAM_OBJECT");
  IElementType STREAM_OPERATOR = new CSPDrogonTokenType("STREAM_OPERATOR");
  IElementType VIEW_START = new CSPDrogonTokenType("VIEW_START");
  IElementType WHILE = new CSPDrogonTokenType("WHILE");
  IElementType WHITE_SPACE = new CSPDrogonTokenType("WHITE_SPACE");
  IElementType XML_ATTRIBUTE_VALUE_END_DELIMITER = new CSPDrogonTokenType("XML_ATTRIBUTE_VALUE_END_DELIMITER");
  IElementType XML_ATTRIBUTE_VALUE_START_DELIMITER = new CSPDrogonTokenType("XML_ATTRIBUTE_VALUE_START_DELIMITER");
  IElementType XML_ATTRIBUTE_VALUE_TOKEN = new CSPDrogonTokenType("XML_ATTRIBUTE_VALUE_TOKEN");
  IElementType XML_CHAR_ENTITY_REF = new CSPDrogonTokenType("XML_CHAR_ENTITY_REF");
  IElementType XML_DATA_CHARACTERS = new CSPDrogonTokenType("XML_DATA_CHARACTERS");
  IElementType XML_DOCTYPE_END = new CSPDrogonTokenType("XML_DOCTYPE_END");
  IElementType XML_DOCTYPE_PUBLIC = new CSPDrogonTokenType("XML_DOCTYPE_PUBLIC");
  IElementType XML_DOCTYPE_START = new CSPDrogonTokenType("XML_DOCTYPE_START");
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
      if (type == CONDITION) {
        return new CSPDrogonConditionImpl(node);
      }
      else if (type == CPP_CONTENT) {
        return new CSPDrogonCppContentImpl(node);
      }
      else if (type == CPP_CONTROL_BLOCK) {
        return new CSPDrogonCppControlBlockImpl(node);
      }
      else if (type == CPP_CONTROL_BLOCK_END) {
        return new CSPDrogonCppControlBlockEndImpl(node);
      }
      else if (type == CPP_CONTROL_BLOCK_START) {
        return new CSPDrogonCppControlBlockStartImpl(node);
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
      else if (type == DOCTYPE) {
        return new CSPDrogonDoctypeImpl(node);
      }
      else if (type == DOCTYPE_CONTENT) {
        return new CSPDrogonDoctypeContentImpl(node);
      }
      else if (type == EMPTY_ELEMENT) {
        return new CSPDrogonEmptyElementImpl(node);
      }
      else if (type == EXPRESSION) {
        return new CSPDrogonExpressionImpl(node);
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
      else if (type == START_TAG_ELEMENT) {
        return new CSPDrogonStartTagElementImpl(node);
      }
      else if (type == STREAM_EXPRESSION) {
        return new CSPDrogonStreamExpressionImpl(node);
      }
      else if (type == VIEW_DIRECTIVE) {
        return new CSPDrogonViewDirectiveImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
