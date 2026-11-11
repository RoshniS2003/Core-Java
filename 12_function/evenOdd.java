import java.util.Scanner;

public class evenOdd {

  public static boolean isEven(int n){
    return n % 2 == 0 ;
    }
  
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENter number: ");
   int n = sc.nextInt();

    if (isEven(n)) {
         System.out.println(n + " is a Even Number");
      } else {
        System.out.println(n + " is a Odd Number");
      }
  }    
}
