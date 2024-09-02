/*
1047. Remove All Adjacent Duplicates In String
EASY

You are given a string s consisting of lowercase English letters. A duplicate removal consists
of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven
that the answer is unique.

Example 1:
Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

Example 2:
Input: s = "azxxzy"
Output: "ay"

*/
package Leetcode.Stack;

import java.util.Stack;

public class removeDuplicateAdjacent_1047 {
    public static void main(String[] args) {
        String s = "azxxzy";

        String result  = removeDuplicates(s);
        System.out.println(result);
    }

    public static String removeDuplicates(String s){

        Stack <Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }

            if (st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }

        char[] ch = new char[st.size()];

        for (int i = ch.length-1 ; i >= 0; i--) {
            ch[i] = st.pop();
        }

        return new String(ch);
    }
}
