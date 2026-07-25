import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input from User
        System.out.println("Enter Radius: ");
        double radius = sc.nextDouble();

        // Calculate area
        double area = Math.PI * radius * radius;

        // print the result
        System.out.println("Radius is: " + radius);
        System.out.println("Area is: " + area);

    }
}
