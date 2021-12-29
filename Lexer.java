/**
 *  Lexer.java
 *
 *  Lexer takes the code entered by the user and splits it into tokens that
 *  other classes like Interpreter can use.
 *
 *  @author Ved Pradhan
 *  @since  December 28, 2021
 */

import java.util.ArrayList;

public class Lexer {

  private String code;
  private int pos;
  private char current;

  /**
   *  Initializes field variables to help construct an instance of the class.
   *
   *  @param codeIn The code entered by the user.
   */
  public Lexer(String codeIn) {
    code = codeIn;
    pos = -1;
    advance();
  }

  /**
   *  Goes to the next character in the code.
   *
   *  There are no parameters or return statements.
   */
  public void advance() {
    pos++;
    if (pos < code.length())
      current = code.charAt(pos);
    else
      current = (char)0;
  }

  /**
   *  Creates an ArrayList of tokens from the code using the Token.java class.
   *
   *  @return An ArrayList containing the tokens.
   */
  public ArrayList<Token> makeTokens() {
    ArrayList<Token> tokens = new ArrayList<Token>();
    while (pos < code.length()) {
      switch (current) {
        case ' ': case '\t':
          advance();
          break;
        case '+':
          tokens.add( new Token(Token.PLUS) );
          advance();
          break;
        case '*':
          tokens.add( new Token(Token.TIMES) );
          advance();
          break;
        case '/':
          tokens.add( new Token(Token.DIV) );
          advance();
          break;
        case ';':
          tokens.add( new Token(Token.SEMI) );
          advance();
          break;
        case '(':
          tokens.add( new Token(Token.LPAREN) );
          advance();
          break;
        case ')':
          tokens.add( new Token(Token.RPAREN) );
          advance();
          break;
        case '-': case '.':
          tokens.add( makeNum() );
          break;
        default:
          if (Character.isDigit(current))
            tokens.add( makeNum() );
          else
            advance();
      }
    }
    return tokens;
  }

  /**
   *  Creates an INT or DOUBLE token given that the next few characters will be
   *  digits or a decimal point.
   *
   *  @return The token to be added to the ArrayList.
   */
  public Token makeNum() {
    String num = new String("");
    int dotCount = 0;
    Token res;
    if (current == '-') {
      num += current;
      advance();
    }
    while (pos < code.length() && (Character.isDigit(current) || current == '.')) {
      if (current == '.') {
        if (dotCount == 1)
          break;
        dotCount++;
        num += current;
      }
      else
        num += current;
      advance();
    }
    if (num.equals("-"))
      return new Token(Token.MINUS);
    if (num.equals("."))
      return new Token(Token.DOT);
    if (dotCount == 0)
      return new Token(Token.INT, num);
    return new Token(Token.DOUBLE, num);
  }

}
