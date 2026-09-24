class Solution {
    public String frequencySort(String s) {
        int[] f = new int[128];

        for (char c : s.toCharArray())
            f[c]++;

        StringBuilder ans = new StringBuilder();

        while (ans.length() < s.length()) {
            int max = 0;
            char ch = 0;

            for (char c = 0; c < 128; c++) {
                if (f[c] > max) {
                    max = f[c];
                    ch = c;
                }
            }

            while (max-- > 0)
                ans.append(ch);

            f[ch] = 0;
        }

        return ans.toString();
    }
}