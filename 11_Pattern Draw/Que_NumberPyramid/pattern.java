public class pattern {
 public static void main(String[] args) {
    int n=5;
    // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop--->>> Space print
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");  // one enter -> center , two enter -> half pyramid , three enter -> rhombus
            }
            // Inner Loop----->>> Star Print
            for (int j = 1; j <= i; j++) {
                // System.out.print("*" + " ");
                System.out.print(i + " ");
            }
            System.out.println();
        }
 }    
}

// Note:--->>>
// In a code we print 4 types of pattern
