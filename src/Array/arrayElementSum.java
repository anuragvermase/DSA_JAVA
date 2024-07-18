/* Sum of array - Read an array of N length and print the sum of all elements. */
package Array;

import java.util.Scanner;

public class arrayElementSum {
    public static void main(String[] args) {
        int sumOfElement = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input value (user)
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        //Sum of elements
        for (int i = 0; i < n; i++) {

           sumOfElement = sumOfElement+arr[i];
        }
        System.out.println(sumOfElement);
    }

}
