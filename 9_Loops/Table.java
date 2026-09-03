import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // WithOut Loop :----->>>

        // Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter Number: ");
        //  int n = sc.nextInt();
        //  System.out.println(n + " x 1 = " + (n * 1));


        
         // With Loop :----->>>

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

         System.out.println("Multiplication of : " + n );
        for(int i = 1 ; i <= 10 ; i++){
             System.out.println(n + " x " + i + " = " + (n * i));
        }

        // int n = 4;
        // for(int i=1 ; i<10 ; i++){
        //           System.out.println(n*i);
        //     }
        // }
     
    }
}
