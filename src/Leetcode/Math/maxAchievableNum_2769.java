/*
Given two integers, num and t. A number is achievable if it can become equal to num after
applying the following operation:

Increase or decrease the number by 1, and simultaneously increase or decrease num by 1.
Return the maximum achievable number after applying the operation at most t times.

Example 1:
Input: num = 4, t = 1
Output: 6

Explanation:
Apply the following operation once to make the maximum achievable number equal to num:
Decrease the maximum achievable number by 1, and increase num by 1.

Example 2:
Input: num = 3, t = 2
Output: 7

Explanation:
Apply the following operation twice to make the maximum achievable number equal to num:
Decrease the maximum achievable number by 1, and increase num by 1.

*/
package Leetcode.Math;

import java.util.Scanner;

public class maxAchievableNum_2769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = sc.nextInt();
        int result = maxAchievableNumber(num, t);
        System.out.println(result);
    }

    public static int maxAchievableNumber(int num, int t){
        return num + 2*t;
    }
}
