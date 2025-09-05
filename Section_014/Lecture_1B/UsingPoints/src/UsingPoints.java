import java.awt.Point;

public class UsingPoints {
  public static void main(String[] args) {

    Point p1 = new Point(0,5);

    System.out.println(printPoint(p1));

    p1.translate(50,-7000);

    System.out.println(printPoint(p1));
  }

  public static String printPoint(Point p) {
    return "(" + (int)p.getX() + ", " + (int)p.getY() + ")";
  }

  public static void printGrid(Point p1, Point p2, Point p3, Point p4, Point p5) {
    for (int i = 4; i >=0; i--) {
      for (int j = 0; j <=4; j++) {

      }
    }
  }
}