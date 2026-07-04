class Solution {
    public char repeatedCharacter(String s) {
    
        int minIndex = s.length();
        char ans = '\0';

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {

                    if (j < minIndex) {
                        minIndex = j;
                        ans = s.charAt(i);
                    }

                    break;
                }
            }
        }

        return ans;
    }
}
