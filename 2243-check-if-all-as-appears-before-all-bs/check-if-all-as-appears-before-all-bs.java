class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        /*boolean flag = true;
        for(int i = 0 ; i < n ; i++){
             if(s.charAt(i) != 'a' || s.charAt(i) != 'b'){
                return true;
                    //break;
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(s.charAt(i) == 'a' && s.charAt(j) == 'b'){
                    if(i > j){
                        flag = false;;
                    }
                }
            }
        }
        if(flag){
            return true;
        }else{
            return false;
        }*/
        for(int i = 1 ; i < n ; i++){
            if(s.charAt(i-1) == 'b' && s.charAt(i) == 'a'){
                return false;
            }
        }
        return true;
    }
}