class Solution {
    public int findNonMinOrMax(int[] nums) {
        //int count  = 0;
        int n = nums.length;
        /*int ans = 0;
         int min = Integer.MIN_VALUE;
         int max = Integer.MAX_VALUE;
         for(int i = 0 ; i < n ; i++){
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
         }
         ans = */

         Arrays.sort(nums);
         if(n == 2 || n == 1){
            return -1;
         }
         return nums[1];
    }
}