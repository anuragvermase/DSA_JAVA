
//Function

package Function;

public class function {
    public static void main(String[] args) {
        int n1 = add(5,5);
        System.out.println(add(n1,cube(5))); //135

        // int n2 = mul(2,3); -> gives error because mul() function has "void return type".
        // So it can't be stored in a variable

        add(5,6); // ->Not gives error because it is not necessary to assign a value in a variable,
        //after calculation.
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int cube(int x){
        return x*x*x;
    }

    public static void mul(int x,int y){
        int result = x*y;
    }
}
