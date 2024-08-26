
package TEST;

import java.util.Arrays;
import java.util.Scanner;

public class testFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2, 11, 10, 1 ,3};
        int k = 10;

        int r = test(nums, k);
        System.out.println(r);
    }

    public static int test(int[] nums, int k) {
        Arrays.sort(nums);
        int op = 0;
        for (int num : nums) {
            if (num < k) {
                op++;
            }
        }
        return op;
    }
}
