package inheritance.payment;

// abstract class Processor {
//   public abstract void authenticate(String authToken);
//   public abstract void processPayment(double amount);
//   public abstract void sendReceipt(String email);
// }

/**
 * An interface is a purely abstract structure which can be used to define
 * abstract methods.
 * Multiple inhertiance is permitted. We use the implments keyword to inherit
 * from an interface.
 * All methods in the interface must be overriden. Any variables defined in an
 * interface is by default
 * public, static and final.
 * 
 * Changes from Java v8
 * 1. Default methods: Allows interfaces to have methods with body. Wre added to
 * maintain backward compatability.
 * 
 * 2. Static methods: Define some utility methods.
 * 
 * 3. FunctionlInterfaces: Interfaces with single abstract
 * method. @FunctionalInterface annotation is used to make an interface a functinal interface.
 * Can have multiple default or static methods.
 * 
 * 4. Lambda and Stream API integration
 * 
 * 5. Private methods in interfaces: Java v9
 */
public interface PaymentProcessor {

  void authenticate(String authToken);

  void processPayment(double amount);

  void sendReceipt(String email);

  default void someAction() {
    System.out.println("Default method");
    log();
  }

  default void anotherMethod() {
    System.out.println("Another default method");
  }

  static double convertToCurrency(String targetCurrency, String localCurrency, double amount) {
    return 0.0;
  }

  // Java v9 onwards
  private void log() {
    
  }
}

@FunctionalInterface
interface test {

  void someMethod();

  default void anotherMethod() {}
  default void anotherMethod2() {}
  default void anotherMethod3() {}

  static void secondMethod() {}
}