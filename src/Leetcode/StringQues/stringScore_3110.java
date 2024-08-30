package Leetcode.StringQues;

import java.util.Scanner;

public class stringScore_3110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result  = scoreOfString(s);
        System.out.println(result);
    }

    public static int scoreOfString(String s){
        char[] nums = s.toCharArray();
        int score = 0;
        for (int i = 0; i < nums.length-1; i++) {
            score = score + Math.abs((int)nums[i]-(int)nums[i+1]);
        }
        return score;
    }
}
