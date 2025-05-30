package problemsets.introtojava;


import java.util.Scanner;

public class WaterTankCapacity  {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Fill the code here
        System.out.println("Enter the radius");
        float radius;
        float height;

        radius=sc.nextInt();
        System.out.println("Enter the height");
        height=sc.nextInt();
        if (radius<=0 || height<=0){
            System.out.println("Invalid measurement");
        }
        else
        {
            double totalCapacity;
            double alarmCapacity;
            totalCapacity=3.14*radius*radius*height;
            alarmCapacity=0.75*totalCapacity;
            System.out.printf("Total capacity is %.2f litres\n",totalCapacity);
            System.out.printf("Capacity for alarm is %.2f litres",alarmCapacity);
        }
    }

}
