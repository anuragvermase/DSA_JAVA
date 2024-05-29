package Recursion;

public class printIncreasing {
    public static void main(String[] args) {
        int N = 5;
        numPrint(N);
    }

    public static void numPrint(int N) {
        // Base case: if N is 1, print 1 and return
        if (N == 1) {
            System.out.println(1);
            return;
        }
        // Recursively call numPrint with N-1
        numPrint(N - 1);
        // Print N after the recursive call
        System.out.println(N);
    }
}