/*
Arrays: Multiply odd indexed elements by 2 and add 10 to even indexed elements.
*/

public class Array11{
public static void main(String[] args){
int[] arr ={5, 3, 2, 1};
print(arr);
}

static void print(int[] arr){
for(int i =0; i< arr.length; i++){
if(i%2==0){
System.out.print((arr[i]+10)+" ");
}
else{
System.out.print((arr[i])*2+" ");
}
}
System.out.println();
}
}