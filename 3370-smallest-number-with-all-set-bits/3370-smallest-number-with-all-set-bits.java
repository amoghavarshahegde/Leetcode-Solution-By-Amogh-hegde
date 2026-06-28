class Solution {
    public int smallestNumber(int n) {
      int i = 1;

        while (true) {
            if (i >= n) {
                return i;
            }

            i = i * 2 + 1;
        }
    }
}