class Solution {
    public int hIndex(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >= n-i){
                return n-i;
            }
        }
        return 0;

        
    }
}