class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        //int i;
        /*double[] result = new double[n/2];
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n/2 ; i++){
             min = Math.min(min , nums[i]);
             max = Math.max(max , nums[i]);
             double avg = (min + max)/2;
             result[i] = avg;
        }
        Arrays.sort(result);
        return result[0];*/
        Arrays.sort(nums);
        int left = 0;
        int right = n-1;
        double[] result = new double[n/2];
        double avgg = Integer.MAX_VALUE;

        while(left < right){
            double avg = (nums[left] + nums[right])/2.0;
            //result[i] = avg;
            avgg = Math.min(avgg , avg);
            left++;
            right--;
        }
        //Arrays.sort(result);
        return avgg;
    }
}