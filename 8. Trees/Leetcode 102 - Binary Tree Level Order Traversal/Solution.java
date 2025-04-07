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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Deque<TreeNode> q = new LinkedList<>();
        q.addFirst(root);

        List<List<Integer>> result = new ArrayList<>();

        while(q.size() != 0) {
            List<Integer> l = new ArrayList<>();
            int n = q.size();

            for(int i = 0; i < n; i++) {
                TreeNode temp = q.removeFirst();
                l.add(temp.val);

                // check if left and right nodes exist
                if(temp.left != null) {
                    q.add(temp.left);
                }
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }

            result.add(l);
        }

        return result;
    }
}