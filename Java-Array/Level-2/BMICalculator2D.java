import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // [weight, height, BMI]
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            double w = sc.nextDouble();
            if (w <= 0) { System.out.println("Invalid! Enter again."); i--; continue; }

            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            double h = sc.nextDouble();
            if (h <= 0) { System.out.println("Invalid! Enter again."); i--; continue; }

            double bmi = w / (h * h);

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = bmi;

            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 24.9) status[i] = "Normal";
            else if (bmi < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + "\t" + personData[i][1] + "\t" + personData[i][2] + "\t" + status[i]);
        }

        sc.close();
    }
}
