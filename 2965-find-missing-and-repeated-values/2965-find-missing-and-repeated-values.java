class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
    
        int n = grid.length;
        int[] freq = new int[n * n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        int repeat = 0;
        int missing = 0;

        for (int i = 1; i <= n * n; i++) {
            if (freq[i] == 2)
                repeat = i;
            if (freq[i] == 0)
                missing = i;
        }

        return new int[]{repeat, missing};
    }
}