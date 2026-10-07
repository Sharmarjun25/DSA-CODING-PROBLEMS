class Solution {
    public int minSwaps(String s) {
        int n = s.length();
        int balance  = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '['){
                balance++;
            }else{
                balance--;
            }
            min = Math.min(min , balance);
        }
        int ans = ((-min + 1)) / 2;
        return ans;
    }
}