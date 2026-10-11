import java.util.Arrays;

class Solution {
    public int countElements(int[] nums, int k) {
        if (k == 0) return nums.length;

        Arrays.sort(nums);
        int n = nums.length;
        int threshold = nums[n - k];

        int count = 0;
        for (int num : nums) {
            if (num < threshold) {
                count++;
            }
        }

        return count;
    }
}