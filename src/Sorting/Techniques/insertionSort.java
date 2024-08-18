/*
INSERTION SORT :
- takes an element
- and, place it in its correct position

Insertion sort is a simple sorting algorithm that works by iteratively inserting each element
of an unsorted list into its correct position in a sorted portion of the list. It is a stable
sorting algorithm, meaning that elements with equal values maintain their relative order in
the sorted output.
*/

package Sorting.Techniques;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        //give input array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        //function call
        sort(nums);

        //prints the output array
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void sort(int[] nums){
        for(int i = 1 ; i<=nums.length-1; i++){   //'i' starts with 1 because we don't need to check the
                                               // correct order of single {0th} element
            int j = i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
                //if the list/array is sorted then it won't run (means it takes O(n) time)
                System.out.println("runs");
            }
        }
    }
}

//TC : O(n^2) {worst & average}
//TC : O(n) {best}