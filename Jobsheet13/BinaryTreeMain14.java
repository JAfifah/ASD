public class BinaryTreeMain14 {
    public static void main(String[] args) {
        BinaryTree14 bt = new BinaryTree14();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        System.out.print("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.print("InOrder Traversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");

        System.out.print("PostOrder Traversal: ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.print("Leaf Nodes: ");
        bt.printLeafNodes();
        System.out.println("");

        System.out.println("Minimum value: " + bt.findMin());
        System.out.println("Maximum value: " + bt.findMax());

        int leafCount = bt.countLeafNodes();
        System.out.println("Number of Leaf Nodes: " + leafCount);
    }
}
