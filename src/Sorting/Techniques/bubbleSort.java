/*
BUBBLE SORT :
- push max. element to the last
- by adjacent swaps

Just like the way bubbles rise from the bottom of a glass,
bubble sort is a simple algorithm that sorts a list, allowing either lower or higher values to
bubble up to the top. The algorithm traverses a list and compares adjacent values, swapping them
if they are not in the correct order.
*/

package Sorting.Techniques;

import java.util.Scanner;

public class bubbleSort {
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

        //prints output array
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void sort (int[] nums){
        for (int i = 0; i <= nums.length-2; i++) {
            //condition for (if input is already sorted it sorts the array in O(n) time)
            int didSwap = 0;
            for (int j = 0; j <= nums.length-2-i; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    didSwap = 1;
                }
            }
            //if array is 'sorted' then the 'didSwap' value is not change and this if cond. is run.
            if(didSwap == 0){
                break;
            }
            System.out.println("runs");
        }
    }
}

//TC : O(n^2) {worst & average}
//TC : O(n) {best}
/*
if we give sorted array then it run one time
*/
