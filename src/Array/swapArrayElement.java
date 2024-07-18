/*
* Swap Indexes : Given array of length n and two indexes i and j, swap the element of those two indexes.
* */

package Array;

public class swapArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0]=10;
        arr[1]=20;

        swap(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}

//OUTCOME : Arrays across functions are always connected