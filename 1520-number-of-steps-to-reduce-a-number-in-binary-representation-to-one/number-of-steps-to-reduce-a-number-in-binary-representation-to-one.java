class Solution {
    public int numSteps(String s) {
        /*int n = Integer.parseInt(s , 2);
        int count = 0;
        while(n > 1){
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = n + 1;
            }
            count++;
            //n--;
        }
        return count;*/
        int steps = 0;
        int carry = 0;
        for(int i = s.length() - 1 ; i > 0 ; i--){
            int bit = s.charAt(i) - '0';
            int current = bit + carry;
            if(current == 1){
                steps = steps + 2;
                carry =  1;
            }else{
                steps = steps + 1;
            }
        }
        return steps + carry;
    }
}