package inheritance.simple;

/**
 * Inheritance
 * Allows us to extend one class and create a new class.
 * We use extends keyword to inherit from another class.
 * Methods and fields get inherited.
 * Constructors, private fields & methods, they are not inheritted.
 * While creating an instance of the child class, the constructor execution
 * starts from base to derived.
 */
public class Car extends Vehicle {

  public Car() {
    System.out.println("Car class constructor.");
  }
  
  public Car(String model) {
    super(model); // placing call to the base class constructor
    System.out.println("Car class constructor 2.");
  }

  public void adjustAC() {
    System.out.println("Adjusting AC");
  }
}
