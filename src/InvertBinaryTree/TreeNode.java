package InvertBinaryTree;

 //Definition for a binary tree node.
 public class TreeNode {

     int val;
     TreeNode left;
     TreeNode right;

     public TreeNode() {}

     public TreeNode(int val) {

         this.val = val;
     }

     public TreeNode(int val, TreeNode left, TreeNode right) {

         this.val = val;
         this.left = left;
         this.right = right;
     }

     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append(val);

         if (left != null) {
             sb.append(", ").append(left.toString());
         } else {
             sb.append(", null");
         }

         if (right != null) {
             sb.append(", ").append(right.toString());
         } else {
             sb.append(", null");
         }

         return sb.toString();
     }
 }
