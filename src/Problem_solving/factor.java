// optimized code for finding the factors.

package Problem_solving;
//import java.lang.Math;
import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        System.out.println(factorFind());
    }

    public static int factorFind() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i != n/i) {
                    count =count + 2;
                } else {
                    count++;
                }

//                System.out.println(i);
//                int j = n / i;
//                System.out.println(j);
//                System.out.println("count "+count);

            }
        }
        return count ;

    }}