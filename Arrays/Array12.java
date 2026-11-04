
import java.util.*;

public class Array12 {
    public static void main(String[] args) {

        int[] arr = {5, 6, 3, 6};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Element what you Search: ");
        int n = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == n) {

                System.out.println(arr[i] + " this element is in the array!");
                System.out.println("The index is: " + i);

                found = true;
                break;
            }
        }

        if(found == false) {
            System.out.println("The number is not in the Array!");
        }

        sc.close();
    }
}

