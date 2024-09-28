package Pattern;

public class Daimond {
    private final int n;

    public Daimond(int n) {
        this.n = (n / 2);
        Pyramid pattern = new Pyramid(n);
        generateInverseDaimond();
    }

    private void generateInverseDaimond() {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < (n - i); j++) {
                    System.out.print("* ");
                }
                for(int j = 0; j < i; j++) {
                    System.out.print("    ");
                }
                for(int j = 0; j < (n - i); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(int i = 1; i <= n; i++) {
                for(int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                for(int j = 0; j < (n - i); j++) {
                    System.out.print("    ");
                }
                for(int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
