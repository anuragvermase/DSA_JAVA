package Recursion;

public class factorialOfN {
    public static void main(String[] args) {
        int N=5;
        int r = fact(N);
        System.out.println(r);
    }
    public static int fact(int N){
        if(N==1){
            return 1;
        }
        int temp = fact(N-1);
        return temp*N;
    }
}
