class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = -99999;
        for (int i = 0; i < nums.length; i++) {
            currentSum+=nums[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
        
    }
}
