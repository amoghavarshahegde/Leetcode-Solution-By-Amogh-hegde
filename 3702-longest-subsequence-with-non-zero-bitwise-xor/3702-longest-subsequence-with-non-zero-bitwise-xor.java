class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        boolean hasnonzero=false;
        int xor=0;
        for( int num:nums){
            xor^=num;

            if(num!=0){
                hasnonzero=true;
            }

        }
        if(xor!=0){
            return n;
        }
            if(!hasnonzero){
                return 0;

            }
            else
            return n-1;
        
        
    }
}