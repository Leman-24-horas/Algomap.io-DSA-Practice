/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int smallest = Integer.MAX_VALUE;
    private TreeNode prev = null;

    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return smallest;
    }

    public void inOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrderTraversal(root.left);

        if(prev != null) {
            int diff = Math.abs(prev.val - root.val);
            smallest = Math.min(smallest, diff);
        }

        prev = root; // prev = currNode.val
        // this is also a trick, if you want to use something in the next iteration
        // you set it at the end after the main operation

        inOrderTraversal(root.right);
    }
}