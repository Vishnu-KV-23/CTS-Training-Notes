package oops;

import java.time.LocalDate;

public class Employee {

  /**
   * Class level attributes or global variables. They are automatically
   * initialized by java. Local variables must be programatically initialized.
   * 
   * Access Modifiers:
   * final, abstract, static
   * 
   * Access Specifiers:
   * private - only inside the class
   * public - inside the class, inside the package, outside the package
   * protected - class and subclass
   * default-access or package-friendly - package level access
   * 
   * Access Level
   * class, package, outside-package
   */
  private String empId;
  private String fullName;
  private String email;
  private char gender;
  private String department;
  private LocalDate hiredDate;

  /**
   * Constructor: A special method, gets executed when an object is created, have
   * the same name as of the class, and have no return type. If no constructor is
   * provided Java will add a default constructor into the class.
   * 
   * Employee obj = new Employee()
   * 1. Memory Allocation [happens in heap memory]
   * 2. Property initialization with default values
   * 3. Constructor execeution
   * 4. Reference is returned
   */
  public Employee() {
    System.out.println("Employee constructor executed....");
  }

  public Employee(String empId, String fullName, String email) {
    this.empId = empId;
    this.fullName = fullName;
    this.email = email;
  }

  /**
   * <acess-specifier> <access-modifier> return-type methodName(<parameters>) {}
   * 
   * Uses camelCase naming conventions
   * Getters and Setters | Accessor and Mutator
   * 
   * data-type propertyName
   * 
   * public data-type getPropertyName () {}
   * 
   * public void setPropertyName(data-type parameter) {}
   */
  public String getEmpId() {
    return empId;
  }

  public String getFullName() {
    return fullName;
  }

  public String getEmail() {
    return email;
  }

  public char getGender() {
    return gender;
  }

  public String getDepartment() {
    return department;
  }

  public LocalDate getHiredDate() {
    return hiredDate;
  }

  public void setEmpId(String empId) {
    this.empId = empId;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public void setHiredDate(LocalDate hiredDate) {
    this.hiredDate = hiredDate;
  }

  public void printInfo() {
    System.out.println("Employee: " + this.fullName + " " + this.email + " " + this.department);
  }
}
