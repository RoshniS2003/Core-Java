public class Solid {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        
        // Outer Loop--->> for rows
        for (int i = 1; i <= n; i++) {
            // Inner Loop ---->>>for columns
            for (int j = 1; j <= m; j++) {
                System.out.print(" * ");  // not use ln because * print the one line
            }
            System.out.println();
        }
    }
}
