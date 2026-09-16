class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = nums.length;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums[i].length ; j++){
                map.put(nums[i][j] , map.getOrDefault(nums[i][j] , 0) + 1);
            }
            //count = count+ i;
            
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() == count){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}