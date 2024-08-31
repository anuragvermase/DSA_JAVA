/*
Remove adjacent Duplicate:
Given a String S, Remove equal pair of adjacent character. Return the final string.

eg: 1. a b b b b d
       a d
    2. a b c c b d e
       a d e
    3. a b b b e
       a b e
    4. a d c b b e c a a c d e d
       a d c e d e d
*/
package Stack;

import java.util.Arrays;
import java.util.Stack;

public class removeAdjacentDuplicate {
    public static void main(String[] args) {
        String str = "hello";

        String result = removeAdjacent(str);
        System.out.println(result);

    }
    public static String removeAdjacent(String str){
        Stack <Character> st =  new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(st.isEmpty()){
                st.push(str.charAt(i));
                continue;
            }

            if (str.charAt(i) == st.peek()){
                st.pop();
            }else{
                st.push(str.charAt(i));
            }
        }
        char[] ch = new char[st.size()];

        for (int i = ch.length-1; i >=0; i--) {
            ch[i] = st.pop();

        }

        return Arrays.toString(ch);
    }
}


//TC : O(n)
//SC : O(n) -stack space