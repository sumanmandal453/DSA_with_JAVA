// Deep copy
import java.util.*;

public class Array9a {
    public static void main(String[] args){
        int[] arr ={45, 56, 89, 78};
        System.out.println(arr[2]);
        
        int[] Deep = Arrays.copyOf(arr,arr.length);
        Deep[2] = 100;
        System.out.println(Deep[2]);
        System.out.println(arr[2]);

        // or in another way to deep copy
        int[] brr = new int[arr.length];
        for(int i = 1; i<arr.length; i++){
            brr[i] = arr[i];
        }
        System.out.println(brr[2]);



    }
    
}
