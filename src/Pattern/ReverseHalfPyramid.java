package Pattern;

public class ReverseHalfPyramid {
    private final int n;

    public ReverseHalfPyramid(int n) {
        this.n = n;
        generatePattern();
        generateIncreasingNumberPattern();
    }

    private void generatePattern() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void generateIncreasingNumberPattern() {
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
