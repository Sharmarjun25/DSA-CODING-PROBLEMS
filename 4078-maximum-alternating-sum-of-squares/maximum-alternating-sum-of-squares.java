class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        //Arrays.sort(nums);
        for(int i = 0 ; i < n ; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        long sum = 0;
        int half = n/2;
        for(int i = 0 ; i < half ; i++){
            sum = sum - nums[i];
        }
        for(int i = half ; i < n ; i++){
            sum = sum + nums[i];
        }
        return sum;

    }
}