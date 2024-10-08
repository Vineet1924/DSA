package Pattern;

public class HalfPyramid {
    private final int n;

    public HalfPyramid(int n) {
        this.n = n;
        generatePattern();
        generateNumberPattern();
        generateIncreaseNumberPattern();
        generateBinaryHalfPyramid();
        generateNumberPyramid();
        generateAlphabetPyramid();
        generateAlphabeticPattern();
        generateReverseAlphabeticPattern();
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

    private void generateBinaryHalfPyramid() {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((j - i) % 2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    private void generateNumberPyramid() {
        int count = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    private void generateAlphabetPyramid() {
        int ascii = 65;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char) (ascii + j) + " ");
            }
            System.out.println();
        }
    }

    private  void generateAlphabeticPattern() {
        int ascii = 65;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char) (ascii + i) + " ");
            }
            System.out.println();
        }
    }

    private  void generateReverseAlphabeticPattern() {
        int ascii = 65;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print((char) (ascii + (n - (i - j))) + " ");
            }
            System.out.println();
        }
    }
}
