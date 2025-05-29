package CoreJavaProblems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WaterTankCapacity {



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Fill the code here
        System.out.println("Enter the radius:");
        float radius;
        float height;
        radius=sc.nextInt();
        System.out.println("Enter the height:");
        height=sc.nextInt();
        double totalCapacity;
        double alarmCapacity;
        totalCapacity=3.14*radius*radius*height;
        alarmCapacity=0.75*totalCapacity;
        System.out.printf("Total Capacity is %.2f\n",totalCapacity);
        System.out.printf("Capacity for alarm is %.2f",alarmCapacity);

    }
}
