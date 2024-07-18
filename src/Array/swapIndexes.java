/*Given an array of length N and two indexes idx1 and idx2 , swap the element of those two indexes*/

package Array;

import java.util.Scanner;

public class swapIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};

        System.out.println("enter the idx1");
        int idx1 = sc.nextInt();

        System.out.println("enter the idx2");
        int idx2 = sc.nextInt();

        swap(arr, idx1, idx2);

       //it prints the swap array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
}
