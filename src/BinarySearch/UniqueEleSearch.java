/*
* Every element twice except for 1 . find unique element.
* NOTE : duplicates are adjacent to each other
*
* eg: arr[15] : {4 4 1 1 9 9 11 11 20 7 7 3 3 5 5}
*
* IDEA 1: Take XOR of all elements
* TC: O(N)   SC: O(1)
*
* IDEA 2: Binary search
* indexing :  0 1 2 3 4 5 6  7  8  9 10 11 12 13 14
* arr[15]  : {4 4 1 1 9 9 11 11 20 7 7  3  3  5  5}
* occurrence = 20
 * pre single occurrence : Numbers are starting from even
 * post single occurrence :Numbers are starting from odd
 *
 *  case 1:
 *  if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1] ){
 *       return nums[mid];
 *  }
 *
 * case 2:
 *  if(mid%2==0){
 *      lo = mid+2; (discard left / go to right)
 *  }
 *
 *  case 3:
 *  if(mid%2==1){
 *      lo = mid-1; (discard right /go to left)
 *  }
 *
 *  How to make sure that mid lands at 1st occurrence
 *
 *  if(nums[mid]==nums[mid-1]){
 *     mid--;
 *  }
 *
 *
  * */
package BinarySearch;

import java.util.Scanner;

public class UniqueEleSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int r = findUniqueElement(nums);
        System.out.println(r);
    }
    public static int findUniqueElement(int[] nums){
        // for 0th index
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        // for last Nth index
        if(nums[nums.length-1]!= nums[nums.length-2]){
            return nums[nums.length-1];
        }
        // for 2 to N-3 index
        int hi = nums.length-3;
        int lo = 2;

        while(lo<=hi){
            int mid = (hi+lo)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1] ){
                return nums[mid];
            }
            if (nums[mid]==nums[mid-1]) {
                mid--;
            }
            if(mid%2==0){
                lo = mid+2;
            }else {
                hi = mid-1;
            }



        }
        return -1;
    }
}

//TC : O(logN)
//SC : O(1)