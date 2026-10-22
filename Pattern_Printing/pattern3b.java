/*
pattern print:
n=2
print Alphabet
a b
a b

or
n=3
a b c
a b c
a b c 

*/

import java.util.*;
public class pattern3b{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number(1-26): ");
int n = sc.nextInt();
for(int i =1; i<=n;i++){
for(int j=97; j<97+n;j++){
System.out.print((char)j+" ");
}
System.out.println();
}
}
}