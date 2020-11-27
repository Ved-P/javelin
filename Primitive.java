/**
 *  Primitive.java
 *
 *  Primitive is a subclass of value and stores data for primitive varibales.
 *  It also stores the data type so it can be accessed later.
 *
 *  @author Ved Pradhan
 *  @since  November 26, 2020
 */

public class Primitive extends Value {

  public enum Type {
    BOOLEAN,
    BYTE,
    CHAR,
    SHORT,
    INT,
    LONG,
    FLOAT,
    DOUBLE
  }

  private Type dataType;
  private boolean boolVal;
  private byte byteVal;
  private char charVal;
  private short shortVal;
  private int intVal;
  private long longVal;
  private float floatVal;
  private double doubleVal;

  /**
   *  Initializes the field variables dataType and the field that corresponds
   *  to the correct data type.
   *
   *  @param dType The data type of the primitive as a String.
   *  @param value The value of the primitive as a String.
   */
  public Primitive(String dType, String value) {
    switch (dType) {
      case "boolean":
        dataType = Type.BOOLEAN;
        boolVal = Boolean.parseBoolean(value);
        break;
      case "byte":
        dataType = Type.BYTE;
        byteVal = Byte.parseByte(value);
        break;
      case "char":
        dataType = Type.CHAR;
        charVal = value.charAt(0);
        break;
      case "short":
        dataType = Type.SHORT;
        shortVal = Short.parseShort(value);
        break;
      case "int":
        dataType = Type.INT;
        intVal = Integer.parseInt(value);
        break;
      case "long":
        dataType = Type.LONG;
        longVal = Long.parseLong(value);
        break;
      case "float":
        dataType = Type.FLOAT;
        floatVal = Float.parseFloat(value);
        break;
      case "double":
        dataType = Type.DOUBLE;
        doubleVal = Double.parseDouble(value);
        break;
    }
  }

  /**
   *  Returns the data type of the variable.
   *
   *  @return The data type of the variable as an enum of Type.
   */
  public Type getDataType() {
    return dataType;
  }

  /**
   *  Gets the value for the correct data type of this primitive.
   *
   *  @return The value of the primitive, as a String.
   */
  public String getValue() {
    switch (dataType) {
      case BOOLEAN:
        return "" + boolVal;
      case BYTE:
        return "" + byteVal;
      case CHAR:
        return "" + charVal;
      case SHORT:
        return "" + shortVal;
      case INT:
        return "" + intVal;
      case LONG:
        return "" + longVal;
      case FLOAT:
        return "" + floatVal;
      case DOUBLE:
        return "" + doubleVal;
    }
    return "";
  }
}
