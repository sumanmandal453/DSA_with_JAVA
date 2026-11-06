/*
Array: missing Element or value in Array.
example-
arr[] = {1,2,3,5};
Output:
4

*/

public class Array16 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = arr.length+1;
        int sum = (n*(n+1))/2;
        int ArraySum = 0;
        for(int ele: arr){
            ArraySum += ele;
        }
        int v = sum - ArraySum;
        System.out.println("Missing Element in the Array is: "+v);

    }
}
