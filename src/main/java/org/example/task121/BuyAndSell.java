package org.example.task121;

import java.util.Arrays;

public class BuyAndSell {

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentValue = prices[i];
            if (currentValue < min) {
                min = currentValue;
            } else {
                int currentProfit = currentValue - min;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

}
