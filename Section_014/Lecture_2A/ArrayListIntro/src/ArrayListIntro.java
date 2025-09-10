import java.util.ArrayList;

public class ArrayListIntro {
  public static void main(String[] args) {

    ArrayList<Double> dblList = new ArrayList<>();
    dblList.add(12.0);
    dblList.add(3.1415926);
    dblList.add(13.5);
    System.out.println(dblList);
    dblList.add(1, 1234.5678);
    System.out.println(dblList);

    int count = 0;
    for(Double d : dblList) {
      System.out.println(count++ + ": " + d);
    }

    dblList.clear();
    System.out.println(dblList);
    System.out.println(dblList.contains(5));
  }
}