import java.util.ArrayList;

public class NaryTree {

  Node root;

  NaryTree() {
    this.root = null;
  }

  static class Node {
    int value;
    ArrayList<Node> children;

    Node(int val) {
      this.value = val;
      this.children = new ArrayList<>();
    }

    void addChild(int val) {
      this.children.add(new Node(val));
    }


    void print_rec() {
      System.out.print(this.value + " ");
      for(Node n : this.children) {
        n.print_rec();
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
    NaryTree tree = new NaryTree();
    tree.root = new Node(1);
    tree.root.addChild(2);
    tree.root.children.get(0).addChild(3);
    tree.root.children.get(0).addChild(4);
    tree.root.addChild(5);
    tree.root.children.get(1).addChild(6);
    tree.root.addChild(7);
    tree.root.children.get(2).addChild(8);
    tree.root.children.get(2).addChild(9);
    tree.root.children.get(2).addChild(10);
    tree.root.addChild(11);
    tree.root.addChild(12);
    tree.root.children.get(4).addChild(13);
    tree.root.children.get(4).addChild(14);
    tree.root.children.get(4).addChild(15);
    tree.print();

  }
}