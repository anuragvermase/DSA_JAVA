/*
* Reverse the given String : given a string str, reverse and print it.
*
* 1. convert string to character array {because string is immutable, so firstly converts to array}
* 2. then revers the character array
* 3. converts character array to string
* */

package String;

public class reverseString {
    public static void main(String[] args) {
        String str ="animal";
        int n = str.length();
        //convert string to character array
        char[] ch = str.toCharArray();
        int sp=0;
        int ep=n-1;


        while (sp<ep){
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] =  temp;
            sp++;
            ep--;
        }
        //converts character array to string
        String ans = str.valueOf(ch);
        System.out.println(ans);

    }
}
