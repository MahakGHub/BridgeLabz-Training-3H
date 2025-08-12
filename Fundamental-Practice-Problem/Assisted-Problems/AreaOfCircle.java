import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.printf("Area = %.4f%n", area);
        sc.close();
    }
}
