class Solution {
    public boolean checkValidString(String s) {
        int str = s.length();
        int max = 0;
        int min = 0;
        for(int i = 0 ; i < str ; i++){
            char c = s.charAt(i);
            if(c == '('){
                min++;
                max++;
            }else if(c == ')'){
                min--;
                max--;
            }else{
                min--;
                max++;
            }
            if(min < 0){
                min = 0;
            }
            if(max < 0){
                return false;
            }
            /*if(min == 0){
                return true;
            }*/
        }
        return min == 0;
    }
}