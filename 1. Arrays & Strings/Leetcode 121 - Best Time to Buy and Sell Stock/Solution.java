public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        double minPrice = Double.POSITIVE_INFINITY;

        for(int i : prices) {
            if(i < minPrice) {
                minPrice = i;
            }

            int profit = (int) (i - minPrice);

            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit; // 2ms, 74.79%
    }
}