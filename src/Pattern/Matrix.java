package Pattern;

public class Matrix {
    private final int row;
    private final int column;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        generatePattern();
        generateHollowMatrix();
        generatePyramidMatrix();
    }

    private void generatePattern() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void generateHollowMatrix() {
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= column; j++) {
                if(i == 1 || j == 1 || i == row || j == column)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private void generatePyramidMatrix() {
        int n = row;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(n - j + " ");
            }
            for(int j = 1; j <= (n - i); j++) {
                System.out.print(((n - i) + 1) + " ");
            }
            for(int j = 1; j <= ((n - i) - 1); j++) {
                System.out.print(((n - i) + 1) + " ");
            }
            for(int j = i; j > 0; j--) {
                if(n == j) continue;
                System.out.print((n - j) + 1 + " ");
            }
            System.out.println();
        }
        for(int i = (n - 1); i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print(n - j + " ");
            }
            for(int j = 1; j <= (n - i); j++) {
                System.out.print(((n - i) + 1) + " ");
            }
            for(int j = 1; j <= ((n - i) - 1); j++) {
                System.out.print(((n - i) + 1) + " ");
            }
            for(int j = i; j > 0; j--) {
                if(n == j) continue;
                System.out.print((n - j) + 1 + " ");
            }
            System.out.println();
        }
    }
}
