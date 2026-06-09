//Find All Anagrams in a String 
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length(), n = p.length();
        List<Integer> ans = new ArrayList<>();
        if (m < n) {
            return ans;
        }
        int[] wor1 = new int[26];
        for (int i = 0; i < n; ++i) {
            ++wor1[p.charAt(i) - 'a'];
        }
        int[] wor2 = new int[26];
        for (int i = 0; i < n - 1; ++i) {
            ++wor2[s.charAt(i) - 'a'];
        }
        for (int i = n - 1; i < m; ++i) {
            ++wor2[s.charAt(i) - 'a'];
            if (Arrays.equals(wor1, wor2)) {
                ans.add(i - n + 1);
            }
            --wor2[s.charAt(i - n + 1) - 'a'];
        }
        return ans;
    }
}