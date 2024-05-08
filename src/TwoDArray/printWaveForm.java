/*
* Print Matrix in wave-form(zig-zag)
*
* i.e. a matrix of 3*3
*
* 4  6 7
* 73 5 76
* 12 3 0
*
* Output :4  6 7
*         76 5 73
*         12 3 0

* */

package TwoDArray;

import java.util.Scanner;

public class printWaveForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //row
        int m = sc.nextInt(); //column

        int [][] arr = new int[n][m];

        //input array
        for (int i = 0 ; i<n ; i++ ){
            for (int j = 0; j<m ;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //Output array
        for (int i=0 ; i<n ; i++){
            if(i%2==0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] +" ");
                }
            }else{
                for (int j=m-1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
