public class TestCalc {

    public static void main(String[] args) {
        if (Main.addition(2, 3) != 5) {
            System.out.println("Test addition FAILED");
            System.exit(1);
        }

        if (Main.soustraction(5, 3) != 2) {
            System.out.println("Test soustraction FAILED");
            System.exit(1);
        }

        System.out.println("All tests PASSED");
    }
}