class Solution {
    public boolean checkZeroOnes(String s) {
        int n = s.length();
        int c1 = 0 , c2 = 0;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '1'){
                c1++;
                max1 = Math.max(max1 , c1);
            }else{
                c1 = 0;
                //break;
            }
            if(s.charAt(i) == '0'){
                c2++;
                max2 = Math.max(max2 , c2);
            }else{
                c2 = 0;
                //break;
            }
        }
        if(max1 > max2){
            return true;
        }else{
            return false;
        }
    }
}