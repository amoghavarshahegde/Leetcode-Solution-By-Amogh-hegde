class Solution {
    public boolean checkValidGrid(int[][] grid) {

        int n = grid.length;

        if (grid[0][0] != 0) {
            return false;
        }

        int row = 0;
        int col = 0;
        int count = 0;

        int[][] moves = {
            {-2, -1},
            {-2, 1},
            {-1, -2},
            {-1, 2},
            {1, -2},
            {1, 2},
            {2, -1},
            {2, 1}
        };

        while (count < n * n - 1) {

            boolean found = false;

            for (int[] move : moves) {

                int newRow = row + move[0];
                int newCol = col + move[1];

                if (newRow >= 0 && newRow < n &&
                    newCol >= 0 && newCol < n) {

                    if (grid[newRow][newCol] == count + 1) {

                        row = newRow;
                        col = newCol;
                        count++;
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}