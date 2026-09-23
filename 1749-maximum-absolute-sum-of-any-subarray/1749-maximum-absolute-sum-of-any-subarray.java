class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0, minSum = 0;
        int max = 0, min = 0;

        for (int x : nums) {
            maxSum = Math.max(x, maxSum + x);
            minSum = Math.min(x, minSum + x);

            max = Math.max(max, maxSum);
            min = Math.min(min, minSum);
        }

        return Math.max(max, Math.abs(min));
    }
}