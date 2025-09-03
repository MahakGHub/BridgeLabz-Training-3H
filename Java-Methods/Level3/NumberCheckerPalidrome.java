import java.util.*;

public class NumberCheckerPalidrome {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int n) {
        int[] digits = getDigits(n);
        return arraysEqual(digits, reverseArray(digits));
    }

    public static boolean isDuck(int n) {
        int[] digits = getDigits(n);
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println("Palindrome? " + isPalindrome(n));
        System.out.println("Duck? " + isDuck(n));
    }
}
