
public class Ssort1 {
    static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={5,-1,8,6,0,7,9};
        int n = arr.length;
        print(arr);
        for(int i = 0; i < n-1; i++){
            int min = Integer.MAX_VALUE;
            int ind_min = 0;
            for(int j = i; j<n;j++){
                if(arr[j]< min){
                    min = arr[j];
                    ind_min = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] =arr[ind_min];
            arr[ind_min]=temp;
        }
        print(arr);
    }
}
