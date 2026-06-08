class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sume = 0;
        int sumd = 0;
        for(int i = 0 ; i < n ; i++){
            sume = sume + nums[i];
            int num = nums[i];
            while(nums[i] > 0){
                sumd = sumd +( nums[i] % 10);
                nums[i] = nums[i] / 10;
            }
        }
        return Math.abs(sume - sumd);
        
    }
}