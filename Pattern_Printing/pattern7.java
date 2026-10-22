/*
pattern print:

input: n=4

Output:
a a a a
B B B B
c c c c
D D D D

*/

import java.util.*;

public class  pattern7{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your number: ");
int a = sc.nextInt();

for(int i = 1; i<=a; i++){
if(i%2 ==0){
for(int j=1; j<=a; j++){
System.out.print((char)(i+64)+" "); 
}
System.out.println();
}
else{
for(int j=1; j<=a; j++){
System.out.print((char)(i+96)+" ");
}
System.out.println();
}
}
}
}

