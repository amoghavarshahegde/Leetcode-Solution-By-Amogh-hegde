class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                || s.charAt(i) == 'u') {
                count++;
            }

            if (i >= k && isVowel(s.charAt(i - k))) {
                count--;
            }

            if (i >= k - 1) {
                max = Math.max(max, count);
            }
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u';
    }
}