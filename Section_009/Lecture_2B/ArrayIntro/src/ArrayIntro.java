import java.awt.*;

public class ArrayIntro {
  public static void main(String[] args) {

    int[] arr = {72, 3, 5, 10, 21};

    System.out.println(arr[0]);

    Point[] points = new Point[5];
    for(int i = 0; i < points.length; i++) {
      points[i] = new Point(i, 2*i);
    }
    System.out.println(points[2]);

    for (Point p : points) {
      System.out.println(p);
    }


  }
}