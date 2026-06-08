//1. Valid Anagram 
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] wor = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            ++wor[s.charAt(i) - 'a'];
            --wor[t.charAt(i) - 'a'];
        }
        for (int i = 0; i < 26; ++i) {
            if (wor[i] != 0) {
                return false;
            }
        }
        return true; 
    }
}