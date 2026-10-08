class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
             if(entry.getValue() <= 1){
                continue;
            //     flag = false;
            //     //break;
            }
            boolean flag = true;
            for(int i = 2 ; i*i <= entry.getValue() ; i++){
                if(entry.getValue() % i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
        }
        // if(flag){
        //     return true;
        // }else{
        //     return false;
        // }
        return false;

    }
}