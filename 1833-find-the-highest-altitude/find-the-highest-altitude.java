class Solution {
    public int largestAltitude(int[] gain) {
        int sum1 = 0;
        int sum2 = 0;
        int n = gain.length;
        int[] result = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            sum2 = sum2 + gain[i];
            sum1 = Math.max(sum2 , sum1);
        }
        return sum1;
    }
}