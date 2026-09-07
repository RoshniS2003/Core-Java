import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numbers : ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i = i + 2) {
            System.out.print(i + " ");
        }

        // for (int i = 1; i <= n; i++) {
        // // Check if the number is perfectly divisible by 2
        // if (i % 2 == 0) {
        // System.out.print(i + " ");
        // }
        // }
    }
}
