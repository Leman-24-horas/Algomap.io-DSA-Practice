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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        // if(p.val == q.val) return true; // child nodes may not match but then if parent nodes match then this will equate to true
        if(p != null && q == null || p == null && q != null) return false;
        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

/*
    The nature of recursive
    a) have base cases
    b) call the function again
    c) have a return statement (function call can be here too)
 */