
// Make a function to add 2 numbers and return the sum
import java.util.Scanner;

public class addTwoNum {
    public static int calcualteSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int sum = calcualteSum(a, b);
        System.out.println("Sum of 2 numbers is : " +sum);
    }
}