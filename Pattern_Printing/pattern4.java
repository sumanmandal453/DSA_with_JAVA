/*
pattern print:
n=3
print:

1 1 1
2 2 2
3 3 3
or
n=4
print:
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
 
*/

import java.util.*;

public class pattern4{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int a = sc.nextInt();
for(int i=1; i<=a;i++){
for(int j=1;j<=a;j++){
System.out.print(i+" ");
}
System.out.println();
}
}
}
