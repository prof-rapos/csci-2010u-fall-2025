public class DC {


  public static int minValue(int[] arr, int low, int high) {
    if(low == high) {
      return arr[low];
    }
    int mid = (low + high) / 2;
    return Math.min(minValue(arr, low, mid),
        minValue(arr,mid+1,high));
  }

  public static int sumElements(int[] arr, int low, int high) {
    if(low == high) {
      return arr[low];
    }
    int mid = (low + high) / 2;
    return (sumElements(arr, low, mid) + sumElements(arr,mid+1,high));
  }

  public static int countAs(Student[] students, int low, int high) {
    if (low == high) {
      return students[low].grade >= 80 ? 1 : 0;
    } else {
      int mid = (low + high) / 2;
      return countAs(students, low, mid) + countAs(students, mid+1, high);
    }
  }
  public static class Student {
    String name;
    int grade;
    public Student(String n, int g) {
      name = n;
      grade = g;
    }
  }
  public static void main(String[] args) {
    Student[] students = new Student[] {
        new Student("Tom", 77),
        new Student("Beth", 87),
        new Student("Ahmed", 97),
        new Student("Jessica", 91),
        new Student("Eric", 42)
        };
    System.out.println(countAs(students,0, students.length-1));

    int[] arr = new int[]{1,2,3,4,5,6,7};
    System.out.println(minValue(arr,0,arr.length-1));
    System.out.println(sumElements(arr,0,arr.length-1));
  }






}