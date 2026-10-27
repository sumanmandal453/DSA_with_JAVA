/*
pattern print: (Star Triangle vertically Flipped(mehton-2:use one loop under this loop  
2 loop are their one is space loop nd second one is star loop) in here method number 1 is not possible
input: n = 4

output:
      1
    1 2
  1 2 3
1 2 3 4

*/

import java.util.*;

public class pattern22b{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();

for(int i = 1; i <= n; i++){
for(int j = 1; j <= n-i; j++){
System.out.print("  ");
}
for(int j = 1; j<=i; j++){
System.out.print(j+" ");
}
System.out.println();
}
}
}
