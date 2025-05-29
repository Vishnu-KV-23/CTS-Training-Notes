package inheritance.overriding;

public class Herbivore extends Animal {
  @Override
  public void eat() {
    System.out.println("Herbivore is eating.");
  }

  @Override
  public void sleep() {
    throw new UnsupportedOperationException("Unimplemented method 'sleep'");
  }
}
