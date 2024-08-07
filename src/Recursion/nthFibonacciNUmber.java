/*
* Print Nth fibonacci number
* eg : 0 1 1 2 3 5 8 13 21 34    {indexing from '0'}
* formula:
* fib(N)=fib(N-1)+fib(N-2);
* */
package Recursion;

public class nthFibonacciNUmber {
    public static void main(String[] args) {

        int N=9;
        System.out.println(nthNum(N));

    }
    public static int nthNum(int N){   //faith : given N , calculate  & return Nth fibo. no.
        if(N==1 || N==0){                      //base case:
            return N;
        }

        int temp1 = nthNum(N-1); //main logic : fib(N)=fib(N-1)+fib(N-2);
        int temp2 = nthNum(N-2);
//      or  int temp = nthNum(N-1) + nthNum(N-2);
//          return  temp;
        return temp1+temp2;

    }
}

//    Time Complexity = O(1) * 2^N = O(2^N)        {here 2 function calls}

/*
* Number of calls = x  {i.e. : 2}
* count of levels = n
* number of function = x^n
* */

//Space Complexity : O(N)