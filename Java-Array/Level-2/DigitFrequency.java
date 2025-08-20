import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = new int[20];
        int index = 0;

        int temp = number;
        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        int[] freq = new int[10]; // 0-9
        for (int i = 0; i < index; i++) {
            freq[digits[i]]++;
        }

        System.out.println("\nDigit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + "\t" + freq[i]);
            }
        }

        sc.close();
    }
}
