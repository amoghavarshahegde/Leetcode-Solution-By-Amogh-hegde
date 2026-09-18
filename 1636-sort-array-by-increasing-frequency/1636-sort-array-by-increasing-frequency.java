class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] ans = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        Arrays.sort(ans, (a, b) -> {
            int countA = map.get(a);
            int countB = map.get(b);

            if (countA != countB)
                return countA - countB;

            return b - a;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }

        return nums;
    }
}