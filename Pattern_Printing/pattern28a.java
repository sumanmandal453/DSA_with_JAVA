/*
pattern print:
input: n =3;
Output:
1 1 1
1 2 2
1 2 3

*/
import java.util.*;
public class pattern28a{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();
for(int i =1; i<=n;i++){
for(int j =1; j<=n;j++){
System.out.print(Math.min(i,j)+" ");
// or use
//  System.out.print(((i<j) ? i : j)+" "); //  useTernary Operator
// or use
// if(i <j){
//     System.out.print(i+" ");

// }
// else{
//     System.out.print(j+" ");
// }
}
System.out.println();
}
}
}
