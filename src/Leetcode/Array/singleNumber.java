package Leetcode.Array;

import java.util.HashMap;
import java.util.Scanner;

public class singleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sn = singleNum(nums);
        System.out.println(sn);
    }
    public static int singleNum(int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])){
                int temp = hm.get(nums[i]);
                hm.put(nums[i],temp+1 );

            }else {
                hm.put(nums[i],1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i])==1){
                return nums[i];
//                System.out.println(nums[i]);
            }
        }
        return -1;
    }
}
