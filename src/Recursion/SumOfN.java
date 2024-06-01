package Recursion;

public class SumOfN {
    public static void main(String[] args) {
        int N = 5;
        int r = sumN(N);
        System.out.println(r);
    }
    public static int sumN(int N){
        if(N==1){
            return 1;
        }
        int temp = sumN(N-1);
        return temp+N;
    }
}

//Time Complexity = O(1) * N = O(N)
//Space Complexity = O(N)
