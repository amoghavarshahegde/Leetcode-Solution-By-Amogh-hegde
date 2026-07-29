class Solution {
    public int reversePairs(int[] nums) {
                return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int low, int high) {
        if (low >= high)
            return 0;

        int mid = low + (high - low) / 2;
        int count = 0;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);

        int j = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (j <= high && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += j - (mid + 1);
        }

        merge(nums, low, mid, high);

        return count;
    }

    private void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= high) {
            temp[k++] = nums[j++];
        }

        for (i = low, k = 0; i <= high; i++, k++) {
            nums[i] = temp[k];
        }
    }
}