import java.util.*;

public class ArrayInpur {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i = 0; i< arr.length;i++){
            System.out.print((i+1)+" Enter the number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(" 7 number input successful");

         for(int i = 0; i<arr.length;i++){
            System.out.print(2*arr[i]+" ");
        }
    }
    
}
