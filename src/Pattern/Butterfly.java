package Pattern;

public class Butterfly {
    private final int n;

    public Butterfly(int n) {
        this.n = n;
        generateHalfNumberButterfly();
        generateButterfly();
    }

    private void generateHalfNumberButterfly() {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for(int j = 0; j < (n - i); j++) {
                System.out.print("    ");
            }
            for(int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private void generateButterfly() {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < (n - i); j++) {
                System.out.print("    ");
            }
            for(int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = (n - 1); i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < (n - i); j++) {
                System.out.print("    ");
            }
            for(int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
