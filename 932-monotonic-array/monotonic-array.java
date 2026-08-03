class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean dec = false;
        boolean inc = false;
        int n = nums.length;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] < nums[i-1]){
                inc = true;
            }
            if(nums[i] > nums[i-1]){
                dec = true;
            }
            

        }
        if(inc && dec){
            return false;
        }else{
            return true;
        }
        
    }
}