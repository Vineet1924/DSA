package Pattern;

public class HalfDaimond {
    private final int n;

    public HalfDaimond(int n) {
        this.n = n / 2;
        HalfPyramid top = new HalfPyramid(this.n);
        ReverseHalfPyramid bottom = new ReverseHalfPyramid(this.n - 1);
    }
}
