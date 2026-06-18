class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int n : nums1) {
            set.add(n);
        }

        for (int n : nums2) {
            if (set.contains(n)) {
                ans.add(n);
            }
        }

        int[] result = new int[ans.size()];
        int i = 0;

        for (int n : ans) {
            result[i++] = n;
        }

        return result;
    }
}