import java.util.Scanner;

public class MenuMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch;

        do {

            System.out.print("Enter 1 to input marks or 0 to stop: ");
            ch = sc.nextInt();

            if (ch == 1) {

                System.out.print("Enter student's marks: ");
                int marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                }
                else if (marks >= 60) {
                    System.out.println("This is also Good");
                }
                else if (marks >= 0) {
                    System.out.println("This is Good as well");
                }
                else {
                    System.out.println("Invalid Marks");
                }

                System.out.println("Because marks don't matter but our effort does.");
            }

        } while (ch != 0);

        System.out.println("Program Stopped.");
    }
}