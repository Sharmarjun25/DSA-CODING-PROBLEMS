class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int total = 0;
        //int min = Integer.MAX_VALUE;
        for(int i = cost.length - 1 ; i >= 0 ; i= i-3){
            total = total + cost[i];
            if( i - 1 >= 0 ){
                total = total + cost[i-1];
            }
        }
        return total;
        
        
    }
}