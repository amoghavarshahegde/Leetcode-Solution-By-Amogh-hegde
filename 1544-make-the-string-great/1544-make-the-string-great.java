class Solution {
    public String makeGood(String s) {

        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {

            int n = stack.length();

            if (n > 0 &&
                Math.abs(stack.charAt(n - 1) - ch) == 32) {

                stack.deleteCharAt(n - 1);

            } else {
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}