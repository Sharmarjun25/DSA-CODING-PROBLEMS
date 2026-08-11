class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        /*int[] pre = new int[n];
        if(n == 0){
            return 0;
        }
        
        for(int i = 1 ; i < n ; i++){
            if(nums[i] == nums[i-1] + 1){
                pre[i] = nums[i];
            }else{
                break;
            }
        }
        int sum = 0;
        for(int i = 0 ; i < pre.length ; i++){

        }*/
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int sum = nums[0];
        for(int i = 1 ; i < n ; i++){
            if(nums[i] == nums[i-1] + 1){
                sum = sum + nums[i];
            }else{
                break;
            }
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;

    }
}