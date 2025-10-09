public class OldFactorials {
  public static void main(String[] args) {

    System.out.println(factorial(0));
    System.out.println(factorial(3));
    System.out.println(factorial(5));
    System.out.println(factorial(10));
  }


  public static int factorial(int num) {
    int result = 1;
    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    return result;
  }

}