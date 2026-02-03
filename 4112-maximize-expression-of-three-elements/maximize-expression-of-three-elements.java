class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n = nums.length;
        /*int c = nums[0];
        int a = nums[0];
        int b = nums[0];
        int sum = 0;
        for(int i = 1 ; i < n ; i++){
            sum  = nums[0] + nums[i];
            c = Math.min(c , nums[i]);
            a = Math.max(a , nums[i]);
            b = Math.max( nums[i] ,sum - a-c );
        }*/
        Arrays.sort(nums);
        int a = nums[n-1];
        int b = nums[n-2];
        int c = nums[0];
        return a + b - c;
    }
}