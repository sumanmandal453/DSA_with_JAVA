/*
Given an array of size n+1 consisting of integer from 1 to n. One of the elements is duplicate
in the array.Find that duplicate element.

example-
arr = {5,1,3,4,2,4};

*/

/*
Approach-1:
use nesred Loop
total no. of Operations = 5+4+3+2
*/

public class Ap1 {
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,4};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j< n; j++){
                if(arr[i] == arr[j]){
                    System.out.println("The duplicate element is: "+arr[i]);
                    break;
                }
            }
        }
    }
}

