import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9.0 / 5.0) + 32.0;
        System.out.printf("Temperature in Fahrenheit = %.2f%n", f);
        sc.close();
    }
}
