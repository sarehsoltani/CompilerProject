
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007, 2008 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 1 of "parser.yac"  */
package phase2;
import java.io.*;


/**
 * A Bison parser, automatically generated from <tt>parser.yac</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.4.1";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int PROGRAM_KW = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int IDENTIFIER = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int VAR_KW = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int INTEGER_KW = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int REAL_KW = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int PROCEDURE_KW = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int END_KW = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int IF_KW = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN_KW = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE_KW = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int REPEAT_KW = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int EXIT_KW = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int FOR_KW = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int INTEGER_CONSTANT = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int TO_KW = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int DO_KW = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int BEGIN_KW = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int DOWNTO_KW = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int REAL_CONSTANT = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int DIV_KW = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int MOD_KW = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_KW = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_KW = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT_KW = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int EMPTY_KW = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOLEAN_KW = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int SEMICOLON_KW = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int COLON_KW = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMA_KW = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int SINGLE_QUOTE_KW = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int ASS_KW = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int LP_KW = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int RP_KW = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int LB_KW = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int RB_KW = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int LCB_KW = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int RCB_KW = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int QUESTION_KW = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUALS_KW = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int DOT_KW = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int LE_KW = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int LT_KW = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int GT_KW = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int GE_KW = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int EQ_KW = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int NE_KW = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int ADD_KW = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int SUB_KW = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int MUL_KW = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int WHITE_SPACE = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int NEWLINE = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOLEAN_CONSTANT = 309;
  /** Token number, to be returned by the scanner.  */
  public static final int ERROR_NO_SHARP = 310;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMENTS = 311;
  /** Token number, to be returned by the scanner.  */
  public static final int ERROR_ZERO = 312;
  /** Token number, to be returned by the scanner.  */
  public static final int IFX = 313;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token. 
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;
    
    public final void push (int state, Object value    	   	      	    ) {
      height++;
      if (size == height) 
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  
	  
	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      height--;
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");
      
      for (int i = 0; i < height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  /**
   * Returned by a Bison action in order to print an error message and start
   * error recovery.  */
  public static final int YYFAIL = 3;

  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.
    
       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);
    
    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 353 of lalr1.java  */
/* Line 64 of "parser.yac"  */
    {
		System.out.println("Rule 1: " +
			"program: PROGRAM_KW IDENTIFIER declarations procedure_list compound_statement");
	};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 353 of lalr1.java  */
/* Line 69 of "parser.yac"  */
    {
		System.out.println("Rule 2.1: " + "declarations: VAR_KW declaration_list SEMICOLON_KW");
	};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 353 of lalr1.java  */
/* Line 72 of "parser.yac"  */
    {
		System.out.println("Rule 2.2: " + "declarations: empty");
	};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 353 of lalr1.java  */
/* Line 77 of "parser.yac"  */
    {
		System.out.println("Rule 3.1: " + "declaration_list: identifier_list COLON_KW type");
	};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 353 of lalr1.java  */
/* Line 81 of "parser.yac"  */
    {
		System.out.println("Rule 3.2: " + "declaration_list: declaration_list SEMICOLON_KW identifier_list COLON_KW type");
	};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 353 of lalr1.java  */
/* Line 86 of "parser.yac"  */
    {
		System.out.println("Rule 4.1: " + "identifier_list: IDENTIFIER");
	};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 353 of lalr1.java  */
/* Line 90 of "parser.yac"  */
    {
		System.out.println("Rule 4.2: " + "identifier_list: identifier_list COMMA_KW IDENTIFIER");
	};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 353 of lalr1.java  */
/* Line 95 of "parser.yac"  */
    {
		System.out.println("Rule 5.1: " + "type: INTEGER_KW");
	};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 353 of lalr1.java  */
/* Line 99 of "parser.yac"  */
    {
		System.out.println("Rule 5.2: " + "type: REAL_KW");
	};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 353 of lalr1.java  */
/* Line 104 of "parser.yac"  */
    {
		System.out.println("Rule 6.1: " + "procedure_list: procedure_list procedure");
	};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 353 of lalr1.java  */
/* Line 107 of "parser.yac"  */
    {
		System.out.println("Rule 6.2: " + "procedure_list: empty");
	};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 353 of lalr1.java  */
/* Line 112 of "parser.yac"  */
    {
		System.out.println("Rule 7: " + "procedure: PROCEDURE_KW IDENTIFIER parameters SEMICOLON_KW declarations compound_statement SEMICOLON_KW");
	};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 353 of lalr1.java  */
/* Line 117 of "parser.yac"  */
    {
      System.out.println("Rule 8.1: " +
      "parameters: LP_KW declaration_list RP_KW");
    };
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 353 of lalr1.java  */
/* Line 121 of "parser.yac"  */
    {
      System.out.println("Rule 8.2: " +
      "arguments: empty");
    };
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 353 of lalr1.java  */
/* Line 128 of "parser.yac"  */
    {
			System.out.println("Rule 9: " + "compound_statement :BEGIN_KW statement_list END_KW");
		};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 353 of lalr1.java  */
/* Line 135 of "parser.yac"  */
    {
			System.out.println("Rule 10.1: " + "statement_list: statement");
		};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 353 of lalr1.java  */
/* Line 139 of "parser.yac"  */
    {
			System.out.println("Rule 10.2: " + "statement_list : statement_list SEMICOLON_KW statement");
		};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 353 of lalr1.java  */
/* Line 146 of "parser.yac"  */
    {
			System.out.println("Rule 11.1" + "statement: IDENTIFIER ASS_KW expression");
		};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 353 of lalr1.java  */
/* Line 150 of "parser.yac"  */
    {
			System.out.println("Rule 11.2" + "statement : IF_KW expression THEN_KW statement ELSE_KW statement END_KW");
		};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 353 of lalr1.java  */
/* Line 154 of "parser.yac"  */
    {
			System.out.println("Rule 11.3" + "statement : IF_KW expression THEN_KW statement END_KW");
		};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 353 of lalr1.java  */
/* Line 158 of "parser.yac"  */
    {
			System.out.println("Rule 11.4" + "statement : REPEAT_KW statement_list EXIT_KW IF_KW expression statement_list END_KW");
		};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 353 of lalr1.java  */
/* Line 162 of "parser.yac"  */
    {
			System.out.println("Rule 11.5" + "statement : compound_statement");
		};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 353 of lalr1.java  */
/* Line 166 of "parser.yac"  */
    {
			System.out.println("Rule 11.6" + "statement : IDENTIFIER arguments");
		};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 353 of lalr1.java  */
/* Line 170 of "parser.yac"  */
    {
			System.out.println("Rule 11.7" + "statement : FOR_KW IDENTIFIER EQUALS_KW INTEGER_CONSTANT TO_KW INTEGER_CONSTANT DO_KW BEGIN_KW statement_list END_KW");
		};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 353 of lalr1.java  */
/* Line 174 of "parser.yac"  */
    {
			System.out.println("Rule 11.8" + "statement : FOR_KW IDENTIFIER EQUALS_KW INTEGER_CONSTANT DOWNTO_KW INTEGER_CONSTANT DO_KW BEGIN_KW statement_list END_KW");
		};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 353 of lalr1.java  */
/* Line 177 of "parser.yac"  */
    {
			System.out.println("Rule 11.9: " + "statement: empty");
		};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 353 of lalr1.java  */
/* Line 184 of "parser.yac"  */
    {
			System.out.println("Rule 12.1: " +
			"arguments: LP_KW actual_parameter_list RP_KW");
		};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 353 of lalr1.java  */
/* Line 188 of "parser.yac"  */
    {
			System.out.println("Rule 12.2: " +
			"arguments: empty");
		};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 353 of lalr1.java  */
/* Line 196 of "parser.yac"  */
    {
			System.out.println("Rule 13.1: " + "actual_parameter_list : actual_parameter_list COMMA_KW actual_parameter");
		};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 353 of lalr1.java  */
/* Line 200 of "parser.yac"  */
    {
			System.out.println("Rule 13.2: " + "actual_parameter_list : actual_parameter");
		};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 353 of lalr1.java  */
/* Line 206 of "parser.yac"  */
    {
			System.out.println("Rule 14.1: " + "actual_parameter : expression");
		};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 353 of lalr1.java  */
/* Line 210 of "parser.yac"  */
    {
			System.out.println("Rule 15.1: " + "expression: INTEGER_CONSTANT");
		};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 353 of lalr1.java  */
/* Line 214 of "parser.yac"  */
    {
			System.out.println("Rule 15.2: " + "expression: REAL_CONSTANT");
		};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 353 of lalr1.java  */
/* Line 218 of "parser.yac"  */
    {
			System.out.println("Rule 15.3: " + "expression: IDENTIFIER");
		};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 353 of lalr1.java  */
/* Line 222 of "parser.yac"  */
    {
			System.out.println("Rule 15.4: " + "expression: expression ADD_KW expression");
		};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 353 of lalr1.java  */
/* Line 226 of "parser.yac"  */
    {
			System.out.println("Rule 15.5: " + "expression: expression SUB_KW expression");
		};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 353 of lalr1.java  */
/* Line 230 of "parser.yac"  */
    {
			System.out.println("Rule 15.6: " + "expression: expression MUL_KW expression");
		};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 353 of lalr1.java  */
/* Line 234 of "parser.yac"  */
    {
			System.out.println("Rule 15.7: " + "expression: expression DIV_KW expression");
		};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 353 of lalr1.java  */
/* Line 238 of "parser.yac"  */
    {
			System.out.println("Rule 15.8: " + "expression: SUB_KW expression");
		};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 353 of lalr1.java  */
/* Line 242 of "parser.yac"  */
    {
			System.out.println("Rule 15.9: " + "expression: expression MOD_KW expression");
		};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 353 of lalr1.java  */
/* Line 246 of "parser.yac"  */
    {
			System.out.println("Rule 15.19: " + "expression : LP_KW expression RP_KW");
		};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 353 of lalr1.java  */
/* Line 250 of "parser.yac"  */
    {
			System.out.println("Rule 15.18: " + "expression :NOT_KW expression");
		};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 353 of lalr1.java  */
/* Line 254 of "parser.yac"  */
    {
			System.out.println("Rule 15.17: " + "expression :expression OR_KW expression");
		};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 353 of lalr1.java  */
/* Line 258 of "parser.yac"  */
    {
			System.out.println("Rule 15.16: " + "expression :expression AND_KW expression");
		};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 353 of lalr1.java  */
/* Line 262 of "parser.yac"  */
    {
			System.out.println("Rule 15.15: " + "expression :  expression GE_KW expression");
		};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 353 of lalr1.java  */
/* Line 266 of "parser.yac"  */
    {
			System.out.println("Rule 15.14: " + "expression :  expression GT_KW expression");
		};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 353 of lalr1.java  */
/* Line 269 of "parser.yac"  */
    {
			System.out.println("Rule 15.13: " + "expression :  expression NE_KW expression");
		};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 353 of lalr1.java  */
/* Line 273 of "parser.yac"  */
    {
			System.out.println("Rule 15.12: " + "expression :  expression EQ_KW expression");
		};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 353 of lalr1.java  */
/* Line 277 of "parser.yac"  */
    {
			System.out.println("Rule 15.11: " + "expression :  expression LE_KW expression");
		};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 353 of lalr1.java  */
/* Line 281 of "parser.yac"  */
    {
			System.out.println("Rule 15.10: " + "expression :  expression LT_KW expression");
		};
  break;
    



/* Line 353 of lalr1.java  */
/* Line 949 of "parser.cac"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);
    
        /* Accept?  */
        if (yystate == yyfinal_)
          return true;
    
        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyn == yypact_ninf_)
          {
            label = YYDEFAULT;
	    break;
          }
    
        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }
    
        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
	    		     yylval);
          }
    
        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;
    
        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yyn == 0 || yyn == yytable_ninf_)
	      label = YYFAIL;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }
    
        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
	    		     yylval);
    
            /* Discard the token being shifted.  */
            yychar = yyempty_;
    
            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;
    
            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;
    
      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYFAIL;
        else
          label = YYREDUCE;
        break;
    
      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;
    
      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYFAIL:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
	    ++yynerrs_;
	    yyerror (yysyntax_error (yystate, yytoken));
          }
    
        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */
    
	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }
    
        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;
    
      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:
    
        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;
    
      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */
    
        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (yyn != yypact_ninf_)
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }
    
	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;
    
	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }
    
	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);
    
        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;
    
        /* Accept.  */
      case YYACCEPT:
        return true;
    
        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        int yyn = yypact_[yystate];
        if (yypact_ninf_ < yyn && yyn <= yylast_)
          {
	    StringBuffer res;

	    /* Start YYX at -YYN if negative to avoid negative indexes in
	       YYCHECK.  */
	    int yyxbegin = yyn < 0 ? -yyn : 0;

	    /* Stay within bounds of both yycheck and yytname.  */
	    int yychecklim = yylast_ - yyn + 1;
	    int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
	    int count = 0;
	    for (int x = yyxbegin; x < yyxend; ++x)
	      if (yycheck_[x + yyn] == x && x != yyterror_)
	        ++count;

	    // FIXME: This method of building the message is not compatible
	    // with internationalization.
	    res = new StringBuffer ("syntax error, unexpected ");
	    res.append (yytnamerr_ (yytname_[tok]));
	    if (count < 5)
	      {
	        count = 0;
	        for (int x = yyxbegin; x < yyxend; ++x)
	          if (yycheck_[x + yyn] == x && x != yyterror_)
		    {
		      res.append (count++ == 0 ? ", expecting " : " or ");
		      res.append (yytnamerr_ (yytname_[x]));
		    }
	      }
	    return res.toString ();
          }
      }

    return "syntax error";
  }


  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -45;
  private static final short yypact_[] =
  {
        10,    21,    60,    82,   -45,    61,   -45,   -45,    34,   -19,
      43,    61,    13,    89,    90,   114,   -45,   -45,    59,   -45,
     -45,   -45,   -45,    63,    58,    62,   114,    95,   -45,    44,
     -45,    13,    61,    81,    62,    62,   -45,   -45,   -45,   -45,
      62,    62,    62,    98,    84,    70,   -45,   114,   -45,   -20,
      82,   -17,    23,   -45,   -17,   -45,   115,     1,   114,    62,
      62,    62,    62,    62,    62,    62,    62,    62,    62,    62,
      62,    62,   104,    99,   -45,    61,   -45,    97,    62,   -45,
     -45,   105,   -45,   -45,   145,   129,    -1,    -1,    -1,    -1,
     159,   159,     1,     1,   -45,    62,    39,    96,   -45,   114,
      57,   103,   110,   -45,   -45,    48,   112,   113,   -45,   109,
     116,   114,   114,    55,    66,   -45,   -45
  };

  /* YYDEFACT[S] -- default rule to reduce with in state S when YYTABLE
     doesn't specify something else to do.  Zero means the default is an
     error.  */
  private static final byte yydefact_[] =
  {
         0,     0,     0,     4,     1,     0,    12,     7,     0,     0,
       0,     3,     0,     0,     0,    27,    11,     2,     0,     9,
      10,     5,     8,    15,    29,     0,    27,     0,    23,     0,
      17,     0,     0,     0,     0,     0,    24,    35,    33,    34,
       0,     0,     0,     0,     0,     0,    16,    27,     6,     0,
       4,    19,     0,    31,    32,    43,     0,    40,    27,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,    18,     0,    14,     0,     0,    28,
      42,    21,    39,    41,    45,    44,    50,    51,    47,    46,
      49,    48,    36,    37,    38,     0,     0,     0,    30,    27,
      27,     0,     0,    13,    20,     0,     0,     0,    22,     0,
       0,    27,    27,     0,     0,    25,    26
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final byte yypgoto_[] =
  {
       -45,   -45,    86,   100,    -7,   123,   -45,   -45,   -45,    -8,
     -26,   -44,   -45,   -45,    56,   -24
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final byte
  yydefgoto_[] =
  {
        -1,     2,     6,     8,     9,    21,    10,    16,    33,    28,
      29,    30,    36,    52,    53,    54
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If zero, do what YYDEFACT says.  */
  private static final byte yytable_ninf_ = -1;
  private static final byte
  yytable_[] =
  {
        44,    43,    17,    74,    18,    59,    60,    61,    62,    75,
      51,    12,    13,     1,    81,    76,    55,    56,    57,    19,
      20,    59,    60,    59,    60,     3,    63,    64,    65,    66,
      67,    68,    69,    70,    71,    82,    83,    84,    85,    86,
      87,    88,    89,    90,    91,    92,    93,    94,    69,    70,
      71,    14,    71,    46,    78,   104,   101,   108,    79,   102,
       4,    24,    15,    11,   115,     7,    37,    25,    18,    97,
      26,   100,    27,    47,   105,   116,    15,    47,    38,    59,
      60,    61,    62,    39,    47,   113,   114,     5,    40,    31,
      13,    34,    35,    22,    23,    47,    41,    32,    72,    45,
      63,    64,    65,    66,    67,    68,    69,    70,    71,    58,
      50,    73,    42,    47,    95,    96,    15,    99,    24,   106,
      59,    60,    61,    62,    25,   103,   107,    26,   111,    27,
     109,   110,    49,    15,    98,   112,    77,    59,    60,    61,
      62,    63,    64,    65,    66,    67,    68,    69,    70,    71,
      80,    59,    60,    61,    48,     0,     0,     0,    63,    64,
      65,    66,    67,    68,    69,    70,    71,    59,    60,     0,
       0,     0,    63,    64,    65,    66,    67,    68,    69,    70,
      71,    59,    60,     0,     0,     0,     0,     0,    63,    64,
      65,    66,    67,    68,    69,    70,    71,     0,     0,     0,
       0,     0,    63,    64,    65,    66,     0,     0,    69,    70,
      71
  };

  /* YYCHECK.  */
  private static final byte
  yycheck_[] =
  {
        26,    25,    10,    47,    11,    22,    23,    24,    25,    29,
      34,    30,    31,     3,    58,    35,    40,    41,    42,     6,
       7,    22,    23,    22,    23,     4,    43,    44,    45,    46,
      47,    48,    49,    50,    51,    59,    60,    61,    62,    63,
      64,    65,    66,    67,    68,    69,    70,    71,    49,    50,
      51,     8,    51,     9,    31,    99,    17,     9,    35,    20,
       0,     4,    19,    29,     9,     4,     4,    10,    75,    77,
      13,    95,    15,    29,   100,     9,    19,    29,    16,    22,
      23,    24,    25,    21,    29,   111,   112,     5,    26,    30,
      31,    33,    34,     4,     4,    29,    34,    34,    14,     4,
      43,    44,    45,    46,    47,    48,    49,    50,    51,    11,
      29,    41,    50,    29,    10,    16,    19,    12,     4,    16,
      22,    23,    24,    25,    10,    29,    16,    13,    19,    15,
      18,    18,    32,    19,    78,    19,    50,    22,    23,    24,
      25,    43,    44,    45,    46,    47,    48,    49,    50,    51,
      35,    22,    23,    24,    31,    -1,    -1,    -1,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    22,    23,    -1,
      -1,    -1,    43,    44,    45,    46,    47,    48,    49,    50,
      51,    22,    23,    -1,    -1,    -1,    -1,    -1,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    -1,    -1,    -1,
      -1,    -1,    43,    44,    45,    46,    -1,    -1,    49,    50,
      51
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,     3,    62,     4,     0,     5,    63,     4,    64,    65,
      67,    29,    30,    31,     8,    19,    68,    70,    65,     6,
       7,    66,     4,     4,     4,    10,    13,    15,    70,    71,
      72,    30,    34,    69,    33,    34,    73,     4,    16,    21,
      26,    34,    50,    76,    71,     4,     9,    29,    66,    64,
      29,    76,    74,    75,    76,    76,    76,    76,    11,    22,
      23,    24,    25,    43,    44,    45,    46,    47,    48,    49,
      50,    51,    14,    41,    72,    29,    35,    63,    31,    35,
      35,    72,    76,    76,    76,    76,    76,    76,    76,    76,
      76,    76,    76,    76,    76,    10,    16,    70,    75,    12,
      76,    17,    20,    29,    72,    71,    16,    16,     9,    18,
      18,    19,    19,    71,    71,     9,     9
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312,   313,   314,
     315
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    61,    62,    63,    63,    64,    64,    65,    65,    66,
      66,    67,    67,    68,    69,    69,    70,    71,    71,    72,
      72,    72,    72,    72,    72,    72,    72,    72,    73,    73,
      74,    74,    75,    76,    76,    76,    76,    76,    76,    76,
      76,    76,    76,    76,    76,    76,    76,    76,    76,    76,
      76,    76
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     5,     3,     0,     3,     5,     1,     3,     1,
       1,     2,     0,     7,     3,     0,     3,     1,     3,     3,
       6,     4,     7,     1,     2,    10,    10,     0,     3,     0,
       3,     1,     1,     1,     1,     1,     3,     3,     3,     3,
       2,     3,     3,     2,     3,     3,     3,     3,     3,     3,
       3,     3
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "PROGRAM_KW", "IDENTIFIER", "VAR_KW",
  "INTEGER_KW", "REAL_KW", "PROCEDURE_KW", "END_KW", "IF_KW", "THEN_KW",
  "ELSE_KW", "REPEAT_KW", "EXIT_KW", "FOR_KW", "INTEGER_CONSTANT", "TO_KW",
  "DO_KW", "BEGIN_KW", "DOWNTO_KW", "REAL_CONSTANT", "DIV_KW", "MOD_KW",
  "AND_KW", "OR_KW", "NOT_KW", "EMPTY_KW", "BOOLEAN_KW", "SEMICOLON_KW",
  "COLON_KW", "COMMA_KW", "SINGLE_QUOTE_KW", "ASS_KW", "LP_KW", "RP_KW",
  "LB_KW", "RB_KW", "LCB_KW", "RCB_KW", "QUESTION_KW", "EQUALS_KW",
  "DOT_KW", "LE_KW", "LT_KW", "GT_KW", "GE_KW", "EQ_KW", "NE_KW", "ADD_KW",
  "SUB_KW", "MUL_KW", "WHITE_SPACE", "NEWLINE", "BOOLEAN_CONSTANT",
  "ERROR_NO_SHARP", "COMMENTS", "ERROR_ZERO", "IFX", "\"THEN_KW\"",
  "\"ELSE_KW\"", "$accept", "program", "declarations", "declaration_list",
  "identifier_list", "type", "procedure_list", "procedure", "parameters",
  "compound_statement", "statement_list", "statement", "arguments",
  "actual_parameter_list", "actual_parameter", "expression", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        62,     0,    -1,     3,     4,    63,    67,    70,    -1,     5,
      64,    29,    -1,    -1,    65,    30,    66,    -1,    64,    29,
      65,    30,    66,    -1,     4,    -1,    65,    31,     4,    -1,
       6,    -1,     7,    -1,    67,    68,    -1,    -1,     8,     4,
      69,    29,    63,    70,    29,    -1,    34,    64,    35,    -1,
      -1,    19,    71,     9,    -1,    72,    -1,    71,    29,    72,
      -1,     4,    33,    76,    -1,    10,    76,    11,    72,    12,
      72,    -1,    10,    76,    11,    72,    -1,    13,    71,    14,
      10,    76,    71,     9,    -1,    70,    -1,     4,    73,    -1,
      15,     4,    41,    16,    17,    16,    18,    19,    71,     9,
      -1,    15,     4,    41,    16,    20,    16,    18,    19,    71,
       9,    -1,    -1,    34,    74,    35,    -1,    -1,    74,    31,
      75,    -1,    75,    -1,    76,    -1,    16,    -1,    21,    -1,
       4,    -1,    76,    49,    76,    -1,    76,    50,    76,    -1,
      76,    51,    76,    -1,    76,    22,    76,    -1,    50,    76,
      -1,    76,    23,    76,    -1,    34,    76,    35,    -1,    26,
      76,    -1,    76,    25,    76,    -1,    76,    24,    76,    -1,
      76,    46,    76,    -1,    76,    45,    76,    -1,    76,    48,
      76,    -1,    76,    47,    76,    -1,    76,    43,    76,    -1,
      76,    44,    76,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     9,    13,    14,    18,    24,    26,    30,
      32,    34,    37,    38,    46,    50,    51,    55,    57,    61,
      65,    72,    77,    85,    87,    90,   101,   112,   113,   117,
     118,   122,   124,   126,   128,   130,   132,   136,   140,   144,
     148,   151,   155,   159,   162,   166,   170,   174,   178,   182,
     186,   190
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,    64,    64,    69,    72,    77,    81,    86,    90,    95,
      99,   104,   107,   112,   117,   121,   127,   134,   138,   145,
     149,   153,   157,   161,   165,   169,   173,   177,   183,   188,
     195,   199,   205,   210,   214,   218,   222,   226,   230,   234,
     238,   242,   245,   249,   253,   257,   261,   265,   268,   272,
     276,   280
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 210;
  private static final int yynnts_ = 16;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 4;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 61;

  private static final int yyuser_token_number_max_ = 315;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 875 of lalr1.java  */
/* Line 7 of "parser.yac"  */

	static PrintStream writer;

    public static void main(String args[]) throws IOException, FileNotFoundException {
        YYParser yyparser;
        final Yylex lexer;

        writer = new PrintStream(new File("output.txt"));
        lexer = new Yylex(new InputStreamReader(new FileInputStream("testcase.txt")));

        yyparser = new YYParser(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {

                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error :" + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error : " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        yyparser.parse();

        return;
    }



/* Line 875 of lalr1.java  */
/* Line 1659 of "parser.cac"  */

}


