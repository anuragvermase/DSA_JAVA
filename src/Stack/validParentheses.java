/*
Valid parentheses :

Given a String with '(' ')' '{' '}' '[' ']' you have to find whether the string is balanced or not

Note : Balanced String :
1. open brackets must be closed by the same type of brackets.
s: (){}[](()) -> true
s: (){}[) -> false

2. opening brackets must be closed in correct order.
s: ({)} -> false
s: (){(}) -> false
*/

package Stack;

import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        String s = "[()[]{}]{}";

        boolean result  = valid(s);
        System.out.println(result);
    }

    public static boolean valid(String s){
        Stack <Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }

            if (s.charAt(i) == '[' || s.charAt(i) == '(' ||s.charAt(i) == '{'){
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ']') {
                if (st.peek() == '['){
                    st.pop();
                }else{
                    return false;
                }
            }else if (s.charAt(i) == ')') {
                if (st.peek() == '('){
                    st.pop();
                }else{
                    return false;
                }
            }
            else if (s.charAt(i) == '}') {
                if (st.peek() == '{'){
                    st.pop();
                }else{
                    return false;
                }
            }
        }

        if (st.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
