// This is a generated file. Not intended for manual editing.
package com.austinv11.bio.lang.fasta;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.austinv11.bio.lang.fasta.psi.FastaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FastaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == CONTENT) {
      r = Content(b, 0);
    }
    else if (t == DEFINITION) {
      r = Definition(b, 0);
    }
    else if (t == HEADER) {
      r = Header(b, 0);
    }
    else if (t == PROPERTIES) {
      r = Properties(b, 0);
    }
    else if (t == SEQUENCE_LINE) {
      r = SequenceLine(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return FastaFile(b, l + 1);
  }

  /* ********************************************************** */
  // SequenceLine*
  public static boolean Content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Content")) return false;
    Marker m = enter_section_(b, l, _NONE_, CONTENT, "<content>");
    while (true) {
      int c = current_position_(b);
      if (!SequenceLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Content", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // Header? Content
  public static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = Definition_0(b, l + 1);
    r = r && Content(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Header?
  private static boolean Definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_0")) return false;
    Header(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // !<<eof>> Definition
  static boolean FastaFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FastaFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FastaFile_0(b, l + 1);
    r = r && Definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean FastaFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FastaFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Properties?
  public static boolean Header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Header")) return false;
    Marker m = enter_section_(b, l, _NONE_, HEADER, "<header>");
    Properties(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // START IDENTIFIER?
  public static boolean Properties(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Properties")) return false;
    if (!nextTokenIs(b, START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, START);
    r = r && Properties_1(b, l + 1);
    exit_section_(b, m, PROPERTIES, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean Properties_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Properties_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // GENERIC_FASTA '*'?
  public static boolean SequenceLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SequenceLine")) return false;
    if (!nextTokenIs(b, GENERIC_FASTA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GENERIC_FASTA);
    r = r && SequenceLine_1(b, l + 1);
    exit_section_(b, m, SEQUENCE_LINE, r);
    return r;
  }

  // '*'?
  private static boolean SequenceLine_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SequenceLine_1")) return false;
    consumeToken(b, "*");
    return true;
  }

}
