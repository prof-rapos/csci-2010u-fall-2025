public class TernaryTree {

  Node root;

  TernaryTree() {
    this.root = null;
  }

  static class Node {
    int value;
    Node left;
    Node center;
    Node right;

    Node(int val) {
      this.value = val;
      this.left = null;
      this.center = null;
      this.right = null;
    }

    void addLeft(int val) {
      this.left = new Node(val);
    }

    void addCenter(int val) {
      this.center = new Node(val);
    }

    void addRight(int val) {
      this.right = new Node(val);
    }

    void print_rec() {
      if(this.left != null) {
        this.left.print_rec();
      }
      System.out.print(this.value + " ");
      if (this.center != null) {
        this.center.print_rec();
      }
      if(this.right != null) {
        this.right.print_rec();
      }
    }

  }

  void print() {
    if(this.root != null) {
      this.root.print_rec();
      System.out.println();
    }
  }


  public static void main(String[] args) {
    TernaryTree tree = new TernaryTree();
    tree.root = new Node(5);
    tree.root.addLeft(2);
    tree.root.left.addLeft(1);
    tree.root.left.addCenter(3);
    tree.root.left.addRight(4);
    tree.root.addCenter(7);
    tree.root.center.addLeft(6);
    tree.root.center.addCenter(8);
    tree.root.addRight(9);
    tree.root.right.addRight(10);
    tree.print();

  }
}