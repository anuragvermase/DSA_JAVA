/* Find the first non-repeating elements.
*   eg: arr[6]={1 2 3 1 2 5} -> 3
*   eg: arr[8]={5 4 4 3 6 7 5 6}-> 3
* */
package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class firstNonRepeating {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
    }

    firstNonRepeat(arr);

    }

    public static void firstNonRepeat(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if(hm.containsKey(arr[i])){
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1 );
            }else{
                hm.put(arr[i],1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i])==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

//Time Complexity : O(2n) = O(n)