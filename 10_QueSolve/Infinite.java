public class Infinite {
    public static void main(String[] args) {
        // An Infinite Loop: In Java, a for loop typically has three parts separated by
        // semicolons: for(initialization; condition; update). By leaving all three
        // parts completely blank ((; ;)), you are telling Java that there is no
        // condition to stop the loop. As a result, this loop will run forever (an
        // infinite loop).

        // What it does: When you run this program on your system, it will continuously
        // and rapidly print the text "Apna College" to your console or terminal without
        // ever stopping on its own
        for (;;) {
            System.out.println("Apna College");
        }
    }
}
