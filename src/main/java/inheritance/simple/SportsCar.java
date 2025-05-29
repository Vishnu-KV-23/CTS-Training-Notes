package inheritance.simple;

public class SportsCar extends Car {

  public SportsCar() {
    System.out.println("Sports car constructor.");
  }
  
  public SportsCar(String model) {
    super(model);
    System.out.println("Sports car constructor 2.");
  }

  public void tuneEngine() {
    System.out.println("Tuning the engine of sports car.");
  }

}
