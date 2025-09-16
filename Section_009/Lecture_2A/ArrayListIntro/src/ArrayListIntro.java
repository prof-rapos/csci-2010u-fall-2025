import java.util.ArrayList;

public class ArrayListIntro {
  public static void main(String[] args) {

    ArrayList<Character> charlist = new ArrayList<>();

    charlist.add('T');
    charlist.add('c');
    charlist.add('x');
    charlist.add('R');

    System.out.println(charlist);

    charlist.set(charlist.indexOf('c'),Character.toUpperCase(charlist.get(charlist.indexOf('c'))));
    System.out.println(charlist);

    for (Character c : charlist) {
      System.out.println(Character.toLowerCase(c));
    }

    charlist.clear();

    System.out.println(charlist);

  }
}