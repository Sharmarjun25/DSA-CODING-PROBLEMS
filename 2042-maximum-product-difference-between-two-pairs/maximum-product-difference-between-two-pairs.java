class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int product1 = nums[0]*nums[1];
        int product2 = nums[n-1]*nums[n-2];
        return Math.abs(product1 - product2); 
    }
}