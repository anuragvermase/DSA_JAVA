//Input an array

package Array;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //size of the array
        int[] arr = new int[n];  //define an array

        // array input
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(arr[2]); //prints the 2nd index element

        //To print all the array element
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
