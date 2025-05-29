package exceptions;

/**
 * 1. Create custome exception
 * 2. Learn about declaring exceptions and handling them (throw and throws)
 */
public class CustomExceptionDemo {
  public static void main(String[] args) {
    // main() <- a() <- b() <- c()
    User arun = new User(21, "Arun");
    User anoop = new User(17, "Anoop");

    try {
      arun.register();
      anoop.register();
    } catch (InvalidAgeException ex) {
      System.err.println("Error: "+ex.getMessage());
    }

  }
}

class User {
  private int age;
  private String name;

  public User(int age, String name) {
    this.age = age;
    this.name = name;
  }

  // Check if the age of the user is atleast 18, if not raise an exception
  // throws keyword declares that this method might raise an exception
  public void register() throws InvalidAgeException {
    if (age >= 18) {
      System.out.println("Hello " + name + ", you are eligible for registration.");
    } else {
      // use throw keyword to throw/raise an exception
      throw new InvalidAgeException(name + " is only " + age + " years old. Must be atleast 18 to register.");
    }
  }
}

/**
 * Create custom exception
 * 1. Define your exception class: create a class and inherit from
 * java.lang.Exception
 */
class InvalidAgeException extends Exception {
  public InvalidAgeException(String message) {
    super(message);
  }
}
