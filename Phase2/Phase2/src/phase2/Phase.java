/* The following code was generated by JFlex 1.6.0 */

package phase2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;
import java.util.ArrayList;

class Phase{
	ArrayList simbol_table = new ArrayList();
    public static void main(String[] args) {
        FileReader filereader = null;
        String input = "testcase.txt";
        try {
            filereader = new FileReader(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Lexeme\t\t\t Token\t\t\t simbol_table");
        Yylex yylex = new Yylex(filereader);
        try {
            yylex.yylex();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>E:/Education/University/Semesters/Semester 8/flex.flex</tt>
 */
class Yylex {

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
    "\11\0\1\0\1\54\1\57\1\57\1\55\25\0\1\56\1\0\1\53"+
    "\1\0\1\0\1\36\1\37\1\51\1\47\1\34\1\50\1\45\1\52"+
    "\1\3\11\2\1\33\1\32\1\0\1\35\1\0\1\44\1\0\32\1"+
    "\1\40\1\0\1\41\3\0\1\10\1\21\1\22\1\23\1\12\1\25"+
    "\1\7\1\26\1\16\2\1\1\20\1\11\1\17\1\6\1\4\1\46"+
    "\1\5\1\27\1\13\1\24\1\15\1\31\1\30\1\14\1\1\1\42"+
    "\1\0\1\43\7\0\1\57\u1fa2\0\1\57\1\57\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\14\2\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\1\2\25"+
    "\1\0\2\2\1\26\6\2\1\27\3\2\1\30\6\2"+
    "\1\31\1\25\4\0\1\32\2\33\1\3\3\2\1\34"+
    "\1\2\1\35\4\2\1\36\1\2\1\37\3\2\1\40"+
    "\1\2\1\41\1\42\1\43\1\44\1\45\1\46\2\32"+
    "\1\25\3\2\1\47\1\2\1\50\1\51\1\52\1\53"+
    "\1\2\1\54\2\2\1\55\3\2\1\56\1\2\1\57"+
    "\1\2\1\25\2\2\1\60\1\2\1\61\1\62\1\2"+
    "\1\63\1\2\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[127];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0"+
    "\0\u0300\0\60\0\u0330\0\60\0\60\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\u0360\0\60\0\60\0\60"+
    "\0\u0390\0\60\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0"+
    "\0\140\0\u04e0\0\u0510\0\u0540\0\u0570\0\u05a0\0\u05d0\0\140"+
    "\0\u0600\0\u0630\0\u0660\0\140\0\u0690\0\u06c0\0\u06f0\0\u0720"+
    "\0\u0750\0\u0780\0\60\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870"+
    "\0\u08a0\0\u08d0\0\u0900\0\u03f0\0\u0930\0\u0960\0\u0990\0\140"+
    "\0\u09c0\0\140\0\u09f0\0\u0a20\0\u0a50\0\u0a80\0\140\0\u0ab0"+
    "\0\140\0\u0ae0\0\u0b10\0\u0b40\0\140\0\u0b70\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\u0ba0\0\u0bd0\0\u0c00"+
    "\0\u0c30\0\u0c60\0\140\0\u0c90\0\140\0\140\0\140\0\140"+
    "\0\u0cc0\0\140\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u0de0"+
    "\0\140\0\u0e10\0\140\0\u0e40\0\u0d50\0\u0e70\0\u0ea0\0\140"+
    "\0\u0ed0\0\140\0\140\0\u0f00\0\140\0\u0f30\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[127];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\3"+
    "\1\11\1\3\1\12\1\13\1\3\1\14\1\15\1\16"+
    "\1\3\1\17\1\3\1\20\1\3\1\21\4\3\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\3\1\36\1\37\1\40\1\41"+
    "\1\42\2\2\1\43\62\0\31\3\14\0\1\3\13\0"+
    "\2\4\41\0\1\44\14\0\1\45\1\46\41\0\1\44"+
    "\13\0\4\3\1\47\24\3\14\0\1\3\12\0\11\3"+
    "\1\50\17\3\14\0\1\3\12\0\4\3\1\51\24\3"+
    "\14\0\1\3\12\0\16\3\1\52\12\3\14\0\1\3"+
    "\12\0\10\3\1\53\5\3\1\54\1\55\7\3\1\56"+
    "\1\3\14\0\1\3\12\0\4\3\1\57\1\60\17\3"+
    "\1\61\3\3\14\0\1\3\12\0\7\3\1\62\21\3"+
    "\14\0\1\3\12\0\16\3\1\63\5\3\1\64\4\3"+
    "\14\0\1\3\12\0\5\3\1\65\23\3\14\0\1\3"+
    "\12\0\5\3\1\66\3\3\1\67\17\3\14\0\1\3"+
    "\12\0\5\3\1\70\23\3\14\0\1\3\12\0\5\3"+
    "\1\71\1\3\1\72\21\3\14\0\1\3\46\0\1\73"+
    "\24\0\2\74\3\0\1\75\2\0\1\76\4\0\1\77"+
    "\1\100\111\0\1\101\7\0\1\102\1\103\41\0\1\74"+
    "\14\0\1\104\1\44\56\0\2\45\41\0\1\74\14\0"+
    "\1\45\1\46\41\0\1\74\13\0\5\3\1\105\23\3"+
    "\14\0\1\3\12\0\3\3\1\106\3\3\1\107\21\3"+
    "\14\0\1\3\12\0\22\3\1\110\6\3\14\0\1\3"+
    "\12\0\3\3\1\111\25\3\14\0\1\3\12\0\22\3"+
    "\1\112\6\3\14\0\1\3\12\0\26\3\1\113\2\3"+
    "\14\0\1\3\12\0\15\3\1\114\13\3\14\0\1\3"+
    "\12\0\23\3\1\115\5\3\14\0\1\3\12\0\11\3"+
    "\1\116\17\3\14\0\1\3\12\0\4\3\1\117\24\3"+
    "\14\0\1\3\12\0\12\3\1\120\16\3\14\0\1\3"+
    "\12\0\12\3\1\121\16\3\14\0\1\3\12\0\5\3"+
    "\1\122\23\3\14\0\1\3\12\0\6\3\1\123\22\3"+
    "\14\0\1\3\12\0\30\3\1\124\14\0\1\3\12\0"+
    "\4\3\1\125\24\3\14\0\1\3\12\0\17\3\1\126"+
    "\11\3\14\0\1\3\13\0\2\74\66\0\1\127\1\130"+
    "\112\0\1\131\23\0\1\132\57\0\1\133\1\134\44\0"+
    "\54\101\1\135\1\136\2\101\2\0\2\102\41\0\1\137"+
    "\14\0\1\45\1\46\41\0\1\137\13\0\6\3\1\140"+
    "\12\3\1\141\7\3\14\0\1\3\12\0\11\3\1\142"+
    "\17\3\14\0\1\3\12\0\17\3\1\143\11\3\14\0"+
    "\1\3\12\0\12\3\1\144\16\3\14\0\1\3\12\0"+
    "\11\3\1\145\17\3\14\0\1\3\12\0\12\3\1\146"+
    "\16\3\14\0\1\3\12\0\11\3\1\147\17\3\14\0"+
    "\1\3\12\0\16\3\1\150\12\3\14\0\1\3\12\0"+
    "\11\3\1\151\17\3\14\0\1\3\12\0\17\3\1\152"+
    "\11\3\14\0\1\3\12\0\15\3\1\153\13\3\14\0"+
    "\1\3\12\0\16\3\1\154\12\3\14\0\1\3\12\0"+
    "\26\3\1\115\2\3\14\0\1\3\65\0\1\135\5\0"+
    "\2\155\55\0\4\3\1\156\24\3\14\0\1\3\12\0"+
    "\11\3\1\157\17\3\14\0\1\3\12\0\7\3\1\160"+
    "\21\3\14\0\1\3\12\0\13\3\1\161\15\3\14\0"+
    "\1\3\12\0\6\3\1\162\22\3\14\0\1\3\12\0"+
    "\16\3\1\163\12\3\14\0\1\3\12\0\12\3\1\164"+
    "\16\3\14\0\1\3\13\0\1\155\1\165\55\0\7\3"+
    "\1\166\21\3\14\0\1\3\12\0\22\3\1\167\6\3"+
    "\14\0\1\3\12\0\12\3\1\170\16\3\14\0\1\3"+
    "\12\0\11\3\1\171\17\3\14\0\1\3\12\0\5\3"+
    "\1\172\23\3\14\0\1\3\12\0\10\3\1\173\20\3"+
    "\14\0\1\3\12\0\23\3\1\174\5\3\14\0\1\3"+
    "\12\0\4\3\1\175\24\3\14\0\1\3\12\0\4\3"+
    "\1\176\24\3\14\0\1\3\12\0\11\3\1\177\17\3"+
    "\14\0\1\3\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3936];
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
    "\1\0\1\11\17\1\1\11\1\1\11\11\1\1\3\11"+
    "\1\1\1\11\3\1\1\0\24\1\1\11\1\1\4\0"+
    "\26\1\7\11\42\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[127];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 168) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public int yylex() throws java.io.IOException {
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { 
          }
        case 53: break;
        case 2: 
          { //System.out.println(yytext() + "\t\t\t" + "IDENTIFIER\t\t\t" + '-');
	return YYParser.IDENTIFIER;
          }
        case 54: break;
        case 3: 
          { //System.out.println(yytext() + "\t\t\t" + "ERROR_NO_SHARP\t\t\t" + '-');
	return YYParser.ERROR_NO_SHARP;
          }
        case 55: break;
        case 4: 
          { //System.out.println(yytext() + "\t\t\t" + "SEMICOLON_KW\t\t\t" + '-');
	return YYParser.SEMICOLON_KW;
          }
        case 56: break;
        case 5: 
          { //System.out.println(yytext() + "\t\t\t" + "COLON_KW\t\t\t" + '-');
	return YYParser.COLON_KW;
          }
        case 57: break;
        case 6: 
          { //System.out.println(yytext() + "\t\t\t" + "COMMA_KW\t\t\t" + '-');
	return YYParser.COMMA_KW;
          }
        case 58: break;
        case 7: 
          { //System.out.println(yytext() + "\t\t\t" + "EQUALS_KW\t\t\t" + '-');
	return YYParser.EQUALS_KW;
          }
        case 59: break;
        case 8: 
          { //System.out.println(yytext() + "\t\t\t" + "LP_KW\t\t\t" + '-');
	return YYParser.LP_KW;
          }
        case 60: break;
        case 9: 
          { //System.out.println(yytext() + "\t\t\t" + "RP_KW\t\t\t" + '-');
	return YYParser.RP_KW;
          }
        case 61: break;
        case 10: 
          { //System.out.println(yytext() + "\t\t\t" + "LB_KW}\t\t\t" + '-');
	return YYParser.LB_KW;
          }
        case 62: break;
        case 11: 
          { //System.out.println(yytext() + "\t\t\t" + "RB_KW\t\t\t" + '-');
	return YYParser.RB_KW;
          }
        case 63: break;
        case 12: 
          { //System.out.println(yytext() + "\t\t\t" + "LCB_KW\t\t\t" + '-');
	return YYParser.LCB_KW;
          }
        case 64: break;
        case 13: 
          { //System.out.println(yytext() + "\t\t\t" + "RCB_KW\t\t\t" + '-');
	return YYParser.RCB_KW;
          }
        case 65: break;
        case 14: 
          { //System.out.println(yytext() + "\t\t\t" + "QUESTION_KW\t\t\t" + '-');
	return YYParser.QUESTION_KW;
          }
        case 66: break;
        case 15: 
          { //System.out.println(yytext() + "\t\t\t" + "DOT_KW\t\t\t" + '-');
	return YYParser.DOT_KW;
          }
        case 67: break;
        case 16: 
          { //System.out.println(yytext() + "\t\t\t" + "ADD_KW\t\t\t" + '-');
	return YYParser.ADD_KW;
          }
        case 68: break;
        case 17: 
          { //System.out.println(yytext() + "\t\t\t" + "SUB_KW\t\t\t" + '-');
	return YYParser.SUB_KW;
          }
        case 69: break;
        case 18: 
          { //System.out.println(yytext() + "\t\t\t" + "MUL_KW\t\t\t" + '-');
	return YYParser.MUL_KW;
          }
        case 70: break;
        case 19: 
          { //System.out.println(yytext() + "\t\t\t" + "DIV_KW\t\t\t" + '-');
	return YYParser.DIV_KW;
          }
        case 71: break;
        case 20: 
          { //System.out.println(yytext() + "\t\t\t" + "MOD_KW\t\t\t" + '-');
	return YYParser.MOD_KW;
          }
        case 72: break;
        case 21: 
          { //System.out.println(yytext() + "\t\t\t" + "ERROR_ZERO\t\t\t" + '-');
	return YYParser.ERROR_ZERO;
          }
        case 73: break;
        case 22: 
          { //System.out.println(yytext() + "\t\t\t" + "OR_KW}\t\t\t" + '-');
	return YYParser.OR_KW;
          }
        case 74: break;
        case 23: 
          { //System.out.println(yytext() + "\t\t\t" + "TO_KW\t\t\t" + '-');
	return YYParser.TO_KW;
          }
        case 75: break;
        case 24: 
          { //System.out.println(yytext() + "\t\t\t" + "IF_KW\t\t\t" + '-');
	return YYParser.IF_KW;
          }
        case 76: break;
        case 25: 
          { //System.out.println(yytext() + "\t\t\t" + "ASS_KW\t\t\t" + '-');
	return YYParser.ASS_KW;
          }
        case 77: break;
        case 26: 
          { //System.out.println(yytext() + "\t\t\t" + "COMMENTS\t\t\t" + '-');
	return YYParser.COMMENTS;
          }
        case 78: break;
        case 27: 
          { //System.out.println(yytext() + "\t\t\t" + "INTEGER_CONSTANT\t\t\t" + '-');
	return YYParser.INTEGER_CONSTANT;
          }
        case 79: break;
        case 28: 
          { //System.out.println(yytext() + "\t\t\t" + "AND_KW\t\t\t" + '-');
	return YYParser.AND_KW;
          }
        case 80: break;
        case 29: 
          { //System.out.println(yytext() + "\t\t\t" + "END_KW\t\t\t" + '-');
	return YYParser.END_KW;
          }
        case 81: break;
        case 30: 
          { //System.out.println(yytext() + "\t\t\t" + "VAR_KW\t\t\t" + '-');
	return YYParser.VAR_KW;
          }
        case 82: break;
        case 31: 
          { //System.out.println(yytext() + "\t\t\t" + "NOT_KW\t\t\t" + '-');
	return YYParser.NOT_KW;
          }
        case 83: break;
        case 32: 
          { //System.out.println(yytext() + "\t\t\t" + "FOR_KW\t\t\t" + '-');
	return YYParser.FOR_KW;
          }
        case 84: break;
        case 33: 
          { //System.out.println(yytext() + "\t\t\t" + "GE_KW\t\t\t" + '-');
	return YYParser.GE_KW;
          }
        case 85: break;
        case 34: 
          { //System.out.println(yytext() + "\t\t\t" + "GT_KW\t\t\t" + '-');
	return YYParser.GT_KW;
          }
        case 86: break;
        case 35: 
          { //System.out.println(yytext() + "\t\t\t" + "EQ_KW\t\t\t" + '-');
	return YYParser.EQ_KW;
          }
        case 87: break;
        case 36: 
          { //System.out.println(yytext() + "\t\t\t" + "NE_KW\t\t\t" + '-');
	return YYParser.NE_KW;
          }
        case 88: break;
        case 37: 
          { //System.out.println(yytext() + "\t\t\t" + "LE_KW\t\t\t" + '-');
	return YYParser.LE_KW;
          }
        case 89: break;
        case 38: 
          { //System.out.println(yytext() + "\t\t\t" + "LT_KW\t\t\t" + '-');
	return YYParser.LT_KW;
          }
        case 90: break;
        case 39: 
          { //System.out.println(yytext() + "\t\t\t" + "REAL_KW\t\t\t" + '-');
	return YYParser.REAL_KW;
          }
        case 91: break;
        case 40: 
          { //System.out.println(yytext() + "\t\t\t" + "ELSE_kw\t\t\t" + '-');
	return YYParser.ELSE_KW;
          }
        case 92: break;
        case 41: 
          { //System.out.println(yytext() + "\t\t\t" + "EXIT_KW\t\t\t" + '-');
	return YYParser.EXIT_KW;
          }
        case 93: break;
        case 42: 
          { //System.out.println(yytext() + "\t\t\t" + "BOOLEAN_CONSTANT\t\t\t" + '-');
	return YYParser.BOOLEAN_CONSTANT;
          }
        case 94: break;
        case 43: 
          { //System.out.println(yytext() + "\t\t\t" + "THEN_KW\t\t\t" + '-');
	return YYParser.THEN_KW;
          }
        case 95: break;
        case 44: 
          { //System.out.println(yytext() + "\t\t\t" + "BOOLEAN_KW\t\t\t" + '-');
	return YYParser.BOOLEAN_KW;
          }
        case 96: break;
        case 45: 
          { //System.out.println(yytext() + "\t\t\t" + "REAL_CONSTANT\t\t\t" + '-');
	return YYParser.REAL_CONSTANT;
          }
        case 97: break;
        case 46: 
          { //System.out.println(yytext() + "\t\t\t" + "EMPTY_KW\t\t\t" + '-');
	return YYParser.EMPTY_KW;
          }
        case 98: break;
        case 47: 
          { //System.out.println(yytext() + "\t\t\t" + "BEGIN_KW\t\t\t" + '-');
	return YYParser.BEGIN_KW;
          }
        case 99: break;
        case 48: 
          { //System.out.println(yytext() + "\t\t\t" + "REPEAT_KW\t\t\t" + '-');
	return YYParser.REPEAT_KW;
          }
        case 100: break;
        case 49: 
          { //System.out.println(yytext() + "\t\t\t" + "DOWNTO_KW\t\t\t" + '-');
	return YYParser.DOWNTO_KW;
          }
        case 101: break;
        case 50: 
          { //System.out.println(yytext() + "\t\t\t" + "PROGRAM_KW\t\t\t" + '-');
	return YYParser.PROGRAM_KW;
          }
        case 102: break;
        case 51: 
          { //System.out.println(yytext() + "\t\t\t" + "INTEGER_KW\t\t\t" + '-');
	return YYParser.INTEGER_KW;
          }
        case 103: break;
        case 52: 
          { //System.out.println(yytext() + "\t\t\t" + "PROCEDURE_KW\t\t\t" + '-');
	return YYParser.PROCEDURE_KW;
          }
        case 104: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return 0; }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
