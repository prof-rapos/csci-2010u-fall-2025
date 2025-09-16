public class SinglyLinkedList<E> {

    Node<E> head;
    int size;

    public SinglyLinkedList() {
      this.head = null;
      size = 0;
    }

    public void add(E val){
      if (size == 0) {
        head = new Node<E>(val);
        size++;
        return;
      }
      Node<E> cur = head;
      while(cur.getNext() != null) {
        cur = cur.getNext();
      }
      cur.setNext(new Node<E>(val));
      size++;
    }

    public E get(int ind){
      if (ind > size-1){
        return null;
      } else{
        int count = 0;
        Node<E> cur = head;
        while (count < ind)  {
          cur = cur.getNext();
          count++;
        }
        return cur.getValue();
      }
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

    @Override
    public String toString() {
      String list = "[";
      Node<E> cur = head;
      if (cur == null) {
        return list += "]";
      } else {
        while (cur.getNext() != null) {
          list += cur.getValue() + ", ";
          cur = cur.getNext();
        }
        list += cur.getValue() + "]";
        return list;
      }
    }


}