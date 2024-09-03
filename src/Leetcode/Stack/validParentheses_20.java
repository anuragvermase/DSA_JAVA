/*
Valid Parentheses
Easy

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

*/

package Leetcode.Stack;

import java.util.Stack;

public class validParentheses_20 {
    public static void main(String[] args) {
        String s = "[()[]{}]{}";

        boolean result = valid(s);
        System.out.println(result);
    }

    public static boolean valid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (st.isEmpty()) {
                st.push(s.charAt(i));
                continue;
            }

            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ']') {
                if (st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ')') {
                if (st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
