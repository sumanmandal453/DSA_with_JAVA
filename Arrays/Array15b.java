// Reverse Array From Specific Position to Specific Position


public class Array15b {
    public static void main(String[] args) {
        int[] arr ={3,56,9,83,18,24,85,14};
         int n = arr.length;
        int i = 2 , j = 5;
        while( i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
