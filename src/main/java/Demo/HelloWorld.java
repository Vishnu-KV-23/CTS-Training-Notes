/**
 * Always create packages and keep the classes in them
 * Package name is always small case
 * package statement must be the first statement in java source file
 */

package Demo;


/**
 * import statement to be written after package statements
 * import statement is optional]
 * there will be only one package statement
 * by default java imports java.lang package
 */
import java.lang.*; //optional,by default imported
import java.util.*;


//we can create multiple class files in a single source files
//but we can only create one public class access in source file

public class HelloWorld {
    //first method to execute while executing the java application, would not start if there is no main method
    //this is default signature of main method.
    public static void main(String[] args)
    {
        System.out.println("Welcome to java programming..");
        int x=10;
        String name="Vishnu";
        char gender='M';
        boolean AccountIsLocked = false ;
        /**
         * Local type inference
         * var helps you to declare variables without specifying the type
         *
         */
        var y=100.4;
        // var x=null , can not be assigned
        // var can not be used direcly in a class , only in methods,it is LOCAL meaning in the method , thus local type inference
        /**
         * Text blocks , to Print formatted text
         * TExt="""
         *
         * """
         */
        String WelcomeMessage= """
                Hi
                My name is Vishnu and 
                this is the example of Text bocks
                text would be properly formatted
                
                
                
                In the end""";
        System.out.println(WelcomeMessage);

//        final keyword used used to define constants
        final double INTEREST_RATE=7.456;
        //INTEREST_RATE=56; will throw an exception
        int age=18;
        if (age>=18){
            System.out.println("You can vote");
        }
        else {
            System.err.println("Not eligible to vote");
        }
        char grade ='A';
        if (grade=='A'){
            System.out.println("Grade is A");
        }
        else if (grade=='B'){
            System.out.println("grade is B");
        }
        else
        {
            System.out.print("You dont have grades");
        }

        String month="JAN";
        switch(month){
            case "JAN":
                System.out.print("january");
                break;
            case "FEB":
                System.out.print("february");
                break;
            default:
                System.out.println("Not a month");
        }
    }

}
