/**
 *  Interpreter.java
 *
 *  Interpreter is used by the Javelin class and uses other classes to
 *  interpret lines of code provided by the user and sends the correct result
 *  to be sent to the terminal.
 *
 *  @author Ved Pradhan
 *  @since  November 25, 2020
 */

import java.util.ArrayList;

public class Interpreter {

  private ArrayList<Token> tokens;

  /**
   *  Initializes field variables to help construct an instance of the class.
   *
   *  There are no parameters or return statements.
   */
  public Interpreter() {
    tokens = null;
  }

  /**
   *  Takes in a line of code and uses other classes to interpret the line of
   *  code.
   *
   *  @param code The line of code inputted by the user.
   *  @return The output to be printed to the terminal window.
   */
  public String interpret(String code) {
    Lexer lexer = new Lexer(code);
    tokens = lexer.makeTokens();
    String res = new String("");
    for (Token token : tokens)
      res += token + ", ";
    return res.substring(0, res.length() - 2);
  }

}
