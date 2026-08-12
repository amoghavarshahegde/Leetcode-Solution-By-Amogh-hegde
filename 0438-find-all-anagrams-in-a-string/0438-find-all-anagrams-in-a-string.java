class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length())
            return ans;

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

     
        for (char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }

        int k = p.length();

      
        for (int i = 0; i < s.length(); i++) {

           
            sFreq[s.charAt(i) - 'a']++;

           
            if (i >= k) {
                sFreq[s.charAt(i - k) - 'a']--;
            }

            if (i >= k - 1) {

                if (Arrays.equals(pFreq, sFreq)) {
                    ans.add(i - k + 1);
                }
            }
        }

        return ans;
    }
}