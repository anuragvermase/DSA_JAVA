package Recursion;

public class program {
    public static void main(String[] args) {
        int x=20;
        int y=10;
        int temp1=add(x,y);
        int temp2=mul(temp1,30);
        int temp3=sub(temp2,75);
        System.out.println(temp3);
    }
    public static int add(int a, int b ){
        return a+b;
    }

    public static int mul(int a, int b ){
        return a*b;
    }
    public static int sub(int a, int b ){
        return a-b;
    }
}
