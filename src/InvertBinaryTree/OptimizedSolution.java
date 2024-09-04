package InvertBinaryTree;

public class OptimizedSolution {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        //Recursively inverting the left and right Subtrees
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        //Swapping the left and right children
        root.left = right;
        root.right = left;

        return root;
    }
}
