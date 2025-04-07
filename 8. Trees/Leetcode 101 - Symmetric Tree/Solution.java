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
    public boolean isSymmetric(TreeNode root) {
        return match(root, root);
    }

    public boolean match(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }

        if(p == null && q != null || p != null && q == null) {
            return false;
        }

        if(p.val != q.val) {
            return false;
        }

        return match(p.left, q.right) && match(p.right, q.left);
    }
}

// 0ms, 100%

// another thing p.left and q.right are mostly used in return statements, not in the body of the method