public class Array7 {
    public static void main(String[] args) {
        int[] arr ={45, 89, 75, 48, 78};

        System.out.println(arr[2]);

        change(arr);
        System.out.println(arr[2]);

    }
    static void change(int[] a){
        a[2] = 99;
    }
}
