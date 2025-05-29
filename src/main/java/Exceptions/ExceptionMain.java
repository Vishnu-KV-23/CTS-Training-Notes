package exceptions;

/**
 * Exceptions: Unwanted or unforseen situations or events that disrupts the
 * normal flow of a program.
 * To handle such scenarios, we can either use the handle rule or declare rule.
 * 
 * Handle an exception
 * try - enclose the statements that might cause an exception
 * catch - catch the exception and handle the error
 * finally - allows you execute code irrespective of the exception
 * 
 * java.lang.Throwable
 * --java.lang.Error      - Environment related issues that cannot be handled
 * --java.lang.Exception  - Runtime unwanted issues which needs to be handled 
 * ------Checked    - Checked ar compile time, must be declared or handled
 * ------Unchecked  - Runtime exceptions
 */
public class ExceptionMain {

  public static void main(String[] args) {
    System.out.println("Program to divide two numbers");
    int number1 = 0;
    int number2 = 0;
    int q = 0;

    try {
      System.out.println("Provide value to number 1: ");
      String strNum1 = System.console().readLine().trim();
      number1 = Integer.parseInt(strNum1); // 1

      System.out.println("Provide value to number 2: ");
      String strNum2 = System.console().readLine().trim();
      number2 = Integer.parseInt(strNum2); // 2

      q = number1 / number2; // 3
      System.out.println("Q = " + q);
    } catch (NumberFormatException | ArithmeticException ex) {
      System.err.println("Error while executing: " + ex.getMessage());
    } catch (Exception ex) {
      System.err.println(ex.getMessage());
    } finally {
      System.out.println("Exiting the program");
    }
  }
}
