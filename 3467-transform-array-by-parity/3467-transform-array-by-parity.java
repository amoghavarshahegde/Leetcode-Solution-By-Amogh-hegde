class Solution {
    public int[] transformArray(int[] nums) {
        int res[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[j++]=0;
            }
            else
             res[j++]=1;
        }
        Arrays.sort(res);
        return res;
        
    }
}