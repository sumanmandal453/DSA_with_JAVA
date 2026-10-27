/*
print the pattern:
input: n=4

output:
1
1 3
1 3 5
1 3 5 7
*/

import java.util.*;

public class pattern20{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();
int a = 0;
for(int i =1; i<=n; i++){
for(int j =1 ; j <=i; j++){

System.out.print((j+a)+" ");
a++;
}
a = a-i;
System.out.println();
}
}
}
