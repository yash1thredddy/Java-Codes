class BST_class {
    // node class that defines BST node
    class Node {
        int key;
        Node left, right;

        public Node(int data) {
            key = data;
            left = right = null;
        }
    }

    // BST root node
    Node root;

    // Constructor for BST =>initial empty tree
    BST_class() {
        root = null;
    }

    // delete a node from BST
    void deleteKey(int key) {
        root = delete_Recursive(root, key);
    }

    // recursive delete function
    Node delete_Recursive(Node root, int key) {
        // tree is empty
        if (root == null)
            return root;

        // traverse the tree
        if (key < root.key) // traverse left subtree
            root.left = delete_Recursive(root.left, key);
        else if (key > root.key) // traverse right subtree
            root.right = delete_Recursive(root.right, key);
        else {
            // node contains only one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node has two children;
            // get inorder successor (min value in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = delete_Recursive(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        // initially minval = root
        int minval = root.key;
        // find minval
        while (root.left != null) {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }

    // insert a node in BST
    void insert(int key) {
        root = insert_Recursive(root, key);
    }

    // recursive insert function
    Node insert_Recursive(Node root, int key) {
        // tree is empty
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // traverse the tree
        if (key < root.key) // insert in the left subtree
            root.left = insert_Recursive(root.left, key);
        else if (key > root.key) // insert in the right subtree
            root.right = insert_Recursive(root.right, key);
        // return pointer
        return root;
    }

    // method for inorder traversal of BST
    void inorder() {
        inorder_Recursive(root);
    }

    // recursively traverse the BST
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }

}

class BST2 {
    public static void main(String[] args) {
        // create a BST object
        BST_class bst = new BST_class();
        /*
         * BST tree example 45 / \ 10 90 / \ / 7 12 50
         */
        // insert data into BST
        bst.insert(2);
        bst.insert(6);
        bst.insert(3);
        bst.insert(12);
        bst.insert(16);
        bst.insert(5);
        bst.insert(4);
        bst.insert(7);
        bst.insert(16);
        bst.insert(26);
        bst.insert(23);
        bst.insert(18);
        bst.insert(8);
        bst.insert(19);
        bst.insert(62);
        // print the BST
        System.out.println("The BST Created with input data:");
        bst.inorder();

        // delete leaf node
        System.out.println("\nThe BST after Delete 62:");
        bst.deleteKey(62);
        bst.inorder();
        // delete the node with one child
        System.out.println("\nThe BST after Delete 8:");
        bst.deleteKey(8);
        bst.inorder();

        // delete node with two children
        System.out.println("\nThe BST after Delete 4 :");
        bst.deleteKey(4);
        bst.inorder();
    }
}