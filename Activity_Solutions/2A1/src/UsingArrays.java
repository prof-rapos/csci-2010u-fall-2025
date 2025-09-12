import java.awt.*;

public class UsingArrays {
  public static void main(String[] args) {
    //Part 1
    int[] arr = new int[25];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int)Math.pow(2, i);
    }

    for (int i = 0; i < arr.length; i++) {
      if (i < arr.length-1) {
        System.out.print(arr[i] + ", ");
      } else {
        System.out.print(arr[i]);
      }
    }
    System.out.println();

    //Part 2 (I will use Points as my Object
    Point[] pointArray = new Point[10];

    for (int i = 0; i < pointArray.length; i++){
      pointArray[i] = new Point(i, i*i); // the y = x^2 curve
    }

    for (int i = 0; i < pointArray.length; i++){
      System.out.println((int)pointArray[i].getX() + ", " + (int)pointArray[i].getY());
    }
  }
}