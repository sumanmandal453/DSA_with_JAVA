/*
Arrays: given an array, print negative number only.
*/

import java.util.*;

public class Array1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];

for(int i =0; i< arr.length;i++){
System.out.print((i+0)+" Enter the number: ");
arr[i] = sc.nextInt();
}
System.out.println(arr.length+"number of element enter Successfully");
System.out.println("All Negative number is: ");
for(int i =0; i< arr.length;i++){
if( arr[i]<0){
System.out.println((i+1)+" : is a negative"+arr[i]);
}
else{
}
}
}
}
