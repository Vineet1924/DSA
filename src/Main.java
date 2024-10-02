import Pattern.*;
import Recursion.Number;

public class Main {
    public static void main(String[] args) {
        Number n = new Number();
        int[] arr = {0, 1};
        n.reverseArray(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}