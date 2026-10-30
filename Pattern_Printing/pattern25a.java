/*
pattern print:(pyramid:,Method:2--> using variables)
input: n = 4;

Output:
      *
    * * * 
  * * * * *
* * * * * * *

*/
import java.util.*;

public class pattern25a{
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
 System.out.print("* ");
}
System.out.println();
nsp--;
nst +=2;
}
}
}


