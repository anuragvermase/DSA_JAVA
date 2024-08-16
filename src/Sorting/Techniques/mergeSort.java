/*
MERGE SORT :

Merge sort is a sorting algorithm that follows the divide-and-conquer approach. It works by recursively
dividing the input array into smaller subarrays and sorting those subarrays then merging them back
together to obtain the sorted array.

divide and merge technique.
*/
package Sorting.Techniques;

import java.util.ArrayList;
import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = n-1;
        //function call
        sort(arr,low,high);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr, int low, int high){

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
            }else{
                list.add(arr[right]);
                right++;
            }

        }

        while(left <= mid){
            list.add(arr[left]);
            left++;
        }

        while(right<=high){
            list.add(arr[right]);
            right++;
        }

        //assign 'list' element to 'arr'
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }

    }
}

//T.C. : O(NlogN)
//S.C. : O(N)