package lambdas;

public class GreetingLambda {
  public static void main(String[] args) {
    Greeting welcome    = () -> System.out.println("Welcome");
    Greeting helloWorld = () -> System.out.println("Hello World");

    welcome.greet();
    helloWorld.greet();

    // -> arrow operator lets the JVM know that this is a lambda expression

    /**
     * When creating a lambda expression,
     * 1. no need to specify any access specifier.
     * 2. no need to specify any return type.
     * 3. no need to specify a name to the method
     * 4. no need to specify the data types of the parameters
     * 5. use -> operator
     * 6. return statement is optional if it is an expression and not a block
     */

    MathOperation sum         = (a, b) -> a + b;
    MathOperation multiply    = (a, b) -> a * b;
    MathOperation quotient    = (a, b) -> a / b;
    // lambda blocks needs to terminated with a ;
    // return statements are manadatory here 
    MathOperation difference  = (a, b) -> {
      return a - b;
    };

  }

}

@FunctionalInterface
interface Greeting {
  void greet();
}

@FunctionalInterface // ensures one only abstract method is allowed here
interface MathOperation {
  double operation(double a, double b);
}