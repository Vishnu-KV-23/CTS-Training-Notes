package oops;

public class Student {

  // Properties of Student
  private int rollNumber;
  private String fullName;
  private String email;

  // static: access modifier, repreents content that belongs to class rather than
  // an instance of that class. Loaded when the class is loaded. To initialize
  // static content we can use static blocks. static content can be accessed from
  // the class directly
  private static String collegeName;

  static {
    collegeName = "ABC College";
    System.out.println("Static block executed");
  }

  {
    System.out.println("Instance block executed");
  }

  public Student() {
    // this(0,"","");
    System.out.println("Student class contructor.");
  }
  
  // Constructor overriding
  public Student(int rollNumber, String fullName, String email) {
    // zero argument constuctor, this() call must be the first line
    this(); 
    System.out.println("Student class contructor 2.");
    this.rollNumber = rollNumber;
    this.fullName = fullName;
    this.email = email;
  }

  public int getRollNumber() {
    return rollNumber;
  }

  public void setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public static String getCollegeName() {
    return collegeName;
  }

  public static void setCollegeName(String collegeName) {
    Student.collegeName = collegeName;
  }

}
