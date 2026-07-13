class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int m = target - nums[i];
            if(map.containsKey(m)){
                //list.add(nums[i]);
                return new int[]{map.get(m) , i};
            }
            map.put(nums[i] ,i);

        }
        return new int[]{};
    }
}