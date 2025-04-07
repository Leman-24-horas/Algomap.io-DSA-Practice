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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) { // if it doesn't match you'll eventually get to a point where you've reach a null node of a leaf node like leaf.left or right and there is a subroot
            return false;
        }

        boolean check = match(root, subRoot);
        if(check) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean match(TreeNode root, TreeNode subRoot) { // same as same tree
        if(root == null && subRoot == null) {
            return true;
        }

        if(root != null && subRoot == null || root == null && subRoot != null) {
            return false;    
        } 

        if(root.val != subRoot.val) {
            // return match(root.left, subRoot);
            return false;
        }

        return match(root.left, subRoot.left) && match(root.right, subRoot.right); 
        // if same then move on;

    }
}