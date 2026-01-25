class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int x = nums[0]; //min

        int y = nums[0]; // max
        for(int i = 0 ; i < n ; i++){
            if(x > nums[i]){
                x = nums[i];
            }
            if(y < nums[i]){
                y = nums[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 1 ; i<=x ; i++ ){
            if(x  % i == 0 && y % i == 0){
                max = Math.max(max , i);
            }
        }
        return max;
    }
}