class Solution {
    public int rob(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        /*if(n < 2){
            return nums[0];
        }
        int sum = nums[1];
        int sum2 = nums[0];
        for(int i = 2 ; i < n ; i++){
            if(i % 2 == 0){
                sum2 += nums[i];
            }else{
                sum += nums[i];
            }

        }
        max = Math.max(sum , sum2);
        return max;*/
        if(n == 1){
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0] , nums[1]);
        for(int i = 2 ; i < n ; i++){
            dp[i] = Math.max(dp[i-1] , nums[i] + dp[i-2]);
        }
        return dp[n-1];

    }
}