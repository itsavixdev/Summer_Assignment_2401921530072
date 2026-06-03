//3. Container With Most Water 
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max_water = 0;
        int start = 0;
        int end = n - 1;
        
        while (start < end) {
            int width = end - start;
            int curr_height = Math.min(height[start], height[end]);
            int curr_water = width * curr_height;
            max_water = Math.max(max_water, curr_water);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        
        return max_water;
    }
}