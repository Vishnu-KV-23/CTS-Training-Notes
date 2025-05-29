package inheritance.overriding;

// Method overriding alows us to redefine the base class method in a child class
// Must have same signature as that of the base class method.
// final and private methods cannot be overridden
// access level cannot be less persmissive
// use @Override annotation
public class Carnivore extends Animal {

  @Override
  public void eat() {
    System.out.println("Carnivore is eating.");
  }

  @Override
  public void sleep() {
    throw new UnsupportedOperationException("Unimplemented method 'sleep'");
  }

  public void someMethod() {}
}
