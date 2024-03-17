/* Reverse a part of an array : given N array element and [s,e], reverse the array from [s,e]*/
package Array;

import java.util.Scanner;

public class reversePartOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the starting point");
        int s = sc.nextInt();
        System.out.println("Enter the ending point");
        int e = sc.nextInt();

        System.out.println("enter the array element");

        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }

        reverse(arr,s,e);

        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void reverse(int[] arr,int s,int e) {
        int sp =s;
        int ep =e;

        while (sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;

            sp++;
            ep--;
        }
    }
}
