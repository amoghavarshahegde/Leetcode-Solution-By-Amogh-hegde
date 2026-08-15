class Solution {
    public int findMiddleIndex(int[] nums) {
        

        int total=0;
        for(int num:nums){
            total+=num;
        }
        int left_s=0;
        for(int i=0;i<nums.length;i++){
           int right_s=total-left_s-nums[i];


            if(left_s==right_s){
                return i;
            }
            left_s+=nums[i];
        }
        return -1;
        
    }
}