class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        HashMap<Character , Integer> map = new HashMap<>();
        //HashMap<Character , Integer> map2 = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int even = 0,odd =0 ;
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 0){
                even = entry.getValue();
                min = Math.min(min , even);
            }
            if(entry.getValue() % 2 != 0){
                odd = entry.getValue();
                max = Math.max(max , odd);
            }
        }
        return max - min;
    }
}