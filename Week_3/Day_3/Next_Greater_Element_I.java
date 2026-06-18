//3. Next Greater Element I
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Deque<Integer> stck = new ArrayDeque<>();
        int m = nums1.length, n = nums2.length;
        Map<Integer, Integer> d = new HashMap(n);
        for (int i = n - 1; i >= 0; --i) {
            int x = nums2[i];
            while (!stck.isEmpty() && stck.peek() < x) {
                stck.pop();
            }
            if (!stck.isEmpty()) {
                d.put(x, stck.peek());
            }
            stck.push(x);
        }
        int[] ans = new int[m];
        for (int i = 0; i < m; ++i) {
            ans[i] = d.getOrDefault(nums1[i], -1);
        }
        return ans; 
    }
}