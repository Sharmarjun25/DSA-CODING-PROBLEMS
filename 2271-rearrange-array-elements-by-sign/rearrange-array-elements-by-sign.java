class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result1 = new int[n/2];
        int[] result2 = new int[n/2];
        int[] result3 = new int[n];
        int p = 0;
        int ng = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] < 0){
                result1[ng++] = nums[i];
            }else{
                result2[p++] = nums[i];
            }
        }
        //result3[0] = result2[0];
        p = 0;
        ng = 0;
        for(int i = 0 ; i < n ; i++){
            if(i % 2 == 0){
                result3[i] = result2[p++];
            }else{
                result3[i] = result1[ng++];
            }
        }
        return result3;

    }
}