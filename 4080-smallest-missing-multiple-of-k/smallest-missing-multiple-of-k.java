class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        /*for(int i = 1 ; i < n ; i++){
            int pro = k * i;
            if(nums[i] != pro){
                ans = Math.min(ans , pro);
            }
        }*/
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            
            set.add(nums[i]);
        }
        int curr = k;
        for(int num : set){
            if(set.contains(curr)){
                curr = curr + k;
            }
        }
        return curr;
    }
}