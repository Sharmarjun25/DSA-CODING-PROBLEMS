class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n = prices.length;
        int mon = money;
        for(int i = 0 ; i < n ; i++){
            int sum = prices[0] + prices[1];
            if( sum > money){
                mon = money;
            }else if(sum <= money){
                mon = money - sum;
            }
        }
        return mon;
    }
}