/*
SELECTION SORT :

The algorithm repeatedly selects the smallest (or largest) element from the 'unsorted portion' of the
list and swaps it with the 'first element' of the 'unsorted part'. This process is repeated for the
remaining 'unsorted portion' until the entire list is 'sorted'.
*/
package Sorting.Techniques;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sort(nums);

        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void sort(int[] nums){
        for (int i = 0; i <= nums.length-2; i++) {
            int mini = i;
            for (int j = i; j <= nums.length-1 ; j++) {
                if (nums[mini]>nums[j]) {
                    mini = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[mini];
            nums[mini] = temp;

        }
    }
}
