class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int count = 0;
        /*int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            max  = Math.max(max , nums[i]);

        }*/
        Arrays.sort(nums);
        for(int i = 0 ; i < n-1 ; i++){
            while(nums[i] < nums[n-1]){
                nums[i] = nums[i] + 1;
                count++;
            }

        }
        return count;
    }
}