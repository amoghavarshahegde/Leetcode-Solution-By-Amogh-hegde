class Solution {
    public boolean squareIsWhite(String coordinates) {

        int col = coordinates.charAt(0) - 'a';
        int row = coordinates.charAt(1) - '1';

        if ((col + row) % 2 == 0) {
            return false;
        }

        return true;
    }
}