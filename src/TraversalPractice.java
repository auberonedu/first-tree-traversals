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
        //check
        if (node == null) return;

        //left
        printLargeNodesPostOrder(node.left);

        //right
        printLargeNodesPostOrder(node.right);

        //print
        if (node.data > 1000) {
            System.out.println(node.data);
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
        //in-order means left print right
        if (node == null) return;

        //left
        printNegativeNodesInOrder(node.left);

        //print
        if (node.data < 0) {
            System.out.println(node.data);
        }

        //right
        printNegativeNodesInOrder(node.right);
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

    }
}
