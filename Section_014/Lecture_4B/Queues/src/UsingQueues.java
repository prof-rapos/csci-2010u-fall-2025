public class UsingQueues {
  public static void main(String[] args) {
    Queue<String> stringQueue = new Queue<>();
    System.out.println(stringQueue.size());
    System.out.println(stringQueue.isEmpty());
    System.out.println(stringQueue.peek());

    stringQueue.enqueue("Please");
    stringQueue.enqueue("do");
    stringQueue.enqueue("not");
    stringQueue.enqueue("message");
    stringQueue.enqueue("me");
    stringQueue.enqueue("on");
    stringQueue.enqueue("Canvas!");
    System.out.println(stringQueue.peek());
    System.out.println(stringQueue.size());
    while(!stringQueue.isEmpty()) {
      System.out.print(stringQueue.dequeue() + " ");
    }
    System.out.println();
  }
}
