package problemsets.classesandobjectsdateapi.restaurant;

public class Restaurant {


    public Restaurant(String customerName, int orderNumber, String deliveryType, String foodName, long phoneNumber) {
        this.customerName = customerName;
        this.orderNumber = orderNumber;
        this.deliveryType = deliveryType;
        this.foodName = foodName;
        this.phoneNumber = phoneNumber;
    }

    private String customerName;
    private int orderNumber;
    private String deliveryType;
    private String foodName;
    private long phoneNumber;

    public String getCustomerName() {
        return customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public double calculateTotalBill(double cost){

        if (deliveryType.equals("HomeDelivery")){

            return (0.8*cost+cost);
        }
        else if (deliveryType.equals("Parcel")){

            return (0.5*cost+cost);
        }
        else if (deliveryType.equals("NormalOrder")){

            return (0.3*cost+cost);
        }
        else
        {
            return -1;
        }

        

    }
}
