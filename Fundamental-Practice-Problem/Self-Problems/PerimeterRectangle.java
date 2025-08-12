import java.util.Scanner;
public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        double l = sc.nextDouble();
        System.out.print("Width: ");
        double w = sc.nextDouble();
        double perimeter = 2 * (l + w);
        System.out.printf("Perimeter = %.2f%n", perimeter);
        sc.close();
    }
}
