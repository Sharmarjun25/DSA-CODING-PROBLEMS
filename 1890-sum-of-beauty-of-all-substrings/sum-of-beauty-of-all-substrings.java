class Solution {
    public int beautySum(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        /*for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s))
        }*/
        int sum = 0;
        
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            map.clear();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for(int j = i ; j < n ; j++){
                map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) , 0) + 1);
                max = Integer.MIN_VALUE;
                min = Integer.MAX_VALUE;

                for(Map.Entry<Character , Integer> entry : map.entrySet()){
                    if(entry.getValue() < min){
                        min = entry.getValue();
                    }
                    if(entry.getValue() > max){
                        max = entry.getValue();
                    }
                }

                /*if(map.get(s.charAt(j)) < min){
                    min = map.get(s.charAt(j));
                }
                if(map.get(s.charAt(j)) > max){
                    max = map.get(s.charAt(j));
                }*/
                int diff = max - min;

                if(diff != 0){
                    sum = sum + diff;
                }
            }
            
            
            // max = 0;
            // min = 0;
            // map.clear();
            //map.remove()

        }
        return sum;

    }
}