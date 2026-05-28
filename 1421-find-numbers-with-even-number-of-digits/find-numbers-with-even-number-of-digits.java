class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        //int count2 = 0;
        for(int i : nums){
            if((i >= 10 && i <= 99) || (i >= 1000 && i <= 9999) || (i >= 100000 && i <= 999999)){
                count++;
            }
        }
        return count;
    }
}