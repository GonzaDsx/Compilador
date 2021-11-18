/* The following code was generated by JFlex 1.4.3 on 17/11/21 19:41 */

package intface;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 17/11/21 19:41 from the specification file
 * <tt>D:/ING EN SISTEMAS/9no Semestre/Lenguajes y automatas II/Compilador1/src/intface/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  3,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 30, 40,  0,  0, 33, 27,  0, 34, 35, 33, 31,  3, 32, 39,  4, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0, 38, 29, 26, 29,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 25,  1,  1,  1, 
     1,  1, 24,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0,  0,  1, 
     0, 12, 10, 13, 14,  5, 18, 21,  1, 16,  1,  1, 11, 17,  6,  9, 
    20,  1,  8, 15,  7, 19, 22,  1,  1,  1, 23, 36, 28, 37,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\12\2\1\5"+
    "\2\1\1\6\4\1\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\0\2\15\1\4\1\16\13\2\1\17"+
    "\4\2\1\6\1\20\1\21\1\0\1\22\1\23\1\0"+
    "\23\2\1\0\12\2\1\24\3\2\1\25\2\2\1\26"+
    "\1\2\1\3\10\2\1\27\1\2\1\30\1\2\1\31"+
    "\1\2\1\32\1\2\1\33\3\2\1\34\1\35\1\2"+
    "\1\36\1\2\1\37\6\2\1\40\1\41\2\2\1\42"+
    "\2\2\1\43\1\2\1\44\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[142];
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
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\u023e\0\u0267"+
    "\0\u0290\0\u02b9\0\u02e2\0\u0290\0\u0290\0\u030b\0\u0334\0\u035d"+
    "\0\u0386\0\51\0\51\0\51\0\51\0\51\0\u03af\0\u03d8"+
    "\0\51\0\u0401\0\51\0\51\0\u042a\0\u0453\0\u047c\0\u04a5"+
    "\0\u04ce\0\u04f7\0\u0520\0\u0549\0\u0572\0\u059b\0\u05c4\0\u05ed"+
    "\0\u0616\0\u063f\0\u0668\0\u0691\0\51\0\51\0\51\0\u06ba"+
    "\0\u03af\0\51\0\u0401\0\u06e3\0\u070c\0\u0735\0\u075e\0\u0787"+
    "\0\u07b0\0\u07d9\0\u0802\0\u082b\0\u0854\0\u087d\0\u08a6\0\u08cf"+
    "\0\u08f8\0\u0921\0\u094a\0\u0973\0\u099c\0\u09c5\0\u09ee\0\u0a17"+
    "\0\u0a40\0\u0a69\0\u0a92\0\u0abb\0\u0ae4\0\u0b0d\0\u0b36\0\u0b5f"+
    "\0\u0b88\0\122\0\u0bb1\0\u0bda\0\u0c03\0\122\0\u0c2c\0\u0c55"+
    "\0\122\0\u0c7e\0\51\0\u0ca7\0\u0cd0\0\u0cf9\0\u0d22\0\u0d4b"+
    "\0\u0d74\0\u0d9d\0\u0dc6\0\122\0\u0def\0\122\0\u0e18\0\122"+
    "\0\u0e41\0\122\0\u0e6a\0\122\0\u0e93\0\u0ebc\0\u0ee5\0\122"+
    "\0\122\0\u0f0e\0\122\0\u0f37\0\122\0\u0f60\0\u0f89\0\u0fb2"+
    "\0\u0fdb\0\u1004\0\u102d\0\122\0\122\0\u1056\0\u107f\0\122"+
    "\0\u10a8\0\u10d1\0\122\0\u10fa\0\122\0\122";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[142];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\2\3\1\10"+
    "\1\3\1\11\1\3\1\12\1\13\1\14\1\15\1\3"+
    "\1\16\1\17\3\3\1\20\3\3\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\52\0\2\3\1\40\1\0"+
    "\25\3\16\0\1\41\1\0\1\40\1\4\1\40\1\0"+
    "\25\40\16\0\1\41\1\0\2\40\1\5\1\0\25\40"+
    "\16\0\1\42\4\0\1\43\25\0\1\44\17\0\2\3"+
    "\1\40\1\0\1\3\1\45\23\3\16\0\1\41\1\0"+
    "\2\3\1\40\1\0\1\46\3\3\1\47\20\3\16\0"+
    "\1\41\1\0\2\3\1\40\1\0\4\3\1\50\20\3"+
    "\16\0\1\41\1\0\2\3\1\40\1\0\17\3\1\51"+
    "\1\3\1\52\3\3\16\0\1\41\1\0\2\3\1\40"+
    "\1\0\6\3\1\53\1\54\3\3\1\55\11\3\16\0"+
    "\1\41\1\0\2\3\1\40\1\0\1\56\24\3\16\0"+
    "\1\41\1\0\2\3\1\40\1\0\2\3\1\57\10\3"+
    "\1\60\11\3\16\0\1\41\1\0\2\3\1\40\1\0"+
    "\13\3\1\61\11\3\16\0\1\41\1\0\2\3\1\40"+
    "\1\0\7\3\1\62\6\3\1\63\6\3\16\0\1\41"+
    "\1\0\2\3\1\40\1\0\1\64\24\3\16\0\1\41"+
    "\32\0\1\65\51\0\1\66\51\0\1\66\46\0\1\44"+
    "\4\0\1\67\43\0\1\44\5\0\1\67\42\0\1\44"+
    "\56\0\1\70\11\0\3\71\1\0\25\71\16\0\1\72"+
    "\1\0\3\40\1\0\25\40\16\0\1\41\1\0\3\73"+
    "\1\0\25\73\16\0\1\72\1\0\2\3\1\40\1\0"+
    "\2\3\1\74\5\3\1\75\14\3\16\0\1\41\1\0"+
    "\2\3\1\40\1\0\2\3\1\76\5\3\1\77\14\3"+
    "\16\0\1\41\1\0\2\3\1\40\1\0\2\3\1\100"+
    "\22\3\16\0\1\41\1\0\2\3\1\40\1\0\4\3"+
    "\1\101\20\3\16\0\1\41\1\0\2\3\1\40\1\0"+
    "\7\3\1\102\15\3\16\0\1\41\1\0\2\3\1\40"+
    "\1\0\7\3\1\103\15\3\16\0\1\41\1\0\2\3"+
    "\1\40\1\0\7\3\1\104\15\3\16\0\1\41\1\0"+
    "\2\3\1\40\1\0\11\3\1\105\1\106\12\3\16\0"+
    "\1\41\1\0\2\3\1\40\1\0\10\3\1\107\14\3"+
    "\16\0\1\41\1\0\2\3\1\40\1\0\2\3\1\110"+
    "\22\3\16\0\1\41\1\0\2\3\1\40\1\0\7\3"+
    "\1\111\15\3\16\0\1\41\1\0\2\3\1\40\1\0"+
    "\1\3\1\112\23\3\16\0\1\41\1\0\2\3\1\40"+
    "\1\0\1\113\24\3\16\0\1\41\1\0\2\3\1\40"+
    "\1\0\6\3\1\114\16\3\16\0\1\41\1\0\2\3"+
    "\1\40\1\0\1\3\1\115\23\3\16\0\1\41\1\0"+
    "\2\3\1\40\1\0\3\3\1\116\21\3\16\0\1\41"+
    "\2\0\1\117\47\0\2\3\1\40\1\0\1\120\24\3"+
    "\16\0\1\41\1\0\2\3\1\40\1\0\1\121\24\3"+
    "\16\0\1\41\1\0\2\3\1\40\1\0\3\3\1\122"+
    "\21\3\16\0\1\41\1\0\2\3\1\40\1\0\4\3"+
    "\1\123\20\3\16\0\1\41\1\0\2\3\1\40\1\0"+
    "\7\3\1\124\15\3\16\0\1\41\1\0\2\3\1\40"+
    "\1\0\6\3\1\125\16\3\16\0\1\41\1\0\2\3"+
    "\1\40\1\0\20\3\1\126\4\3\16\0\1\41\1\0"+
    "\2\3\1\40\1\0\1\3\1\127\23\3\16\0\1\41"+
    "\1\0\2\3\1\40\1\0\12\3\1\130\12\3\16\0"+
    "\1\41\1\0\2\3\1\40\1\0\1\131\24\3\16\0"+
    "\1\41\1\0\2\3\1\40\1\0\4\3\1\132\20\3"+
    "\16\0\1\41\1\0\2\3\1\40\1\0\6\3\1\133"+
    "\16\3\16\0\1\41\1\0\2\3\1\40\1\0\1\134"+
    "\24\3\16\0\1\41\1\0\2\3\1\40\1\0\3\3"+
    "\1\135\21\3\16\0\1\41\1\0\2\3\1\40\1\0"+
    "\4\3\1\136\20\3\16\0\1\41\1\0\2\3\1\40"+
    "\1\0\1\3\1\137\23\3\16\0\1\41\1\0\2\3"+
    "\1\40\1\0\12\3\1\140\12\3\16\0\1\41\1\0"+
    "\2\3\1\40\1\0\10\3\1\141\14\3\16\0\1\41"+
    "\1\0\2\3\1\40\1\0\11\3\1\142\13\3\16\0"+
    "\1\41\2\0\1\117\40\0\1\143\6\0\2\3\1\40"+
    "\1\0\3\3\1\144\21\3\16\0\1\41\1\0\2\3"+
    "\1\40\1\0\1\3\1\145\23\3\16\0\1\41\1\0"+
    "\2\3\1\40\1\0\4\3\1\146\20\3\16\0\1\41"+
    "\1\0\2\3\1\40\1\0\3\3\1\147\21\3\16\0"+
    "\1\41\1\0\2\3\1\40\1\0\3\3\1\150\21\3"+
    "\16\0\1\41\1\0\2\3\1\40\1\0\1\151\24\3"+
    "\16\0\1\41\1\0\2\3\1\40\1\0\7\3\1\152"+
    "\15\3\16\0\1\41\1\0\2\3\1\40\1\0\22\3"+
    "\1\153\2\3\16\0\1\41\1\0\2\3\1\40\1\0"+
    "\1\154\24\3\16\0\1\41\1\0\2\3\1\40\1\0"+
    "\1\3\1\155\23\3\16\0\1\41\1\0\2\3\1\40"+
    "\1\0\4\3\1\156\20\3\16\0\1\41\1\0\2\3"+
    "\1\40\1\0\1\3\1\157\23\3\16\0\1\41\1\0"+
    "\2\3\1\40\1\0\2\3\1\160\22\3\16\0\1\41"+
    "\1\0\2\3\1\40\1\0\2\3\1\161\22\3\16\0"+
    "\1\41\1\0\2\3\1\40\1\0\4\3\1\162\20\3"+
    "\16\0\1\41\1\0\2\3\1\40\1\0\7\3\1\163"+
    "\15\3\16\0\1\41\1\0\2\3\1\40\1\0\4\3"+
    "\1\164\20\3\16\0\1\41\1\0\2\3\1\40\1\0"+
    "\11\3\1\165\13\3\16\0\1\41\1\0\2\3\1\40"+
    "\1\0\10\3\1\166\14\3\16\0\1\41\1\0\2\3"+
    "\1\40\1\0\3\3\1\167\21\3\16\0\1\41\1\0"+
    "\2\3\1\40\1\0\23\3\1\170\1\171\16\0\1\41"+
    "\1\0\2\3\1\40\1\0\7\3\1\172\15\3\16\0"+
    "\1\41\1\0\2\3\1\40\1\0\3\3\1\173\21\3"+
    "\16\0\1\41\1\0\2\3\1\40\1\0\7\3\1\174"+
    "\15\3\16\0\1\41\1\0\2\3\1\40\1\0\7\3"+
    "\1\175\15\3\16\0\1\41\1\0\2\3\1\40\1\0"+
    "\1\176\24\3\16\0\1\41\1\0\2\3\1\40\1\0"+
    "\3\3\1\177\21\3\16\0\1\41\1\0\2\3\1\40"+
    "\1\0\11\3\1\200\13\3\16\0\1\41\1\0\2\3"+
    "\1\40\1\0\1\201\24\3\16\0\1\41\1\0\2\3"+
    "\1\40\1\0\1\202\24\3\16\0\1\41\1\0\2\3"+
    "\1\40\1\0\13\3\1\203\11\3\16\0\1\41\1\0"+
    "\2\3\1\40\1\0\1\3\1\144\23\3\16\0\1\41"+
    "\1\0\2\3\1\40\1\0\3\3\1\204\21\3\16\0"+
    "\1\41\1\0\2\3\1\40\1\0\3\3\1\205\21\3"+
    "\16\0\1\41\1\0\2\3\1\40\1\0\7\3\1\206"+
    "\15\3\16\0\1\41\1\0\2\3\1\40\1\0\1\207"+
    "\24\3\16\0\1\41\1\0\2\3\1\40\1\0\3\3"+
    "\1\210\21\3\16\0\1\41\1\0\2\3\1\40\1\0"+
    "\11\3\1\211\13\3\16\0\1\41\1\0\2\3\1\40"+
    "\1\0\11\3\1\212\13\3\16\0\1\41\1\0\2\3"+
    "\1\40\1\0\12\3\1\213\12\3\16\0\1\41\1\0"+
    "\2\3\1\40\1\0\3\3\1\140\21\3\16\0\1\41"+
    "\1\0\2\3\1\40\1\0\1\214\24\3\16\0\1\41"+
    "\1\0\2\3\1\40\1\0\4\3\1\215\20\3\16\0"+
    "\1\41\1\0\2\3\1\40\1\0\3\3\1\216\21\3"+
    "\16\0\1\41";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4387];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\27\1\5\11\1\1\1\0\1\11\1\1"+
    "\2\11\20\1\3\11\1\0\1\1\1\11\1\0\23\1"+
    "\1\0\23\1\1\11\53\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[142];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
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
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 18: 
          { return new Symbol(sym.TextoSC, yychar, yyline, yytext());
          }
        case 38: break;
        case 9: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 39: break;
        case 31: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 40: break;
        case 24: 
          { return new Symbol(sym.Ciclo, yychar, yyline, yytext());
          }
        case 41: break;
        case 16: 
          { return new Symbol(sym.Op_logico, yychar, yyline, yytext());
          }
        case 42: break;
        case 25: 
          { return new Symbol(sym.Start, yychar, yyline, yytext());
          }
        case 43: break;
        case 15: 
          { return new Symbol(sym.Si, yychar, yyline, yytext());
          }
        case 44: break;
        case 27: 
          { return new Symbol(sym.T_dato, yychar, yyline, yytext());
          }
        case 45: break;
        case 7: 
          { return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());
          }
        case 46: break;
        case 14: 
          { return new Symbol(sym.Op_asignacion, yychar, yyline, yytext());
          }
        case 47: break;
        case 20: 
          { return new Symbol(sym.Caso, yychar, yyline, yytext());
          }
        case 48: break;
        case 36: 
          { return new Symbol(sym.Recorrido, yychar, yyline, yytext());
          }
        case 49: break;
        case 10: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 50: break;
        case 30: 
          { return new Symbol(sym.Apagar, yychar, yyline, yytext());
          }
        case 51: break;
        case 32: 
          { return new Symbol(sym.Avanzar, yychar, yyline, yytext());
          }
        case 52: break;
        case 34: 
          { return new Symbol(sym.Encender, yychar, yyline, yytext());
          }
        case 53: break;
        case 17: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 54: break;
        case 35: 
          { return new Symbol(sym.Mientras, yychar, yyline, yytext());
          }
        case 55: break;
        case 8: 
          { return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());
          }
        case 56: break;
        case 29: 
          { return new Symbol(sym.RotarL, yychar, yyline, yytext());
          }
        case 57: break;
        case 13: 
          { return new Symbol(sym.TextoSA, yychar, yyline, yytext());
          }
        case 58: break;
        case 11: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 59: break;
        case 23: 
          { return new Symbol(sym.Clase, yychar, yyline, yytext());
          }
        case 60: break;
        case 28: 
          { return new Symbol(sym.RotarR, yychar, yyline, yytext());
          }
        case 61: break;
        case 37: 
          { return new Symbol(sym.Retroceder, yychar, yyline, yytext());
          }
        case 62: break;
        case 21: 
          { return new Symbol(sym.Si_No, yychar, yyline, yytext());
          }
        case 63: break;
        case 33: 
          { return new Symbol(sym.Detener, yychar, yyline, yytext());
          }
        case 64: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 65: break;
        case 12: 
          { return new Symbol(sym.Punto, yychar, yyline, yytext());
          }
        case 66: break;
        case 4: 
          { /*Ignore*/
          }
        case 67: break;
        case 5: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 68: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 69: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 70: break;
        case 6: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 71: break;
        case 22: 
          { return new Symbol(sym.Func, yychar, yyline, yytext());
          }
        case 72: break;
        case 19: 
          { return new Symbol(sym.Texto, yychar, yyline, yytext());
          }
        case 73: break;
        case 26: 
          { return new Symbol(sym.Op_booleano, yychar, yyline, yytext());
          }
        case 74: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
