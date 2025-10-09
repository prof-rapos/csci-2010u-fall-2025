import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CrazyQueue {
  public static void main(String[] args) {

    Queue<Stack<LinkedList<Integer[]>>> crazyQueue = new LinkedList<>();
    for (int x = 0; x < 5; x++) {
      Stack<LinkedList<Integer[]>> crazyStack = new Stack<>();
      for (int k = 0; k < 5; k++) {
        LinkedList<Integer[]> crazyList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
          Integer[] intArray = new Integer[5];
          for (int j = 0; j < intArray.length; j++) {
            intArray[j] = (int) (Math.random() * 100 + 1);
          }
          crazyList.add(intArray);
        }
        crazyStack.push(crazyList);
      }
      crazyQueue.add(crazyStack);
    }
    while (!crazyQueue.isEmpty()) {
      Stack<LinkedList<Integer[]>> s = crazyQueue.remove();
      while (!s.isEmpty()) {
        LinkedList<Integer[]> l = s.pop();
        while (!l.isEmpty()) {
          Integer[] a = l.remove();
          for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
          }
        }
      }
    }
  }
}