public class BinaryTree14 {
    Node14 root;

    public BinaryTree14() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    // rekursif
    public void add(int data) {
        root = addRecursive(root, data);
    }

    private Node14 addRecursive(Node14 current, int data) {
        if (current == null) {
            return new Node14(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    // terkecil
    public int findMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMinRecursive(root);
    }

    private int findMinRecursive(Node14 node) {
        return node.left == null ? node.data : findMinRecursive(node.left);
    }

    // terbesar
    public int findMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMaxRecursive(root);
    }

    private int findMaxRecursive(Node14 node) {
        return node.right == null ? node.data : findMaxRecursive(node.right);
    }

    // leaf
    public void printLeafNodes() {
        printLeafNodesRecursive(root);
    }

    private void printLeafNodesRecursive(Node14 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeafNodesRecursive(node.left);
            printLeafNodesRecursive(node.right);
        }
    }

    // Hitung leaf
    public int countLeafNodes() {
        return countLeafNodesRecursive(root);
    }

    private int countLeafNodesRecursive(Node14 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodesRecursive(node.left) + countLeafNodesRecursive(node.right);
    }

    void traversePreOrder(Node14 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node14 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node14 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
