import java.util.Scanner;
public class ConvertKilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.printf("%.3f kilometers = %.3f miles%n", km, miles);
        sc.close();
    }
}
