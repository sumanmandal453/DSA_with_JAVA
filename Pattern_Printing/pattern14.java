/*
pattern print:
input =4

a b c d 
a b c
a b
a
*/

import java.util.*;

public class pattern14{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();

for(int i =1; i<=n;i++){
for(int j=1; j<=(n+1)-i;j++){
System.out.print((char)(j+96) +" ");

}
System.out.println();
}
}
}