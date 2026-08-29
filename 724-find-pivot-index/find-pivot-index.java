class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int prefix = 0;
        int[] left = new int[n];
        for(int i = 0 ; i < n ; i++){
            left[i] = prefix;
            prefix = prefix + nums[i];
        }
        int suffix = 0;
        int[] right = new int[n];
        for(int i = n-1 ; i >= 0 ; i--){
            right[i]= right[i] + suffix;
            suffix = suffix + nums[i];
         }
         for(int i = 0 ; i < n ; i++){
            if(left[i] == right[i]){
                ans =  i;
                break;
            }
         }
         return ans;
    }
}