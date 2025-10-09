public class Stack<E> {
  private class Node<E> {
    private E value;
    private Node<E> next;

    private Node(E val) {
      this.value = val;
      next = null;
    }

    private E getValue() {
      return value;
    }

    private void setValue(E value) {
      this.value = value;
    }

    private Node<E> getNext() {
      return next;
    }

    private void setNext(Node<E> next) {
      this.next = next;
    }
  }

  private Node<E> top;
  private int size;

  public Stack() {
    top = null;
    size = 0;
  }

  public int size() {
    return size;
  }

  public E peek() {
    return isEmpty() ? null : top.getValue();
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void push(E val) {
    Node n = new Node<E>(val);
    n.setNext(this.top);
    this.top = n;
    size++;
  }

  public E pop() {
    if (isEmpty()) {
      return  null;
    } else {
      E val = this.top.getValue();
      this.top = this.top.getNext();
      size--;
      return val;
    }
  }

}