package Leetcode.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class containsDuplicate_217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = sort(nums);

        System.out.println(result);
    }

    public static boolean sort(int[] nums){
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            if (hs.contains(num)) {
                return true;
            }
            hs.add(num);
        }
        return false;
    }
}



/*
 Arrays.sort(nums);

        for (int i = 0; i <= nums.length-2 ; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
*/