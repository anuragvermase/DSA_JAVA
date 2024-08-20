package Leetcode.Sorting;


import java.util.HashMap;
import java.util.Scanner;



public class containsDuplicates2_219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = sort(nums, k);

        System.out.println(result);
    }

    public static boolean sort(int[] nums, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i <= nums.length-1; i++) {
            if (hm.containsKey(nums[i]) && (i - hm.get(nums[i]) <=k )){
                return  true;
            }
            hm.put(nums[i], i );    //key is the element and index is the value
        }
        return false;
    }
}


/*
Time limit exceeds :

 for (int i = 0; i <= nums.length-2; i++) {
            for (int j = i+1; j <= nums.length-1 ; j++) {
                if(i !=j && nums[i] == nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
*/