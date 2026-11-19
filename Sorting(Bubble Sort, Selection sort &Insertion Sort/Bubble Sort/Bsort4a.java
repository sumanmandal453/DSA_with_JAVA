/*
Advance version of Bsort4 with 
time complexity= O(n) and space complexity = O(1)

*/

public class Bsort4a {
    static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-2,3,0,4,8,0,10,12}; 
        print(arr);
        int n = arr.length;
        int j = 0;
        for(int i = 0; i<n;i++){
            if(arr[i] != 0){
                if(i != j){
                    int temp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        print(arr);
    }
    
}
