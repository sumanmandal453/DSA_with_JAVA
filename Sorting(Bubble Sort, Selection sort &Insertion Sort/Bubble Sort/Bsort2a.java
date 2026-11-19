public class Bsort2a {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {-5,2,6,0,1,2,4};
        int  n = arr.length;
        print(arr);
        for(int j =0; j < n-1;j++){ // n-1 passes
        for(int i = 0; i<n-1-j;i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp; 
            }
        }
    }
    print(arr);    
    }
}
