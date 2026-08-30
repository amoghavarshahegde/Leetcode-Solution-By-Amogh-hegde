class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {

        int n = dist.length;

    
        if (hour <= n - 1) {
            return -1;
        }

     
        int low = 1;
        int high = 10_000_000;

        while (low < high) {

          
            int mid = low + (high - low) / 2;

            double totalTime = 0;

           
            for (int i = 0; i < n - 1; i++) {
                totalTime += Math.ceil((double) dist[i] / mid);
            }

         
            totalTime += (double) dist[n - 1] / mid;

           
            if (totalTime <= hour) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}