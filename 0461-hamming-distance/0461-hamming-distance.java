class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;

        String bin1 = Integer.toBinaryString(x);
        String bin2 = Integer.toBinaryString(y);

        int len = Math.max(bin1.length(), bin2.length());

        bin1 = "0".repeat(len - bin1.length()) + bin1;
        bin2 = "0".repeat(len - bin2.length()) + bin2;

        char[] arr1 = bin1.toCharArray();
        char[] arr2 = bin2.toCharArray();

        for (int i = 0; i < len; i++) {
            if ((arr1[i] ^ arr2[i]) != 0) {
                count++;
            }
        }

        return count;
    }
}