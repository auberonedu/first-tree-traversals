public class TraversalPractice {
    /**
     * Prints only the values of nodes of a tree that are strictly larger than
     * 1000, traversing post-order.
     * 
     * Each value is printed on a separate line. Values less than or equal to
     * 1000 are not printed.
     * 
     * If the node is null, nothing is printed.
     * 
     * @param node the root of the tree
     */
    public static void printLargeNodesPostOrder(TreeNode node) {
        TreeNode current = node;
        if (current == null) return;

        printLargeNodesPostOrder(current.left);
        printLargeNodesPostOrder(current.right);
        if (current.data > 1000) {
        System.out.println(current.data);
        }
        
    }

    /**
     * Prints only the negative values of nodes of a tree, traversing in-order.
     * 
     * Each value is printed on a separate line. Positive/zero values are not
     * printed.
     * 
     * If the node is null, nothing is printed.
     * 
     * @param node the root of the tree
     */
    public static void printNegativeNodesInOrder(TreeNode node) {
        TreeNode current = node;
        if (current == null) return;
        printNegativeNodesInOrder(current.left);
        if (current.data < 0) {
            System.out.println(current.data);
        }
        printNegativeNodesInOrder(current.right);
    }

    /**
     * Prints only the odd values of nodes of a tree, traversing in pre-order.
     * 
     * Each value is printed on a separate line. Even values are not printed.
     * 
     * If the node is null, nothing is printed.
     * 
     * @param node the root of the tree
     */
    public static void printOddNodesPreOrder(TreeNode node) {
        TreeNode current = node;
        if (current == null) return;
        if (current.data % 2  != 0) {
            System.out.println(current.data);
        }
        printOddNodesPreOrder(current.left);
        printOddNodesPreOrder(current.right);
    }
}
