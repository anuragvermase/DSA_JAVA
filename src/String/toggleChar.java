/*
* Toggle Character :
* Given a char[] which contains only small and capital letters, toggle them.
* lowercase->uppercase
* uppercase->lowercase
* */

package String;

import java.util.Scanner;

public class toggleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sting for toggle");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        //function call
        char[] tc = toggleCharacter(ch);
        System.out.println(tc);
    }

    public static char[] toggleCharacter(char[] ch){
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= 97 && ch[i]<=122){
                ch[i]=(char)(ch[i]-32);
            }else if(ch[i] >= 65 && ch[i]<=90) {
                ch[i]=(char)(ch[i]+32);
            }else{
               ch[i] = (char)(42) ;
            }
        }
        return ch;
    }
}
