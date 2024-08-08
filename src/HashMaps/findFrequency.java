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
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter size of Query");
        int m = sc.nextInt();

        int[] arr = new int[n];
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


    /*IDEA : 1

        for (int i = 0; i < qy.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (qy[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(count);
        }

        */

    //IDEA : 2

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

/*
Compare : Time Complexity
Idea : 1 -> O(n*m)
Idea : 2 -> O(n+m)
if we consider n=m :
Idea : 1 ->          O(n^2)
Idea : 2 -> O(2n) =  O(n)

Idea 2 complexity is better
 */