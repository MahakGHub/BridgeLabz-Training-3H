import java.util.*;

public class NumberChecker2 {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int n) {
        int[] digits = getDigits(n);
        int sum = sumDigits(digits);
        return n % sum == 0;
    }

    public static void digitFrequency(int n) {
        int[] digits = getDigits(n);
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println("Digit " + i + ": " + freq[i]);
        }
    }

    public static void main(String[] args) {
        int n = 21;
        int[] digits = getDigits(n);
        System.out.println("Sum: " + sumDigits(digits));
        System.out.println("Sum of squares: " + sumSquares(digits));
        System.out.println("Harshad? " + isHarshad(n));
        digitFrequency(n);
    }
}
