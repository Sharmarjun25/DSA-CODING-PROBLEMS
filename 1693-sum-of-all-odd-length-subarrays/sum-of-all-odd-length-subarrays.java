class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        for(int start = 0 ; start < arr.length ; start++){
            for(int end = start ; end < arr.length ; end++){
                //int length = start - end + 1;
                int length = end - start + 1;
                int sum = 0;
                if( length % 2 == 1){
                    for(int k = start ; k <= end ; k++){
                        sum = sum + arr[k];
                    }
                }
                total = total + sum;
            }
        }
        return total;
    }
}