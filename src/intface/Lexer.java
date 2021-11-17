/* The following code was generated by JFlex 1.4.3 on 16/11/21 21:14 */

package intface;
import classes.Tokens;
import static classes.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 16/11/21 21:14 from the specification file
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
    "\11\0\1\3\1\32\2\0\1\3\22\0\1\3\1\50\1\51\2\0"+
    "\1\44\1\45\1\0\1\34\1\35\1\44\1\42\1\3\1\43\1\41"+
    "\1\31\12\2\1\0\1\40\1\47\1\33\1\47\2\0\13\1\1\30"+
    "\5\1\1\27\10\1\4\0\1\1\1\0\1\15\1\13\1\16\1\17"+
    "\1\4\1\21\1\24\1\1\1\12\2\1\1\14\1\20\1\5\1\10"+
    "\1\23\1\1\1\7\1\11\1\6\1\22\1\25\3\1\1\26\1\36"+
    "\1\46\1\37\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\12\2\1\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\5\1"+
    "\1\15\2\1\4\2\1\16\13\2\1\4\1\17\1\15"+
    "\1\0\1\20\1\21\1\0\1\22\23\2\1\0\7\2"+
    "\1\23\5\2\1\24\4\2\1\25\1\2\1\3\6\2"+
    "\1\26\3\2\1\27\1\30\3\2\1\21\1\2\1\31"+
    "\4\2\1\32\1\33\1\2\1\34\1\2\1\35\3\2"+
    "\1\36\4\2\1\37\1\40\2\2\1\41\2\2\1\42"+
    "\1\43\1\2\1\44\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[145];
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
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\u0126"+
    "\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c\0\u0276"+
    "\0\52\0\u02a0\0\u02ca\0\52\0\52\0\52\0\52\0\52"+
    "\0\u02f4\0\u031e\0\u0348\0\u0372\0\u039c\0\u02a0\0\u02a0\0\u03c6"+
    "\0\u03f0\0\u041a\0\u0444\0\u046e\0\u0498\0\u04c2\0\u04ec\0\u0516"+
    "\0\u0540\0\u056a\0\u0594\0\u05be\0\u05e8\0\u0612\0\u063c\0\u0666"+
    "\0\u0690\0\52\0\52\0\u06ba\0\52\0\52\0\u03c6\0\52"+
    "\0\u06e4\0\u070e\0\u0738\0\u0762\0\u078c\0\u07b6\0\u07e0\0\u080a"+
    "\0\u0834\0\u085e\0\u0888\0\u08b2\0\u08dc\0\u0906\0\u0930\0\u095a"+
    "\0\u0984\0\u09ae\0\u09d8\0\u0a02\0\u0a2c\0\u0a56\0\u0a80\0\u0aaa"+
    "\0\u0ad4\0\u0afe\0\u0b28\0\124\0\u0b52\0\u0b7c\0\u0ba6\0\u0bd0"+
    "\0\u0bfa\0\124\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2\0\124\0\u0ccc"+
    "\0\52\0\u0cf6\0\u0d20\0\u0d4a\0\u0d74\0\u0d9e\0\u0dc8\0\124"+
    "\0\u0df2\0\u0e1c\0\u0e46\0\124\0\124\0\u0e70\0\u0e9a\0\u0ec4"+
    "\0\124\0\u0eee\0\124\0\u0f18\0\u0f42\0\u0f6c\0\u0f96\0\124"+
    "\0\124\0\u0fc0\0\124\0\u0fea\0\124\0\u1014\0\u103e\0\u1068"+
    "\0\124\0\u1092\0\u10bc\0\u10e6\0\u1110\0\124\0\124\0\u113a"+
    "\0\u1164\0\124\0\u118e\0\u11b8\0\124\0\124\0\u11e2\0\124"+
    "\0\124";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[145];
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
    "\1\34\1\35\1\36\1\37\1\40\53\0\2\3\1\0"+
    "\25\3\23\0\1\4\52\0\1\5\47\0\2\3\1\0"+
    "\1\3\1\41\23\3\22\0\2\3\1\0\1\42\3\3"+
    "\1\43\20\3\22\0\2\3\1\0\2\3\1\44\3\3"+
    "\1\45\16\3\22\0\2\3\1\0\4\3\1\46\20\3"+
    "\22\0\2\3\1\0\17\3\1\47\1\3\1\50\3\3"+
    "\22\0\2\3\1\0\6\3\1\51\1\3\1\52\1\53"+
    "\13\3\22\0\2\3\1\0\1\54\24\3\22\0\2\3"+
    "\1\0\6\3\1\55\16\3\22\0\2\3\1\0\11\3"+
    "\1\56\4\3\1\57\6\3\22\0\2\3\1\0\1\60"+
    "\24\3\52\0\1\61\1\0\1\62\51\0\1\63\61\0"+
    "\1\64\41\0\1\62\6\0\1\65\42\0\1\62\7\0"+
    "\1\65\41\0\1\62\63\0\1\66\52\0\1\66\4\0"+
    "\30\67\1\0\1\67\16\0\1\70\1\0\2\3\1\0"+
    "\2\3\1\71\7\3\1\72\12\3\22\0\2\3\1\0"+
    "\2\3\1\73\7\3\1\74\12\3\22\0\2\3\1\0"+
    "\2\3\1\75\22\3\22\0\2\3\1\0\11\3\1\76"+
    "\13\3\22\0\2\3\1\0\1\3\1\77\23\3\22\0"+
    "\2\3\1\0\4\3\1\100\20\3\22\0\2\3\1\0"+
    "\11\3\1\101\13\3\22\0\2\3\1\0\11\3\1\102"+
    "\13\3\22\0\2\3\1\0\12\3\1\103\12\3\22\0"+
    "\2\3\1\0\11\3\1\104\13\3\22\0\2\3\1\0"+
    "\5\3\1\105\5\3\1\106\11\3\22\0\2\3\1\0"+
    "\2\3\1\107\22\3\22\0\2\3\1\0\1\110\24\3"+
    "\22\0\2\3\1\0\10\3\1\111\14\3\22\0\2\3"+
    "\1\0\1\3\1\112\23\3\22\0\2\3\1\0\3\3"+
    "\1\113\21\3\21\0\32\61\1\0\17\61\2\0\1\114"+
    "\50\0\2\3\1\0\1\115\2\3\1\116\21\3\22\0"+
    "\2\3\1\0\1\117\24\3\22\0\2\3\1\0\3\3"+
    "\1\120\21\3\22\0\2\3\1\0\4\3\1\121\20\3"+
    "\22\0\2\3\1\0\11\3\1\122\13\3\22\0\2\3"+
    "\1\0\3\3\1\123\21\3\22\0\2\3\1\0\4\3"+
    "\1\124\20\3\22\0\2\3\1\0\10\3\1\125\14\3"+
    "\22\0\2\3\1\0\20\3\1\126\4\3\22\0\2\3"+
    "\1\0\1\3\1\127\23\3\22\0\2\3\1\0\10\3"+
    "\1\130\14\3\22\0\2\3\1\0\5\3\1\131\17\3"+
    "\22\0\2\3\1\0\4\3\1\132\20\3\22\0\2\3"+
    "\1\0\1\133\24\3\22\0\2\3\1\0\1\134\24\3"+
    "\22\0\2\3\1\0\1\3\1\135\23\3\22\0\2\3"+
    "\1\0\5\3\1\136\17\3\22\0\2\3\1\0\12\3"+
    "\1\137\12\3\22\0\2\3\1\0\13\3\1\140\11\3"+
    "\23\0\1\114\32\0\1\141\15\0\2\3\1\0\3\3"+
    "\1\142\21\3\22\0\2\3\1\0\11\3\1\143\13\3"+
    "\22\0\2\3\1\0\1\3\1\144\23\3\22\0\2\3"+
    "\1\0\4\3\1\145\20\3\22\0\2\3\1\0\3\3"+
    "\1\146\21\3\22\0\2\3\1\0\3\3\1\147\21\3"+
    "\22\0\2\3\1\0\2\3\1\150\22\3\22\0\2\3"+
    "\1\0\1\151\24\3\22\0\2\3\1\0\11\3\1\152"+
    "\13\3\22\0\2\3\1\0\22\3\1\153\2\3\22\0"+
    "\2\3\1\0\4\3\1\154\20\3\22\0\2\3\1\0"+
    "\1\155\24\3\22\0\2\3\1\0\1\3\1\156\23\3"+
    "\22\0\2\3\1\0\1\3\1\157\23\3\22\0\2\3"+
    "\1\0\2\3\1\160\22\3\22\0\2\3\1\0\4\3"+
    "\1\161\20\3\22\0\2\3\1\0\11\3\1\162\13\3"+
    "\22\0\2\3\1\0\4\3\1\163\20\3\22\0\2\3"+
    "\1\0\13\3\1\164\11\3\22\0\2\3\1\0\13\3"+
    "\1\165\11\3\22\0\2\3\1\0\12\3\1\166\12\3"+
    "\22\0\2\3\1\0\3\3\1\167\21\3\22\0\2\3"+
    "\1\0\23\3\1\170\1\171\22\0\2\3\1\0\11\3"+
    "\1\172\13\3\22\0\2\3\1\0\3\3\1\173\21\3"+
    "\22\0\2\3\1\0\11\3\1\174\13\3\22\0\2\3"+
    "\1\0\11\3\1\175\13\3\22\0\2\3\1\0\1\176"+
    "\24\3\22\0\2\3\1\0\3\3\1\177\21\3\22\0"+
    "\2\3\1\0\13\3\1\200\11\3\22\0\2\3\1\0"+
    "\11\3\1\201\13\3\22\0\2\3\1\0\1\202\24\3"+
    "\22\0\2\3\1\0\1\203\24\3\22\0\2\3\1\0"+
    "\6\3\1\204\16\3\22\0\2\3\1\0\1\3\1\205"+
    "\23\3\22\0\2\3\1\0\3\3\1\206\21\3\22\0"+
    "\2\3\1\0\3\3\1\207\21\3\22\0\2\3\1\0"+
    "\11\3\1\210\13\3\22\0\2\3\1\0\1\211\24\3"+
    "\22\0\2\3\1\0\3\3\1\212\21\3\22\0\2\3"+
    "\1\0\13\3\1\213\11\3\22\0\2\3\1\0\13\3"+
    "\1\214\11\3\22\0\2\3\1\0\4\3\1\215\20\3"+
    "\22\0\2\3\1\0\5\3\1\216\17\3\22\0\2\3"+
    "\1\0\3\3\1\136\21\3\22\0\2\3\1\0\1\217"+
    "\24\3\22\0\2\3\1\0\4\3\1\220\20\3\22\0"+
    "\2\3\1\0\3\3\1\221\21\3\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4620];
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
    "\1\0\1\11\16\1\1\11\2\1\5\11\31\1\2\11"+
    "\1\0\2\11\1\0\1\11\23\1\1\0\24\1\1\11"+
    "\60\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[145];
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
    while (i < 126) {
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
        case 38: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 39: break;
        case 36: 
          { lexeme=yytext(); return Recorrido;
          }
        case 40: break;
        case 11: 
          { lexeme=yytext(); return P_coma;
          }
        case 41: break;
        case 9: 
          { lexeme=yytext(); return Llave_a;
          }
        case 42: break;
        case 16: 
          { lexeme=yytext(); return Op_incremento;
          }
        case 43: break;
        case 5: 
          { lexeme=yytext(); return Linea;
          }
        case 44: break;
        case 18: 
          { lexeme=yytext(); return Texto;
          }
        case 45: break;
        case 27: 
          { lexeme=yytext(); return RotarL;
          }
        case 46: break;
        case 33: 
          { lexeme=yytext(); return Encender;
          }
        case 47: break;
        case 26: 
          { lexeme=yytext(); return RotarR;
          }
        case 48: break;
        case 30: 
          { lexeme=yytext(); return Entrada;
          }
        case 49: break;
        case 31: 
          { lexeme=yytext(); return Avanzar;
          }
        case 50: break;
        case 32: 
          { lexeme=yytext(); return Detener;
          }
        case 51: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 52: break;
        case 10: 
          { lexeme=yytext(); return Llave_c;
          }
        case 53: break;
        case 17: 
          { lexeme=yytext(); return Op_booleano;
          }
        case 54: break;
        case 24: 
          { lexeme=yytext(); return Clase;
          }
        case 55: break;
        case 7: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 56: break;
        case 15: 
          { lexeme=yytext(); return Op_asignacion;
          }
        case 57: break;
        case 29: 
          { lexeme=yytext(); return Cadena;
          }
        case 58: break;
        case 23: 
          { lexeme=yytext(); return Ciclo;
          }
        case 59: break;
        case 12: 
          { lexeme=yytext(); return Punto;
          }
        case 60: break;
        case 19: 
          { lexeme=yytext(); return Si_No;
          }
        case 61: break;
        case 22: 
          { lexeme=yytext(); return Start;
          }
        case 62: break;
        case 37: 
          { lexeme=yytext(); return Retroceder;
          }
        case 63: break;
        case 21: 
          { lexeme=yytext(); return Func;
          }
        case 64: break;
        case 1: 
          { lexeme=yytext(); return ERROR;
          }
        case 65: break;
        case 34: 
          { lexeme=yytext(); return Booleano;
          }
        case 66: break;
        case 8: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 67: break;
        case 14: 
          { lexeme=yytext(); return Si;
          }
        case 68: break;
        case 25: 
          { lexeme=yytext(); return Entero;
          }
        case 69: break;
        case 28: 
          { lexeme=yytext(); return Apagar;
          }
        case 70: break;
        case 6: 
          { lexeme=yytext(); return Igual;
          }
        case 71: break;
        case 20: 
          { lexeme=yytext(); return Caso;
          }
        case 72: break;
        case 4: 
          { /*Ignore*/
          }
        case 73: break;
        case 35: 
          { lexeme=yytext(); return Ciclo_Mientras;
          }
        case 74: break;
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
