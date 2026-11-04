/*
Arrays: Two Sum
arr ={1,5,8,-3};
target = 2;

*/

import java.util.*;

public class Array13{
public static void main(String[] args){
int[] arr = {1,5,8,-3};

int target = 2;
boolean found = false;

for(int i = 0; i < arr.length;i++){
for(int j =i+1; j< arr.length;j++){
if(arr[i]+arr[j] == target){
System.out.println(arr[i] + " and "+arr[j]+" arrys sum is hit the target.");
found = true;
break;
}
}
}
if(!found){
System.out.println("Target is not find");
}
}
}
