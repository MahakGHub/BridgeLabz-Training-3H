import java.util.Scanner;

public class TriangularRunProgram {
    public static int calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        return (int)Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of triangle (meters): ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side 2 of triangle (meters): ");
        double s2 = sc.nextDouble();
        System.out.print("Enter side 3 of triangle (meters): ");
        double s3 = sc.nextDouble();

        int rounds = calculateRounds(s1, s2, s3, 5000);
        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
    }
}
