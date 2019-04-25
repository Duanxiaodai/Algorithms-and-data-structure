public class Solution_122 {
    public int maxProfit(int[] prices) {
        if (prices.length==0){
            return 0;
        }
        int sum=0;
        //int temp = 0;
        for (int i = 0;i<prices.length-1;i++){
            if (prices[i]<prices[i+1]){
                sum+=prices[i+1]-prices[i];
                //sum += temp;
            }
//            else {
//                temp = 0;
//            }
        }
        return sum;
    }

}
