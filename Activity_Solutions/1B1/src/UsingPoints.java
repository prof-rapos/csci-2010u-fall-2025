import java.awt.*;

public class UsingPoints {
  public static void main(String[] args) {

    Point p1 = new Point(0,3);
    Point p2 = new Point(1,2);
    Point p3 = new Point(3,3);
    Point p4 = new Point(1,4);
    Point p5 = new Point(4,4);

    printGrid(p1, p2, p3, p4, p5);

  }

  public static void printGrid(Point p1, Point p2, Point p3, Point p4, Point p5) {
    for (int i = 4; i >= 0; i--) {
      System.out.println("- - - - - - - - - - -");
      for (int j = 0; j <= 4; j++) {
        System.out.print("|");
        if (isMatch(p1,j,i) || isMatch(p2,j,i) || isMatch(p3,j,i) || isMatch(p4,j,i) || isMatch(p5,j,i)){
          System.out.print(" * ");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println("|");
    }
    System.out.println("- - - - - - - - - - -");
  }

  public static boolean isMatch(Point p, int x, int y) {
    return (int)p.getX() == x && (int)p.getY() == y;
  }
}