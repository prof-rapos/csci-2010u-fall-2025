public class SinglyLinkedList<E> {

    Node<E> head;
    int size;

    public SinglyLinkedList() {
      this.head = null;
      size = 0;
    }

    public void add(E val){
      if(size == 0) {
        head = new Node<E>(val);
        size++;
        return;
      }
      Node<E> cur = head;
      while (cur.getNext() != null) {
        cur = cur.getNext();
      }
      cur.setNext(new Node<E>(val));
      size++;
    }

    public E get(int ind){
      Node<E> cur = head;
      int count = 0;
      while (cur != null) {
        if (count == ind) {
          return cur.getValue();
        }
        cur = cur.getNext();
        count++;
      }
      return null;
    }

    public void set(int ind, E val){

    }

    public E remove(int ind){
      return null;
    }

    public int size(){
      return size;
    }

    public boolean contains(E val){
      return false;
    }

    public int indexOf(E val){
      return -1;
    }

    public void clear(){

    }

    public String toString() {
      String result = "[";
      Node<E> cur = head;
      if (cur != null) {
        while (cur.getNext() != null) {
          result += cur.getValue() + ", ";
          cur = cur.getNext();
        }
      } else {
        result += "]";
        return  result;
      }
      result += cur.getValue() + "]";
      return result;
    }


}