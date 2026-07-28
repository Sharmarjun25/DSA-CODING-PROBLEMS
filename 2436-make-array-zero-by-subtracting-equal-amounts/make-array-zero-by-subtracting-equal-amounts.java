class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < n ; i++){
            set.add(nums[i]);    
        }
        int m = set.size();
        if(set.contains(0)){
            return m-1;
        }else{
            return m;
        }


    }
}