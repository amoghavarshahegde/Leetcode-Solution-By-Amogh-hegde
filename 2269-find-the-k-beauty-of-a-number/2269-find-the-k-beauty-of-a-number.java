class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;

        for (int i = 0; i <= s.length() - k; i++) {
            int x = Integer.parseInt(s.substring(i, i + k));

            if (x != 0 && num % x == 0) {
                count++;
            }
        }

        return count;
    }
}