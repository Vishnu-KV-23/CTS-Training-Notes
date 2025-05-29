package demo;

public class SampleJava {
    public static void main(String[] args) {
        /**
         * Array: Finite collection of elements with same datatype, zero based indexing,
         * use the length property to find the size of an array, created using the new
         * keyword,are created in the heap memory, when you create an array all the
         * elements inside the array are initialized to their default values
         */
        int[] numbers = new int[5]; // numbers is an integer array with 5 elements
        int arr[] = new int[3]; // this decalration is not recommended
        numbers[0] = 1;
        numbers[1] = 10;
        numbers[2] = 20;
        numbers[3] = 30;
        numbers[4] = 40;

        // initialize array while decalring
        int[] evenNumbers = new int[] { 2, 4, 6, 8, 10 };

        /**
         * Loops: iterative programming structure, allows us to execeute a set of
         * statements for a fixed number of times.
         */

        // print the even numbers array
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // enhanced for loop
        for (var num : numbers) {
            System.out.println(num + " ");
        }
        System.out.println();

        // Local type inference
        var x = 10;

        // using var keyword while declaring array
        var decimalArr = new byte[10];
        for (var val : decimalArr) {
            System.out.print(val + ", ");
        }
        System.out.println();

        /**
         * Wrapper classes: Class types of primtive data types
         * Primitive    Wrapper
         * ---------------------------
         * byte         Byte
         * short        Short
         * int          Integer
         * long         Long
         * float        Float
         * double       Double
         * char         Character
         * boolean      Boolean
         */
    }
}
