public class Recursion {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.print(i +"! = ");
      System.out.println(factorial(i));
    }

  }


  public static int factorial(int num) {
    if (num == 0 || num == 1) {
      return 1;
    } else {
      return num * factorial(num - 1);
    }
  }



  public static int factorial_old(int num) {
    int prod = 1;
    for (int i = 1; i <=num; i++) {
      prod *= i;
    }
    return prod;
  }
}