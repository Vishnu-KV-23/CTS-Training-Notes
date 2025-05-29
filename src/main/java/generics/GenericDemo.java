package generics;

import oops.Employee;

public class GenericDemo {

  static void boxdemo() {
    String str = "Hello world";
    Employee emp = new Employee("E001", "Ashish S", "ashish.s");

    Box b1 = new Box();
    Box b2 = new Box();

    b1.setData(str);
    b2.setData(emp);

    // Since Box is storing data as type of Object, we have to sure of the type
    // before we cast it.
    // Otherwise we wil have to deal with ClassCastException.
    if (b1.getData() instanceof String str2) {
      // latest version of java explicit casting inside the instanceof operator is not
      // necessary
      // String str2 = (String) b2.getData();
      System.out.println(str2);
    }
    if (b2.getData() instanceof Employee emp2) {
      // latest version of java explicit casting inside the instanceof operator is not
      // necessary
      // Employee emp2 = (Employee) b1.getData();
      System.out.println(emp2.getEmpId() + " " + emp2.getFullName());
    }
  }

  static void genericBoxDemo() {
    GenericBox<String> b1 = new GenericBox<>();
    b1.setData("Hello World");

    GenericBox<Employee> b2 = new GenericBox<>();
    b2.setData(new Employee("E001", "Ashish S", "ashish.s"));

    GenericBox<Long> b3 = new GenericBox<>();
    b3.setData(10l);
  }

  // Bounded type paramter, Number or it's sub classess can be specified
  static <T extends Number> void printArray(T[] array) {
    for (T element : array) {
      System.out.print(element + ", ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Integer[] arr = { 1, 2, 3, 4, 5 };
    Long[] longVals = { 1l, 2l, 3l, 4l, 5l };

    printArray(arr);
    printArray(longVals);
    
    String[] str = { "Hello", "Hi", "Welcome" };
    // printArray(str); // error because String does not extend Number

  }
}

// Generic Box class, <>
class GenericBox<X> {

  private X data;

  public X getData() {
    return data;
  }

  public void setData(X data) {
    this.data = data;
  }
}

// Box is DTO class
class Box {
  // I want to store some data in a property, but I am not sure what kind of data
  // it is. We are using the Object type, because all Java types are directly or
  // indirectly derived from Object.
  private Object data;

  public void setData(Object data) {
    this.data = data;
  }

  public Object getData() {
    return data;
  }
}
