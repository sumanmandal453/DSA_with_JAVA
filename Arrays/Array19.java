// ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class Array19 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(34);
        arr.add(5);
        arr.add(18);
        arr.add(23);
        System.out.println(arr.get(3)); // this means is arr[3] print
        arr.set(3,20);  // this means set arr[3] = 20;
        
        System.out.println(arr); // this means full ArrayList print and not traversing by ourself.

        int n = arr.size(); // this means size of the ArrayList.
        System.out.println(n);
        for(int i = 0; i< n;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        arr.add(78); // this means [25,34,5,20,23,78]
        arr.add(1,100); // this means [25,100,34,5,20,23,78]
        System.out.println(arr);

        arr.remove(n-1);
        System.out.println(arr);
        arr.remove(arr.size()-1); // remove the last index or element.
        System.out.println(arr);

        Collections.reverse(arr); // reverse the array.
        System.out.println(arr);
    }
    
}
