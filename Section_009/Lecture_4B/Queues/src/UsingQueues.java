public class UsingQueues {
  public static void main(String[] args) {
    Queue<Character> charQueue = new Queue<>();
    System.out.println(charQueue.size());
    System.out.println(charQueue.isEmpty());
    System.out.println(charQueue.peek());

    charQueue.enqueue('H');
    charQueue.enqueue('e');
    charQueue.enqueue('l');
    charQueue.enqueue('p');
    charQueue.enqueue(' ');
    charQueue.enqueue('m');
    charQueue.enqueue('e');
    charQueue.enqueue('!');

    while (!charQueue.isEmpty()) {
      System.out.print(charQueue.dequeue());
    }
  }
}
