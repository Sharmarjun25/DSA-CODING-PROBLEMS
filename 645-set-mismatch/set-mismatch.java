class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        /*List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++ ){
            if(nums[i] == nums[i+1]){
                list.add()
            }
        }*/
        /*int dup = 0;
        int miss = 0;

        int[] freq = new int[n];
        for(int num : nums){
            freq[num-1]++;
        }
        for(int i = 0 ; i < n ; i++){
            if(freq[i] > 1){
                dup = i+1;
            }
            if(freq[i] == 0){
                miss = i+1;
            }
        }
        return new int[]{dup , miss};*/
        int dup = 0, miss = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i <= n ; i++){
            int count = 0;
            for(int j = 0 ; j < n ; j++){
                if(nums[j] == i){
                    count++;
                }
            }
            if(count == 2){
                dup = i;
            }else if(count == 0){
                miss = i;
            }
        }
 
        return new int[]{dup , miss};
    }
}