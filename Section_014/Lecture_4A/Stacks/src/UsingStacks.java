public class UsingStacks {
  public static void main(String[] args) {
    Stack<Float> stack = new Stack<>();
    System.out.println(stack.size());
    System.out.println(stack.peek());
    stack.push(3.14159f);
    stack.push(2.71f);
    System.out.println(stack.size());
    System.out.println(stack.isEmpty());
    System.out.println(stack.peek());
    while(!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }
}
