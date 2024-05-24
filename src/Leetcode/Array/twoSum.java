package Leetcode.Array;

import java.util.Arrays;
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
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }
}
