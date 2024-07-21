/*
 *JUMP-GAME :
 * MEDIUM
 *
 * You are given an integer array nums. You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 *
 * Return true if you can reach the last index, or false otherwise.
 * Example 1:
 *
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 *
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0,
 * which makes it impossible to reach the last index.
 *
 * */
package Leetcode.Array;

import java.util.Scanner;

public class JumpGame_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }

        boolean result = jumpGame(nums);
        System.out.println(result);
    }
    public static boolean jumpGame(int[] nums){
        int finalPosition = nums.length-1;
        for (int i = nums.length-2; i >=0 ; i--) {
            if (nums[i]+i >= finalPosition){
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }
}
