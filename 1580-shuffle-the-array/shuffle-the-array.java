class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int[] ans = new int[m];
        for(int i = 0 ; i < m ; i++){
            if(i % 2 == 0){
                ans[i] = nums[i/2];
            }else{
                ans[i] = nums[n + (i/2)];
            }
        }
        return ans;
        
    }
}