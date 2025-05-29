package inheritance.overriding;

// abstract classes must have atleast one abstract method
// can have non abstract methods
// cannot be insttatiated, cannot created direct object
// all abstract methods must be overriden by the child class
public abstract class Animal {
  // abstract methods are incomplete methods, they have a definition but no
  // implmentation
  // The are defined using abstract access modifier in the method definion
  // Can only be defined inside an abstract class
  public abstract void eat();

  public abstract void sleep();
}
