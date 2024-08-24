/*
* Given a sorted arr[N], find floor of given number k.
*
* **floor - just smaller ( greatest no. <= k in arr[] )
*
* eg: arr[9] : { -4 3 4 7 10 11 12 15 19 }
* */
package BinarySearch;

import java.util.Scanner;

public class floorBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mention the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number, you want to search");
        int k = sc.nextInt();

        int r = floorSearch(arr,k);
        System.out.println(r);
    }
    public static int floorSearch(int[] arr,int k){
        int lo = 0;
        int hi = arr.length-1;

        int ans = -1;

        while(lo<=hi){
            int mid = lo + (hi - lo) / 2;
            if (arr[mid]==k){
                return arr[mid];
            } else if (arr[mid] < k) {
                lo=mid+1;
                ans = arr[mid];
            }else {
                hi=mid-1;
            }
        }
        return ans;
    }
}

//TC : O(logN)
//SC : O(1)