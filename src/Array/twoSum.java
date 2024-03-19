/* Two Sum : Given N array elements, checkif there exists a pair (i,j) such that
   arr[i]+arr[j]==k and i!=j.
   note: if i&j are index value, k is given sum.

   Ques : arr[5] = {3 5 2 7 5 }

   k=12

   combinations:

    0,0    1,0    2,0    3,0   4,0
   (0,1)   1,1    2,1    3,1   4,1
   (0,2)  (1,2)   2,2    3,2   2,4
   (0,3)  (1,3)  (2,3)   3,3   3,4
   (0,4)  (1,4)  (2,4 ) (3,4)  4,4      // we have to check for only elements(i,j) which are in brackets
* */
package Array;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array length");
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the array element");

        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();

        }
        System.out.println("Enter the value of k");
        int k =sc.nextInt();

        twoSum(arr,k);

        System.out.println(twoSum(arr,k));
    }

    public static boolean twoSum(int[] arr , int k){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }
      return false;
    }


}
