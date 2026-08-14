class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        HashMap<Character , Integer> map = new HashMap<>();
        int count = 0;
        /*int i = 0 , j = 0;

       /* for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                map.put(s.chatAt(j) , map.getOrDefault(s.charAt(j) , 0) + 1);
            }
            if(map.getValue() > 2){

            }
        }
        for( i = 0 ; i < n ; i++){
            while(j < n ){
                map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) , 0) + 1);
            }
            if(map.get(s.charAt(j)) > 2){
                char left = s.charAt(i);
                map.put(left , map.getOrDefault(left , 0) + 1);
            }
            count = Math.max(count , j - i + 1);
            j++;
        }
        return count;*/
        int i = 0;
        for(int j = 0; j < n ; j++){
            map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) , 0) + 1);
        
        while(map.get(s.charAt(j)) > 2){
            map.put(s.charAt(i) , map.get(s.charAt(i))  - 1);
            i++;
        }
        count = Math.max(count , j-i+1);
        }
        return count;


    }
}