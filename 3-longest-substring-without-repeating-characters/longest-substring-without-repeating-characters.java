class Solution {
    public int lengthOfLongestSubstring(String s) {
       /* int maxlen = 0;
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
             int hash[] = new int[256];
             Arrays.fill(hash , 0);
             for(int j = i ; j < n ; j++){
                if(hash[s.charAt(j)] == 1){
                    break;
                }
                 int len = j - i + 1;
                 maxlen = Math.max(maxlen , len);
                 hash[s.charAt(j)] = 1;
             }
        }
        return maxlen;*/
        int hash[] = new int[256];
        Arrays.fill(hash , -1);
        int n = s.length();
        int r = 0 , l = 0 , maxlen = 0;
        while(r < n){
            if(hash[s.charAt(r)] != -1){
                if(hash[s.charAt(r)] >= l){
                    l =  Math.max(hash[s.charAt(r)] + 1 , 1);
                }
            }
            int len = r - l + 1;
            maxlen  = Math.max(maxlen , len);
            hash[s.charAt(r)] = r;
            
            r++;
        }
        return maxlen;
    }
}