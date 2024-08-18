/*
QUICK SORT :
1. Pick a pivot element place it in its correct place in the sorted array
we can choose pivot element as:
a. 1st element in the array.
b. last element in the array.
c. median of the array.
d. random element from the array.

2. place smaller elements in the left and larger elements on the right.

3. then repeat the 1st and 2nd steps again and again for the left and right sub-array(we can say).

** based on 'divide and conquer'.

QuickSort is a sorting algorithm based on the Divide and Conquer algorithm that picks an element as a
pivot and partitions the given array around the picked pivot by placing the pivot in its correct position
in the sorted array.
*/

package Sorting.Techniques;

import java.util.Scanner;

public class quickSort {
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
        //base case
        if (low==high){
            return;
        }

        if (low<high){
            //function call to find partition value/ or place pivot element at right place
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
            while(i <= high-1 && pivot >= nums[i]){
                i++;
            }
            while(j >= low+1 && pivot < nums[j]){
                j--;
            }

            //if they not cross each other swap  ith and jth elements
            if(i < j){
                int temp = nums[i]  ;
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        //if i & j cross each other than swap the pivot element and jth position element
        int temp01 = nums[low];    //nums[low] = pivot
        nums[low] = nums[j];
        nums[j] = temp01;

        return  j; //partition index
    }
}


//T.C. : O(NlogN)
//S.C. : O(1)