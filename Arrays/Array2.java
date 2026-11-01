/*
Arrays: print Sum of elements of the array.

*/

import java.util.*;

public class Array2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Array size: ");
int n = sc.nextInt();
int[] arr = new int[n];
int a = 0;
System.out.println("Arrays Elements:");
for(int i = 0; i < n ; i++){
arr[i] =sc.nextInt();
 a += arr[i];
}
System.out.println("Total sum of array Elements is: "+ a);
}
}


