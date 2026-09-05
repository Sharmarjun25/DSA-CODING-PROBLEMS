class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n = s.length();
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }
        //putting the values in set to get the length 
        HashSet<Integer> set = new HashSet<>();
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            int x = entry.getValue();
            set.add(x);
        }
        if(set.size() == 1){
            return true;
        }else{
            return false;
        }

    }
}