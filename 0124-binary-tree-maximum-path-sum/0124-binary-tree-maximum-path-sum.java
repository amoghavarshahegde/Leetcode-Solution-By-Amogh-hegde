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
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, dfs(node.left));   // ignore negative paths
        int right = Math.max(0, dfs(node.right));

        // Path through current node (could be answer)
        int currentPath = node.val + left + right;

        // Update global max
        maxSum = Math.max(maxSum, currentPath);

        // Return max path including this node (only one side allowed)
        return node.val + Math.max(left, right);
    }
}