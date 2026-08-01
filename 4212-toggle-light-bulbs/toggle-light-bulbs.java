class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> result = new ArrayList<>();
        //Collections.sort(bulbs);
        /*for(int i = 0 ; i < bulbs.size() ; i++){
            for(int j = 1 ; j < bulbs.size() ; j++){
                if(bulbs.get(i) != bulbs.get(j)){
                    result.add(bulbs.get(i));

                }
            }
            
        }
        Collections.sort(result);
        return result;*/
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < bulbs.size() ; i++){
            map.put(bulbs.get(i) , map.getOrDefault(bulbs.get(i) , 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 != 0){
                result.add(entry.getKey());
            }
        } 
        Collections.sort(result);
        return result;
        
    }
}