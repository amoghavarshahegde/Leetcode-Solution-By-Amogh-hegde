class Solution {
    public boolean primeSubOperation(int[] nums) {
        int prev = 0;

        for (int i = 0; i < nums.length; i++) {
            int original = nums[i];

          
            for (int p = original - 1; p >= 2; p--) {
                if (isPrime(p) && original - p > prev) {
                    nums[i] = original - p;
                    break;
                }
            }

           
            if (nums[i] <= prev) {
                return false;
            }

            prev = nums[i];
        }

        return true;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}