
class Solution {
    public int longestSubarray(int[] nums) {
        int count = 2;
        int max = 2;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + nums[i + 1] == nums[i + 2]) {
                count++;
            } else {
                count = 2;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
