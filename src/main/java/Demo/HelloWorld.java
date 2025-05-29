/**
 * Always create packages and place the classes inside the packages.
 * Package name is always in lower case.
 * package statement must be the first statement in a Java source file
 * Only one package statement can be present in a java source file
 */
package demo;

/**
 * After the package statement you write the import statement.
 * import statement is optional, but if needed you can write multiple import statements
 * in a single java file.
 * By default java imports the java.lang package
 */

import java.lang.*; // optional, by default imported
import java.util.*;


/**
 * You can create multiple classes in one java source file.
 * You can create only one class with public access
 */
public class HelloWorld {
    // var x = 10; // not allowed

    /**
     * The main method in Java, which is the first method that will be executed in a Java application.
     * This is the default signature of the main method.
     */
    public static void main(String[] args) {


        System.out.println("Welcome to Java programming...");
        int x = 10;
        String name = "Ashish";
        char gender = 'M';
        boolean isAccountLocked = false;
        /**
         * Local type inference
         * var keyword allows you to declare variables without specifying the datatypes.
         * can only be used inside the methods
         */
        var y = 100.4;
        // var x = null; // cannot assign null values
        /**
         * Text blocks, use """ to declare text blocks
         */
        String welcomeMessage = """
                Hello,
                
                We are happy to welcome you into this program.
                Hope you have a very productive learning experience.
                
                Thanks
                Learning Team
                """;
        System.out.println(welcomeMessage);

        System.out.println();
        String alternateMessage = "Hello" + "\n\n" + "We are happy to welcome you into this program." +
                "\nHope you have a very productive learning experience." + "\n\n" +
                "Thanks" + "\n" + "Learning Team";
        System.out.println(alternateMessage);

        // final keyword can be used to define constants
        final double INTEREST_RATE = 6.4;
        // INTEREST_RATE = 10; // error

    }
}