/*
pattern print:

* * * * *
* * * * *
* * * * *

*/

import java.util.*;
public class pattern1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("How many rows do you want: ");
int row = sc.nextInt();
System.out.print("How many columns do you want: ");
int col = sc.nextInt();
for(int i=0; i<row;i++){
for(int j=0; j<col;j++){
System.out.print("* ");
}
System.out.println();
}
}
}