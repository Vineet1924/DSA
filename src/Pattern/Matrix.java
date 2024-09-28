package Pattern;

public class Matrix {
    private final int row;
    private final int column;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        generatePattern();
    }

    private void generatePattern() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
