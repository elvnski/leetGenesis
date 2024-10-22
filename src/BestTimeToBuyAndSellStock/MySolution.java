package BestTimeToBuyAndSellStock;

import java.util.Arrays;

public class MySolution {

    public int maxProfit(int[] prices) {

        // KADANE's ALGORITHM

        int currentProfit = 0, maxProfit = 0;

        for(int u = 1; u < prices.length; u++) {

            currentProfit = Math.max(0, currentProfit + prices[u] - prices[u-1]);
            maxProfit = Math.max(currentProfit, maxProfit);
        }

        return maxProfit;
    }
}
