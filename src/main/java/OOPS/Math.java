package oops;

public class Math {
  /**
   * Polymorphism: existence in multiple forms.
   * Static/Compile Time polymorphism: function overloading, no operator
   * overloading
   * Dynamic/Run Time Polymorphism: Inheritance
   * 
   * Function overloading: having multiple methods with same name but different
   * function signature
   * Function signature: method name and parameter list[number, type, order]
   */

  public int sum(int a, int b) {
    return a + b;
  }

  public long sum(long a, long b) {
    return a + b;
  }

  public long sum(long a, int b) {
    return a + b;
  }

  public long sum(int a, long b) {
    return a + b;
  }

}
