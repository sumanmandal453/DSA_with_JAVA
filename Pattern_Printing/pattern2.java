/*
pattern print:
input: n=4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
*/

import java.util.*;
public class pattern2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int row = sc.nextInt();
for(int i=1; i<=row;i++){
for(int j=1; j<=row;j++){
System.out.print(j+" ");
}
System.out.println();
}
}
}
