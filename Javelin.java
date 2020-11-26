/**
 *  Javelin.java
 *
 *  Javelin uses classes such as Logistics and Interpreter to set up a coding
 *  environment in a terminal window for coders to code in Java on the spot.
 *  It is very similar to how Shell works in Python.
 *
 *  @author Ved Pradhan
 *  @since  November 25, 2020
 */

import java.util.Scanner;

public class Javelin {

  private Scanner in;
  private Interpreter interpreter;

  /**
   *  Initializes field variables to help construct an instance of the class.
   *
   *  There are no parameters or return statements.
   */
  public Javelin() {
    in = new Scanner(System.in);
    interpreter = new Interpreter();
  }

  /**
   *  Creates an instance of the class and calls the launch method to launch
   *  the interpreter.
   *
   *  @param args An array of Strings that will not be used in the program.
   */
  public static void main(String[] args) {
    Javelin javelin = new Javelin();
    javelin.launch();
  }

  /**
   *  Uses classes such as Logistics and Interpreter to interpret the java code
   *  and run it.
   *
   *  There are no parameters and return statements.
   */
  public void launch() {
    Logistics.start();
    String input = "";

    while (true) {
      System.out.print(" --> ");
      input = in.nextLine();
      System.out.print(" ---> ");

      if (Logistics.isCommand(input))
        Logistics.runCommand(input);

      System.out.println("\n");
    }
  }
}
