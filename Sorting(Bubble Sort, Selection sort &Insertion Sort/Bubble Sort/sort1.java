/*
Sorting: Check if the Array is Sorted.
*/ 

public class sort1{
public static void main(String[] args){

int[] arr = {1,0,2,3,4};
boolean n = false;
for(int i = 0; i < arr.length-1;i++){
if(arr[i] <= arr[i+1]){
n = true;
}
else{
n = false;
break;
}
}
if(n == true){
System.out.println("Array is Sorted!");
}
else{
System.out.println("Array is not Sorted!");
}
}
}
