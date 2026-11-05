public class Array15a {
    public static void main(String[] args){
        int[] arr ={3 , 5 , 6 , 8 , 9 , 78 , 45};
        // int n = arr.length;
        // int i = 0 , j = n-1;
        // while( i <= j){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;
        // }
        // for(int ele: arr){
        //     System.out.print(ele+" ");
        // }

        // OR
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] =arr[n -1-i];
            arr[n -1-i] = temp;
        }
        for(int i = 0; i< n; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
