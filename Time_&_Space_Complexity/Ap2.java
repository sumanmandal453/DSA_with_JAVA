/*
Approach-2:
use boolean Array.
*/

public class Ap2 {
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,4};
        int n = arr.length;
        boolean[] bol = new boolean[n+1];
        for(int i = 0; i < n ; i++){
            int ele = arr[i];
            if(bol[ele] == true) {
                System.out.println("duplicate element is: "+ele);
            }
            else{
                bol[ele]=true;
            }
        }
    }
}
