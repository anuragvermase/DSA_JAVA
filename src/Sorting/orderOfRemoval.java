/*
* Order of removal:
* Given N element at every step remove an array element. Cost to remove element =sum of array elements present.
* Find min. cost to remove all element.
* NOTE : add cost first and then remove.
* eg. arr[3] = {3 2 5}
* remove 5 : 10
* remove 3 : 5
* remove 2 : 2
* total cost : 17
*
* remove the element from max. element to min. element (to find minimum cost)
*
* */

package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class orderOfRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = removalCost(arr);
        System.out.println(result);
    }
    public static int removalCost(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i <arr.length; i++) {
            int cost = arr[i] * (arr.length-i);
            ans= ans + cost;

        }
        return ans;
    }
}


//T.C. :O(NlogN)+O(N) = O(NlogN)
//S.P. :O(N)