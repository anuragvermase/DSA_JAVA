/*
* IMPORTANT:
* good integer (data can repeat):
*
* eg:  int[] arr ={-2,-4,3,3,5,5,5,5,8,8,8,10,17};
*                   0  1 2 2 4 4 4 4 8 8 8 11 12
* */

package Sorting;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class goodIntegerRepeat {
    public static void main(String[] args) {
        int[] arr ={-2,-4,3,3,5,5,5,5,8,8,8,10,17};
        int r = countGoodInteger(arr);
        System.out.println(r);
    }
    public static int countGoodInteger(int[] arr){
        Arrays.sort(arr);
        int count=0;
        int lessCount=0;

        //handled for 0th index {if 0 is at the very first position}
        if (arr[0]==0){
            count++;
        }

        for (int i = 1; i < arr.length; i++) {

            if(arr[i]!=arr[i-1]){
                lessCount=i;
            }
            if(arr[i]==lessCount){
                count++;
            }
        }
        return count;
    }

}

//T.C.: O(NlogN)
//S.C.: O(N)
