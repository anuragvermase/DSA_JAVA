/*
 * Best Time to Buy and Sell Stock :
 * EASY :
 *
 *  You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a
 * different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve
 * any profit, return 0.
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 *
 * Example 2:
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 * */

package Leetcode.Array;

import java.util.Scanner;

public class BuyNSellStock_121 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n;i++){
            prices[i]=sc.nextInt();
        }

        int profit = maxProfit(prices);
        System.out.println(profit);
    }

    public static int maxProfit(int[] prices){
        int minSoFar =prices[0];
        int maxProfit=0;
        for (int i = 1; i < prices.length; i++) {
            minSoFar =Math.min(prices[i],minSoFar );
            int profit = prices[i]-minSoFar;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}

/*
* but complexity is O(n^2)
*   int maxProfit =0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if((prices[j]-prices[i])>maxProfit) {
                    maxProfit = (prices[j] - prices[i]);
                }
            }
        }
        return maxProfit;
* */