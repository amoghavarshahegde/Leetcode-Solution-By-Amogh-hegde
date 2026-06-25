class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
       int n = colors.length;

        // Create new array of size n+2
        int[] arr = new int[n + 2];

        // Copy original array
        for (int i = 0; i < n; i++) {
            arr[i] = colors[i];
        }

        // Add first two elements at the end
        arr[n] = colors[0];
        arr[n + 1] = colors[1];

        int count = 0;

        // Sliding window of size 3
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[i + 1] && arr[i + 1] != arr[i + 2]) {
                count++;
            }
        }

        return count;
    }
}