class Solution {
    public int numOfUnplacedFruits(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int count = 0;
        boolean[] used = new boolean[n];
        for(int i = 0 ; i < n ; i++){
            boolean placed = false;
            for(int j = 0 ; j < m ; j++){
                if(!used[j] && arr2[j] >= arr1[i]){
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if(!placed){
                count++;
            }
        }
        return count;

    }
}