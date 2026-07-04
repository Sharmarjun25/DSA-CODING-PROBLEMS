class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        /*for(int value : map.values()){
            if(value % k ==0){
                sum = sum + value;
            }
        }
        return sum;*/
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            int element  = entry.getKey();
            int frequency = entry.getValue();

            if(frequency % k == 0){
                sum = sum + (element*frequency);
            }


        }
        return sum;
    }

}