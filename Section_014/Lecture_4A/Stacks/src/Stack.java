public class Stack<E> {
  private class Node<E> {
    E value;
    Node<E> next;

    private Node(E val) {
      this.value = val;
      this.next = null;
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
    this.top = null;
    this.size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public E peek() {
    return (size == 0) ? null : top.getValue();
  }

  public void push(E val) {
    Node n = new Node<E>(val);
    n.setNext(this.top);
    this.top = n;
    size++;
  }

  public E pop() {
    if (this.size == 0) {
      return null;
    } else {
      E val = this.top.value;
      this.top = this.top.next;
      size--;
      return val;
    }
  }
}