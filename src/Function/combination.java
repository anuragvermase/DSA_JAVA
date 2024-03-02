
//Calculate the combinations [nCr = n!/r!*(n-r)!]

package Function;

import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = fact(n);
        int rfact = fact(r);
        int nmrfact = fact(n-r);

        int calComb = nfact/(rfact*nmrfact);
        System.out.println(calComb);
    }
    //function
    public static int fact(int n) {
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans = ans*i;
        }
        return ans;
    }
}
