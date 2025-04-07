/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 class Solution {
    private TreeNode lca;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return lca;
    }

    public void dfs(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return;
        }

        lca = root;

        if(root == p || root == q) {
            return;
        } else if (root.val < p.val && root.val < q.val) {
            dfs(root.right, p, q);
        } else if (root.val > p.val && root.val > q.val) {
            dfs(root.left, p, q);
        } else {
            return; // root is in between p and q so that is the lca
        }

    }
}
