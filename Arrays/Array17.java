/*
Arrays: Segregate 0s and 1s.
example- arr[] ={0,0,1,0}
Output: after Segregate arr[] = {0,0,0,1};

*/

public class Array17{
public static void main(String[] args){
int[] arr ={0,1,0,1,0,0,1,1,1,0};
int n = 0;  // number of zeros in the array.
int m = 0;  // number of 1s in array.

for(int i = 0; i < arr.length; i++){
if(arr[i] == 0){
n++;
}
else{
m++;
}
}
for(int i = 0; i < arr.length ; i++){
if( i < n){
arr[i] = 0;
}
else{
arr[i] = 1;
}
}
for(int ele: arr){
System.out.print(ele+" ");
}
}
}