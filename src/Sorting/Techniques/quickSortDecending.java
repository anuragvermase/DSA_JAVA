// to make it in decreasing order, ensure that elements greater than the pivot are moved to the
// left and elements smaller than the pivot are moved to the right.

package Sorting.Techniques;

import java.util.Scanner;

public class quickSortDecending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        //give the input array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int low = 0;
        int high = n-1;
        //function call
        sort(nums, low, high);

        //prints the output array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void sort(int[] nums, int low, int high){
        if(low == high){
            return;
        }

        if(low < high){
            int pIndex = findPartition(nums, low, high);
            sort(nums, low, pIndex-1);
            sort(nums, pIndex+1, high);
        }

    }

    public static int findPartition(int[] nums, int low, int high){
        int pivot = nums[low];
        int i = low;
        int j = high;

        while(i < j){
            while(i <= high-1 && pivot <= nums[i]){
                i++;
            }

            while(j >= low+1 && pivot > nums[j]){
                j--;
            }
            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp01 = nums[low];
        nums[low] = nums[j];
        nums[j] = temp01;

        return j;
    }
}
