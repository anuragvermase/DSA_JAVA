/*
* Print : **** ****
*         ***   ***
*         **     **
*         *       *
*         **     **
*         ***   ***
*         **** ****
*
* */
package Pattern;

import java.util.Scanner;

public class pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = (n/2)+1;
        int nsp = 1;

        for (int i=1;i<=n;i++){
            //print ing stars
            for(int j=1; j<=nst;j++){
                System.out.print("*");
            }
            //printing spaces
            for(int k=1; k<=nsp;k++){
                System.out.print(" ");
            }
            //print ing stars
            for(int l=1; l<=nst;l++){
                System.out.print("*");
            }

            //Prep for next line

            if(i<=n/2) {
                nst--;
                nsp = nsp + 2;
            }else{
                nst++;
                nsp = nsp - 2;
            }
            System.out.println();
        }
    }
}
