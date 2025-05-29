package OOPS;

import org.w3c.dom.ls.LSOutput;

public class Student {

    private int rollNumber;
    private String fullName;
    private String email;
    //use when something belongs to class but not to object , like orgname or collegename
    //static : access modifier that represents contents belongigng to the class directly rather than an instance of a class
    //loaded when class is loaded
    //member variables like rollNumber,fullName and email is only loaded when an instance is loaded , that is when an object is made
    // Studen ajay=new Student()
    // for static content we can use static block


    static String collegeName;
    static {
        collegeName="SCMS college";
        System.out.println("Static block executed");
        //can call from another class like employee (within the package as Student.collegeName which is CLassname.staticVariableName
        //
         }


         //INSTANCE block: a block of code that gets executed when the class is executed or constructor is run, We can put default codes to finish here

    {
        System.out.println("Instance block executed");
    }
    public Student(){
            System.out.println("Student constructor 1 executed ");
    }

    public Student(int rollNumber, String fullName, String email) {
        System.out.println("Student constructor 2 executed");
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public static String getCollegeName()
    {
        System.out.printf("My college is %s",Student.collegeName);
        return collegeName;
    }



}
