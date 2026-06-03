//2. Squares of a Sorted Array

//Brute force(first attempt)

class Solution {
    public int[] sortedSquares(int[] nums){
    ArrayList <Integer> sq = new ArrayList<>();
        for (int i=0; i< nums.length; i++){
            sq.add(nums[i]*nums[i]);
        }
    Collections.sort(sq);
    int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = sq.get(i);
        }

        return result;
    }
}

// Two pointer(second attempt)

class Solution {
    public int[] sortedSquares(int[] nums){
    int n = nums.length;
    int [] sqr_arr = new int [n];
    int start = 0;
    int end = n-1;
     
     for (int i = n-1; i >= 0; i--){
        int start_sq= nums[start] * nums[start];
        int end_sq= nums[end] * nums[end];

        if(start_sq > end_sq){
            sqr_arr[i] = start_sq;
            start++; 
        }   
        else{
            sqr_arr[i] = end_sq;
            end--; 
        }
     }
    return sqr_arr;
    }
}