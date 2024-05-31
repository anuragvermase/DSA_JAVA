/*
 * Given a and N , calculate a^N
 * */


//This method have better time complexity, because we use N/2
package Recursion;

public class powerCal {
    public static void main(String[] args) {
        int a = 3;
        int K = 5;
        int result = powOfa(a, K);
        System.out.println(result);
    }

    public static int powOfa(int a, int K) {
        if (K == 1) {
            return a;
        }
        int temp = powOfa(a, K / 2);
        if (K % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * a;
        }
    }
}
/* N/2->N/4->N/8 . . . -> logN
 * powOfa(3,5)->powOfa(3,2)->powOfa(3,1)-> 3 functions (i.e. function runs 3 times)
 * No. of functions = 3;
 * time complexity of one function = O(1);
 * Overall complexity = O(1)*logN  (N: number of functions)
 * recursion complexity = O(logN)  {Optimised Complexity}
 */

//__________________________________________________________________________________________

/*
package Recursion;

public class powerCal {
    public static void main(String[] args) {
       int a = 3;
       int K = 5;
       int result = powOfa(a,K);
        System.out.println(result);
    }
    public static int powOfa(int a, int K){
        if(K==1){
            return a;
        }
        int temp = powOfa(a,K-1);
        return temp*a;
    }
}
*/


/*powOfa(3,5)->powOfa(3,4)->powOfa(3,3)->powOfa(3,2)->powOfa(3,1)-> 5 functions (i.e. function runs 5 times)
* No. of functions = 5;
* time complexity of one function = O(1);
* Overall complexity = O(1)*N  (N: number of functions)
* recursion complexity = O(N)
*/

