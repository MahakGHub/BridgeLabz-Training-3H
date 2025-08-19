import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int sum1 = 0, i = 1;
            while (i <= n) {
                sum1 += i;
                i++;
            }
            int sum2 = n * (n + 1) / 2;
            System.out.println("Sum by while loop = " + sum1);
            System.out.println("Sum by formula = " + sum2);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
