class Solution {
    public String frequencySort(String s) {
        char[] ch = s.toCharArray();
        HashMap<Character , Integer> map = new HashMap<>();
        for(char c : ch){
            map.put(c , map.getOrDefault(c , 0) + 1);
        }
        /*Stringbuilder sc = new StringBuilder<>();
        for(char c : map){
            sc.append(c);
        }
        return sc;*/
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list , (a,b) -> map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for(char se : list){
            for(int i = 0; i < map.get(se) ; i++){
                sb.append(se);
            }
        }
        return sb.toString();

        
    }
}