/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that
* they add up to target.

* You may assume that each input would have exactly one solution, and you may not use the same element twice.

* You can return the answer in any order.
*
* Example 1:

* Input: nums = [2,7,11,15], target = 9
* Output: [0,1]
* Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*
* */

package Leetcode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(Arrays.toString(sum(nums, target)));
//        for (int i = 0; i <3 ; i++) {
//            System.out.println(r);
//        }


    }

    public static int[] sum(int[] nums, int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target-a;
            if (hm.containsKey(b)){
                return new int[]{hm.get(b),i};
            }

            hm.put(nums[i],i );
        }
        return null;
    }
}
