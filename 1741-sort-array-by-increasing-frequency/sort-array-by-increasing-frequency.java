class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int x : nums){
            list.add(x);
        }
        list.sort((a,b) -> {
            if(!map.get(a).equals(map.get(b))){
                return map.get(a) - map.get(b);
            }
            return b - a;
        });
        return list.stream().mapToInt(Integer:: intValue).toArray();

    }
}