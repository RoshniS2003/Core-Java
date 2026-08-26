import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int psd = sc.nextInt();

        if (psd == 123) {
            System.out.println("You can access your bank password.");
        }
    }
}
