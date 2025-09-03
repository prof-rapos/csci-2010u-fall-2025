public class Main {
  public static void main(String[] args) {
    int age = getAge(2000, false);
    System.out.println("I am " + age + " years old!");
  }

  public static int getAge(int birthYear, boolean hadBirthday){
    int age = 2025 - birthYear;
    if(!hadBirthday) {
      age--;
    }
    return age;
  }
}