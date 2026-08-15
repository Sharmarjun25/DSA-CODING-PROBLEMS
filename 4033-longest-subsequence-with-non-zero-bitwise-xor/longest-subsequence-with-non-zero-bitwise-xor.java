class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int total = 0;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            total = total ^ nums[i];
            if(nums[i] == 0){
                count++;
            }
        }
        if(total != 0){
            return n;
        }else if(count == n){
            return 0;
        }
        return  n-1;
    }
}