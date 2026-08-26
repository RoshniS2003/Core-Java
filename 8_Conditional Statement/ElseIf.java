import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        int a = sc.nextInt();

        System.out.println("Enter b value:");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Both Value is Equal");
        }
        else if (a > b) {
            System.out.println("A is greater.");
        }
        else {
            System.out.println("B is greater.");
        }
    }
}
