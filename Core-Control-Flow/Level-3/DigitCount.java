

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        System.out.println("Number of digits: " + count);
    }
}
