package Leetcode.StringQues;

import java.util.Scanner;

public class lastLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = lengthOfLastWord(s);
        System.out.println(length);

    }

    public static int lengthOfLastWord(String s) {
        char[] ch = s.trim().toCharArray();
        int count = 0;
        for (int i = ch.length-1; i >=0 ; i--) {
            if(ch[i] == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}


/*
* another way:
*
*       char[] ch = s.trim().toCharArray();
        int count = 0;
        for (int i = ch.length-1; i >=0 ; i--) {
            if(ch[i] != ' '){
                count++;
            }else if (count > 0) {
                break;
            }
        }
        return count;
* */