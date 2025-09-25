import java.util.LinkedList;
import java.util.Stack;

public class UsingStacks {
  public static void main(String[] args) {

    Stack<LinkedList<Stack<Integer>>> s = new Stack<>();

    Stack<Integer> i = new Stack<>();
    i.push(1);
    i.push(2);
    i.push(3);

    Stack<Integer> j = new Stack<>();
    j.push(1);
    j.push(2);
    j.push(3);

    LinkedList<Stack<Integer>> l = new LinkedList<>();
    l.add(i);
    l.add(j);

    s.push(l);
    s.push(l);

    while(!s.isEmpty()) {
      LinkedList<Stack<Integer>> l1 = s.pop();
      while(!l1.isEmpty()) {
        Stack<Integer> s1 = l1.remove();
        while(!s1.isEmpty()) {
          System.out.println(s1.pop());
        }
      }
    }

  }
}