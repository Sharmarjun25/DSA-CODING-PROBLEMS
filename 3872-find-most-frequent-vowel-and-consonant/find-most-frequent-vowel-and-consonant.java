class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        HashMap<Character , Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }
        int max1 = 0;
        int max2 = 0;
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            if(entry.getKey() == 'a' ||entry.getKey() == 'e' || entry.getKey() == 'i' || entry.getKey() == 'o' || entry.getKey() == 'u'){
                if(entry.getValue() > max1){
                    max1 = entry.getValue();
                }
            }else{
                if(entry.getValue() > max2){
                    max2 = entry.getValue();
                }
            }
        }
        sum = max1 + max2;
        return sum;


    }
}