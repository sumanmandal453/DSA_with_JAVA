/*
Arrays: Reverse the Array
 arr = {6,8,1,2,4,9,0}
 Output:
 arr{2,4,9,0,6,8,1}
 sloving Steps:
 1: Chunking reverse 0-2 Index and Chunking Reverse 3-last Index.
 2: full Reverse the Array.

*/

public class Array15c{
public static void main(String[] args){

int[] arr ={6,8,1,2,4,9,0};
System.out.println(" Original Array is: ");
for(int ele: arr){
System.out.print(ele+" ");
}
int n = arr.length;
int i = 0, j = 2;
while(i <= j){
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;

i++;
j--;
}
System.out.println();
System.out.println("The first Chunking of Array index(0-2): ");
for(int ele: arr){
System.out.print(ele+" ");
}
i=3 ; j =n-1;
while(i<=j){
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
i++;
j--;
}
System.out.println();
System.out.println("The Second Chunking of Array index(3-last index): ");
for(int ele: arr){
System.out.print(ele+" ");
}
    i = 0;
        j = n-1;

        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
System.out.println();
System.out.println("The final Result of Reverse Array: ");
for(int ele: arr){
System.out.print(ele+" ");
}
}
}
