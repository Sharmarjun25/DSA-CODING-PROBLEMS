class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int a = banned.length;
        int sum = 0;
        int count = 0;
        HashSet<Integer> set= new HashSet<>();
        for(int i = 0 ; i < a ; i++){
            set.add(banned[i]);
        }
        for(int i = 1 ; i <= n ; i++){
            if(!set.contains(i)){
                sum = sum + i;
                count++;

            }
            if(sum > maxSum){
                sum = sum - i;
                count--;
            }
        }
        return count;
    }
}