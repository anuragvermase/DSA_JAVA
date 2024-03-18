/* Rotate the array : Given N elements, rotate array from last to first by K times.
*
* rotation means:
*
* arr[5]: 1 2 3 4 5
*
* after the first rotation : 5 1 2 3 4
*
* after the second rotation : 4 5 1 2 3
*
* and so on...
*
* When k is greater than n.
*
* OBSERVATION : You will get same array if you do rotation in multiples of arr.length.
*
* n    k
* 5    45   -> same array we get
* 5    50   -> same array we get
* 5    52   -> 2 rotations  (k % n)
*
* if k > n
*
* k=k%n  --> this much rotations  you have to do.
*
* */

package Array;

import java.util.Scanner;

public class arrayRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input K (No. of rotation)");
        int k = sc.nextInt();
        //step1: reverse the whole array
        reverse(arr , 0 ,n-1);
        //step2: reverse the first k element
        reverse(arr , 0 , k-1);
        //step3: reverse the element after kth element
        reverse(arr , k , n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void reverse(int[] arr , int s , int e) {
        int sp = s;
        int ep = e;

        while(sp<ep) {

            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;

            sp++;
            ep--;

        }
    }
}
