package Bit_manipulation;

public class test01 {
    public static void main(String[] args) {
        int[] nums = {5,4,3,4,5,2,2};
        int count =0;
        for (int i=0; i<nums.length;i++){
            count = count^nums[i];
        }
        System.out.println(count);
    }
}
