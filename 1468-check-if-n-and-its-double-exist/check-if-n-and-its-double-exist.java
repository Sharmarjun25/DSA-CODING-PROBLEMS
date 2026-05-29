class Solution {
    public boolean checkIfExist(int[] arr) {
       /* int n = arr.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] == 2 * arr[j]){
                    count++;
                }
            }
        }
        if(count == 0){
            return false;
        }else{
            return true;
        }*/
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i*2) || (i%2 == 0 && set.contains(i/2))){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}