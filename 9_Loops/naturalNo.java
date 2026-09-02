import java.util.Scanner;

public class naturalNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Numbers: ");
    int n = sc.nextInt();

    // Natural Numbers : 1 ,2 ,3, 4,5, 6, 7, 8, 9,10
    // n = 4 so we take first 4 numbers 
    // 1+2+3+4 = 10
    int sum = 0;
    for(int i = 1 ; i <= n; i++){
           sum = sum + i;
    }
     System.out.println("The Sum of First " + n + " Natural Numbers is = " + sum);
  }    
}
