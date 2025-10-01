public class Queue<E> {
  private class Node<E> {
    private E value;
    private Node<E> next;

    private Node(E value) {
      this.value = value;
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
  private int size;
  private Node<E> front;
  private Node<E> back;

  public Queue() {
    this.size = 0;
    this.front = null;
    this.back = null;
  }

  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public E peek() {
    if (this.size == 0) {
      return null;
    } else {
      return this.front.value;
    }
  }

  public void enqueue(E value) {
    Node<E> n = new Node(value);
    if (this.size == 0) {
      this.front = n;
      this.back = n;
    } else {
      this.back.next = n;
      this.back = n;
    }
    size++;
  }

  public E dequeue() {
    if (this.size == 0) {
      return null;
    } else {
      E value = this.front.value;
      this.front = this.front.next;
      this.size--;
      if (this.size == 0) {
        this.back = null;
      }
      return value;
    }
  }












}