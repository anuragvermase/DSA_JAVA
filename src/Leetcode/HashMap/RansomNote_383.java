package Leetcode.HashMap;

import java.util.HashMap;

public class RansomNote_383 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        boolean r = canConstruct(ransomNote, magazine);
        System.out.println(r);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        //Creating HashMap
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (hm.containsKey(magazine.charAt(i))) {
                int temp = hm.get(magazine.charAt(i));
                hm.put(magazine.charAt(i), temp + 1);
            } else {
                hm.put(magazine.charAt(i), 1);
            }
        }

        int count = 0;
        //Iterating through ransomNote and check for available in HashMap and value greater than 0.
        //Then if condition satisfied update HashMap value with -1, and count +1, then
        //compare ransomNote.length() == count if true return true, o/w false
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (hm.containsKey(ch) && hm.get(ch) > 0) {
                hm.put(ch, hm.get(ch) - 1);
                count++;
            } else {
                break;
            }
        }
        if (ransomNote.length() == count) {
            return true;
        }
        return false;

    }
}
