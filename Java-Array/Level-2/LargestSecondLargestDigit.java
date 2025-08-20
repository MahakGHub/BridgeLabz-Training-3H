import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxDigit = 10; // array size
        int[] digits = new int[maxDigit];
        int index = 0;

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Extract digits
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10; // last digit
            number = number / 10;       // remove last digit
            index++;
        }

        // Initialize largest and second largest
        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second Largest digit = " + secondLargest);

        sc.close();
    }
}
