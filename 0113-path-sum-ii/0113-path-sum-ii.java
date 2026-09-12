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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();

        find(root, targetSum, new ArrayList<>(), ans);

        return ans;
    }

    public void find(TreeNode root, int targetSum,
                     List<Integer> path,
                     List<List<Integer>> ans) {

        if (root == null)
            return;

        path.add(root.val);
        targetSum -= root.val;

       
        if (root.left == null && root.right == null) {

            if (targetSum == 0)
                ans.add(new ArrayList<>(path));

        } else {

            find(root.left, targetSum, path, ans);
            find(root.right, targetSum, path, ans);
        }
   path.remove(path.size() - 1);
    }
}