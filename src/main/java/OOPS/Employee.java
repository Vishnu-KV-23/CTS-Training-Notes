package OOPS;

/**
 * OOPs:object oriented programming
 * 1.Class:collection of entities that share some common attributes eg; humans,students etc| blueprint to create objects
 * 2.Object:instance of a class, a realization of the class
 * 3.Encapsulation: usage of getters and setters
 * 4.Abstraction
 * 5.Inheritance
 * 6.Polymorphism
 */


public class Employee{
    /**
     * Constructor: A special method , gets executed when a object is created,have
     * the same name as 0f the class , if no constructor java will add a default constructor
     * they have no return type.
     * it is executed when the object is created
     *
     * Employee obj = new Employee()
     *
     * 1.Memory allocation
     * 2.Default variable initialization
     * 3. Constructor execution

     */
    public Employee()
    {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args){
        //use new keywprd to make object of the class
//not a standard manner to get the data or access the data , use Getters and Setters mentioned below
        Emp emp = new Emp(); // Object creation and constructor call
//        emp.empId = "E001";
//        emp.fullName="Vishnu";

//        //local inner class
//        class MainInner{
//
//             }




        Employee obj = new Employee();

        emp.setEmail("wishnukv2349@gmail.com");
        emp.setEmpId("E001");
        emp.setGender('M');
        emp.setFullName("Vishnu K V");
        emp.printInfo();
    }
}
class Emp {
    /**
     * Access modifiers:final,abstract,static
     * Access specifiers:
     * private-only inside the class
     * public-inside the class , inside the package,outside the package
     * protected- class and sub class
     * default-access or friendly - package level access(if i dont specify any specifier then it is default)
     */

    /**
     * Access Level
     * class,package,outside-package
     */
    private   String empId;
 private   String fullName;
 private   String email;
 private   char gender;
//Getters and Setters | Accessor and Mutator MEthods
/**
 * <acess-specifier > <acess modifier> return-type methodName (<parameters>)- FORMAT OF A METHOD
 *
 * datatype propertyName
 * setter and getter is public
 * getter has return type inorder to return the value
 * setter has void return
 *
 * public returntype getVariableName()-getter
 * public void setVariableName()- setter

 */
    public String getEmpId() {
        return empId;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmpId(String empId) {
        this.empId=empId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public void printInfo(){
        System.out.println("Employee:"+ this.fullName+"\nEmpID:"+this.empId+"\nGender:"+this.gender+"\nEmail:"+this.email);
    }
}
