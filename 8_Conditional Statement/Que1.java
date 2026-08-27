import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value: ");
        double a = sc.nextDouble();

        System.out.println("Enter B value: ");
        double b = sc.nextDouble();

        System.out.print(" Enter Operations = "); // Number not enter in next line so we remove the ln
        int operations = sc.nextInt();

        switch (operations) {
            case 1:
                System.out.println("Addition = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;
                
            case 4:
                System.out.println("Division = " + (a / b));
                break;

            case 5:
                System.out.println("Modolus(Remainder) = " + (a % b));
                break;

            default:
                System.out.println("Invalid Operations");
                break;
        }
    }
}
