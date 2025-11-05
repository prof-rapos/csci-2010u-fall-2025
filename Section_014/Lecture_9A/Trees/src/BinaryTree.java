import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

  Node root;

  BinaryTree() {
    this.root = null;
  }

  static class Node {
    int value;
    Node left;
    Node right;

    Node(int val) {
      this.value = val;
      this.left = null;
      this.right = null;
    }

    void addLeft(int val) {
      this.left = new Node(val);
    }

    void addRight(int val) {
      this.right = new Node(val);
    }

    void print_rec() {
      if(this.left != null) {
        this.left.print_rec();
      }
      System.out.print(this.value + " ");
      if(this.right != null) {
        this.right.print_rec();
      }
    }

  }

  public void add(int value) {
    Node newNode = new Node(value);
    if (root == null) {
      root = newNode; // If the tree is empty, set the new node as root
      return;
    }

    // Use a queue to perform BFS
    Queue<Node> queue = new LinkedList<>();
    queue.add(root); // Start with the root node

    while (!queue.isEmpty()) {
      Node current = queue.poll(); // Get and remove the current node from the queue

      // Check for left child
      if (current.left == null) {
        current.left = newNode; // Add the new node here
        return;
      } else {
        queue.add(current.left); // Otherwise, add the left child to the queue
      }

      // Check for right child
      if (current.right == null) {
        current.right = newNode; // Add the new node here
        return;
      } else {
        queue.add(current.right); // Otherwise, add the right child to the queue
      }
    }
  }

  public void remove(int value) {
    root = removeRecursive(root, value);
  }

  private Node removeRecursive(Node node, int value) {
    if (node == null) {
      return null; // Base case: node is not found
    }
    // If the node to be removed is found
    if (node.value == value) {
      // Case 1: Node with two children
      if (node.left != null && node.right != null) {
        // Promote the left child
        Node newNode = node.left;
        // Attach the right child to the left child
        if (newNode.right == null) {
          newNode.right = node.right; // Attach right child directly
        } else {
          // Find the rightmost node of the left child
          Node rightmost = newNode;
          while (rightmost.right != null) {
            rightmost = rightmost.right;
          }
          rightmost.right = node.right; // Attach right child to the rightmost of the left child
        }
        return newNode; // Promote the left child
      } else {
        // Case 2: Node with only one or no children
        return (node.left != null) ? node.left : node.right;
      }
    }

    // Recursively search for the node to remove in left and right subtrees
    node.left = removeRecursive(node.left, value);
    node.right = removeRecursive(node.right, value);

    return node; // Return the current node
  }


  void print() {
    if(this.root != null) {
      this.root.print_rec();
      System.out.println();
    }
  }


  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.add(1);    tree.add(2);
    tree.add(3);    tree.add(4);
    tree.add(5);    tree.add(6);
    tree.add(7);    tree.add(8);
    tree.add(9);    tree.print();

    tree.remove(4);
    tree.remove(7);
    tree.remove(8);
    tree.print();

  }
}