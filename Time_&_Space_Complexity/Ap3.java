/*
Approach-3:
Most Optimized Approach.
arr ={5,1,3,4,2,4};
sum of Array =
sum of 1 to 5 =
*/

public class Ap3 {
    public static void main(String[] args) {
        int[] arr ={5,1,3,4,2,4};
        int n = arr.length;
        int a = 0; // sum of array.
        int b = (n*(n-1))/2; // sum of 1 to n-1
        for(int i = 0; i < n; i++){
            a += arr[i];
        }
        System.out.println("Total sum of Array is: "+a);
        System.out.println("Duplicate element is: "+(a-b));

    }
}
