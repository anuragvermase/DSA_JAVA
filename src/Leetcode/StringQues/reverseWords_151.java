//WRONG:

package Leetcode.StringQues;

import java.util.Scanner;

public class reverseWords_151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println(reverseWords(str));

    }

    public static String reverseWords(String str){

        char[] ch = str.toCharArray();
        int n = ch.length;

        int sp = 0;
        int ep = n-1;

        while(sp<ep){
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] = temp;

            sp++;
            ep--;
        }
        return String.valueOf(ch);
    }
}
