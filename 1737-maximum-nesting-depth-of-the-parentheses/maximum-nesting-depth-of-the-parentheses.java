class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '('){
                count++;
            }else if(s.charAt(i) == ')'){
                count--;
            }
            max = Math.max(max , count);
        }
        return max;
    }
}