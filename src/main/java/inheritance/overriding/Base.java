package inheritance.overriding;

interface Parent1 {
  /**
   * default methods:
   * can be inheritted as it is
   * you can override it
   * when a class implements multiple interfaces with the same default method, 
   * it needs to override it to resolve ambiguity
   */
  default void greet() {
    System.out.println("Greet from parent 1 interface");
  }
}

interface Parent2 {
  default void greet() {
    System.out.println("Greet from parent 2 interface");
  }
}

class Child implements Parent1, Parent2 {
  @Override
  public void greet() {
    Parent1.super.greet();
    Parent2.super.greet();
  }
}

public class Base {

  public static void main(String[] args) {
    Child c = new Child();
    c.greet();
  }
}
