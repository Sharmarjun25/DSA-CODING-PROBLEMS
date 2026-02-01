class Solution {
    public int minimumCost(int[] nums) {
        int ele1 = nums[0];
        int firstmin = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for(int i = 1 ; i < nums.length ;i++){
            if(firstmin > nums[i]){
                secondmin = firstmin;
                firstmin = nums[i];
            }else if(nums[i] < secondmin){
                secondmin = nums[i];
            }
        }
        return ele1 + firstmin + secondmin;
    }
}