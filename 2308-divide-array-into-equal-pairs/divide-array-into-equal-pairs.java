class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        boolean canbe = true;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        for(int x : map.values()){
            if(x % 2 != 0){
                canbe = false;
                break;
            }
        }
        return canbe;
    }
}