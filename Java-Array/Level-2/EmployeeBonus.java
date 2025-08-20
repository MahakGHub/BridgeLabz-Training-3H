import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; // number of employees
        double[] salary = new double[n];
        double[] years = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input salaries and years of service
        for (int i = 0; i < n; i++) {
            System.out.println("Enter salary of employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.println("Enter years of service of employee " + (i + 1) + ": ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) { // validation
                System.out.println("Invalid input! Enter again.");
                i--; // decrement index to re-enter this employee
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < n; i++) {
            if (years[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output totals
        System.out.println("\n=== Company Zara Bonus Report ===");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
