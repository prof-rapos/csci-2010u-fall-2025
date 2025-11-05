import java.util.HashMap;

public class Hashing {
  public static void main(String[] args) {

    HashMap<Integer, String> students = new HashMap<>();
    students.put(1234, "John Smith");
    students.put(4321, "Susan Storm");
    students.put(5678, "J. Jonah Jamieson");
    students.put(9876, "Diana Prince");

    System.out.println(students.get(1234));
    System.out.println(students.containsKey(5555));

    String studentName = students.get(4321);

  }
}