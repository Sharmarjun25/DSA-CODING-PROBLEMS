class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();

        /*HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(map.getValue > k){
                list.add()
            }
        }*/
        int count = 1;
        
        res.add(nums[0]);
        for(int i = 1 ; i < n ; i++){
            if(nums[i-1] == nums[i]){
                count++;
            }else{
                count = 1;
            }
            if(count <= k){
                //res[i] = nums[i];
                res.add(nums[i]);
            }
        }
        int[] ans = new int[res.size()];
        //return Arrays.toList(res);
        for(int i = 0 ; i < res.size() ; i++){
            ans[i] = res.get(i);
        }
        return ans;

        
    }
}