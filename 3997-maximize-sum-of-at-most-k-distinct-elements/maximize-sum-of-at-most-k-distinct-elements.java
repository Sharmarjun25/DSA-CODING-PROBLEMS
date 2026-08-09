class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        
        int n = nums.length;
        //int[] res = new int[k];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ;i < n ; i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list , Collections.reverseOrder());
        int[] res = new int[Math.min(k , list.size())];
        for(int i = 0 ; i < res.length ; i++){
            res[i] = list.get(i);
        }
        return res;


    }
}