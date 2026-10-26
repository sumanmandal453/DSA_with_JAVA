/*
pattern print:

input = number any
output:
*      *
 *   *
   *
  *  *  
 *    * 
 cross sine 

*/

import java.util.*;

public class pattern18{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();
for(int i = 1; i<= n ; i++){
for(int j = 1; j<= n ; j++){

if(j == i || j == (n+1)-i){
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
