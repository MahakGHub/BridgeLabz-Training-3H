import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();
        double totalInches = heightCm / 2.54;
        double feet = totalInches / 12;
        double inches = totalInches % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + (int)feet + " and inches is " + inches);
        input.close();
    }
}
