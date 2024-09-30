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
}

