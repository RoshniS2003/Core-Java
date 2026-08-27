import java.util.*;

public class ifElse {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter Age: ");
    int age = sc.nextInt();
    
    if (age >= 18) {
        System.out.println("You are Eligible For Vote.");
    } else {
        System.out.println("You are not Eligible For Vote.");
    }
   }    
}
