//Binary Search

package BinarySearch;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        boolean r = searchAlgo(arr,k);
        System.out.println(r);
    }
    public static boolean searchAlgo(int[] arr ,int k){

        int lo = 0;
        int hi = arr.length-1;

        while (lo<=hi){
            int mid=(lo+hi)/2;
            if (arr[mid] == k){
                return true;
            } else if (arr[mid]<k) {
                lo = mid+1;
            }else if (arr[mid]>k){
                hi = mid-1;
            }
        }
        return false;
    }
}

//TC : O(log N)
//SC : O(1)