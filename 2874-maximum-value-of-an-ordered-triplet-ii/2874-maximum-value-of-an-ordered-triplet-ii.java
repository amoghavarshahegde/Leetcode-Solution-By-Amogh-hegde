class Solution {
    public long maximumTripletValue(int[] nums) {
        
     int n = nums.length;

        int[] rightMax = new int[n];
        rightMax[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i], rightMax[i + 1]);
            rightMax[i] = Math.max(nums[i], rightMax[i + 1]);
        }

        long ans = 0;
        int leftMax = nums[0];

        for (int j = 1; j < n - 1; j++) {
            long value = (long)(leftMax - nums[j]) * rightMax[j + 1];
            ans = Math.max(ans, value);
            leftMax = Math.max(leftMax, nums[j]);
        }

        return ans;
    }
}