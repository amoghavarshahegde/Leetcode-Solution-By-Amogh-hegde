class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
 
        Arrays.sort(nums);

        int[] values = new int[nums.length];
        int[] counts = new int[nums.length];

        int i = 0, j = 1, index = 0;

        while (j <= nums.length) {

            if (j < nums.length && nums[i] == nums[j]) {
                j++;
            } else {
                values[index] = nums[i];
                counts[index] = j - i;

                index++;
                i = j;
                j++;
            }
        }

        int[] ans = new int[k];

        for (int p = 0; p < k; p++) {

            int max = 0;

            for (int q = 1; q < index; q++) {
                if (counts[q] > counts[max]) {
                    max = q;
                }
            }

            ans[p] = values[max];

            // Don't select this again
            counts[max] = -1;
        }

        return ans;
    }
}