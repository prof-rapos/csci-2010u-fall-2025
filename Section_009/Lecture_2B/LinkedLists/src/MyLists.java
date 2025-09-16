public class MyLists {
  public static void main(String[] args) {

    SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
    System.out.println(list);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(list);

    System.out.println(list.get(2));

  }
}