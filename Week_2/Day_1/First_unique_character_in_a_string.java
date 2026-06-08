//2. First Unique Character in a String 
class Solution {
    public int firstUniqChar(String s) {
        int[] wor = new int[26];
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            ++wor[s.charAt(i) - 'a'];
        }
        for (int i = 0; i < n; ++i) {
            if (wor[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}