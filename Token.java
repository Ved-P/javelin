/**
 *  Token.java
 *
 *  Token represents a part of the code. This can be a number, a variable,
 *  an operation, or something similar. It has a type and an optional value.
 *
 *  @author Ved Pradhan
 *  @since  December 28, 2021
 */

public class Token {

  // Token type examples.
  public static final String INT = "INT";
  public static final String DOUBLE = "DOUBLE";
  public static final String PLUS = "PLUS";
  public static final String MINUS = "MINUS";
  public static final String TIMES = "TIMES";
  public static final String DIV  = "DIV";
  public static final String DOT  = "DOT";
  public static final String SEMI  = "SEMI";
  public static final String ASSIGN  = "ASSIGN";
  public static final String LPAREN  = "LPAREN";
  public static final String RPAREN  = "RPAREN";
  public static final String RESERV  = "RESERV";
  public static final String IDENT  = "IDENT";

  // Reserved keywords.
  public static final String[] reserved = new String[]{"abstract", "assert",
    "boolean", "break", "byte", "case", "catch", "char", "class", "const",
    "continue", "default", "double", "do", "else", "enum", "extends", "false",
    "final", "finally", "float", "for", "goto", "if", "implements", "import",
    "instanceof", "int", "interface", "long", "native", "new", "null",
    "package", "private", "protected", "public", "return", "short", "static",
    "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
    "transient", "true", "try", "void", "volatile",	"while"};

  // Instance-specific field variables.
  private String type;
  private String value;

  /**
   *  Initializes field variables to help construct an instance of the class.
   *
   *  @param typeIn The type of the token.
   */
  public Token(String typeIn) {
    type = typeIn;
    value = null;
  }

  /**
   *  Initializes field variables to help construct an instance of the class.
   *  This one also includes an option value parameter.
   *
   *  @param typeIn  The type of the token.
   *  @param valueIn The value of the token.
   */
  public Token(String typeIn, String valueIn) {
    type = typeIn;
    value = valueIn;
  }

  /**
   *  Gives the type and, if present, value as a String. Only used for debugging
   *  purposes.
   *
   *  @return The token in the following format: [TYPE(:VAL)].
   */
  public String toString() {
    if (value == null)
      return "[" + type + "]";
    return "[" + type + ":" + value + "]";
  }

}
