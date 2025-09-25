import java.util.LinkedList;
import java.util.Stack;

public class JavaStacks {
  public static void main(String[] args) {

    Stack<LinkedList<Stack<Double>[]>> topStack = new Stack<>();
    for (int g = 0; g < 5; g++) {
      LinkedList<Stack<Double>[]> topList = new LinkedList<>();
      for (int h = 0; h < 7; h++) {
        Stack<Double>[] stackArray = new Stack[5];
        for (int i = 0; i < stackArray.length; i++) {
          Stack<Double> innerStack = new Stack<>();
          for (int j = 0; j < 10; j++) {
            innerStack.push(Math.random() * 100 + 1);
          }
          stackArray[i] = innerStack;
        }
        topList.add(stackArray);
      }
      topStack.push(topList);
    }
    while (!topStack.isEmpty()) {
      LinkedList<Stack<Double>[]> topList = topStack.pop();
      while (!topList.isEmpty()) {
        Stack<Double>[] stackArray = topList.remove();
        for (int i = 0; i < stackArray.length; i++) {
          Stack<Double> stack = stackArray[i];
          while (!stack.isEmpty()) {
            System.out.println(stack.pop());
          }
        }
      }
    }
  }
}