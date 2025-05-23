package Demo;

public class SampleJava {
    public static void main(String[] args){
        int[] evenNumbers = new int[] {2,4,6,8,10};
        /**
         * loops
         */
        for (int i=0;i<evenNumbers.length;i++)
        {
            System.out.println(evenNumbers[i] + " ");
        }

        /** Enchanced for loop
         *
         */
        System.out.println("Enchanced for loop");
        for (var num : evenNumbers){
            System.out.println(num + " ");
        }
        /**
         * When initialising using var , it will have default values
         * vae decimalArr =new String[10]
         * S.o.p decimalArr will give us 10 nulls
         * if its boolean 10 false
//         */
///**
// Wrapper classes: Class types of primtive data tyres
// Primitive
// byte
// short
// int
// long
// float
// double
// char
// boolean
// Wrapper
// Byte
// Short
// Integer
// Long
// Float
// Double
// Character
// Boolean
  //VAR MUST ALLWAYS HAVE A VALUE ASSIGNED TO IT

    }

}
