/* Given arr[n], find no. of distinct elements.
* eg : arr[5] = {4 6 7 6 5} -> 4
* eg : arr[5] = {10 10 10 20 20} -> 2
*
* */

package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class noOfDistinctElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        distinctElement(arr);
    }

    public static void distinctElement(int[] arr){
        HashSet <Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }
}
