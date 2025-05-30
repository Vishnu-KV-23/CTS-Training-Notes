package problemsets.introtojava;
import java.util.Scanner;

public class HealthJourney {




        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            //Fill the code here
            System.out.println("Enter your name");
            String name = sc.nextLine();
            System.out.println("Enter your height in meters");
            float height = sc.nextFloat();
            System.out.println("Enter your weight in kilograms");
            float weight= sc.nextFloat();
            float BMI = (weight)/(height*height);
            if (BMI < 18.5)
            {
                System.out.print("Hello "+ name + ", Your BMI is ");
                System.out.format("%.2f", BMI);
                System.out.println();
                System.out.println("You are under the category Under weight.");
            }
            else if (BMI < 25)
            {
                System.out.print("Hello "+ name + ", Your BMI is ");
                System.out.format("%.2f", BMI);
                System.out.println();

                System.out.println("You are under the category Normal weight.");
            }
            else if (BMI <= 30)
            {
                System.out.print("Hello "+ name + ", Your BMI is ");
                System.out.format("%.2f", BMI);
                System.out.println();
                System.out.println("You are under the category Over weight.");
            }
            else
            {
                System.out.print("Hello "+ name + ", Your BMI is ");
                System.out.format("%.2f", BMI);
                System.out.println();
                System.out.println("You are under the category Obese.");
            }
        }



}
