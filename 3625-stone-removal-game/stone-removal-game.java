class Solution {
    public boolean canAliceWin(int n) {
        int k = 10;
        if( n < 10){
            return false;
        }
        boolean ans = false;
        while( n >= k){
            n = n-k;
            ans = !ans;
            k = k-1;

        }
        return ans;


    }
}