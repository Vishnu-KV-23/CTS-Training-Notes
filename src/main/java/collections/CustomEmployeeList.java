package collections;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CustomEmployeeList {

  static List<Trainee> getTrainees() {
    List<Trainee> trainees = new LinkedList<>();
    trainees.add(new Trainee("E123", "Xavier", LocalDate.of(2020, 10, 25)));
    trainees.add(new Trainee("E089", "Rajeev", LocalDate.of(2020, 11, 22)));
    trainees.add(new Trainee("E129", "Rahul", LocalDate.of(2018, 1, 15)));
    trainees.add(new Trainee("E130", "Ashish", LocalDate.of(2018, 1, 15)));
    return trainees;
  }

  static void print(List<Trainee> trainees) {
    for (var t : trainees) {
      System.out.println(t);
    }
  }
  
  public static void main(String[] args) {

    var trainees = getTrainees();

    System.out.println("Before sorting");
    print(trainees);
    System.out.println();

    System.out.println("After default sorting");
    Collections.sort(trainees); // Default sorting
    print(trainees);
    System.out.println();

    System.out.println("After hiredate based sorting");
    Collections.sort(trainees, new Trainee.TraineeHireDateComparator()); // Hiredate based sorting
    print(trainees);
  }
}
