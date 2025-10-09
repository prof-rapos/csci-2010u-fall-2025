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

  private Node<E> front;
  private Node<E> back;
  private int size;

  public Queue() {
    this.front = null;
    this.back = null;
    this.size = 0;
  }

  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public E peek() {
    return this.size == 0 ? null : this.front.getValue();
  }

  public void enqueue(E value) {
    Node<E> node = new Node<>(value);
    if(this.size == 0) {
      this.front = node;
      this.back = node;
    } else {
      this.back.setNext(node);
      this.back = node;
    }
    this.size++;
  }

  public E dequeue() {
    if (this.size == 0) {
      return null;
    } else {
      E value = this.front.getValue();
      this.front = this.front.getNext();
      this.size--;
      if (this.size == 0) {
        this.back = null;
      }
      return  value;
    }

  }









}