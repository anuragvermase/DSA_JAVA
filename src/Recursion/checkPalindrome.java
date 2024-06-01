//Given an array {character}, check if it is palindrome or not?

package Recursion;

public class checkPalindrome {
    public static void main(String[] args) {
        String str ="MALAYALAM";
        char[] ch = str.toCharArray();
        int s = 0;
        int e = ch.length-1;
        boolean result = isPalindrome(ch, s, e);
        System.out.println(result);
    }
    public static boolean isPalindrome(char[] ch, int s, int e){   //faith : check and return whether ch array is palindrome between s to e
        if(s==e||s>e){                                                  //Base case :
            return true;
        }
        if (ch[s]==ch[e]){                                         //main logic :
            return isPalindrome(ch,s+1,e-1);

        }else{
            return false;
        }

    }
}

/*
* Time Complexity : O(1)*N/2 =O(N/2)= O(N)
* Space Complexity :  O(1)*N/2 =O(N/2)= O(N)
* */