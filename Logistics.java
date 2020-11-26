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

public class Logistics {

  public static final String documentation = "https://github.com/Ved-P/javelin";
  public static final String sourceCode = "https://github.com/Ved-P/javelin";

  public static void start() {
    System.out.println("\n\n\n");
    System.out.println("Starting Javelin ... ");
    System.out.println("Javelin (Java Language Interpreter) started.");
    System.out.println("Documentation: " + documentation);
    System.out.println("Source Code: " + sourceCode);
    System.out.println("Contributions are appreciated.\n");
  }

  public static void help() {
    System.out.println("You have accessed the help menu.");
    System.out.println("Javelin is an interpreter for coders to program in "
      + "Java, similar to how Shell works in Python. The help menu is still "
      + "under construction, and will be expanded soon.");
    System.out.println("COMMANDS:");
    System.out.printf("%10s:  %s%n", "help", "Opens the help menu.");
    System.out.printf("%10s:  %s%n", "quit", "Quits Javelin.");
    System.out.println("For more help, look at the documentation at:\n"
      + documentation);
  }

  public static void quit() {
    System.out.println("Quiting Javelin ... \n");
    System.out.println("Thanks for using Javelin!");
    System.out.println("\n\n\n");
    System.exit(0);
  }

}
