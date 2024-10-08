/*
Partitioning Into Minimum Number Of Deci-Binary Numbers
MEDIUM
A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros.
For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
Given a string n that represents a positive decimal integer, return the minimum number of
positive deci-binary numbers needed so that they sum up to n.

Example 1:
Input: n = "32"
Output: 3
Explanation: 10 + 11 + 11 = 32

Example 2:
Input: n = "82734"
Output: 8

Example 3:
Input: n = "27346209830709182346"
Output: 9

*/
package Leetcode.StringQues;

//import static java.lang.Math.max;

public class minPartitions_1689 {
    public static void main(String[] args) {
        String n = "27346209830709182346";

        int result = minimumPartitions(n);
        System.out.println(result);
    }

    public static int minimumPartitions(String n){
        char[] nums = n.toCharArray();
        int ans = 0;
        for (char num : nums) {
            int currValue = (int) num - 48;     //48- ascii value of zero
            ans = Math.max(ans, currValue);
        }
        return ans;
    }
}
