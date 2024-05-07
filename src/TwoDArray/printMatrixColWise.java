/*
* Print Matrix Column Wise:
*
* i.e. A matrix of 3*2
*
* 2 3
* 5 6
* 7 8
*
* Output : 2 5 7
*          3 6 8
* */

package TwoDArray;

import java.util.Scanner;

public class printMatrixColWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        //input
        for(int i=0; i<n ;i++){
            for(int j=0; j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //Output
        for (int j = 0; j < m; j++) {
            for(int i=0; i<n; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
