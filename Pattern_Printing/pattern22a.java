/*
pattern print: (Star Triangle vertically Flipped(method-2:use one loop under this loop  
2 loop are their one is space loop nd second one is star loop)
input: n = 4

output:
      *
    * *
  * * *
* * * *

*/

import java.util.*;

public class pattern22a{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();

for(int i = 1; i <= n; i++){
for(int j = 1; j <= n-i; j++){
System.out.print("  ");
}
for(int j = 1; j<=i; j++){
System.out.print("* ");
}
System.out.println();
}
}
}

