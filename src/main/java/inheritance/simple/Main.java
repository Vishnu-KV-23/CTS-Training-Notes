package inheritance.simple;

public class Main {

  // static class InnerClass{} Allowed
  public static void main(String[] args) {

    System.out.println("Vehicle");
    Vehicle v = new Vehicle("Truck");
    v.start();
    v.stop();
    System.out.println();
    
    System.out.println("Car");
    Car c = new Car("Innova");
    // c.setModel("Innova");
    c.start();
    c.adjustAC();
    c.stop();
    System.out.println();

    System.out.println("Sports car");
    SportsCar sc = new SportsCar("Aventador");
    // sc.setModel("Aventador");
    sc.start();
    sc.tuneEngine();
    sc.stop();

  }
}
