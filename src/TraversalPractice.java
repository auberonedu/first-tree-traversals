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
        /**
        if null : return
        search left
        search right
        print data in a separated line and only > 1000
         */

         if (node == null) return;
         printLargeNodesPostOrder(node.left);
         printLargeNodesPostOrder(node.right);
         if (node.data > 1000){
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
        /**
        if null : return
        search left
        print data in a separated line and only < 0
        search right
         */

         if (node == null) return;
         printNegativeNodesInOrder(node.left);
         if (node.data < 0){
         System.out.println(node.data);
         }
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
        /**
        if null : return
        print data in a separated line and only odd nodes
        search left
        search right
         */

         if (node == null) return;
         if (node.data % 2 != 0){
         System.out.println(node.data);
         }
         printOddNodesPreOrder(node.left);
         printOddNodesPreOrder(node.right);

    }
}
