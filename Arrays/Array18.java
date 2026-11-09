/*
Arrays: Wave Array.
like example- input : sorted array ={1,2,3,4,5};
Output: arr={2,1,4,3,5};
*/
public class Array18{
public static void main(String[] args){
int[] arr={2,4,7,8,9, 10 };
int n = arr.length;
int i = 0, j = 1;
while(i+1< n && j+1 <= n){
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
i+=2;
j+=2;
}
for(int ele: arr){
    System.out.print(ele+" ");
}
}
}
