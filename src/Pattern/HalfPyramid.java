package Pattern;

public class HalfPyramid {
    private final int n;

    public HalfPyramid(int n) {
        this.n = n;
        generatePattern();
        generateIncreaseNumberPattern();
        generateNumberPattern();
    }

    private void generatePattern() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void generateIncreaseNumberPattern() {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private void generateNumberPattern() {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
