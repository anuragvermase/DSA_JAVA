//another method by formula s=(n*(n+1))/2

package Problem_solving;

import java.util.Scanner;

public class sumOfNNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum = 0;

        //formula -> s=(n*(n+1))/2
        sum=(n*(n+1))/2;

        System.out.println(sum);

    }
}
