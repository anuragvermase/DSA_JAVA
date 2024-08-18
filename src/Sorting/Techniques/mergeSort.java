/*
MERGE SORT :
- divide and merge technique.

Merge sort is a sorting algorithm that follows the divide-and-conquer approach. It works by recursively
dividing the input array into smaller sub-arrays and sorting those sub-arrays then merging them back
together to obtain the sorted array.
*/
package Sorting.Techniques;

import java.util.ArrayList;
import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //give input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = n-1;

        //function call
        sort(arr,low,high);

        //prints the output array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr, int low, int high){
        //base cond. of recursion
        if(low >= high) return;

        int mid = (low + high)/2;
        //recursion concept
        sort(arr, low, mid);
        sort(arr, mid + 1, high);

        //function call to merge
        merge(arr, low, mid, high);

    }

    //merge function
    public static void merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        //created an empty array 'list'
        ArrayList<Integer> list = new ArrayList<>();

        while(left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }

        //if any elements left in left array
        while(left <= mid){
            list.add(arr[left]);
            left++;
        }

        //if any elements left in right array
        while(right<=high){
            list.add(arr[right]);
            right++;
        }

        //assign/add 'list' elements to 'arr'
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }
}

//T.C. : O(NlogN) {best, average & worst}
//S.C. : O(N)