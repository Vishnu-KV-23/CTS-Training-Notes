package oops;

import java.time.LocalDate;

/**
 * OOPs: Object Oriented Programming
 * 
 * 1. Class: Collection of entities that share some common attributes, blueprint
 * to create objects
 * 2. Object: A realization of the class
 * 3. Encapsulation:
 * 4. Abstraction
 * 5. Inheritance
 * 6. Polymorphism
 */
public class OopsDemo {
  public static void main(String[] args) {

    // Use the new keyword to create an object of the class

    Employee emp = new Employee(); // new Employee() -> creates the object of Employee
    // not the standard manner
    // emp.empId = "E001";
    // emp.department = "IT";

    emp.setEmpId("E001");
    emp.setDepartment("IT");
    emp.setEmail("ashish.sp");
    emp.setFullName("Ashish S P");
    emp.setGender('M');
    emp.setHiredDate(LocalDate.now());

    // emp.printInfo();

    System.out.println(Student.getCollegeName());
    // Student s = new Student();
    // Student s1 = new Student();
    Student s3 = new Student(1, "Ashish", "ashish.sp");
    
    // System.out.println(s.getCollegeName());
    // System.out.println(s1.getCollegeName());
    
    Student.setCollegeName("DEF College");
    // System.out.println(s.getCollegeName());
    // System.out.println(s1.getCollegeName());


    
  }
}


