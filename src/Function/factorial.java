//To print the factorial.
package Function;

public class factorial {
    public static void main(String[] args) {
        int fn = printFact(5);
        System.out.println(fn);

    }

    public static int printFact(int n){
        int ans=1;

        for(int i=1;i<=n;i++){
            ans =ans*i;
        }
//        System.out.println(ans);
        return ans;
    }
}
