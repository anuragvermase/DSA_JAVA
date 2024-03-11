//find the square root of n (floor value)

package Problem_solving;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(squareRoot(n));

    }

    public static int squareRoot(int n) {
        int ans = 1;
        int i = 1;
        while(i*i<=n){
            ans = i;
            i++;
        }
        return ans;
    }
}
