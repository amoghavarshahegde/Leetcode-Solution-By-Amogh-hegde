import java.util.Arrays;

class Solution {
    public long smallestNumber(long num) {
        char[] arr = Long.toString(num).toCharArray();

        if (num > 0) {
            Arrays.sort(arr);

            if (arr[0] == '0') {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] != '0') {
                        char temp = arr[0];
                        arr[0] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        } else if (num < 0) {
            Arrays.sort(arr, 1, arr.length);

            for (int i = 1, j = arr.length - 1; i < j; i++, j--) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return Long.parseLong(new String(arr));
    }
}