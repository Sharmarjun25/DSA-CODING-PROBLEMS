class Solution {
    public int minimumDeletions(int[] nums) {
        int max = nums[0] , min = nums[0];
        int n = nums.length;
        int maxi = 0 , mini = 0;
        int count = 0;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] > max){
                max = nums[i];
                maxi = i;
            }
            
        }
        for(int i = 1 ; i < n ; i++){
            if(nums[i] < min){
                min = nums[i];
                mini = i;
            }
        }
        int a = Math.max(maxi , mini) + 1;
        int b =  n - Math.min(maxi , mini);
        int c = (mini + 1) + (n - maxi);
        int d = (maxi + 1) + (n - mini);
        return Math.min(a , Math.min(b , Math.min(c , d)));
    }
}