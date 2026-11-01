class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        //boolean flag = true;
        int sum = nums[0];
        //int max = Integer.MIN_VALUE;
        int max = nums[0];

        for(int i = 1 ; i < n ; i++){
            if(nums[i] > nums[i-1]){
                sum = sum + nums[i];
               // max = Math.max(max , sum);
            }else{
                sum = nums[i];
            }
            max = Math.max(max , sum);
        }
        return max;
    }
}