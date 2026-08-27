class Solution {
    public int findLUSlength(String a, String b) {
       /* int n = a.length();
        int ans = n;;
        for(int i = 0 ; i < n ; i++){
            if(a.charAt(i) == b.charAt(i)){
                ans = -1;
                break;

            }
        }
        return ans;*/
        if(a.equals(b)){
            return -1;
        }else{
            return Math.max(a.length() , b.length());


        }
    }
}