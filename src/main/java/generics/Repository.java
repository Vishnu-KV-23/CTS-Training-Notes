package generics;

import oops.Employee;
import oops.Student;

public interface Repository<E, ID> {

  E save(E data);

  void delete(E data);

  E findById(ID id);
}

class StudentRepository<T> implements Repository<Student, Integer> {

  T[] id;

  @Override
  public void delete(Student data) {
    StudentRepository<Integer> sr = new StudentRepository<>();
    sr.id = new Integer[] { 1, 2, 3, 4, 5 };
  }

  @Override
  public Student save(Student data) {
    return null;
  }

  @Override
  public Student findById(Integer id) {
    return null;
  }
}

class EmployeeRepository implements Repository<Employee, String> {

  @Override
  public Employee save(Employee data) {
    return null;
  }

  @Override
  public void delete(Employee data) {
  }

  @Override
  public Employee findById(String id) {
    return null;
  }

}
