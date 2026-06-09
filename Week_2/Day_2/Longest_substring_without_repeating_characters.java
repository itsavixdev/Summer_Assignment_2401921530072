//1. Longest Substring Without Repeating Characters 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] wor = new int[128];
        int ans = 0, n = s.length();
        for (int l = 0, r = 0; r < n; ++r) {
            char c = s.charAt(r);
            ++wor[c];
            while (wor[c] > 1) {
                --wor[s.charAt(l++)];
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
} 