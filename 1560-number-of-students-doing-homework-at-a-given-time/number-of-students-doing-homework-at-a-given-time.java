class Solution {
    public int busyStudent(int[] s, int[] e, int q) {
        int count = 0;
        int n = s.length;
        for(int i = 0 ; i < n ; i++){
            if(q >= s[i] && q<= e[i]){
                count++;
            }
        }
        return count;
    }
}