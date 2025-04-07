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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int h1 = height(root.left);
        int h2 = height(root.right);
        int diff = Math.abs(h2-h1);


        if(diff <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false;

    }

    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int l = height(root.left);
        int r = height(root.right);

        return Math.max(l, r) + 1;
    }
}