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
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return checkSum(root, 0, targetSum);
    }

    public static boolean checkSum(TreeNode root, int currSum, int targetSum) {
        if(root == null) { // again, no root.left or root.right, just root
            return false;  // simple base case
        }

        currSum += root.val;

        if(root.left == null && root.right == null) { // when you've reached leaf node
            return currSum == targetSum;
        }

        return checkSum(root.left, currSum, targetSum) || checkSum(root.right, currSum, targetSum);
    }
}

// dfs boolean: left || right
// sum calculation is top to bottom
// boolean value goes bottom to top recursively