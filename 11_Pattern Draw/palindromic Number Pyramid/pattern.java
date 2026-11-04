public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " "); // j print => 1 2 3 4 5 and i => 1 1 1 1 1
            }

            // Increasing Order
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
