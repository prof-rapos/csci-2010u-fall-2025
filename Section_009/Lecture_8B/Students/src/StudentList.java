import java.util.HashMap;
import java.util.Objects;

public class StudentList {

  public class Student{
    String name;
    String studentNo;

    public Student(String name, String studentNo){
      this.name = name;
      this.studentNo = studentNo;
    }

    public int hashCode() {
      return name.length() * Integer.parseInt(studentNo);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      } else if (!(o instanceof Student)) {
        return false;
      }
      Student s = (Student) o;
      return (this.name == s.name
          && this.studentNo == s.studentNo);

    }
  }

  HashMap<Student, String> studentList;

  public StudentList() {
    studentList = new HashMap<>();
  }

  public void addStudent(String name, String studentNum, String email) {
    studentList.put(new Student(name, studentNum), email);
  }

  public void updateEmail(String name, String studentNum, String email) {
    studentList.put(new Student(name, studentNum), email);
  }

  public boolean contains(String name, String studentNum) {
    return studentList.containsKey(new Student(name, studentNum));
  }

  public static void main(String[] args) {
    StudentList students = new StudentList();
    students.addStudent("Eric", "1234", "eric@eric.eric");
    students.updateEmail("Eric", "1234", "eric@eric.ca");
    System.out.println(students.studentList.size());
    System.out.println(students.contains("Eric", "1234"));
  }
}