package collections;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * Default sorting implementation,
 * 1. Implement the java.lang.Comparable interface.
 * 2. Override the compare method
 */
public class Trainee implements Comparable<Trainee> {

  private String employeeId;
  private String fullName;
  private LocalDate hireDate;

  public Trainee() {
  }

  public Trainee(String employeeId, String fullName, LocalDate hireDate) {
    this.employeeId = employeeId;
    this.fullName = fullName;
    this.hireDate = hireDate;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }

  /**
   * Returns a String representation of the obejct. Provided by the Object class.
   */
  @Override
  public String toString() {
    return "Trainee [employeeId=" + employeeId + ", fullName=" + fullName + ", hireDate=" + hireDate + "]";
  }

  /**
   * The default comparing startergy is to compare the names of the employees.
   */
  @Override
  public int compareTo(Trainee o) {
    return getFullName().compareTo(o.getFullName());
  }

  /**
   * java.util.Comparator
   * We can create public static inner classes in java
   */
  public static class TraineeHireDateComparator implements Comparator<Trainee> {

    @Override
    public int compare(Trainee o1, Trainee o2) {
      int comparisonVal = o1.getHireDate().compareTo(o2.getHireDate());
      if (comparisonVal != 0) {
        return o1.getHireDate().compareTo(o2.getHireDate());
      }
      return o1.getEmployeeId().compareTo(o2.getEmployeeId());
    }

  }

}
