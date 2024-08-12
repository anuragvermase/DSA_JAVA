//insertion sort
package Sorting.Techniques;

import java.util.Scanner;

public class insertionSort {
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
        for(int i = 1 ; i<nums.length; i++){   //'i' starts with 1 because we don't need to check the
                                               // correct order of single {0th} element
            int j = i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
    }
}
