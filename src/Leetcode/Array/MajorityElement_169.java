/*
* Given an array nums of size n, return the majority element.
* The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*
* Example 1:
* Input: nums = [3,2,3]
* Output: 3
*
* Example 2:
* Input: nums = [2,2,1,1,1,2,2]
* Output: 2
*
* */

package Leetcode.Array;

import java.util.Scanner;

public class MajorityElement_169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int element = majorityElement(nums);
        System.out.println(element);
    }
    public static int majorityElement(int[] nums){

        for(int i=0; i<nums.length;i++){
            int count=0;
            for(int j=0; j< nums.length;j++){
                if(nums[i]==nums[j]) {
                    count++;
                }
            }
            if(count> (nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }
}
