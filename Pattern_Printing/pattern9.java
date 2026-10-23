/*
Hollow Rectangle pattern print:

* * * * * * * * *
*               *
*               *
*               *
* * * * * * * * *

*/ 

import java.util.*;


public class pattern9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int m = sc.nextInt();
        System.out.print("Enter the Column's: ");
        int n = sc.nextInt();

        for(int i =1; i<=m;i++){
            for(int j=1; j<=n;j++){
                if(j==1 || j==n || i==1 || i==m){
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }  
            }
            System.out.println();
        }
    }
}
