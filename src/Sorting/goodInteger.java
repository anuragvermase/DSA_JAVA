/*
* Good Integer : {Only distinct}
* Given arr[N], calculate no. of good integers. An element is said to be good if
* {No. of element < ele == ele itself}
*
* eg: {-1 -4 3 5 -15 4} -> ele's
*       2  1 3 5  0  4  -> no of element smaller than ele.
* so 3 5 4 are good integer.
* */
package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class goodInteger {
    public static void main(String[] args) {
        int[] arr = {-1, -4, 3, 5, -15, 4};

         int r = noOfGoodInt(arr);
        System.out.println(r);
    }

    public static int noOfGoodInt(int[] arr){
        Arrays.sort(arr);
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==i){
                count =count +1;
//                System.out.println(count);
            }
        }
        return count;
    }
}

//T.C. : O(NlogN+N) = O(NlogN)
//S.P. : O(N)