class Solution {
    public int absDifference(int[] nums, int k) {
        int n = nums.length - 1;
        Arrays.sort(nums);
        //int[] max = new int[n];
        //int[] min = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        /*for(int i = 0 ; i < k ; i++){
            min[i] = nums[i];
            sum1 = sum1 + min[i];
            
        }
        for(int i = n ; i > k ; i++){
            max[i] = nums[i];
            sum2 = sum2 + max[i];
        }
        return Math.abs(sum1 - sum2);*/
        for(int i = 0 ; i < k ; i++){
            sum1 += nums[i];
            sum2 += nums[n--];
        }
        return Math.abs(sum1 - sum2);

    }
}