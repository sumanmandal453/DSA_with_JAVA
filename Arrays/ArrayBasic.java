public class ArrayBasic {
    public static void main(String[] args){
       int[] x = {6,85,45,9};
       // indxing

       System.out.println(x[0]);
       x[0] = 12;  // Arrays is Mutability Properties
       System.out.println(x[0]);

       // Array Declaration in Another way
       int[] arr = new int[4];

       arr[0]= 5;
       arr[1]= 6;
       arr[2]= 7;
       arr[3]= 8;
       System.out.println(arr.length);


    }
}
