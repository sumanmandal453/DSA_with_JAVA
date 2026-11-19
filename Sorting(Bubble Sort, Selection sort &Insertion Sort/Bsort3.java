/*
Bubble Sort:(Reverse)
sort an array in decending order using bubble sort.

*/

public class Bsort3 {
    static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {-5,4,85,-6,78,95,85,45,78,95}; 
        print(arr);

        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            boolean isSorted = true;
            for(int j = 0; j < n-1-i;j++){
                if(arr[j] < arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                isSorted = false;
            }
          }
            if(isSorted == true) break;
        }
        print(arr);
    }
    
}
