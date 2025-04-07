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
    private long max = Long.MAX_VALUE;
    private long min = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        return isValid(root, min, max);
    }

    public boolean isValid(TreeNode root, long min, long max) { // dfs aka in order traversal
        // base cases
        if(root == null) {
            return true;
        }

        if(root.val >= max || root.val <= min) {
            return false;
        }

        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
        
    }
}