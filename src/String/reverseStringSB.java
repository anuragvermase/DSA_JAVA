//reverse a string
package String;

public class reverseStringSB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("great");

        for (int i = 0; i < sb.length()/2; i++) {
            int sp = i;
            int ep = sb.length() - 1 - i;

            char startChar = sb.charAt(sp);
            char endChar = sb.charAt(ep);

            sb.setCharAt(sp, endChar);
            sb.setCharAt(ep, startChar);
        }
        System.out.println(sb);
    }
}

/*
we can also do just by, built-in reverse() method.

time complexity : O(n)
*/
