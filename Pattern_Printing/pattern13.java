/*
pattern print:
input = 4

output:
1
A B
1 2 3
A B C D

*/

import java.util.*;

public class pattern13{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int  n = sc.nextInt();

for(int i=1; i<=n; i++){
for(int j=1; j<=i; j++){

if(i%2==0){
System.out.print((char)(j+64)+" ");
}
else{
System.out.print(j+" ");
}
}
System.out.println();
}
}
}

