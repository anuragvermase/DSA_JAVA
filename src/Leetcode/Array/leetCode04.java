package TwoDArray;

import java.util.Scanner;

public class leetCode04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int element = majorityElement(nums);
        System.out.println(element);
    }
    public static int majorityElement(int[] nums){

        for(int i=0; i<nums.length;i++){
            int count=0;
            for(int j=0; j< nums.length;j++){
                if(nums[i]==nums[j]) {
                    count++;
                }
            }
            if(count> (nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }
}
