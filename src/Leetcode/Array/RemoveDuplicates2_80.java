/*
 * 80. Remove Duplicates from Sorted Array II
 * MEDIUM:

 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place
 * such that each unique element appears at most twice. The relative order of the elements
 * should be kept the same.
 *
 * Since it is impossible to change the length of the array in some languages, you must
 * instead have the result be placed in the first part of the array nums. More formally,
 * if there are k elements after removing the duplicates, then the first k elements of nums
 * should hold the final result. It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array. You must do this by modifying the input array
 * in-place with O(1) extra memory.
 *
 * Example 1:
 * Input: nums = [1,1,1,2,2,3]
 * Output: 5, nums = [1,1,2,2,3,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums
 * being 1, 1, 2, 2 and 3 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).

 * Example 2:
 * Input: nums = [0,0,1,1,1,1,2,3,3]
 * Output: 7, nums = [0,0,1,1,2,3,3,_,_]
 * Explanation: Your function should return k = 7, with the first seven elements of nums
 * being 0, 0, 1, 1, 2, 3 and 3 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * */
package Leetcode.Array;
import java.util.Scanner;

public class RemoveDuplicates2_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int  resultLength = removeDuplicates2(nums);

        System.out.println("Number of element after removing duplicates :"+resultLength);

        System.out.println("New Array : ");
        for (int i = 0; i < resultLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static int removeDuplicates2(int[] nums){
        //In case we get an empty array
        if(nums.length==0)
            return 0;
        //starts from 2nd index
        int k = 2;
        for (int i = 2; i <nums.length ; i++) {
            if (nums[i]!=nums[k-2]){         //nums[k-2] : check from updated/new array
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
