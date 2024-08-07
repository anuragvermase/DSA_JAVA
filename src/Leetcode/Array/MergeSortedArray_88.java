/* Merge Sorted Array:
 * EASY:
 *
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers
 * m and n, representing the number of elements in nums1 and nums2 respectively.

 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.

 * The final sorted array should not be returned by the function, but instead be stored inside the array
 * nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the
 * elements that should be merged, and the last n elements are set to 0 and should be ignored.
 * nums2 has a length of n.
 *
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 *
 * */

package Leetcode.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];
        for (int i = 0; i < m + n; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            nums2[j] = sc.nextInt();
        }
        merge(nums1, m, nums2, n);

        for (int i = 0; i < m + n; i++) {
            System.out.println(nums1[i]);
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = 0; i < m; i++) {
            nums1[k++] = nums1[i];
        }
        for (int j = 0; j < n; j++) {
            nums1[k++] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}



/*
package TwoDArray;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class leetCode01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n =sc.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        int[] nums3 = new int[n+m];

        for (int i=0;i<m;i++){
            nums1[i]=sc.nextInt();
        }

        for (int j=0;j<n;j++){
            nums2[j]=sc.nextInt();
        }

        mergeArray(nums1,n,nums2,m,nums3);

        for (int k=0;k<n+m;k++){
            System.out.println(nums3[k]);
        }


    }

    public static void mergeArray(int[] arr1,int n,int[] arr2,int m,int[] nums3){
        int k=0;
        for (int i=0;i<m;i++){
            nums3[k]=arr1[i];
            k++;
        }
        for (int j=0;j<n;j++){
            nums3[k]=arr2[j];
            k++;
        }

        Arrays.sort(nums3);
    }
}

*/

