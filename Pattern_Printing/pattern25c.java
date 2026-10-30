/*
pattern print:(pyramid:,Method:2--> using variables)
input: n = 4;

Output:
      1
    1 2 3
  1 2 3 4 5
1 2 3 4 5 6 7

*/

import java.util.*;

public class pattern25c{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number: ");
 
 int n = sc.nextInt();
 int nsp = n-1;
 int nst = 1;
 for(int i =1; i<=n;i++){
 for(int j =1; j<=nsp;j++){
 System.out.print("  ");
 
}
for(int j =1; j<=nst;j++){
 System.out.print(j+" ");
}
System.out.println();
nsp--;
nst +=2;
}
}
}
