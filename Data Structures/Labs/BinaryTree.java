
public class BinaryTree {

  public static void main(String[] args) {
    BinaryTree bst = new BinaryTree(30);
    int[] a = { 35, 57, 15, 63, 49, 89, 77, 67, 98, 91 };
    for (int n : a)
      bst.insert(n);
    System.out.println("Preorder Traversal :");
    bst.traversePreOrder();

    System.out.println("\nInorder Traversal :");
    bst.traverseInOrder();

    System.out.println("\nPostorder Traversal :");
    bst.traversePostOrder();
  }

  int data;
  BinaryTree left;
  BinaryTree right;

  public BinaryTree(int i) {
    this.data = i;
    this.left = null;
    this.right = null;
  }

  public void insert(int i) {
    if (i < this.data) {
      if (this.left != null)
        this.left.insert(i);
      else
        this.left = new BinaryTree(i);
    } else {
      if (this.right != null) {
        this.right.insert(i);
      } else {
        this.right = new BinaryTree(i);
      }
    }
  }

  // PreOrder Traversal 
  public void traversePreOrder() {
    System.out.print(this.data + " ");
    if (this.left != null) {
      this.left.traversePreOrder();
    }
    if (this.right != null) {
      this.right.traversePreOrder();
    }
  }

  // InOrder Traversal
  public void traverseInOrder() {
    if (this.left != null) {
      this.left.traverseInOrder();
    }
    System.out.print(this.data + " ");
    if (this.right != null) {
      this.right.traverseInOrder();
    }
  }

  // PostOrder Traversal
  public void traversePostOrder() {
    if (this.left != null) {
      this.left.traversePostOrder();
    }
    if (this.right != null) {
      this.right.traversePostOrder();
    }
    System.out.print(this.data + " ");
  }

}
