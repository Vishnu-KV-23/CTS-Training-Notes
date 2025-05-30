package problemsets.introtojava;

import java.util.Scanner;

public class SquareSeries
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int number;
        number=sc.nextInt();
        int num=number;
        int sum;
        System.out.println("Required Square Increment Sequence");
        for (int i=0;i<=10;i++)
        {
            sum=0;
            sum=num*num+1;
            System.out.print(sum+" ");
            num=num+1;
        }
    }
}
