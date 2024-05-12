package String;

import java.util.Scanner;

public class stringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String Input
        System.out.println("Enter String");
        String st = sc.nextLine();
        System.out.println(st);
        System.out.println("Character at 1st index");
        System.out.println(st.charAt(1)); //get character by index value
        //st.charAt(1)='o'; //you can't update character of a string directly

        //nextLine() -> reads whole line

        //Char Input
        System.out.println("Enter Character");
        char ch = sc.nextLine().charAt(0);
        System.out.println(ch);

        //Type casting
        //char to int : implicit
        int x = 'c';
        System.out.println(x); //99

        //int to char : complicated {in few cases it will be implicit & in few it should be explicit}
        //  so, do explicitly always

        //*In this case it will be implicit
        char ch3 = 65; //so use char ch = (char)65;
        System.out.println(ch3); //A
        //*In this case it will be explicit
        char ch4 = 'A';
        ch4 = (char)(ch4 +3); //Explicitly 68 converted to char
        System.out.println(ch4); //D

        //SUBSTRING : continuous part of string

        String subst = "GREAT";
        /*
        substring(sp,ep): sp-> inclusive ep->exclusive
        */
        System.out.println(subst.substring(2,5)); //EAT

        //Length of string
        System.out.println(subst.length()); //5

        //String to character Array
        char[] nums = subst.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");  //G R E A T
        }

        System.out.println();

        //Character Array to String
        String str = "".valueOf(nums);
        System.out.println(str); //GREAT
        
    }
}
