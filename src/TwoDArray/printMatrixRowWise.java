/* Print matrix row wise
*  i.e. a matrix of 3*2
*  2 3
*  5 6
*  8 9
*
*  output: 2 3
*          5 6
*          8 9
* */

package TwoDArray;

import java.util.Scanner;

public class printMatrixRowWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input row and column
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        //input the array
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        //printing the array
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
