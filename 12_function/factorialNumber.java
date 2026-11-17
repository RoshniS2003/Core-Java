import java.util.Scanner;

// Void

// public class factorialNumber {
//     public static void printFactorial(int n) {
//         int factorial = 1;

//         for (int i = n; i >= 1; i--) {
//             factorial = factorial * i;
//         }

//       System.out.println(factorial);
//         return; -->> not required

//         // suppose we write int then return factorial write
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int n = sc.nextInt();

//         System.out.println("The factorial of " + n + " is :");
//         printFactorial(n);
//     }
// }

// int
public class factorialNumber {
    public static int printFactorial(int n) {

        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("invalid Number");
        } else {
            int fact = printFactorial(n);
            System.out.println("The factorial of " + n + " is : " + fact);
        }
        sc.close();
    }
}
