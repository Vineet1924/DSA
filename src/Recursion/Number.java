package Recursion;

public class Number {
    public void printNumbers(int n) {
        int temp = n;
        if(n < 1) return;
        printNumbers(--temp);
        System.out.print(n + " ");
    }

    public void printGfg(int n) {
        if(n < 1) return;
        System.out.print("GFG ");
        printGfg(--n);
    }

    public void printNos(int n) {
        if(n < 1) return;
        System.out.print(n + " ");
        printNos(--n);
    }

    public long sumOfSeries(int n) {
        if(n == 1) return 1;
        return (long) Math.pow(n, 3) + sumOfSeries(n - 1);
    }
}

