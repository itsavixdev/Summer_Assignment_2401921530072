//3. Ransom Note
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] wor = new int[26];
        for (int i = 0; i < magazine.length(); ++i) {
            ++wor[magazine.charAt(i) - 'a'];
        }
        for (int i = 0; i < ransomNote.length(); ++i) {
            if (--wor[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}