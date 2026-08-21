class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x , map.getOrDefault(x , 0) + 1);
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            /*if(entry.getValue() % 2 == 0){
                count1 = count1 + (entry.getValue() / 2);

            }else{
                //if(entry.getValue() > 2){
                    count2 = count2 + entry.getValue() % 2;
                //}
            }*/
            count1 += entry.getValue() / 2;
            count2 += entry.getValue() % 2;
        }
        return new int[]{count1 , count2};
    }
}