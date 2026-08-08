class Solution {
    public boolean detectCapitalUse(String word) {
   int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                counter++;
            }
        }

        if (counter == 0 || counter == word.length()) {
            return true;
        }

        if (counter == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}