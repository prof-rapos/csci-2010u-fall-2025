import java.awt.*;
import java.util.ArrayList;

public class UsingArrayLists {
  public static void main(String[] args) {
    //Part 1
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    for (int i = 0; i < 25; i++) {
      arrayList.add((int)Math.pow(2, i));
    }

    System.out.println(arrayList);

    for (int i = 0; i < arrayList.size(); i++) {
      System.out.print("2^" + i + " = " + arrayList.get(i));
      if (i < arrayList.size()-1) {
        System.out.print(", ");
      } else {
        System.out.println();
      }
    }


    //Part 2 (I will use Points as my Object
    ArrayList<Point> points = new ArrayList<>();

    for (int i = 0; i < 10; i++){
      points.add(new Point(i, i*i)); // the y = x^2 curve
    }

    System.out.println(points);

    for (int i = 0; i < points.size(); i++){
      System.out.println("(" + (int)points.get(i).getX() + ", " + (int)points.get(i).getY() + ")");
    }
  }
}