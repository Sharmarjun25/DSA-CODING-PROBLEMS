class Solution {
    public int firstUniqueEven(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int min = Integer.MAX_VALUE;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        /*for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() == 1 && entry.getKey() % 2 ==0 ){
                //ans = entry.getKey();
                min = Math.min(entry.getKey() , min);
                ans = min;
                break;
            }

        }*/
        for(int num : nums){
            if(num % 2 == 0 && map.get(num) == 1){
                ans = num;
                break;
            }
        }
        return ans;

    }
}