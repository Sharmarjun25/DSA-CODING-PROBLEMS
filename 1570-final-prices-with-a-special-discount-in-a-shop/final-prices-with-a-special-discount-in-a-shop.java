class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        
        for(int i = 0 ; i < n ; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i+1 ; j < n ; j++){
                if(prices[j] <= prices[i]){
                    min = prices[j];
                    break;
                }
            }
            if(min != Integer.MAX_VALUE){
                prices[i] = prices[i]-min;
            }
        }
        return prices;     
    }
}