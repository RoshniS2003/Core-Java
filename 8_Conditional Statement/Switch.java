import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Button: ");
        int button = sc.nextInt();

        // // It's not best for long conditions like button 1 - 100 so we use switch
        // conditions
        // if (button == 1) {
        // System.out.println("Red wire");
        // }
        // else if (button == 2) {
        // System.out.println("Yellow Wire");
        // }
        // else if (button == 2) {
        // System.out.println("Green Wire");
        // }
        // else {
        // System.out.println("Invalid button");
        // }

        switch (button) {
            case 1:
                System.err.println("Red");
                break;
            case 2:
                System.err.println("Yellow");
                break;
            case 3:
                System.err.println("Green");
                break;
            default:
                System.out.println("Invalid button");
                break;
        }
    }

}
