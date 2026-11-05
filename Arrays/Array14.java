/*

Arrays: Print the second maximum element in the Array.

*/

public class Array14{
public static void main(String[] args){
int[] arr = {4,10,10,2,3,8,10,17,32};

int n = arr.length;
int max = Integer.MIN_VALUE;
int  a = 0;

int se_max = Integer.MIN_VALUE;

for(int i = 0 ; i< n ; i++){
if(arr[i] > max){
max = arr[i];
}
}
for(int j = 0; j < n ; j++){
if(arr[j] > se_max && arr[j] != max){
se_max = arr[j];
 a = j;
}
}
System.out.println("The Second max element in the Array is: "+se_max);
System.out.println("The Second max element index is:"+ a);
}
}
