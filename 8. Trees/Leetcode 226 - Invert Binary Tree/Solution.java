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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null; // base case for recursion

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);   
            
        return root; // 0ms, 100%

        // // Iterative approach
        // if(root == null) {
        //     return null;
        // }
        // Deque<TreeNode> q = new LinkedList<>();
        // q.add(root);

        // while(!q.isEmpty()) {
        //     TreeNode node = q.getFirst();
        //     q.remove();

        //     TreeNode temp = node.left;
        //     node.left = node.right;
        //     node.right = temp;

        //     if(node.left != null) {
        //         q.add(node.left);
        //     }
        //     if(node.right != null) {
        //         q.add(node.right);
        //     }
        // }

        // return root; // 0ms, 100%
    }
}

// bfs
// then swap the left and right