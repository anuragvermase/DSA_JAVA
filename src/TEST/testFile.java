/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*/

package TEST;

import java.util.Arrays;
import java.util.Scanner;

public class testFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2, 11, 10, 1 ,3};
        int k = 10;

        int r = test(nums, k);
        System.out.println(r);
    }

    public static int test(int[] nums, int k) {
        Arrays.sort(nums);
        int op = 0;
        for (int num : nums) {
            if (num < k) {
                op++;
            }
        }
        return op;
    }
}
