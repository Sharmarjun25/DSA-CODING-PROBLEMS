class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        /*int count = 0;
        for(int i = 1 ; i < n-1 ; i++){
            if(colors[i-1] == 0 && colors[i+1] == 1 ){
                count++;
            }
        }
        return count;*/
        if(n < 3){
            return 0;
        }
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            int pre = colors[i];
            int cur = colors[(i+1)%n];
            int nxt = colors[(i+2)%n];
            if(pre!=cur && cur!=nxt){
                count++;
            }
        }
        return count;
    }
}