/*Remove Duplicates from Sorted Array:
 * EASY:
 *
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
 * each unique element appears only once. The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.

 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following
 * things:

 * Change the array nums such that the first k elements of nums contain the unique elements in the
 * order they were present in nums initially. The remaining elements of nums are not important
 * as well as the size of nums.
 * Return k.
 *
 * */

package Leetcode.Array;

import java.util.Scanner;

public class RemovesDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int arrayLength = removeDuplicates(nums);
        System.out.println(arrayLength);

        System.out.println("New Array");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] != nums[i + 1]) {
                nums[k++] = nums[i];
            }
        }
        nums[k] = nums[nums.length - 1];
        return k + 1;
    }
}
