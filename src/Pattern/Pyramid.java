package Pattern;

public class Pyramid {
    private final int n;

    public Pyramid(int n) {
        this.n = (n / 2) + 1;
        generatePattern();
        generateReveresPyramid();
        generateAlphabeticPyramid();
    }

    private void generatePattern() {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= (i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void generateReveresPyramid() {
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < (n - i); j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < (n - (i + 1)); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void generateAlphabeticPyramid() {
        final int ascii = 64;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(ascii + j) + " ");
            }
            for(int j = 1; j <= (i - 1); j++) {
                System.out.print((char)(ascii + (i - j)) + " ");
            }
            System.out.println();
        }
    }
}
