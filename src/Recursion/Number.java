package Recursion;

import java.util.ArrayList;

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

    public ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> ans = new ArrayList<>();
        return factorial(ans, n, 2, 1);
    }

    public ArrayList<Long> factorial(ArrayList<Long> ans,long n, int i, long prev) {
        if(prev > n) return ans;
        ans.add(prev);
        prev *= i;
        i++;
        return factorial(ans, n, i, prev);
    }

    public void reverseArray(int[] arr) {
        reverseArrayHelper(arr, 0, arr.length - 1);
    }

    private void reverseArrayHelper(int[] arr, int i, int n) {
        if(i >= n) return;
        swap(arr, i, n);
        reverseArrayHelper(arr, ++i, --n);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public boolean isPalindrome(String s) {
        if(s.equals(" ") || s.equals("")) return true;
        return palindromeHelper(s, 0, s.length() - 1);
    }
    public boolean palindromeHelper(String s, int i, int j) {
        if(i >= j) return true;
        if(!Character.isLetterOrDigit(s.charAt(i))) return palindromeHelper(s, ++i, j);
        if(!Character.isLetterOrDigit(s.charAt(j))) return palindromeHelper(s, i, --j);
        if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
        return palindromeHelper(s, ++i, --j);
    }
}

