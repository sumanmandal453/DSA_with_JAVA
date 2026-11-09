import java.util.ArrayList;
import java.util.Collections;

public class Array19a {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(34);
        arr.add(5);
        arr.add(18);
        arr.add(23);
        System.out.println(arr);
        
        //reverse the array using collections
        // Collections.reverse(arr);
        // System.out.println(arr);

        // normal method use for reverse the arrayList.
        int n = arr.size();
        int i =0, j = n-1;
        while(i < j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);

    }
}
