public class MyLists {

  public static void main(String[] args) {

    SinglyLinkedList<Integer> intList = new SinglyLinkedList<>();
    System.out.println(intList);
    System.out.println(intList.get(3));
    intList.add(31);
    intList.add(12);
    intList.add(6);
    System.out.println(intList);
    System.out.println(intList.get(1));
    System.out.println(intList.get(5));
  }
}