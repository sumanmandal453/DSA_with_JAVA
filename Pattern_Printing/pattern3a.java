import java.util.Scanner;

public class pattern3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the number(1-26): ");
        int a = sc.nextInt();
        for(int i=1; i<=a;i++){
            for(int j=1; j<=a;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }

    }
    
}
