/*Given arr[N], check if there exists a pair(i,j) such that arr[i]+arr[j]==k and (i!=j)
*            0 1 2  3 4 5 6   7 8 9
* arr[10] = {8 9 1 -2 4 5 11 -6 7 5}
*
* k=11 -> arr[4]+arr[8]-> 4+7 = 11.
*
* */

package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class pairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        boolean result = sum(arr,k);
        System.out.println(result);
    }

    public static boolean sum(int[] arr, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1 );
            }else{
                hm.put(arr[i],1 );
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = k-a;
            if (hm.containsKey(b) && a!=b){
                return true;
            } else if (a==b && hm.containsKey(b) && hm.get(b)>1) {
                return true;
            }
        }
        return false;
    }
}
