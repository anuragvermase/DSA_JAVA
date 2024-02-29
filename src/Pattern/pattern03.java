/*Print : *
          **
          ***
*/
package Pattern;

import java.util.Scanner;

public class pattern03 {
    public static void main(String[] args) {
        int nst =1;
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=nst;j++) {
                System.out.print("*");
            }
            nst++;
            System.out.println();
        }

    }
}
