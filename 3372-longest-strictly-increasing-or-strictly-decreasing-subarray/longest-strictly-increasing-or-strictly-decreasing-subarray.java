class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int max = 1;
        for(int i = 0 ; i < n ; i++){
            int count1 = 0;
            int count2 = 0;
            for(int j = i ; j < n-1 ; j++){
                if(nums[j] < nums[j+1]){
                    count1++;
                    count2 = 0;
                // }else{
                //     count1 = 0;
                }else if(nums[j] > nums[j+1]){
                    count2++;
                    count1 = 0;

                }else{
                    break;
                }
                //max = Math.max(max , count1+1);

                
                max = Math.max(max , Math.max(count1 , count2) + 1);

            }
            //max = Math.max(count1 , count2);
        }
        return max;
    }
}