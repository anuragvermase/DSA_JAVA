/* Sum of array - Read an array of N length and print the sum of all elements. */
package Array;

import java.util.Scanner;

public class arrayElementSum {
    public static void main(String[] args) {
        int sumOfElement = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Input value (user)
        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }

        //Sum of elements
        for (int i = 0; i < N; i++) {

           sumOfElement = sumOfElement+arr[i];
        }
        System.out.println(sumOfElement);
    }

}
