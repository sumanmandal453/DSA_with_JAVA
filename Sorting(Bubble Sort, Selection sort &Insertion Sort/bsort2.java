public class bsort2 {
    static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {-5,2,6,0,1,2,4};
        print(arr);
        for(int i = 0; i< arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

        for(int i = 0; i< arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

        for(int i = 0; i< arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

        for(int i = 0; i< arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

        for(int i = 0; i< arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

        for(int i = 0; i< arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

    }

}
