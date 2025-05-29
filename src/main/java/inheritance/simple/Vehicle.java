package inheritance.simple;

public class Vehicle {

  private String model;

  public Vehicle() {
    System.out.println("Vehicle class constructor.");
  }

  public Vehicle(String model) {
    System.out.println("Vehicle class constructor 2.");
    this.model = model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  public void start() {
    System.out.println(model + " Started.");
  }

  public void stop() {
    System.out.println(model + " Stopped.");
  }

}
