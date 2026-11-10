/*
Arrays: Adding One
arr[] = {5,6,7,8};
Output: {5,6,7,9};
or
arr[] = {9,9,9};
Output: {1,0,0,0};
*/


import java.util.Vector;
import java.util.Collections;

public class Array19b {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;
        for(int i = n-1 ; i>=0; i--){
            if(arr[i]+carry <=9){
                ans.add(arr[i]+carry);
                carry = 0;
            }
            else{ // arr[i]+carry = 10
                ans.add(0);
                carry = 1;
            }
            
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        System.out.println(ans);

    }
    
}
