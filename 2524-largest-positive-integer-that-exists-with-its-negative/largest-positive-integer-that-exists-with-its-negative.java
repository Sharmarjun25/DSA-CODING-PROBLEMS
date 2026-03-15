class Solution {
    public int findMaxK(int[] nums) {
        //int n = arr.length;
        /*int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            max = Math.max(max , arr[i]);
            if(max == -arr[i]){
                return max;
            }
        }
        return -1;*/
        HashSet<Integer> set = new HashSet<>();
        int ans = -1;
        for(int num : nums){
            if(set.contains(-num)){
                ans = Math.max(ans , Math.abs(num));
            }
            set.add(num);

        }
        return ans;
    }
}