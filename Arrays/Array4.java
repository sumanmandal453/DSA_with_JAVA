/*
Arrays: print the maxelement in the Array.

*/

import java.util.*;
public class Array4{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Size of the Array: ");
int n = sc.nextInt();
int[] arr = new int[n];

// int max = arr[0];
int max =Integer.MIN_VALUE;
System.out.println("Enter the Array Elements: ");
for(int i = 0; i < n; i++){
arr[i] = sc.nextInt();
if( arr[i]> max){
max = arr[i];
}
}
System.out.println("Maximum no. of element in the Array is: "+max);
}
}

