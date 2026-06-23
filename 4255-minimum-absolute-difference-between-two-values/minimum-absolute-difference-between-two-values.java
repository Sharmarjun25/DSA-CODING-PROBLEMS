class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int diff  = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            for(int j = 1 ; j < n ; j++){
                if(nums[i] == 1 && nums[j] == 2 || nums[i] == 2 && nums[j] == 1){
                    diff = Math.min( diff , Math.abs(i - j));
                }
            }
        }
       // return diff;
       if(diff == Integer.MAX_VALUE){
        return -1;
       }else{
        return diff;
       }
    }
}