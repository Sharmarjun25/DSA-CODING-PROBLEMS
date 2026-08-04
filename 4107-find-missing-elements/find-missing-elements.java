class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        for(int i = 0 ; i < n ; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = min ; i <= max ; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        //Arrays.sort(ans);
        return ans;
    }
}