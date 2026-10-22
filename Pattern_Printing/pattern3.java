/*
pattern print:
n=2
print Alphabet
A B
A B

or
n=3
A B C
A B C
A B C
*/

import java.util.*;
public class pattern3{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number(1-26): ");
int n = sc.nextInt();
for(int i =1; i<=n;i++){
for(int j=65; j<=65+(n-1);j++){
System.out.print((char)j+" ");
}
System.out.println();
}
}
}

