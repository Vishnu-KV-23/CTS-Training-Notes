// Lambda Expression Example in Java
package lambdas;
@FunctionalInterface
interface Greeting {
    void greet();
}

@FunctionalInterface
interface MathOperation {
    double operation(double a, double b);
}

public class GreetingLambda {
    public static void main(String[] args) {
        // Lambda expressions for Greeting
        Greeting welcome = () -> System.out.println("Welcome");
        Greeting helloWorld = () -> System.out.println("Hello World");

        // Call the greet methods
        welcome.greet();
        helloWorld.greet();

        // Lambda expression for MathOperation
        MathOperation sum = (a, b) -> a + b;



        // Using the MathOperation
        double result = sum.operation(5.0, 3.0);
        System.out.println("Sum: " + result);
    }
}
