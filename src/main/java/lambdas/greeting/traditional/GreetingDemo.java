package lambdas.greeting.traditional;

/**
 * Functions in Java encapsulates the behaviour of that class. Functions cannot
 * exist in isolation. They are always part of an object.
 * 
 */
public class GreetingDemo {
  public static void main(String[] args) {
    Greeting welcome = new Welcome();
    Greeting helloWorld = new HelloWorld();
    welcome.greet();
    helloWorld.greet();
  }
}

class HelloWorld implements Greeting {
  @Override
  public void greet() {
    System.out.println("Helloworld from Java");
  }
}

class Welcome implements Greeting {
  @Override
  public void greet() {
    System.out.println("Welcome to Java");
  }
}

interface Greeting {
  void greet();
}