//1. Maximum Subarray 
class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int csum = nums[0];
        
        for(int i= 1;i< nums.length; i++){
            csum = Math.max(nums[i], csum + nums[i]);

            max_sum = Math.max(max_sum,csum);
        }
       return max_sum; 
    }
}