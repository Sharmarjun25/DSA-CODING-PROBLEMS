class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        //List<Character> left = new ArrayList<>();
        //List<Character> right = new ArrayList<>();
        int sumleft = 0;
        int sumright = 0;
        int quesleft = 0;
        int quesright = 0;
        for(int i = 0 ; i < n/2 ; i++){
            //left.add(num.charAt(i));
            if(num.charAt(i) != '?'){
                sumleft += num.charAt(i) - '0';
            }else{
                quesleft ++;
            }
        }
        for(int i = n/2 ; i < n ; i++){
            //right.add(num.charAt(i));
            if(num.charAt(i) != '?'){
                sumright += num.charAt(i) - '0';
            }else{
                quesright ++;
            }
        }
        int diff = sumleft - sumright;
        int q = quesleft + quesright;
        if( q % 2 == 0 && diff == 9 * (quesright - quesleft) / 2){
            return false;
        }else{
            return true;
        }


    }
}