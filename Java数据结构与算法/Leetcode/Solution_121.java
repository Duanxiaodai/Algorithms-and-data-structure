class Solution_121 {
    public int maxProfit(int[] prices) {
        if (prices.length==0){
            return 0;
        }
        int result=0;
        int temp = prices[0];
        for(int i = 0 ; i<prices.length;i++){

            if(prices[i]>temp){
                if (prices[i]-temp>result){
                    result = prices[i]-temp;
                }
            }
            else{
                temp = prices[i];
            }
        }
        return result;
    }
}
