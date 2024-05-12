/*MEDIUM:
*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
*
* */

package Leetcode.Array;

import java.util.Scanner;

public class leetCode06 {
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