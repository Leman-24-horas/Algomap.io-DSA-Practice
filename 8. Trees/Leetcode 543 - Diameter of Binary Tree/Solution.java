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
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root); // we don't need height just the diameter
        return maxDiameter;
        
    }

    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int l = height(root.left);
        int r = height(root.right);
        int diameter = l + r;
        maxDiameter = Math.max(maxDiameter, diameter); // you need this 

        return Math.max(l, r) + 1;
    }
}

// depth first search