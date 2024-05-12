package Leetcode.Array;

import java.util.Scanner;

public class leetCode05 {
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
