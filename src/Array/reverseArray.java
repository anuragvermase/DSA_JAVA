/*Reverse array : Given an array of length N, Reverse the whole array. */


package Array;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        //input
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //function call
        reverse(arr);

        //prints
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverse(int[] arr){
        int sp = 0;                   //sp-starting point
        int ep = arr.length-1;        //ep-ending point

        while (sp<ep){                //condition
            int temp = arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            //preparation for the next line
            sp++;
            ep--;
        }
    }
}
