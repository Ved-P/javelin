/**
 *  Logistics.java
 *
 *  Logistics is used by the Javelin class and provides static methods that are
 *  used when the user of Javelin requests a Javelin command, such as 'help'. It
 *  also provides important links as static final fields.
 *
 *  @author Ved Pradhan
 *  @since  November 25, 2020
 */

import java.util.HashMap;

public class Logistics {

  public static final String documentation = "https://github.com/Ved-P/javelin";
  public static final String sourceCode = "https://github.com/Ved-P/javelin";
  public static final HashMap<String, String> commands = new HashMap<String, String>() {{
    put("help", "Opens the help menu.");
    put("quit", "Quits Javelin.");
  }};

  /**
   *  Prints the information when Javelin starts up.
   *
   *  There are no parameters or return statements.
   */
  public static void start() {
    System.out.println(" \n\n\n");
    System.out.println(" Starting Javelin ... ");
    System.out.println(" Javelin (Java Language Interpreter) started.");
    System.out.println(" Documentation: " + documentation);
    System.out.println(" Source Code: " + sourceCode);
    System.out.println(" Contributions are appreciated.\n");
  }

  /**
   *  Takes in an input command and checks if the command exists in the HashMap
   *  of commands.
   *
   *  @param input A String command entered in the Javelin user interface.
   *  @return true if the input is a command, otherwise false.
   */
  public static boolean isCommand(String input) {
    for (String command : commands.keySet())
      if (input.equals(command))
        return true;
    return false;
  }

  /**
   *  Takes in an input command and calls the appropriate logistics method in
   *  response to the command.
   *
   *  @param command The command entered by the user.
   */
  public static void runCommand(String command) {
    switch (command) {
      case "help":
        help();
        break;
      case "quit":
        quit();
        break;
    }
  }

  /**
   *  Prints out the help menu when the command 'help' is called.
   *
   *  There are no parameters or return statements.
   */
  public static void help() {
    System.out.println("You have accessed the help menu.");
    System.out.println(" Javelin is an interpreter for coders to program in "
      + "Java, similar to how Shell works in Python.\n The help menu is still "
      + "under construction, and will be expanded soon.\n");
    System.out.println(" COMMANDS:");
    for (String command : commands.keySet() )
      System.out.printf("%10s:  %s%n", command, commands.get(command));
    System.out.print("\n For more help, look at the documentation at:\n "
      + documentation);
  }

  /**
   *  Prints out the ending information and quits Javelin when the command
   *  quit is called.
   *
   *  There are no parameters or return statements.
   */
  public static void quit() {
    System.out.println("Quiting Javelin ... \n");
    System.out.println(" Thanks for using Javelin!");
    System.out.println("\n\n\n");
    System.exit(0);
  }

}
