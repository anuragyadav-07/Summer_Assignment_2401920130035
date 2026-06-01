class Q3 {
    public int maxProfit(int[] prices) {

        int i=0;
        int maxProfit = 0;

        for(int j=1; j<prices.length; j++){
            if(prices[i] > prices[j]){
                i = j;
            }else{
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit , profit);
            }
        }
        return maxProfit;
    }
}