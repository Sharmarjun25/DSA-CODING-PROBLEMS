class Solution {
    public int findClosestNumber(int[] nums) {

        int n = nums.length;
        /*
        int min = Integer.MAX_VALUE;
        int val = 0 ;
        int ans2;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            set.add(nums[i]);
        }
        for(int num : set){
            int ans = Math.abs(num);
             val = Math.min(min , ans);
            if(set.contains(-val)){
                 val = Math.max(val , -val);

                
            }   

        }
        return val;*/
        int minDistance = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            int distance = Math.abs(nums[i]);

            if(distance < minDistance){
                minDistance = distance;
                ans = nums[i];
            }else if(distance == minDistance){
                ans = Math.max(ans , nums[i]);
            }
        }

        return ans;


        
    }
}