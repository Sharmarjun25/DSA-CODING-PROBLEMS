class Solution {
    public int hIndex(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] >= n-i){
                return n-i;
            }
        }
        return 0;
        
    }
}