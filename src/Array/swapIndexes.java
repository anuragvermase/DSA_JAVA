/*Given an array of length N and two indexes idx1 and idx2 , swap the element of those two indexes*/

package Array;

public class swapIndexes {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        swap(arr);

//      it prints the swap array elements

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void swap(int[] arr) {
        int temp = arr[1];
        arr[1]=arr[4];
        arr[4]=temp;

    }
}
