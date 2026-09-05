class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = nums[0];
        suf[n-1] = nums[n-1];
        int ans = -1;
        int max = Integer.MAX_VALUE;
        for(int i = 1 ;i < n ; i++){
            pre[i] = Math.max(pre[i-1] , nums[i]);
        }
        for(int i = n-2 ; i >= 0 ; i--){
            suf[i] = Math.min(suf[i+1] , nums[i]);
        }
        for(int i = 0 ; i < n ; i++){
            int diff = pre[i] - suf[i];
            if(diff <= k){
                ans = i;
                break;
            }
        }
        return ans;

    }
}