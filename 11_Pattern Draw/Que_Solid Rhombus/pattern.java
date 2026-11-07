public class pattern {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop--->> Space print
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Inner Loop--->> Star print
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Note:----->>
// j <= i	Triangle / Pyramid
// j <= n	Square / Rhombus