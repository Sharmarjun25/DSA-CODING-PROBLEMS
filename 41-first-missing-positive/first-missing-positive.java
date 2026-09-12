class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        /*int max = Integer.MIN_VALUE;
        int ans = 0;
       HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(i >= 0){
                set.add(i);
            }
            if(max < i){
                max = i;
            }
        }
        if(n==1){
            if(nums[0] >= 0){
                ans = max+1;
            }else{
                ans = 1;

            }
           // ans = max+1;
            //break;
        }
        for(int i = 1 ; i <= max ; i++){
            if(!set.contains(i)){
                ans = i;
                break;
            }else{
                ans = max+1;
                //break;
            }
        }
        return ans;*/
        int[] res = Arrays.stream(nums).filter(a -> a > 0).toArray();
        Arrays.sort(res);
        int target = 1;
        for(int i  : res){
            if(i == target){
                target++;
            }else if(i > target){
                return target;
            }
        }
        return target;
    }
}