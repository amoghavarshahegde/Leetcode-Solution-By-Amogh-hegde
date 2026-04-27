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
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         postIndex = postorder.length-1;
  
        
       return build(inorder, postorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] inorder, int[] postorder, int start, int end) {
        if (start > end) return null;

       
        int val = postorder[postIndex--];
        TreeNode root = new TreeNode(val);

        
        int index = start;
        while (inorder[index] != val) {
            index++;
        }

        root.right = build( inorder, postorder,index+1,end);
        root.left = build( inorder,postorder, start, index-1);

        return root;
    }
}