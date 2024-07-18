/*
* Given n array elements, "count total number of elements" having atleast 1 element greater then itself.
*
* arr[8] : {3, 4, 11, 8, 2, 10, 9, 11}
* max element =11
* count =6  //element which is smaller than max element
*
* STEPS:
* 1. find the max. element from the array
* 2. then search for no. of element less than max. element
*
* */
package Array;

import java.util.Scanner;

public class problemCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        max(arr);
        System.out.println(max(arr));
    }

    public static int max(int[] arr) {

        int maxElement =arr[0];

        //Gives the max element from the array
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }

        //Gives the count which is smaller than max element
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxElement) {
                count++;
            }
        }
        return arr.length-count;
    }
}
