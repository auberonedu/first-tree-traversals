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
        if (node == null){
            return;
        }

        // Traverse the left subtree
        printLargeNodesPostOrder(node.left);

        // Traverse the right subtree
        printLargeNodesPostOrder(node.right);

        // Check the current node's value
        if(node.data > 1000) {
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
        if(node == null){
            return;
        }

        // Traverse the left subtree
        printNegativeNodesInOrder(node.left);

        // Check the current node's value
        if(node.data < 0){
            System.out.println(node.data);
        }

        // Traverse the right subtree
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
        if(node == null){
            return;
        }

        // Check the current node's value
        if(node.data % 2 != 0){

            System.out.println(node.data);
        }

        // Traverse the left subtree
        printOddNodesPreOrder(node.left);

        // Traverse the right subtree
        printOddNodesPreOrder(node.right);
    }
}
