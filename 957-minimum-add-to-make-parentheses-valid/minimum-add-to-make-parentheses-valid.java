class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int count = 0;
        // int count1 = 0;
        // int count2 = 0;
        int neg = 0;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '('){
                count++;
            }else{
                count--;
            }

            if(count < 0){
                neg++;
                count = 0;
            }
        }
        // if(count1 > count2){

        // }
        //return Math.abs(count1 - count2);
        return Math.abs(count + neg);
    }
}