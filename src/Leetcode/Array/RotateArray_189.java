/*
* ROTATE ARRAY :
* MEDIUM:
*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
*
* Example 1:
* Input: nums = [1,2,3,4,5,6,7], k = 3
* Output: [5,6,7,1,2,3,4]
* Explanation:
* rotate 1 steps to the right: [7,1,2,3,4,5,6]
* rotate 2 steps to the right: [6,7,1,2,3,4,5]
* rotate 3 steps to the right: [5,6,7,1,2,3,4]
*
* Example 2:
* Input: nums = [-1,-100,3,99], k = 2
* Output: [3,99,-1,-100]
* Explanation:
* rotate 1 steps to the right: [99,-1,-100,3]
* rotate 2 steps to the right: [3,99,-1,-100]
*
* */

package Leetcode.Array;

import java.util.Scanner;

public class RotateArray_189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rorate(nums, k);
    }

    public static void rorate(int[] nums, int k){
        k=k% nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0,k-1);
        reverse(nums, k , nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

    }

    public static void reverse(int[] nums,int s,int e ){
        int sp = s;
        int ep = e;
        while(sp<ep){
            int temp = nums[sp];
            nums[sp] = nums[ep];
            nums[ep] = temp;
            sp++;
            ep--;
        }
    }
}