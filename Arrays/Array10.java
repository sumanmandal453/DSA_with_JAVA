// Array sorting

import java.util.*;
public class Array10 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, -5, 67, 58};
        // System.out.println(arr.length);
        print(arr);
        Arrays.sort(arr);  // sort---> ascending order
        print(arr);

    }

    static void print(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    
}
