public class Recursion {
  public static void main(String[] args) {
    for(int i = 0; i <=10; i++) {
      System.out.println(i + "! = " + factorial(i));
    }

  }

  public static int factorial(int num) {
    if (num == 0) {
      return 1;
    } else {
      return num * factorial(num -1);
    }
  }

  public static int factorial_old(int num) {
    int result = 1;
    // do something? Help?
    for(int i = 1; i <= num; i++) {
      result *= i;
    }
    return result;
  }

}