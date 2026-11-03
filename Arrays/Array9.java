public class Array9 {
    public static void main(String[] args) {
        int[] arr = {34, 56, 78 ,53};
        int[] x = arr; // x is a shallow copy of arr

        x[0] = 23;
        System.out.println(arr[0]);

        for(int i =0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
