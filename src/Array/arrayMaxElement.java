/*
* Find the max of an array element
*
* Read an array of N length and print the max of all element
*
* eg : arr[4] : 10 -1  3  -7
* o/p : 10
* */

package Array;

import java.util.Scanner;

public class arrayMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxElement=arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]>maxElement) {
                maxElement = arr[i];

            }
        }
        System.out.println(maxElement);
    }
}
