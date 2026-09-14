class Solution {
    public boolean checkRecord(String s) {
        int n = s.length();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == 'A'){
                count1++;
            }
            
            
        }

        for(int i = 0 ; i < n ; i++){
            // if(s.charAt(i) == 'L' && s.charAt(i+1) == 'L' || s.charAt(i) == 'L' && s.charAt(i-1) == 'L'){
            //     count2++;
            // }
            if(s.charAt(i) == 'L'){
                count2++;
            }else{
                count2 = 0;
            }
            if(count2 >= 3){
                return false;
                //break;
            }

        }
        if(count1 < 2){
            return true;
        }else{
            return false;
        }
    }
}