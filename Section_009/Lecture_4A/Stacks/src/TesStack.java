public class TesStack {
  public static void main(String[] args) {
    Stack<Float> stack = new Stack<Float>();
    System.out.println(stack.size());
    System.out.println(stack.isEmpty());
    System.out.println(stack.peek());

    stack.push(3.1415926f);
    stack.push(2.71f);

    System.out.println(stack.size());
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.size());
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

  }
}
