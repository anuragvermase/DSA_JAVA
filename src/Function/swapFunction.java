package Function;

public class swapFunction {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println("swapped a = "+a);
        System.out.println("swapped b = "+b);

    }
}

//OUTCOME : variable of two function is not connected
