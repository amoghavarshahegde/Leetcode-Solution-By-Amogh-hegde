import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int total = 0;

     
        for (int x : apple) {
            total += x;
        }

        Arrays.sort(capacity);

        int sum = 0;
        int count = 0;

   
        for (int i = capacity.length - 1; i >= 0; i--) {
            sum += capacity[i];
            count++;

            if (sum >= total) {
                break;
            }
        }

        return count;
    }
}