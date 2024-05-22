/*Find Frequency
* Given N array element & Q queries. for every query find frequency of element in array.
* Eg: arr[11] :{2 6 3 8 2 8 2 3 8 10 6}
*
* queries[4] : {2 8 3 5}
* frequency  :  3 3 2 0
* */

package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class findFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter size of array");
        int[] arr = new int[n];
        System.out.println("Enter size of Query");

        int[] qy = new int[m];
        System.out.println("Enter array");

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter query");

        for (int i=0; i<m; i++){
            qy[i] = sc.nextInt();
        }

        findFreq(arr,qy);

    }
    public static void findFreq(int[] arr,int[] qy){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else{
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }
        }

        for (int i = 0; i < qy.length; i++) {
            int val =  qy[i];
            if (hm.containsKey(val)) {
                System.out.println(hm.get(val));
            }else{
                System.out.println("0");
            }
        }
    }
}
