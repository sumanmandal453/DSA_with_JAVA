//more optimized version of Bsort2a

public class Bsort2b {
    static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {-5,4,85,-6,78,95,85,45,78,95};
        print(arr);
        int n = arr.length;
        for(int i = 0; i < n-1;i++){
            boolean  isSored = true;
           for(int j = 0; j <n-1;j++){
            if(arr[j] > arr[j+1]){
                isSored = false;
                break;  
            }
           }
           if(isSored == true){
            break;
           } 
           for(int j =0 ; j<n-1;j++){
            if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
           }
          }
        }
        print(arr);
    }
    
}
