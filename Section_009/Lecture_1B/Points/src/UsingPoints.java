import java.awt.*;

public class UsingPoints {
  public static void main(String[] args) {
    Point p1 = new Point(5,7);
    Point p2 = new Point(6,9);

    System.out.println(printPoint(p1));
    System.out.println(printPoint(p2));

    p1.move((int)p2.getX(),(int)p2.getY());

    System.out.println(printPoint(p1));
    System.out.println(printPoint(p2));


  }

  public static String printPoint(Point p) {
    return "(" + p.getX() + ", " + p.getY() + ")";
  }
}