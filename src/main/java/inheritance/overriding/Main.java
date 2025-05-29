package inheritance.overriding;

public class Main {
  public static void main(String[] args) {

    // error, abstract class cannot be instatiated
    // Animal a = new Animal();
    // a.eat();
    // IS-A
    // int x = 10;
    // x = 10.123;

    // Dynamic/Run Time polymorphism
    // Virtual Method Invocation
    Animal c = new Carnivore();
    c.eat();
    // c.someMethod(); // 

    Animal h = new Herbivore();
    h.eat();

    // if(c instanceof Carnivore) {
    //   System.out.println("Carnivore");
    //   Carnivore cx = (Carnivore) c;
    //   cx.someMethod();
    // }

  }
}
