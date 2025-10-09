public class CodingBat {
  public static void main(String[] args) {

    System.out.println(triangle(0));
    System.out.println(triangle(1));
    System.out.println(triangle(3));
    System.out.println(triangle(5));
    System.out.println();

    System.out.println(sumDigits(0));
    System.out.println(sumDigits(45));
    System.out.println(sumDigits(123));
    System.out.println(sumDigits(9999));
    System.out.println();

    System.out.println(powerN(2,0));
    System.out.println(powerN(2,1));
    System.out.println(powerN(2,2));
    System.out.println(powerN(10,5));

  }

  public static int triangle(int rows) {
    if (rows == 0) {
      return 0;
    } else {
      return rows + triangle(rows-1);
    }
  }
  public static int sumDigits(int n) {
    if (n == 0)
      return 0;
    else
      return n % 10 + sumDigits(n/10);
  }

  public static int powerN(int base, int n) {
    if (n == 0)
      return 1;
    else if (n == 1)
      return base;
    else
      return base * powerN(base, n-1);
  }


}