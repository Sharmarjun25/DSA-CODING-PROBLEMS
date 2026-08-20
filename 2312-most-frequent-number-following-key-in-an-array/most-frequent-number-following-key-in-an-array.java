class Solution {
    public int mostFrequent(int[] nums, int key) {
        int n = nums.length;
        int count = 0;
        int target = 0;
       /* for(int i = 0 ; i < n-1 ; i++){
            int max = Integer.MIN_VALUE;
            if(nums[i] == key){
                target = nums[i+1] ;

                for(int j = i+1 ; j <n-1 ; j++){
                    if(nums[j] == target && nums[j-1] == key){
                        count++;
                    }
                }
                max = Math.max(max , count);
            }
        }
        return count;*/
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < n-1 ; i++){
            if(nums[i] == key){
                map.put(nums[i+1] , map.getOrDefault(nums[i+1] , 0) + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
         return ans;
    }
}