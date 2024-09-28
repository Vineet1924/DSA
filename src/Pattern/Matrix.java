package Pattern;

public class Matrix {
    private final int row;
    private final int column;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        generatePattern();
        generateHollowMatrix();
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
}
