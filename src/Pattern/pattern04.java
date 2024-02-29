/*Print : 1
          2 3
          4 5 6
 */
package Pattern;

import java.util.Scanner;

public class pattern04 {
    public static void main(String[] args) {
        int t = 1;
        int count =1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<= t ;j++){
                System.out.print(count +" ");
                count ++;
            }
            t++;
            System.out.println();
        }

    }
}
