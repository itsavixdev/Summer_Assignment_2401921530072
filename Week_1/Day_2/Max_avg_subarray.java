//3. Maximum Average Subarray I 
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double curr_avg = 0;
        for(int i= 0; i<k; i++){
            curr_avg += nums[i];
        }
        double max_avg = curr_avg;

        for(int i=k; i< nums.length; i++){
            curr_avg += nums[i] - nums[i-k];
            max_avg = Math.max(max_avg, curr_avg);
        }
     return (max_avg / k);
    }
}