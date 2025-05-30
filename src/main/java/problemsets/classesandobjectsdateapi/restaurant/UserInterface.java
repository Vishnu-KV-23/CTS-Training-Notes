package problemsets.classesandobjectsdateapi.restaurant;
import problemsets.classesandobjectsdateapi.restaurant.Restaurant;

import java.util.Scanner;


public class UserInterface {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Name");
        //Restaurant customer = new Restaurant();
        String name;
        name = sc.next();
        System.out.println("Enter the Order Number");
        int orderNumber;
        orderNumber = sc.nextInt();
        System.out.println("Enter the delivery type");
        String deliveryType;
        deliveryType=sc.next();
        if (!deliveryType.equals("NormalOrder") && !deliveryType.equals("Parcel") && !deliveryType.equals("HomeDelivery"))
        {
            System.out.println("Invalid Order Type");
        }
        else {

            System.out.println("Enter the Food Name");
            String foodName;
            foodName = sc.next();

            System.out.println("Enter the phone Number");
            long phoneNumber;
            phoneNumber = sc.nextLong();

            System.out.println("Enter the price of the item");
            int price;
            price = sc.nextInt();

            Restaurant customer = new Restaurant(name, orderNumber, deliveryType, foodName, phoneNumber);
            double cost;
            cost = customer.calculateTotalBill(price);
            if (cost == -1) {
                System.out.println("Invalid Order Type");

            } else {
                System.out.println("Name " + customer.getCustomerName());
                System.out.println("Order Number " + customer.getOrderNumber());
                System.out.println("Delivery Type " + customer.getDeliveryType());
                System.out.println("Food Name " + customer.getFoodName());
                System.out.println("Phone Number " + customer.getPhoneNumber());
                System.out.println("Bill Amount " + cost);
            }

        }
    }
}
