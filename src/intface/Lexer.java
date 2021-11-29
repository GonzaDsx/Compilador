/* The following code was generated by JFlex 1.4.3 on 28/11/21 20:15 */

package intface;
import classes.Tokens;
import static classes.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 28/11/21 20:15 from the specification file
 * <tt>D:/ING EN SISTEMAS/9no Semestre/Lenguajes y automatas II/Compilador1/src/intface/Lexer.flex</tt>
 */
class Lexer {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\33\2\0\1\3\22\0\1\3\1\51\1\52\2\0"+
    "\1\45\1\46\1\0\1\35\1\36\1\45\1\43\1\3\1\44\1\42"+
    "\1\32\12\2\1\0\1\41\1\50\1\34\1\50\2\0\13\1\1\30"+
    "\5\1\1\27\1\31\7\1\4\0\1\1\1\0\1\15\1\13\1\16"+
    "\1\17\1\4\1\21\1\24\1\1\1\12\2\1\1\14\1\20\1\5"+
    "\1\10\1\23\1\1\1\7\1\11\1\6\1\22\1\25\3\1\1\26"+
    "\1\37\1\47\1\40\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\13\2\1\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\5\1"+
    "\1\15\2\1\4\2\1\16\14\2\1\4\1\17\1\15"+
    "\1\0\1\20\1\21\1\0\1\22\24\2\1\0\7\2"+
    "\1\23\5\2\1\24\4\2\1\25\2\2\1\3\6\2"+
    "\1\26\3\2\1\27\1\30\3\2\1\21\2\2\1\31"+
    "\4\2\1\32\1\33\1\2\1\34\1\2\1\35\3\2"+
    "\1\36\1\37\4\2\1\40\1\41\2\2\1\42\2\2"+
    "\1\43\1\44\1\2\1\45\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[151];
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
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\u012d"+
    "\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204\0\u022f\0\u025a\0\u0285"+
    "\0\u02b0\0\53\0\u02db\0\u0306\0\53\0\53\0\53\0\53"+
    "\0\53\0\u0331\0\u035c\0\u0387\0\u03b2\0\u03dd\0\u02db\0\u02db"+
    "\0\u0408\0\u0433\0\u045e\0\u0489\0\u04b4\0\u04df\0\u050a\0\u0535"+
    "\0\u0560\0\u058b\0\u05b6\0\u05e1\0\u060c\0\u0637\0\u0662\0\u068d"+
    "\0\u06b8\0\u06e3\0\u070e\0\53\0\53\0\u0739\0\53\0\53"+
    "\0\u0408\0\53\0\u0764\0\u078f\0\u07ba\0\u07e5\0\u0810\0\u083b"+
    "\0\u0866\0\u0891\0\u08bc\0\u08e7\0\u0912\0\u093d\0\u0968\0\u0993"+
    "\0\u09be\0\u09e9\0\u0a14\0\u0a3f\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb"+
    "\0\u0b16\0\u0b41\0\u0b6c\0\u0b97\0\u0bc2\0\u0bed\0\126\0\u0c18"+
    "\0\u0c43\0\u0c6e\0\u0c99\0\u0cc4\0\126\0\u0cef\0\u0d1a\0\u0d45"+
    "\0\u0d70\0\126\0\u0d9b\0\u0dc6\0\53\0\u0df1\0\u0e1c\0\u0e47"+
    "\0\u0e72\0\u0e9d\0\u0ec8\0\126\0\u0ef3\0\u0f1e\0\u0f49\0\126"+
    "\0\126\0\u0f74\0\u0f9f\0\u0fca\0\126\0\u0ff5\0\u1020\0\126"+
    "\0\u104b\0\u1076\0\u10a1\0\u10cc\0\126\0\126\0\u10f7\0\126"+
    "\0\u1122\0\126\0\u114d\0\u1178\0\u11a3\0\126\0\126\0\u11ce"+
    "\0\u11f9\0\u1224\0\u124f\0\126\0\126\0\u127a\0\u12a5\0\126"+
    "\0\u12d0\0\u12fb\0\126\0\126\0\u1326\0\126\0\126";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[151];
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
    "\1\2\1\3\1\4\1\5\1\6\2\3\1\7\1\3"+
    "\1\10\1\3\1\11\1\3\1\12\1\13\1\14\1\15"+
    "\1\16\3\3\1\17\3\3\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\54\0\2\3"+
    "\1\0\26\3\23\0\1\4\53\0\1\5\50\0\2\3"+
    "\1\0\1\3\1\42\24\3\22\0\2\3\1\0\1\43"+
    "\3\3\1\44\21\3\22\0\2\3\1\0\2\3\1\45"+
    "\3\3\1\46\17\3\22\0\2\3\1\0\4\3\1\47"+
    "\21\3\22\0\2\3\1\0\17\3\1\50\1\3\1\51"+
    "\4\3\22\0\2\3\1\0\6\3\1\52\1\3\1\53"+
    "\1\54\14\3\22\0\2\3\1\0\1\55\25\3\22\0"+
    "\2\3\1\0\6\3\1\56\17\3\22\0\2\3\1\0"+
    "\11\3\1\57\4\3\1\60\7\3\22\0\2\3\1\0"+
    "\1\61\25\3\22\0\2\3\1\0\1\62\25\3\53\0"+
    "\1\63\1\0\1\64\52\0\1\65\62\0\1\66\42\0"+
    "\1\64\6\0\1\67\43\0\1\64\7\0\1\67\42\0"+
    "\1\64\64\0\1\70\53\0\1\70\4\0\31\71\1\0"+
    "\1\71\16\0\1\72\1\0\2\3\1\0\2\3\1\73"+
    "\7\3\1\74\13\3\22\0\2\3\1\0\2\3\1\75"+
    "\7\3\1\76\13\3\22\0\2\3\1\0\2\3\1\77"+
    "\23\3\22\0\2\3\1\0\11\3\1\100\14\3\22\0"+
    "\2\3\1\0\1\3\1\101\24\3\22\0\2\3\1\0"+
    "\4\3\1\102\21\3\22\0\2\3\1\0\11\3\1\103"+
    "\14\3\22\0\2\3\1\0\11\3\1\104\14\3\22\0"+
    "\2\3\1\0\12\3\1\105\13\3\22\0\2\3\1\0"+
    "\11\3\1\106\14\3\22\0\2\3\1\0\5\3\1\107"+
    "\5\3\1\110\12\3\22\0\2\3\1\0\2\3\1\111"+
    "\23\3\22\0\2\3\1\0\1\112\25\3\22\0\2\3"+
    "\1\0\10\3\1\113\15\3\22\0\2\3\1\0\1\3"+
    "\1\114\24\3\22\0\2\3\1\0\3\3\1\115\22\3"+
    "\22\0\2\3\1\0\1\3\1\116\24\3\21\0\33\63"+
    "\1\0\17\63\2\0\1\117\51\0\2\3\1\0\1\120"+
    "\2\3\1\121\22\3\22\0\2\3\1\0\1\122\25\3"+
    "\22\0\2\3\1\0\3\3\1\123\22\3\22\0\2\3"+
    "\1\0\4\3\1\124\21\3\22\0\2\3\1\0\11\3"+
    "\1\125\14\3\22\0\2\3\1\0\3\3\1\126\22\3"+
    "\22\0\2\3\1\0\4\3\1\127\21\3\22\0\2\3"+
    "\1\0\10\3\1\130\15\3\22\0\2\3\1\0\20\3"+
    "\1\131\5\3\22\0\2\3\1\0\1\3\1\132\24\3"+
    "\22\0\2\3\1\0\10\3\1\133\15\3\22\0\2\3"+
    "\1\0\5\3\1\134\20\3\22\0\2\3\1\0\4\3"+
    "\1\135\21\3\22\0\2\3\1\0\1\136\25\3\22\0"+
    "\2\3\1\0\1\137\25\3\22\0\2\3\1\0\1\3"+
    "\1\140\24\3\22\0\2\3\1\0\5\3\1\141\20\3"+
    "\22\0\2\3\1\0\12\3\1\142\13\3\22\0\2\3"+
    "\1\0\13\3\1\143\12\3\22\0\2\3\1\0\5\3"+
    "\1\144\20\3\23\0\1\117\33\0\1\145\15\0\2\3"+
    "\1\0\3\3\1\146\22\3\22\0\2\3\1\0\11\3"+
    "\1\147\14\3\22\0\2\3\1\0\1\3\1\150\24\3"+
    "\22\0\2\3\1\0\4\3\1\151\21\3\22\0\2\3"+
    "\1\0\3\3\1\152\22\3\22\0\2\3\1\0\3\3"+
    "\1\153\22\3\22\0\2\3\1\0\2\3\1\154\23\3"+
    "\22\0\2\3\1\0\1\155\25\3\22\0\2\3\1\0"+
    "\11\3\1\156\14\3\22\0\2\3\1\0\22\3\1\157"+
    "\3\3\22\0\2\3\1\0\4\3\1\160\21\3\22\0"+
    "\2\3\1\0\1\161\25\3\22\0\2\3\1\0\1\3"+
    "\1\162\24\3\22\0\2\3\1\0\1\3\1\163\24\3"+
    "\22\0\2\3\1\0\2\3\1\164\23\3\22\0\2\3"+
    "\1\0\4\3\1\165\21\3\22\0\2\3\1\0\11\3"+
    "\1\166\14\3\22\0\2\3\1\0\4\3\1\167\21\3"+
    "\22\0\2\3\1\0\4\3\1\170\21\3\22\0\2\3"+
    "\1\0\13\3\1\171\12\3\22\0\2\3\1\0\13\3"+
    "\1\172\12\3\22\0\2\3\1\0\12\3\1\173\13\3"+
    "\22\0\2\3\1\0\3\3\1\174\22\3\22\0\2\3"+
    "\1\0\23\3\1\175\1\176\1\3\22\0\2\3\1\0"+
    "\11\3\1\177\14\3\22\0\2\3\1\0\3\3\1\200"+
    "\22\3\22\0\2\3\1\0\11\3\1\201\14\3\22\0"+
    "\2\3\1\0\11\3\1\202\14\3\22\0\2\3\1\0"+
    "\1\203\25\3\22\0\2\3\1\0\3\3\1\204\22\3"+
    "\22\0\2\3\1\0\13\3\1\205\12\3\22\0\2\3"+
    "\1\0\3\3\1\206\22\3\22\0\2\3\1\0\11\3"+
    "\1\207\14\3\22\0\2\3\1\0\1\210\25\3\22\0"+
    "\2\3\1\0\1\211\25\3\22\0\2\3\1\0\6\3"+
    "\1\212\17\3\22\0\2\3\1\0\1\3\1\213\24\3"+
    "\22\0\2\3\1\0\3\3\1\214\22\3\22\0\2\3"+
    "\1\0\3\3\1\215\22\3\22\0\2\3\1\0\11\3"+
    "\1\216\14\3\22\0\2\3\1\0\1\217\25\3\22\0"+
    "\2\3\1\0\3\3\1\220\22\3\22\0\2\3\1\0"+
    "\13\3\1\221\12\3\22\0\2\3\1\0\13\3\1\222"+
    "\12\3\22\0\2\3\1\0\4\3\1\223\21\3\22\0"+
    "\2\3\1\0\5\3\1\224\20\3\22\0\2\3\1\0"+
    "\3\3\1\141\22\3\22\0\2\3\1\0\1\225\25\3"+
    "\22\0\2\3\1\0\4\3\1\226\21\3\22\0\2\3"+
    "\1\0\3\3\1\227\22\3\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4945];
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
    "\1\0\1\11\17\1\1\11\2\1\5\11\32\1\2\11"+
    "\1\0\2\11\1\0\1\11\24\1\1\0\25\1\1\11"+
    "\62\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[151];
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
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 128) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 13: 
          { lexeme=yytext(); return Op_relacional;
          }
        case 39: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 40: break;
        case 37: 
          { lexeme=yytext(); return Recorrido;
          }
        case 41: break;
        case 11: 
          { lexeme=yytext(); return P_coma;
          }
        case 42: break;
        case 9: 
          { lexeme=yytext(); return Llave_a;
          }
        case 43: break;
        case 16: 
          { lexeme=yytext(); return Op_incremento;
          }
        case 44: break;
        case 5: 
          { lexeme=yytext(); return Linea;
          }
        case 45: break;
        case 18: 
          { lexeme=yytext(); return Texto;
          }
        case 46: break;
        case 27: 
          { lexeme=yytext(); return RotarL;
          }
        case 47: break;
        case 34: 
          { lexeme=yytext(); return Encender;
          }
        case 48: break;
        case 26: 
          { lexeme=yytext(); return RotarR;
          }
        case 49: break;
        case 31: 
          { lexeme=yytext(); return Entrada;
          }
        case 50: break;
        case 32: 
          { lexeme=yytext(); return Avanzar;
          }
        case 51: break;
        case 33: 
          { lexeme=yytext(); return Detener;
          }
        case 52: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 53: break;
        case 10: 
          { lexeme=yytext(); return Llave_c;
          }
        case 54: break;
        case 17: 
          { lexeme=yytext(); return Op_booleano;
          }
        case 55: break;
        case 24: 
          { lexeme=yytext(); return Clase;
          }
        case 56: break;
        case 7: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 57: break;
        case 15: 
          { lexeme=yytext(); return Op_asignacion;
          }
        case 58: break;
        case 29: 
          { lexeme=yytext(); return Cadena;
          }
        case 59: break;
        case 23: 
          { lexeme=yytext(); return Ciclo;
          }
        case 60: break;
        case 12: 
          { lexeme=yytext(); return Punto;
          }
        case 61: break;
        case 19: 
          { lexeme=yytext(); return Si_No;
          }
        case 62: break;
        case 22: 
          { lexeme=yytext(); return Start;
          }
        case 63: break;
        case 38: 
          { lexeme=yytext(); return Retroceder;
          }
        case 64: break;
        case 21: 
          { lexeme=yytext(); return Func;
          }
        case 65: break;
        case 1: 
          { lexeme=yytext(); return ERROR;
          }
        case 66: break;
        case 35: 
          { lexeme=yytext(); return Booleano;
          }
        case 67: break;
        case 8: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 68: break;
        case 14: 
          { lexeme=yytext(); return Si;
          }
        case 69: break;
        case 25: 
          { lexeme=yytext(); return Entero;
          }
        case 70: break;
        case 28: 
          { lexeme=yytext(); return Apagar;
          }
        case 71: break;
        case 6: 
          { lexeme=yytext(); return Igual;
          }
        case 72: break;
        case 20: 
          { lexeme=yytext(); return Caso;
          }
        case 73: break;
        case 4: 
          { /*Ignore*/
          }
        case 74: break;
        case 36: 
          { lexeme=yytext(); return Ciclo_Mientras;
          }
        case 75: break;
        case 30: 
          { lexeme=yytext(); return Sensor;
          }
        case 76: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
