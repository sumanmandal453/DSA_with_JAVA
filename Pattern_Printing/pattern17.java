/*
pattern print:

only enter the odd number =3,5 , 7, 9.....etc.
output:
    *
    *
* * * * *
    *
    *
Star plus print

*/

import java.util.*;

public class pattern17{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the even number for print the Star plus: ");
int n = sc.nextInt();
if( n%2 != 0){
for(int i =1; i<=n;i++){
for(int j =1; j<=n;j++){
if( j ==((n+1)/2) || i==((n+1)/2)){
System.out.print("* ");
}
else{
System.out.print("  ");
}
}
System.out.println();
}
}
else{
System.out.println("You are not enter the Odd number!");
}
}
}

