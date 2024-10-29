// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: CSPDrogon.flex

// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.asdhammu.cspdrogon.language;

import com.asdhammu.cspdrogon.language.psi.CSPDrogonTypes;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static com.asdhammu.cspdrogon.language.CSPDrogonParserDefinition.*;


class CSPDrogonLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int IN_DIRECTIVE = 2;
  public static final int IN_PARAMETER = 4;
  public static final int IN_COMMENT = 6;
  public static final int START_TAG_NAME = 8;
  public static final int END_TAG_NAME = 10;
  public static final int BEFORE_TAG_ATTRIBUTES = 12;
  public static final int TAG_ATTRIBUTES = 14;
  public static final int ATTRIBUTE_VALUE_START = 16;
  public static final int ATTRIBUTE_VALUE_DQ = 18;
  public static final int ATTRIBUTE_VALUE_SQ = 20;
  public static final int TAG_CHARACTERS = 22;
  public static final int IN_CPP_DATA = 24;
  public static final int IN_DOCTYPE = 26;
  public static final int START_CPP_INCLUDE = 28;
  public static final int CPP_H_INCLUDE_DELIMITER = 30;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\41\u1f00\1\u0100\1\u2f00\1\u3000\1\u0100\1\u3100\1\u3200"+
    "\1\u3300\1\u3400\1\u1f00\1\u3500\1\u3600\1\u3700\1\u3800\1\u0100"+
    "\1\u3900\1\u3a00\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u1f00"+
    "\1\u4000\1\u4100\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700"+
    "\1\u4800\1\u4900\1\u4a00\1\u4b00\1\u1f00\1\u4c00\1\u4d00\1\u4e00"+
    "\1\u1f00\3\u0100\1\u4f00\1\u5000\1\u5100\12\u1f00\4\u0100\1\u5200"+
    "\17\u1f00\2\u0100\1\u5300\41\u1f00\2\u0100\1\u5400\1\u5500\2\u1f00"+
    "\1\u5600\1\u5700\27\u0100\1\u5800\2\u0100\1\u5900\45\u1f00\1\u0100"+
    "\1\u5a00\1\u5b00\11\u1f00\1\u5c00\27\u1f00\1\u5d00\1\u5e00\1\u5f00"+
    "\1\u6000\11\u1f00\1\u6100\1\u6200\5\u1f00\1\u6300\1\u6400\4\u1f00"+
    "\1\u6500\21\u1f00\246\u0100\1\u6600\20\u0100\1\u6700\1\u6800\25\u0100"+
    "\1\u6900\34\u0100\1\u6a00\14\u1f00\2\u0100\1\u6b00\u0e05\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\2\1\1\2\2\1\22\0\1\1\1\3\1\4"+
    "\1\5\1\6\1\7\1\10\1\11\3\0\1\12\1\0"+
    "\1\13\1\14\1\15\12\16\1\17\1\20\1\21\1\22"+
    "\1\23\2\0\1\24\1\25\1\26\1\27\1\30\1\24"+
    "\1\31\1\32\1\33\2\31\1\34\1\35\1\31\1\36"+
    "\1\37\3\31\1\40\1\41\2\31\1\42\1\43\1\31"+
    "\1\44\1\45\1\46\1\0\1\31\1\0\1\47\1\50"+
    "\1\51\1\52\1\53\1\24\1\54\1\55\1\56\2\31"+
    "\1\57\1\60\1\61\1\62\1\63\1\64\1\31\1\65"+
    "\1\66\1\67\1\70\1\71\1\42\1\72\1\31\12\0"+
    "\1\73\44\0\1\17\12\0\1\17\4\0\1\17\5\0"+
    "\27\17\1\0\37\17\1\0\u01ca\17\4\0\14\17\16\0"+
    "\5\17\7\0\1\17\1\0\1\17\201\0\5\17\1\0"+
    "\2\17\2\0\4\17\1\0\1\17\6\0\1\17\1\0"+
    "\3\17\1\0\1\17\1\0\24\17\1\0\123\17\1\0"+
    "\213\17\10\0\246\17\1\0\46\17\2\0\1\17\6\0"+
    "\51\17\107\0\33\17\4\0\4\17\55\0\53\17\43\0"+
    "\2\17\1\0\143\17\1\0\1\17\17\0\2\17\7\0"+
    "\2\17\12\0\3\17\2\0\1\17\20\0\1\17\1\0"+
    "\36\17\35\0\131\17\13\0\1\17\30\0\41\17\11\0"+
    "\2\17\4\0\1\17\5\0\26\17\4\0\1\17\11\0"+
    "\1\17\3\0\1\17\27\0\31\17\7\0\13\17\65\0"+
    "\25\17\1\0\10\17\106\0\66\17\3\0\1\17\22\0"+
    "\1\17\7\0\12\17\17\0\20\17\4\0\10\17\2\0"+
    "\2\17\2\0\26\17\1\0\7\17\1\0\1\17\3\0"+
    "\4\17\3\0\1\17\20\0\1\17\15\0\2\17\1\0"+
    "\3\17\16\0\2\17\12\0\1\17\10\0\6\17\4\0"+
    "\2\17\2\0\26\17\1\0\7\17\1\0\2\17\1\0"+
    "\2\17\1\0\2\17\37\0\4\17\1\0\1\17\23\0"+
    "\3\17\20\0\11\17\1\0\3\17\1\0\26\17\1\0"+
    "\7\17\1\0\2\17\1\0\5\17\3\0\1\17\22\0"+
    "\1\17\17\0\2\17\27\0\1\17\13\0\10\17\2\0"+
    "\2\17\2\0\26\17\1\0\7\17\1\0\2\17\1\0"+
    "\5\17\3\0\1\17\36\0\2\17\1\0\3\17\17\0"+
    "\1\17\21\0\1\17\1\0\6\17\3\0\3\17\1\0"+
    "\4\17\3\0\2\17\1\0\1\17\1\0\2\17\3\0"+
    "\2\17\3\0\3\17\3\0\14\17\26\0\1\17\64\0"+
    "\10\17\1\0\3\17\1\0\27\17\1\0\20\17\3\0"+
    "\1\17\32\0\3\17\5\0\2\17\36\0\1\17\4\0"+
    "\10\17\1\0\3\17\1\0\27\17\1\0\12\17\1\0"+
    "\5\17\3\0\1\17\40\0\1\17\1\0\2\17\17\0"+
    "\2\17\22\0\10\17\1\0\3\17\1\0\51\17\2\0"+
    "\1\17\20\0\1\17\5\0\3\17\10\0\3\17\30\0"+
    "\6\17\5\0\22\17\3\0\30\17\1\0\11\17\1\0"+
    "\1\17\2\0\7\17\72\0\60\17\1\0\2\17\14\0"+
    "\7\17\72\0\2\17\1\0\1\17\1\0\5\17\1\0"+
    "\30\17\1\0\1\17\1\0\12\17\1\0\2\17\11\0"+
    "\1\17\2\0\5\17\1\0\1\17\25\0\4\17\40\0"+
    "\1\17\77\0\10\17\1\0\44\17\33\0\5\17\163\0"+
    "\53\17\24\0\1\17\20\0\6\17\4\0\4\17\3\0"+
    "\1\17\3\0\2\17\7\0\3\17\4\0\15\17\14\0"+
    "\1\17\21\0\46\17\1\0\1\17\5\0\1\17\2\0"+
    "\53\17\1\0\115\17\1\0\4\17\2\0\7\17\1\0"+
    "\1\17\1\0\4\17\2\0\51\17\1\0\4\17\2\0"+
    "\41\17\1\0\4\17\2\0\7\17\1\0\1\17\1\0"+
    "\4\17\2\0\17\17\1\0\71\17\1\0\4\17\2\0"+
    "\103\17\45\0\20\17\20\0\126\17\2\0\6\17\3\0"+
    "\u016c\17\2\0\21\17\1\0\32\17\5\0\113\17\6\0"+
    "\10\17\7\0\15\17\1\0\4\17\16\0\22\17\16\0"+
    "\22\17\16\0\15\17\1\0\3\17\17\0\64\17\43\0"+
    "\1\17\4\0\1\17\103\0\131\17\7\0\5\17\2\0"+
    "\42\17\1\0\1\17\5\0\106\17\12\0\37\17\61\0"+
    "\36\17\2\0\5\17\13\0\54\17\4\0\32\17\66\0"+
    "\27\17\11\0\65\17\122\0\1\17\135\0\57\17\21\0"+
    "\7\17\67\0\36\17\15\0\2\17\12\0\54\17\32\0"+
    "\44\17\51\0\3\17\12\0\44\17\2\0\11\17\7\0"+
    "\53\17\2\0\3\17\51\0\4\17\1\0\6\17\1\0"+
    "\2\17\3\0\1\17\5\0\300\17\100\0\26\17\2\0"+
    "\6\17\2\0\46\17\2\0\6\17\2\0\10\17\1\0"+
    "\1\17\1\0\1\17\1\0\1\17\1\0\37\17\2\0"+
    "\65\17\1\0\7\17\1\0\1\17\3\0\3\17\1\0"+
    "\7\17\3\0\4\17\2\0\6\17\4\0\15\17\5\0"+
    "\3\17\1\0\7\17\53\0\2\73\107\0\1\17\15\0"+
    "\1\17\20\0\15\17\145\0\1\17\4\0\1\17\2\0"+
    "\12\17\1\0\1\17\3\0\5\17\6\0\1\17\1\0"+
    "\1\17\1\0\1\17\1\0\4\17\1\0\13\17\2\0"+
    "\4\17\5\0\5\17\4\0\1\17\64\0\2\17\u017b\0"+
    "\57\17\1\0\57\17\1\0\205\17\6\0\4\17\3\0"+
    "\2\17\14\0\46\17\1\0\1\17\5\0\1\17\2\0"+
    "\70\17\7\0\1\17\20\0\27\17\11\0\7\17\1\0"+
    "\7\17\1\0\7\17\1\0\7\17\1\0\7\17\1\0"+
    "\7\17\1\0\7\17\1\0\7\17\120\0\1\17\325\0"+
    "\2\17\52\0\5\17\5\0\2\17\4\0\126\17\6\0"+
    "\3\17\1\0\132\17\1\0\4\17\5\0\53\17\1\0"+
    "\136\17\21\0\33\17\65\0\306\17\112\0\360\17\20\0"+
    "\215\17\103\0\56\17\2\0\15\17\3\0\20\17\12\0"+
    "\2\17\24\0\57\17\20\0\37\17\2\0\106\17\61\0"+
    "\11\17\2\0\147\17\2\0\65\17\2\0\5\17\60\0"+
    "\13\17\1\0\3\17\1\0\4\17\1\0\27\17\35\0"+
    "\64\17\16\0\62\17\76\0\6\17\3\0\1\17\1\0"+
    "\2\17\13\0\34\17\12\0\27\17\31\0\35\17\7\0"+
    "\57\17\34\0\1\17\20\0\5\17\1\0\12\17\12\0"+
    "\5\17\1\0\51\17\27\0\3\17\1\0\10\17\24\0"+
    "\27\17\3\0\1\17\3\0\62\17\1\0\1\17\3\0"+
    "\2\17\2\0\5\17\2\0\1\17\1\0\1\17\30\0"+
    "\3\17\2\0\13\17\7\0\3\17\14\0\6\17\2\0"+
    "\6\17\2\0\6\17\11\0\7\17\1\0\7\17\1\0"+
    "\53\17\1\0\14\17\10\0\163\17\35\0\244\17\14\0"+
    "\27\17\4\0\61\17\4\0\156\17\2\0\152\17\46\0"+
    "\7\17\14\0\5\17\5\0\1\17\1\0\12\17\1\0"+
    "\15\17\1\0\5\17\1\0\1\17\1\0\2\17\1\0"+
    "\2\17\1\0\154\17\41\0\153\17\22\0\100\17\2\0"+
    "\66\17\50\0\14\17\164\0\5\17\1\0\207\17\44\0"+
    "\32\17\6\0\32\17\13\0\131\17\3\0\6\17\2\0"+
    "\6\17\2\0\6\17\2\0\3\17\43\0\14\17\1\0"+
    "\32\17\1\0\23\17\1\0\2\17\1\0\17\17\2\0"+
    "\16\17\42\0\173\17\205\0\35\17\3\0\61\17\57\0"+
    "\40\17\15\0\24\17\1\0\10\17\6\0\46\17\12\0"+
    "\36\17\2\0\44\17\4\0\10\17\60\0\236\17\22\0"+
    "\44\17\4\0\44\17\4\0\50\17\10\0\64\17\234\0"+
    "\67\17\11\0\26\17\12\0\10\17\230\0\6\17\2\0"+
    "\1\17\1\0\54\17\1\0\2\17\3\0\1\17\2\0"+
    "\27\17\12\0\27\17\11\0\37\17\101\0\23\17\1\0"+
    "\2\17\12\0\26\17\12\0\32\17\106\0\70\17\6\0"+
    "\2\17\100\0\1\17\17\0\4\17\1\0\3\17\1\0"+
    "\35\17\52\0\35\17\3\0\35\17\43\0\10\17\1\0"+
    "\34\17\33\0\66\17\12\0\26\17\12\0\23\17\15\0"+
    "\22\17\156\0\111\17\67\0\63\17\15\0\63\17\15\0"+
    "\44\17\334\0\35\17\12\0\1\17\10\0\26\17\232\0"+
    "\27\17\14\0\65\17\113\0\55\17\40\0\31\17\32\0"+
    "\44\17\35\0\1\17\13\0\43\17\3\0\1\17\14\0"+
    "\60\17\16\0\4\17\25\0\1\17\1\0\1\17\43\0"+
    "\22\17\1\0\31\17\124\0\7\17\1\0\1\17\1\0"+
    "\4\17\1\0\17\17\1\0\12\17\7\0\57\17\46\0"+
    "\10\17\2\0\2\17\2\0\26\17\1\0\7\17\1\0"+
    "\2\17\1\0\5\17\3\0\1\17\22\0\1\17\14\0"+
    "\5\17\236\0\65\17\22\0\4\17\24\0\1\17\40\0"+
    "\60\17\24\0\2\17\1\0\1\17\270\0\57\17\51\0"+
    "\4\17\44\0\60\17\24\0\1\17\73\0\53\17\15\0"+
    "\1\17\107\0\33\17\345\0\54\17\164\0\100\17\37\0"+
    "\1\17\240\0\10\17\2\0\47\17\20\0\1\17\1\0"+
    "\1\17\34\0\1\17\12\0\50\17\7\0\1\17\25\0"+
    "\1\17\13\0\56\17\23\0\1\17\42\0\71\17\7\0"+
    "\11\17\1\0\45\17\21\0\1\17\61\0\36\17\160\0"+
    "\7\17\1\0\2\17\1\0\46\17\25\0\1\17\31\0"+
    "\6\17\1\0\2\17\1\0\40\17\16\0\1\17\u0147\0"+
    "\23\17\15\0\232\17\346\0\304\17\274\0\57\17\321\0"+
    "\107\17\271\0\71\17\7\0\37\17\161\0\36\17\22\0"+
    "\60\17\20\0\4\17\37\0\25\17\5\0\23\17\260\0"+
    "\100\17\200\0\113\17\5\0\1\17\102\0\15\17\100\0"+
    "\2\17\1\0\1\17\34\0\370\17\10\0\363\17\15\0"+
    "\37\17\61\0\3\17\21\0\4\17\10\0\u018c\17\4\0"+
    "\153\17\5\0\15\17\3\0\11\17\7\0\12\17\146\0"+
    "\125\17\1\0\107\17\1\0\2\17\2\0\1\17\2\0"+
    "\2\17\2\0\4\17\1\0\14\17\1\0\1\17\1\0"+
    "\7\17\1\0\101\17\1\0\4\17\2\0\10\17\1\0"+
    "\7\17\1\0\34\17\1\0\4\17\1\0\5\17\1\0"+
    "\1\17\3\0\7\17\1\0\u0154\17\2\0\31\17\1\0"+
    "\31\17\1\0\37\17\1\0\31\17\1\0\37\17\1\0"+
    "\31\17\1\0\37\17\1\0\31\17\1\0\37\17\1\0"+
    "\31\17\1\0\10\17\64\0\55\17\12\0\7\17\20\0"+
    "\1\17\u0171\0\54\17\24\0\305\17\73\0\104\17\7\0"+
    "\1\17\264\0\4\17\1\0\33\17\1\0\2\17\1\0"+
    "\1\17\2\0\1\17\1\0\12\17\1\0\4\17\1\0"+
    "\1\17\1\0\1\17\6\0\1\17\4\0\1\17\1\0"+
    "\1\17\1\0\1\17\1\0\3\17\1\0\2\17\1\0"+
    "\1\17\2\0\1\17\1\0\1\17\1\0\1\17\1\0"+
    "\1\17\1\0\1\17\1\0\2\17\1\0\1\17\2\0"+
    "\4\17\1\0\7\17\1\0\4\17\1\0\4\17\1\0"+
    "\1\17\1\0\12\17\1\0\21\17\5\0\3\17\1\0"+
    "\5\17\1\0\21\17\104\0\327\17\51\0\65\17\13\0"+
    "\336\17\2\0\u0182\17\16\0\u0131\17\37\0\36\17\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[27648];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\2\0\1\2\14\0\1\1\2\3\5\1\3\4"+
    "\1\5\1\4\1\6\1\4\2\2\1\4\2\7\1\10"+
    "\1\11\1\7\1\12\1\7\1\13\2\14\1\15\1\16"+
    "\1\17\2\20\1\21\1\22\2\21\3\23\2\4\1\24"+
    "\1\25\2\4\1\26\2\4\1\27\2\4\1\30\1\4"+
    "\1\31\10\0\1\32\1\33\1\34\1\35\1\0\1\36"+
    "\1\0\6\2\1\0\1\32\1\37\1\20\1\0\1\40"+
    "\5\0\1\41\1\42\2\0\1\43\13\0\1\44\2\0"+
    "\2\2\1\0\1\43\5\2\1\45\4\0\1\46\2\0"+
    "\1\47\5\0\1\50\1\46\1\2\1\0\1\2\1\51"+
    "\1\14\3\0\1\52\1\53\6\0\1\54\1\55\5\0"+
    "\1\56\1\57\1\60";

  private static int [] zzUnpackAction() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\74\0\170\0\264\0\360\0\u012c\0\u0168\0\u01a4"+
    "\0\u01e0\0\u021c\0\u0258\0\u0294\0\u02d0\0\u030c\0\u0348\0\u0384"+
    "\0\u03c0\0\u03fc\0\u0438\0\u0474\0\u04b0\0\u04ec\0\u0528\0\u0564"+
    "\0\u0474\0\u05a0\0\u04b0\0\u05dc\0\u0618\0\u0654\0\u0690\0\u06cc"+
    "\0\u0708\0\u0744\0\u0474\0\u04b0\0\u0780\0\u0474\0\u07bc\0\u07f8"+
    "\0\u0834\0\u0474\0\u0870\0\u08ac\0\u0474\0\u0474\0\u0474\0\u08e8"+
    "\0\u0924\0\u0474\0\u0474\0\u04b0\0\u0960\0\u0474\0\u04b0\0\u0834"+
    "\0\u099c\0\u09d8\0\u0474\0\u0a14\0\u0a50\0\u0a8c\0\u0474\0\u0ac8"+
    "\0\u0b04\0\u0474\0\u0b40\0\u0b7c\0\u0474\0\u0bb8\0\u0bf4\0\u0c30"+
    "\0\u0c6c\0\u0ca8\0\u0ce4\0\u0d20\0\u0d5c\0\u0d98\0\u0dd4\0\u0e10"+
    "\0\u0e4c\0\u03c0\0\u0474\0\u0e88\0\u0474\0\u0ec4\0\u0f00\0\u0f3c"+
    "\0\u0f78\0\u0fb4\0\u0ff0\0\u102c\0\u1068\0\u0474\0\u0474\0\u10a4"+
    "\0\u10e0\0\u0474\0\u0a50\0\u0a8c\0\u111c\0\u1158\0\u1194\0\u0474"+
    "\0\u0474\0\u11d0\0\u120c\0\u0474\0\u1248\0\u1284\0\u12c0\0\u12fc"+
    "\0\u1338\0\u1374\0\u13b0\0\u13ec\0\u1428\0\u1464\0\u14a0\0\u14dc"+
    "\0\u1518\0\u1554\0\u1590\0\u15cc\0\u1608\0\u06cc\0\u1644\0\u1680"+
    "\0\u16bc\0\u16f8\0\u1734\0\u0474\0\u1770\0\u17ac\0\u17e8\0\u1824"+
    "\0\u0474\0\u1860\0\u189c\0\u0474\0\u18d8\0\u1914\0\u1950\0\u198c"+
    "\0\u19c8\0\u0474\0\u06cc\0\u1a04\0\u1a40\0\u1a7c\0\u0474\0\u0474"+
    "\0\u1ab8\0\u1af4\0\u1b30\0\u0474\0\u0474\0\u1b6c\0\u1ba8\0\u1be4"+
    "\0\u1c20\0\u1c5c\0\u1c98\0\u0474\0\u0474\0\u1cd4\0\u1d10\0\u1d4c"+
    "\0\u1d88\0\u1dc4\0\u0474\0\u0474\0\u0474";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\21\1\22\1\23\2\21\2\24\1\21\1\25\10\21"+
    "\1\26\22\21\1\27\1\30\26\21\1\31\2\22\4\31"+
    "\1\32\1\33\2\31\1\34\1\35\1\31\1\34\5\31"+
    "\20\34\3\31\24\34\2\31\2\22\5\31\1\33\13\31"+
    "\20\36\2\31\1\37\24\36\1\31\10\40\1\41\2\40"+
    "\1\42\60\40\10\43\1\44\6\43\1\45\1\43\1\46"+
    "\2\43\20\45\3\43\24\45\11\43\1\44\6\43\1\45"+
    "\1\43\1\47\2\43\20\45\3\43\24\45\2\43\1\50"+
    "\6\43\1\44\4\43\1\51\5\43\1\52\47\43\1\50"+
    "\1\53\1\22\1\54\1\53\1\55\4\53\1\56\3\53"+
    "\1\51\3\53\1\43\1\57\1\52\50\53\1\60\1\31"+
    "\2\60\1\55\4\60\1\56\3\60\1\61\5\60\1\52"+
    "\50\60\4\62\1\63\3\62\1\64\34\62\1\65\36\62"+
    "\1\64\1\63\33\62\1\65\26\62\10\66\1\67\4\66"+
    "\1\70\3\66\1\46\1\66\1\52\50\66\1\31\2\22"+
    "\3\31\1\71\1\72\1\33\7\31\1\73\3\31\20\74"+
    "\3\31\24\74\2\31\2\22\1\31\1\75\3\31\1\33"+
    "\1\76\11\31\1\77\6\31\1\100\4\31\1\101\15\31"+
    "\1\100\5\31\1\101\11\31\2\22\1\31\1\102\1\103"+
    "\1\31\1\104\1\33\64\31\2\22\1\31\1\105\3\31"+
    "\1\33\3\31\1\106\7\31\20\107\3\31\24\107\1\31"+
    "\1\21\1\0\3\21\2\0\1\21\1\0\10\21\1\0"+
    "\23\21\1\30\26\21\1\0\2\22\71\0\1\21\1\22"+
    "\1\23\2\21\2\0\1\21\1\0\10\21\1\0\23\21"+
    "\1\30\26\21\101\0\1\110\11\0\1\111\4\0\20\111"+
    "\3\0\1\112\4\111\1\113\2\111\1\113\1\111\1\114"+
    "\2\111\1\115\6\111\4\0\1\116\3\0\1\117\5\0"+
    "\1\120\1\0\1\121\4\0\20\121\3\0\24\121\1\0"+
    "\1\21\1\0\3\21\2\0\1\21\1\0\10\21\1\0"+
    "\22\21\1\122\1\30\27\21\1\0\6\21\1\0\10\21"+
    "\1\0\23\21\1\30\26\21\23\0\1\123\63\0\1\34"+
    "\2\0\1\34\5\0\20\34\3\0\24\34\52\0\1\124"+
    "\40\0\1\36\5\0\20\36\3\0\24\36\47\0\1\125"+
    "\25\0\13\40\1\126\65\40\1\127\5\40\1\126\3\40"+
    "\1\130\4\40\20\130\3\40\1\131\4\130\1\132\2\130"+
    "\1\132\1\130\1\133\2\130\1\134\6\130\14\40\1\135"+
    "\60\40\13\0\2\45\1\0\2\45\4\0\20\45\3\0"+
    "\24\45\16\0\1\136\57\0\1\50\71\0\1\50\23\0"+
    "\1\137\50\0\1\53\1\0\2\53\1\0\4\53\1\0"+
    "\3\53\1\0\3\53\3\0\51\53\1\22\1\54\1\53"+
    "\1\0\4\53\1\0\3\53\1\0\3\53\3\0\50\53"+
    "\1\60\1\0\13\60\1\140\5\60\1\0\51\60\1\0"+
    "\13\60\1\140\5\60\1\137\50\60\6\0\1\62\73\0"+
    "\1\141\110\0\1\142\66\0\1\74\5\0\20\74\3\0"+
    "\24\74\1\0\4\143\1\62\67\143\11\144\1\62\62\144"+
    "\40\0\1\145\25\0\1\145\46\0\1\146\25\0\1\146"+
    "\62\0\1\147\40\0\1\150\125\0\1\151\34\0\1\107"+
    "\5\0\20\107\3\0\24\107\17\0\1\152\23\0\1\153"+
    "\44\0\2\111\1\0\2\111\1\154\3\0\20\111\3\0"+
    "\24\111\14\0\2\111\1\0\2\111\1\154\3\0\20\111"+
    "\3\0\11\111\1\155\2\111\1\156\7\111\14\0\2\111"+
    "\1\0\2\111\1\154\3\0\20\111\3\0\17\111\1\157"+
    "\4\111\14\0\2\111\1\0\2\111\1\154\3\0\20\111"+
    "\3\0\1\111\1\160\22\111\14\0\2\111\1\0\2\111"+
    "\1\154\3\0\20\111\3\0\20\111\1\161\3\111\14\0"+
    "\1\162\13\0\1\163\22\0\1\163\72\0\1\164\4\0"+
    "\1\165\1\166\10\0\1\167\22\0\1\170\4\0\20\170"+
    "\3\0\24\170\14\0\2\121\1\0\2\121\4\0\20\121"+
    "\3\0\24\121\66\0\1\171\6\0\13\40\1\172\73\40"+
    "\1\126\2\40\1\173\23\40\1\174\44\40\1\175\1\130"+
    "\1\40\2\130\1\176\3\40\20\130\3\40\24\130\14\40"+
    "\1\175\1\130\1\40\2\130\1\176\3\40\20\130\3\40"+
    "\11\130\1\177\2\130\1\200\7\130\14\40\1\175\1\130"+
    "\1\40\2\130\1\176\3\40\20\130\3\40\17\130\1\201"+
    "\4\130\14\40\1\175\1\130\1\40\2\130\1\176\3\40"+
    "\20\130\3\40\1\130\1\202\22\130\14\40\1\175\1\130"+
    "\1\40\2\130\1\176\3\40\20\130\3\40\20\130\1\203"+
    "\3\130\24\40\1\204\50\40\15\60\1\140\5\60\1\0"+
    "\50\60\21\0\1\205\107\0\1\206\22\0\1\206\40\0"+
    "\1\207\22\0\1\207\104\0\1\210\30\0\1\152\1\0"+
    "\1\211\71\0\1\212\5\0\5\212\16\0\5\212\33\0"+
    "\2\111\1\0\2\111\1\154\3\0\20\111\3\0\14\111"+
    "\1\157\7\111\14\0\2\111\1\0\2\111\1\154\3\0"+
    "\20\111\3\0\13\111\1\213\10\111\14\0\2\111\1\0"+
    "\2\111\1\211\3\0\20\111\3\0\24\111\14\0\2\111"+
    "\1\0\2\111\1\154\3\0\20\111\3\0\16\111\1\155"+
    "\5\111\14\0\2\111\1\0\2\111\1\154\3\0\20\111"+
    "\3\0\13\111\1\113\10\111\14\0\1\214\116\0\1\215"+
    "\23\0\1\215\23\0\1\216\142\0\1\217\61\0\1\220"+
    "\102\0\1\221\30\0\2\170\1\0\2\170\4\0\20\170"+
    "\3\0\24\170\64\0\1\222\10\0\23\40\1\0\63\40"+
    "\1\126\2\40\1\173\1\40\1\223\66\40\1\126\2\40"+
    "\1\224\5\40\5\224\16\40\5\224\33\40\1\225\1\130"+
    "\1\40\2\130\1\176\3\40\20\130\3\40\24\130\14\40"+
    "\1\175\1\130\1\40\2\130\1\176\3\40\20\130\3\40"+
    "\14\130\1\201\7\130\14\40\1\175\1\130\1\40\2\130"+
    "\1\176\3\40\20\130\3\40\13\130\1\226\10\130\14\40"+
    "\1\175\1\130\1\40\2\130\1\223\3\40\20\130\3\40"+
    "\24\130\14\40\1\175\1\130\1\40\2\130\1\176\3\40"+
    "\20\130\3\40\16\130\1\177\5\130\14\40\1\175\1\130"+
    "\1\40\2\130\1\176\3\40\20\130\3\40\13\130\1\132"+
    "\10\130\1\40\21\0\1\227\106\0\1\230\22\0\1\230"+
    "\50\0\1\231\22\0\1\231\65\0\1\232\40\0\1\212"+
    "\1\0\1\211\3\0\5\212\16\0\5\212\33\0\2\111"+
    "\1\0\2\111\1\154\3\0\20\111\3\0\16\111\1\157"+
    "\5\111\27\0\1\233\22\0\1\233\34\0\1\234\132\0"+
    "\1\235\114\0\1\236\54\0\1\237\20\0\13\40\1\126"+
    "\2\40\1\224\1\40\1\223\3\40\5\224\16\40\5\224"+
    "\33\40\2\130\1\40\2\130\1\176\2\40\1\0\20\130"+
    "\3\40\24\130\14\40\1\175\1\130\1\40\2\130\1\176"+
    "\3\40\20\130\3\40\16\130\1\201\5\130\1\40\33\0"+
    "\1\240\22\0\1\240\74\0\1\241\54\0\1\242\25\0"+
    "\1\242\67\0\1\243\102\0\1\244\30\0\1\245\22\0"+
    "\1\245\111\0\1\246\47\0\1\247\26\0\1\247\70\0"+
    "\1\250\56\0\1\251\60\0\1\252\23\0\1\252\76\0"+
    "\1\253\60\0\1\254\50\0\1\255\22\0\1\255\20\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[7680];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\2\0\1\1\14\0\3\1\1\11\4\1\1\11"+
    "\11\1\1\11\2\1\1\11\3\1\1\11\2\1\3\11"+
    "\2\1\2\11\2\1\1\11\4\1\1\11\3\1\1\11"+
    "\2\1\1\11\2\1\1\11\2\1\10\0\3\1\1\11"+
    "\1\0\1\11\1\0\6\1\1\0\2\11\1\1\1\0"+
    "\1\11\5\0\2\11\2\0\1\11\13\0\1\1\2\0"+
    "\2\1\1\0\6\1\1\11\4\0\1\11\2\0\1\11"+
    "\5\0\1\11\2\1\1\0\1\1\2\11\3\0\2\11"+
    "\6\0\2\11\5\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CSPDrogonLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return CSPDrogonTypes.XML_DATA_CHARACTERS;
            }
          // fall through
          case 49: break;
          case 2:
            { return CSP_COMMENT_CONTENT;
            }
          // fall through
          case 50: break;
          case 3:
            { return TokenType.WHITE_SPACE;
            }
          // fall through
          case 51: break;
          case 4:
            { yybegin(YYINITIAL);return TokenType.BAD_CHARACTER;
            }
          // fall through
          case 52: break;
          case 5:
            { return CSPDrogonTypes.FILE_NAME;
            }
          // fall through
          case 53: break;
          case 6:
            { return CSPDrogonTypes.PARAM_VARIABLE_NAME;
            }
          // fall through
          case 54: break;
          case 7:
            { yybegin(YYINITIAL); yypushback(1); break;
            }
          // fall through
          case 55: break;
          case 8:
            { yybegin(BEFORE_TAG_ATTRIBUTES); return CSPDrogonTypes.XML_NAME;
            }
          // fall through
          case 56: break;
          case 9:
            { return CSPDrogonTypes.XML_START_TAG_START;
            }
          // fall through
          case 57: break;
          case 10:
            { yybegin(TAG_ATTRIBUTES); return TokenType.WHITE_SPACE;
            }
          // fall through
          case 58: break;
          case 11:
            { yybegin(YYINITIAL); return CSPDrogonTypes.XML_TAG_END;
            }
          // fall through
          case 59: break;
          case 12:
            { return CSPDrogonTypes.XML_NAME;
            }
          // fall through
          case 60: break;
          case 13:
            { yybegin(ATTRIBUTE_VALUE_DQ); return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_START_DELIMITER;
            }
          // fall through
          case 61: break;
          case 14:
            { yybegin(ATTRIBUTE_VALUE_SQ); return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_START_DELIMITER;
            }
          // fall through
          case 62: break;
          case 15:
            { yybegin(ATTRIBUTE_VALUE_START); return CSPDrogonTypes.XML_EQ;
            }
          // fall through
          case 63: break;
          case 16:
            { yybegin(TAG_ATTRIBUTES); return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_TOKEN;
            }
          // fall through
          case 64: break;
          case 17:
            { return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_TOKEN;
            }
          // fall through
          case 65: break;
          case 18:
            { yybegin(TAG_ATTRIBUTES); return CSPDrogonTypes.XML_ATTRIBUTE_VALUE_END_DELIMITER;
            }
          // fall through
          case 66: break;
          case 19:
            { return CSPDrogonTypes.XML_TAG_CHARACTERS;
            }
          // fall through
          case 67: break;
          case 20:
            { return CSPDrogonTypes.SEMICOLON;
            }
          // fall through
          case 68: break;
          case 21:
            { return CSPDrogonTypes.CPP_VARIABLE_NAME;
            }
          // fall through
          case 69: break;
          case 22:
            { yybegin(YYINITIAL); return CSPDrogonTypes.XML_DOCTYPE_END;
            }
          // fall through
          case 70: break;
          case 23:
            { yybegin(CPP_H_INCLUDE_DELIMITER); return CSPDrogonTypes.H_FILE_START_DELIMITER;
            }
          // fall through
          case 71: break;
          case 24:
            { yybegin(START_CPP_INCLUDE); return CSPDrogonTypes.H_FILE_END_DELIMITER;
            }
          // fall through
          case 72: break;
          case 25:
            { return CSPDrogonTypes.H_FILE;
            }
          // fall through
          case 73: break;
          case 26:
            { return CSPDrogonTypes.XML_END_TAG_START;
            }
          // fall through
          case 74: break;
          case 27:
            { yybegin(START_TAG_NAME); yypushback(yylength());
            }
          // fall through
          case 75: break;
          case 28:
            { yybegin(IN_PARAMETER); return CSPDrogonTypes.PARAM_START;
            }
          // fall through
          case 76: break;
          case 29:
            { yybegin(YYINITIAL); return CSPDrogonTypes.DIRECTIVE_END;
            }
          // fall through
          case 77: break;
          case 30:
            { yybegin(YYINITIAL); return CSPDrogonTypes.PARAM_END;
            }
          // fall through
          case 78: break;
          case 31:
            { yybegin(YYINITIAL); return CSPDrogonTypes.XML_EMPTY_ELEMENT_END;
            }
          // fall through
          case 79: break;
          case 32:
            { yybegin(YYINITIAL); return CSPDrogonTypes.CPP_VIEW_END;
            }
          // fall through
          case 80: break;
          case 33:
            { yybegin(YYINITIAL); return CSPDrogonTypes.CPP_INCLUDE_END;
            }
          // fall through
          case 81: break;
          case 34:
            { return CSPDrogonTypes.H_FILE_EXT;
            }
          // fall through
          case 82: break;
          case 35:
            { return CSPDrogonTypes.XML_ENTITY_REF_TOKEN;
            }
          // fall through
          case 83: break;
          case 36:
            { yybegin(END_TAG_NAME); yypushback(yylength());
            }
          // fall through
          case 84: break;
          case 37:
            { yybegin(YYINITIAL);return CSP_COMMENT_END;
            }
          // fall through
          case 85: break;
          case 38:
            { return CSPDrogonTypes.XML_CHAR_ENTITY_REF;
            }
          // fall through
          case 86: break;
          case 39:
            { yybegin(IN_COMMENT);return CSP_COMMENT_START;
            }
          // fall through
          case 87: break;
          case 40:
            { return CSPDrogonTypes.CSP_EXT;
            }
          // fall through
          case 88: break;
          case 41:
            { return CSPDrogonTypes.DOLLARSIGN;
            }
          // fall through
          case 89: break;
          case 42:
            { yybegin(IN_CPP_DATA); return CSPDrogonTypes.CPP_VIEW_START;
            }
          // fall through
          case 90: break;
          case 43:
            { yybegin(START_CPP_INCLUDE); return CSPDrogonTypes.CPP_INCLUDE_START;
            }
          // fall through
          case 91: break;
          case 44:
            { yybegin(IN_DIRECTIVE); return CSPDrogonTypes.VIEW_START;
            }
          // fall through
          case 92: break;
          case 45:
            { return CSPDrogonTypes.XML_DOCTYPE_PUBLIC;
            }
          // fall through
          case 93: break;
          case 46:
            { yybegin(IN_DIRECTIVE); return CSPDrogonTypes.LAYOUT_START;
            }
          // fall through
          case 94: break;
          case 47:
            { return CSPDrogonTypes.CPP_INCLUDE;
            }
          // fall through
          case 95: break;
          case 48:
            { yybegin(IN_DOCTYPE); return CSPDrogonTypes.XML_DOCTYPE_START;
            }
          // fall through
          case 96: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
