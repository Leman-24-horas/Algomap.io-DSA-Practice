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
    private List<Integer> list = new ArrayList<>();
    // Approach 1 - Use DFS and make an array
    // public int kthSmallest(TreeNode root, int k) {
    //     inOrderTraversal(root);
    //     return list.get(k-1);
        
    // }

    // public void inOrderTraversal(TreeNode root, int) {
    //     if(root == null) {
    //         return;
    //     }

    //     inOrderTraversal(root.left);
    //     list.add(root.val);
    //     inOrderTraversal(root.right);
    // }

    // Approach 2 - More optimal approach
    private int result;
    private int count; 
    public int kthSmallest(TreeNode root, int k) {
        result = 0;
        count = k;
        inOrderTraversal(root);
        return result;
        
    }

    public void inOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrderTraversal(root.left);
        if (count == 1) {
            result = root.val;
        }
        
        count--;
    
        if(count > 0) { // stop dfs when you have found your target
            inOrderTraversal(root.right);
        }
    }
}

// in order traversal
// in a bst inorder you will always visit the smallest number node first