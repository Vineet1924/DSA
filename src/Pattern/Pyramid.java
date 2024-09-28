package Pattern;

public class Pyramid {
    private final int n;

    public Pyramid(int n) {
        this.n = n;
        generatePattern();
    }

    private void generatePattern() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
