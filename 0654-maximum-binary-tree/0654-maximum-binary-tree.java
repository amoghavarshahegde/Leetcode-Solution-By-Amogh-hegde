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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return ans(nums,0,nums.length-1);
    }
    public TreeNode ans(int nums[],int low,int high){

        if (low > high)
            return null;


         int maxin=low;
 for(int i=low;i<=high;i++){
    if(nums[i]>nums[maxin]){
        maxin=i;
    }
   
    
   }
     TreeNode root=new TreeNode(nums[maxin]);
     root.left=ans(nums,low,maxin-1);
     root.right=ans(nums,maxin+1,high);
     return root;

    
}
}