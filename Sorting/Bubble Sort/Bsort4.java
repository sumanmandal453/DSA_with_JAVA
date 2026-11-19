/*
Move to all Zeros to end.
example- arr ={1,0,-2,3,0,4,8,0,10,12};

Output:-
arr={1,-2,3,4,8,10,12,0,0,0};
*/

public class Bsort4 {
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
        for(int i = 0; i < n-1; i++){
            boolean isSorted = true;
            for(int j = 0; j < n-1-i;j++){
                if(arr[j]==0){
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
