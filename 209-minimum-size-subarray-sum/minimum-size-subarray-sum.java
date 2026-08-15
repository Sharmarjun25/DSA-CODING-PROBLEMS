class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int length = Integer.MAX_VALUE;
        /*for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = i ; j < n ; j++){
                sum = sum + nums[j];
                if(sum >= target){
                    length = Math.min(length , j-i+1);
                }else{
                    length = 0;
                }
            }
        }*/
        int i = 0;
        for(int j = 0 ; j < n ; j++){
             sum = sum + nums[j];
            while(sum >= target){
                if(j - i + 1 < length){
                    length = j-i+1;
                }
                sum = sum - nums[i];
                i++;
                
                
            }
            
        }
        if(length == Integer.MAX_VALUE){
            return 0;
        }else{
            return length;
        }
       // return length;
    }
}