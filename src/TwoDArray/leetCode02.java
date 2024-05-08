/*EASY
* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
* The order of the elements may be changed. Then return the number of elements in nums which are
* not equal to val.

* Consider the number of elements in nums which are not equal to val be k, to get accepted,
* you need to do the following things:

* Change the array nums such that the first k elements of nums contain the elements which are
* not equal to val. The remaining elements of nums are not important as well as the size of nums.
* Return k.
*
* */

package TwoDArray;

import java.util.Scanner;

public class leetCode02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int val = sc.nextInt();

        int arrlength = removeElement(nums,val);

//        System.out.println(newArr.length);
        System.out.println(arrlength);

        for (int i = 0; i < arrlength; i++) {
            System.out.print(nums[i]+ " ");
        }

    }
    public static int removeElement(int[] nums,int val){
        int k=0;
        for (int i=0; i<nums.length;i++){
            if (nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
