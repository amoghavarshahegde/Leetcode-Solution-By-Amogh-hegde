class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        // Prefix product
        int pre = 1;

        for (int i = 0; i < n; i++) {
            res[i] = pre;
            pre = pre * nums[i];
        }

        // Suffix product
        int post = 1;

        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * post;
            post = post * nums[i];
        }

        return res;
    }
}