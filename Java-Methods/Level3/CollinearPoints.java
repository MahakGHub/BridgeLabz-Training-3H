import java.util.Scanner;

public class CollinearPoints {

    // Function to check collinearity
    public static boolean areCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Using the area of triangle method
        // Area = 0 → Points are collinear
        int area = (x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 points
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check
        if (areCollinear(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }

        sc.close();
    }
}
